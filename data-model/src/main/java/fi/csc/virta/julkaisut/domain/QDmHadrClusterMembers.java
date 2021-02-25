package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmHadrClusterMembers is a Querydsl query type for QDmHadrClusterMembers
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmHadrClusterMembers extends com.querydsl.sql.RelationalPathBase<QDmHadrClusterMembers> {

    private static final long serialVersionUID = -1684055892;

    public static final QDmHadrClusterMembers dmHadrClusterMembers = new QDmHadrClusterMembers("dm_hadr_cluster_members");

    public final StringPath memberName = createString("memberName");

    public final NumberPath<Byte> memberState = createNumber("memberState", Byte.class);

    public final StringPath memberStateDesc = createString("memberStateDesc");

    public final NumberPath<Byte> memberType = createNumber("memberType", Byte.class);

    public final StringPath memberTypeDesc = createString("memberTypeDesc");

    public final NumberPath<Integer> numberOfQuorumVotes = createNumber("numberOfQuorumVotes", Integer.class);

    public QDmHadrClusterMembers(String variable) {
        super(QDmHadrClusterMembers.class, forVariable(variable), "sys", "dm_hadr_cluster_members");
        addMetadata();
    }

    public QDmHadrClusterMembers(String variable, String schema, String table) {
        super(QDmHadrClusterMembers.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmHadrClusterMembers(Path<? extends QDmHadrClusterMembers> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_hadr_cluster_members");
        addMetadata();
    }

    public QDmHadrClusterMembers(PathMetadata metadata) {
        super(QDmHadrClusterMembers.class, metadata, "sys", "dm_hadr_cluster_members");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(memberName, ColumnMetadata.named("member_name").withIndex(1).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(memberState, ColumnMetadata.named("member_state").withIndex(4).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(memberStateDesc, ColumnMetadata.named("member_state_desc").withIndex(5).ofType(Types.NVARCHAR).withSize(60).notNull());
        addMetadata(memberType, ColumnMetadata.named("member_type").withIndex(2).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(memberTypeDesc, ColumnMetadata.named("member_type_desc").withIndex(3).ofType(Types.NVARCHAR).withSize(60).notNull());
        addMetadata(numberOfQuorumVotes, ColumnMetadata.named("number_of_quorum_votes").withIndex(6).ofType(Types.INTEGER).withSize(10));
    }

}

