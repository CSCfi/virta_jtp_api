package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmXeObjectColumns is a Querydsl query type for QDmXeObjectColumns
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmXeObjectColumns extends com.querydsl.sql.RelationalPathBase<QDmXeObjectColumns> {

    private static final long serialVersionUID = 1774138283;

    public static final QDmXeObjectColumns dmXeObjectColumns = new QDmXeObjectColumns("dm_xe_object_columns");

    public final NumberPath<Integer> capabilities = createNumber("capabilities", Integer.class);

    public final StringPath capabilitiesDesc = createString("capabilitiesDesc");

    public final NumberPath<Integer> columnId = createNumber("columnId", Integer.class);

    public final StringPath columnType = createString("columnType");

    public final StringPath columnValue = createString("columnValue");

    public final StringPath description = createString("description");

    public final StringPath name = createString("name");

    public final StringPath objectName = createString("objectName");

    public final StringPath objectPackageGuid = createString("objectPackageGuid");

    public final StringPath typeName = createString("typeName");

    public final StringPath typePackageGuid = createString("typePackageGuid");

    public QDmXeObjectColumns(String variable) {
        super(QDmXeObjectColumns.class, forVariable(variable), "sys", "dm_xe_object_columns");
        addMetadata();
    }

    public QDmXeObjectColumns(String variable, String schema, String table) {
        super(QDmXeObjectColumns.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmXeObjectColumns(Path<? extends QDmXeObjectColumns> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_xe_object_columns");
        addMetadata();
    }

    public QDmXeObjectColumns(PathMetadata metadata) {
        super(QDmXeObjectColumns.class, metadata, "sys", "dm_xe_object_columns");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(capabilities, ColumnMetadata.named("capabilities").withIndex(9).ofType(Types.INTEGER).withSize(10));
        addMetadata(capabilitiesDesc, ColumnMetadata.named("capabilities_desc").withIndex(10).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(columnId, ColumnMetadata.named("column_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(columnType, ColumnMetadata.named("column_type").withIndex(7).ofType(Types.NVARCHAR).withSize(60).notNull());
        addMetadata(columnValue, ColumnMetadata.named("column_value").withIndex(8).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(description, ColumnMetadata.named("description").withIndex(11).ofType(Types.NVARCHAR).withSize(3072));
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(objectName, ColumnMetadata.named("object_name").withIndex(3).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(objectPackageGuid, ColumnMetadata.named("object_package_guid").withIndex(4).ofType(Types.CHAR).withSize(36).notNull());
        addMetadata(typeName, ColumnMetadata.named("type_name").withIndex(5).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(typePackageGuid, ColumnMetadata.named("type_package_guid").withIndex(6).ofType(Types.CHAR).withSize(36).notNull());
    }

}

