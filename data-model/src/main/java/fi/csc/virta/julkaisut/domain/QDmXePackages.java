package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmXePackages is a Querydsl query type for QDmXePackages
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmXePackages extends com.querydsl.sql.RelationalPathBase<QDmXePackages> {

    private static final long serialVersionUID = 1402881216;

    public static final QDmXePackages dmXePackages = new QDmXePackages("dm_xe_packages");

    public final NumberPath<Integer> capabilities = createNumber("capabilities", Integer.class);

    public final StringPath capabilitiesDesc = createString("capabilitiesDesc");

    public final StringPath description = createString("description");

    public final StringPath guid = createString("guid");

    public final SimplePath<byte[]> moduleAddress = createSimple("moduleAddress", byte[].class);

    public final StringPath moduleGuid = createString("moduleGuid");

    public final StringPath name = createString("name");

    public QDmXePackages(String variable) {
        super(QDmXePackages.class, forVariable(variable), "sys", "dm_xe_packages");
        addMetadata();
    }

    public QDmXePackages(String variable, String schema, String table) {
        super(QDmXePackages.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmXePackages(Path<? extends QDmXePackages> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_xe_packages");
        addMetadata();
    }

    public QDmXePackages(PathMetadata metadata) {
        super(QDmXePackages.class, metadata, "sys", "dm_xe_packages");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(capabilities, ColumnMetadata.named("capabilities").withIndex(4).ofType(Types.INTEGER).withSize(10));
        addMetadata(capabilitiesDesc, ColumnMetadata.named("capabilities_desc").withIndex(5).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(description, ColumnMetadata.named("description").withIndex(3).ofType(Types.NVARCHAR).withSize(3072).notNull());
        addMetadata(guid, ColumnMetadata.named("guid").withIndex(2).ofType(Types.CHAR).withSize(36).notNull());
        addMetadata(moduleAddress, ColumnMetadata.named("module_address").withIndex(7).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(moduleGuid, ColumnMetadata.named("module_guid").withIndex(6).ofType(Types.NVARCHAR).withSize(60).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(256).notNull());
    }

}

