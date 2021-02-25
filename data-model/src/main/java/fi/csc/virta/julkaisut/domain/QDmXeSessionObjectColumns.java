package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmXeSessionObjectColumns is a Querydsl query type for QDmXeSessionObjectColumns
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmXeSessionObjectColumns extends com.querydsl.sql.RelationalPathBase<QDmXeSessionObjectColumns> {

    private static final long serialVersionUID = -2107436037;

    public static final QDmXeSessionObjectColumns dmXeSessionObjectColumns = new QDmXeSessionObjectColumns("dm_xe_session_object_columns");

    public final NumberPath<Integer> columnId = createNumber("columnId", Integer.class);

    public final StringPath columnName = createString("columnName");

    public final StringPath columnValue = createString("columnValue");

    public final SimplePath<byte[]> eventSessionAddress = createSimple("eventSessionAddress", byte[].class);

    public final StringPath objectName = createString("objectName");

    public final StringPath objectPackageGuid = createString("objectPackageGuid");

    public final StringPath objectType = createString("objectType");

    public QDmXeSessionObjectColumns(String variable) {
        super(QDmXeSessionObjectColumns.class, forVariable(variable), "sys", "dm_xe_session_object_columns");
        addMetadata();
    }

    public QDmXeSessionObjectColumns(String variable, String schema, String table) {
        super(QDmXeSessionObjectColumns.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmXeSessionObjectColumns(Path<? extends QDmXeSessionObjectColumns> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_xe_session_object_columns");
        addMetadata();
    }

    public QDmXeSessionObjectColumns(PathMetadata metadata) {
        super(QDmXeSessionObjectColumns.class, metadata, "sys", "dm_xe_session_object_columns");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(columnId, ColumnMetadata.named("column_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(columnName, ColumnMetadata.named("column_name").withIndex(2).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(columnValue, ColumnMetadata.named("column_value").withIndex(4).ofType(Types.NVARCHAR).withSize(3072));
        addMetadata(eventSessionAddress, ColumnMetadata.named("event_session_address").withIndex(1).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(objectName, ColumnMetadata.named("object_name").withIndex(6).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(objectPackageGuid, ColumnMetadata.named("object_package_guid").withIndex(7).ofType(Types.CHAR).withSize(36).notNull());
        addMetadata(objectType, ColumnMetadata.named("object_type").withIndex(5).ofType(Types.NVARCHAR).withSize(60).notNull());
    }

}

