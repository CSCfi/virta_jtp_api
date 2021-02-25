package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmXeMapValues is a Querydsl query type for QDmXeMapValues
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmXeMapValues extends com.querydsl.sql.RelationalPathBase<QDmXeMapValues> {

    private static final long serialVersionUID = -281361365;

    public static final QDmXeMapValues dmXeMapValues = new QDmXeMapValues("dm_xe_map_values");

    public final NumberPath<Integer> mapKey = createNumber("mapKey", Integer.class);

    public final StringPath mapValue = createString("mapValue");

    public final StringPath name = createString("name");

    public final StringPath objectPackageGuid = createString("objectPackageGuid");

    public QDmXeMapValues(String variable) {
        super(QDmXeMapValues.class, forVariable(variable), "sys", "dm_xe_map_values");
        addMetadata();
    }

    public QDmXeMapValues(String variable, String schema, String table) {
        super(QDmXeMapValues.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmXeMapValues(Path<? extends QDmXeMapValues> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_xe_map_values");
        addMetadata();
    }

    public QDmXeMapValues(PathMetadata metadata) {
        super(QDmXeMapValues.class, metadata, "sys", "dm_xe_map_values");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(mapKey, ColumnMetadata.named("map_key").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(mapValue, ColumnMetadata.named("map_value").withIndex(4).ofType(Types.NVARCHAR).withSize(3072).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(objectPackageGuid, ColumnMetadata.named("object_package_guid").withIndex(2).ofType(Types.CHAR).withSize(36).notNull());
    }

}

