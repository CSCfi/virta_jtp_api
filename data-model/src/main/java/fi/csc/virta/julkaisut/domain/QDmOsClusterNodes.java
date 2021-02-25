package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmOsClusterNodes is a Querydsl query type for QDmOsClusterNodes
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmOsClusterNodes extends com.querydsl.sql.RelationalPathBase<QDmOsClusterNodes> {

    private static final long serialVersionUID = 1764446113;

    public static final QDmOsClusterNodes dmOsClusterNodes = new QDmOsClusterNodes("dm_os_cluster_nodes");

    public final BooleanPath isCurrentOwner = createBoolean("isCurrentOwner");

    public final StringPath nodeName = createString("nodeName");

    public final NumberPath<Integer> status = createNumber("status", Integer.class);

    public final StringPath statusDescription = createString("statusDescription");

    public QDmOsClusterNodes(String variable) {
        super(QDmOsClusterNodes.class, forVariable(variable), "sys", "dm_os_cluster_nodes");
        addMetadata();
    }

    public QDmOsClusterNodes(String variable, String schema, String table) {
        super(QDmOsClusterNodes.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmOsClusterNodes(Path<? extends QDmOsClusterNodes> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_os_cluster_nodes");
        addMetadata();
    }

    public QDmOsClusterNodes(PathMetadata metadata) {
        super(QDmOsClusterNodes.class, metadata, "sys", "dm_os_cluster_nodes");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(isCurrentOwner, ColumnMetadata.named("is_current_owner").withIndex(4).ofType(Types.BIT).withSize(1));
        addMetadata(nodeName, ColumnMetadata.named("NodeName").withIndex(1).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(status, ColumnMetadata.named("status").withIndex(2).ofType(Types.INTEGER).withSize(10));
        addMetadata(statusDescription, ColumnMetadata.named("status_description").withIndex(3).ofType(Types.VARCHAR).withSize(7).notNull());
    }

}

