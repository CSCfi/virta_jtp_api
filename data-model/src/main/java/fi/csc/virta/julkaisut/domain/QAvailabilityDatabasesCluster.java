package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAvailabilityDatabasesCluster is a Querydsl query type for QAvailabilityDatabasesCluster
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAvailabilityDatabasesCluster extends com.querydsl.sql.RelationalPathBase<QAvailabilityDatabasesCluster> {

    private static final long serialVersionUID = -1173009830;

    public static final QAvailabilityDatabasesCluster availabilityDatabasesCluster = new QAvailabilityDatabasesCluster("availability_databases_cluster");

    public final StringPath databaseName = createString("databaseName");

    public final StringPath groupDatabaseId = createString("groupDatabaseId");

    public final StringPath groupId = createString("groupId");

    public QAvailabilityDatabasesCluster(String variable) {
        super(QAvailabilityDatabasesCluster.class, forVariable(variable), "sys", "availability_databases_cluster");
        addMetadata();
    }

    public QAvailabilityDatabasesCluster(String variable, String schema, String table) {
        super(QAvailabilityDatabasesCluster.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAvailabilityDatabasesCluster(Path<? extends QAvailabilityDatabasesCluster> path) {
        super(path.getType(), path.getMetadata(), "sys", "availability_databases_cluster");
        addMetadata();
    }

    public QAvailabilityDatabasesCluster(PathMetadata metadata) {
        super(QAvailabilityDatabasesCluster.class, metadata, "sys", "availability_databases_cluster");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(databaseName, ColumnMetadata.named("database_name").withIndex(3).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(groupDatabaseId, ColumnMetadata.named("group_database_id").withIndex(2).ofType(Types.CHAR).withSize(36).notNull());
        addMetadata(groupId, ColumnMetadata.named("group_id").withIndex(1).ofType(Types.CHAR).withSize(36).notNull());
    }

}

