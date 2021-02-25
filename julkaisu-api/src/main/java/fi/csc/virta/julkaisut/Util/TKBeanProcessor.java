package fi.csc.virta.julkaisut.Util;

import org.apache.commons.dbutils.BeanProcessor;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TKBeanProcessor extends BeanProcessor {

    private final Map<String, String> columnToPropertyOverrides;
    private final Map<Class, int[]> columnToPropertyCache = new HashMap<>();

    public TKBeanProcessor(Map<String, String> propOverrides) {
        this.columnToPropertyOverrides = propOverrides;
    }

    @Override
    public <T> T toBean(ResultSet rs, Class<T> type) throws SQLException {
        PropertyDescriptor[] props = this.propertyDescriptors(type);
        ResultSetMetaData rsmd = rs.getMetaData();
        int[] columnToProperty = this.mapColumnsToProperties(rsmd, props);
        columnToPropertyCache.put(type, columnToProperty);
        return super.toBean(rs, type);
    }

    @Override
    protected int[] mapColumnsToProperties(ResultSetMetaData rsmd, PropertyDescriptor[] props) throws SQLException {
        int cols = rsmd.getColumnCount();
        int[] columnToProperty = new int[cols + 1];
        Arrays.fill(columnToProperty, PROPERTY_NOT_FOUND);

        for (int col = 1; col <= cols; col++) {
            String columnName = rsmd.getColumnLabel(col);
            if (0 == columnName.length()) {
                columnName = rsmd.getColumnName(col);
            }
            String propertyName = columnToPropertyOverrides.get(columnName);
            if (propertyName == null) {
                propertyName = columnName;
            }
            for (int i = 0; i < props.length; i++) {
                PropertyDescriptor prop = props[i];
                Method method = prop.getReadMethod();
                if (method == null) {
                    continue;
                }
                final Class<?> declaringClass = method.getDeclaringClass();
                if (columnToPropertyCache.get(declaringClass) != null) {
                    return columnToPropertyCache.get(declaringClass);
                }
                String className = declaringClass.getName();
                if (!propertyName.startsWith(className)) {
                    continue;
                }
                String propName = propertyName.substring(propertyName.lastIndexOf('.') + 1);
                if (propName.equalsIgnoreCase(prop.getName())) {
                    columnToProperty[col] = i;
                    break;
                }
            }
        }

        return columnToProperty;
    }

    private PropertyDescriptor[] propertyDescriptors(Class<?> c)
            throws SQLException {
        // Introspector caches BeanInfo classes for better performance
        BeanInfo beanInfo = null;
        try {
            beanInfo = Introspector.getBeanInfo(c);

        } catch (IntrospectionException e) {
            throw new SQLException(
                    "Bean introspection failed: " + e.getMessage());
        }

        return beanInfo.getPropertyDescriptors();
    }
}
