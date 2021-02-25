package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmHadrCluster is a Querydsl query type for QDmHadrCluster
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmHadrCluster extends com.querydsl.sql.RelationalPathBase<QDmHadrCluster> {

    private static final long serialVersionUID = -502072403;

    public static final QDmHadrCluster dmHadrCluster = new QDmHadrCluster("dm_hadr_cluster");

    public final StringPath clusterName = createString("clusterName");

    public final NumberPath<Byte> quorumState = createNumber("quorumState", Byte.class);

    public final StringPath quorumStateDesc = createString("quorumStateDesc");

    public final NumberPath<Byte> quorumType = createNumber("quorumType", Byte.class);

    public final StringPath quorumTypeDesc = createString("quorumTypeDesc");

    public QDmHadrCluster(String variable) {
        super(QDmHadrCluster.class, forVariable(variable), "sys", "dm_hadr_cluster");
        addMetadata();
    }

    public QDmHadrCluster(String variable, String schema, String table) {
        super(QDmHadrCluster.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmHadrCluster(Path<? extends QDmHadrCluster> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_hadr_cluster");
        addMetadata();
    }

    public QDmHadrCluster(PathMetadata metadata) {
        super(QDmHadrCluster.class, metadata, "sys", "dm_hadr_cluster");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(clusterName, ColumnMetadata.named("cluster_name").withIndex(1).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(quorumState, ColumnMetadata.named("quorum_state").withIndex(4).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(quorumStateDesc, ColumnMetadata.named("quorum_state_desc").withIndex(5).ofType(Types.NVARCHAR).withSize(60).notNull());
        addMetadata(quorumType, ColumnMetadata.named("quorum_type").withIndex(2).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(quorumTypeDesc, ColumnMetadata.named("quorum_type_desc").withIndex(3).ofType(Types.NVARCHAR).withSize(60).notNull());
    }

}

