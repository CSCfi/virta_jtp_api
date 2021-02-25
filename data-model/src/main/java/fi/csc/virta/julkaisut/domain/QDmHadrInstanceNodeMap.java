package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmHadrInstanceNodeMap is a Querydsl query type for QDmHadrInstanceNodeMap
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmHadrInstanceNodeMap extends com.querydsl.sql.RelationalPathBase<QDmHadrInstanceNodeMap> {

    private static final long serialVersionUID = -1151152040;

    public static final QDmHadrInstanceNodeMap dmHadrInstanceNodeMap = new QDmHadrInstanceNodeMap("dm_hadr_instance_node_map");

    public final StringPath agResourceId = createString("agResourceId");

    public final StringPath instanceName = createString("instanceName");

    public final StringPath nodeName = createString("nodeName");

    public QDmHadrInstanceNodeMap(String variable) {
        super(QDmHadrInstanceNodeMap.class, forVariable(variable), "sys", "dm_hadr_instance_node_map");
        addMetadata();
    }

    public QDmHadrInstanceNodeMap(String variable, String schema, String table) {
        super(QDmHadrInstanceNodeMap.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmHadrInstanceNodeMap(Path<? extends QDmHadrInstanceNodeMap> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_hadr_instance_node_map");
        addMetadata();
    }

    public QDmHadrInstanceNodeMap(PathMetadata metadata) {
        super(QDmHadrInstanceNodeMap.class, metadata, "sys", "dm_hadr_instance_node_map");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(agResourceId, ColumnMetadata.named("ag_resource_id").withIndex(1).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(instanceName, ColumnMetadata.named("instance_name").withIndex(2).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(nodeName, ColumnMetadata.named("node_name").withIndex(3).ofType(Types.NVARCHAR).withSize(256).notNull());
    }

}

