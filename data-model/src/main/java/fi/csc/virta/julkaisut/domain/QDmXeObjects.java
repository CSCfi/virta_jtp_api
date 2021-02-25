package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmXeObjects is a Querydsl query type for QDmXeObjects
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmXeObjects extends com.querydsl.sql.RelationalPathBase<QDmXeObjects> {

    private static final long serialVersionUID = 1270877921;

    public static final QDmXeObjects dmXeObjects = new QDmXeObjects("dm_xe_objects");

    public final NumberPath<Integer> capabilities = createNumber("capabilities", Integer.class);

    public final StringPath capabilitiesDesc = createString("capabilitiesDesc");

    public final StringPath description = createString("description");

    public final StringPath name = createString("name");

    public final StringPath objectType = createString("objectType");

    public final StringPath packageGuid = createString("packageGuid");

    public final StringPath typeName = createString("typeName");

    public final StringPath typePackageGuid = createString("typePackageGuid");

    public final NumberPath<Integer> typeSize = createNumber("typeSize", Integer.class);

    public QDmXeObjects(String variable) {
        super(QDmXeObjects.class, forVariable(variable), "sys", "dm_xe_objects");
        addMetadata();
    }

    public QDmXeObjects(String variable, String schema, String table) {
        super(QDmXeObjects.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmXeObjects(Path<? extends QDmXeObjects> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_xe_objects");
        addMetadata();
    }

    public QDmXeObjects(PathMetadata metadata) {
        super(QDmXeObjects.class, metadata, "sys", "dm_xe_objects");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(capabilities, ColumnMetadata.named("capabilities").withIndex(5).ofType(Types.INTEGER).withSize(10));
        addMetadata(capabilitiesDesc, ColumnMetadata.named("capabilities_desc").withIndex(6).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(description, ColumnMetadata.named("description").withIndex(4).ofType(Types.NVARCHAR).withSize(3072).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(objectType, ColumnMetadata.named("object_type").withIndex(2).ofType(Types.NVARCHAR).withSize(60).notNull());
        addMetadata(packageGuid, ColumnMetadata.named("package_guid").withIndex(3).ofType(Types.CHAR).withSize(36).notNull());
        addMetadata(typeName, ColumnMetadata.named("type_name").withIndex(7).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(typePackageGuid, ColumnMetadata.named("type_package_guid").withIndex(8).ofType(Types.CHAR).withSize(36));
        addMetadata(typeSize, ColumnMetadata.named("type_size").withIndex(9).ofType(Types.INTEGER).withSize(10));
    }

}

