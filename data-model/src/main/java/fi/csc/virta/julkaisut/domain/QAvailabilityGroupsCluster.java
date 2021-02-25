package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAvailabilityGroupsCluster is a Querydsl query type for QAvailabilityGroupsCluster
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAvailabilityGroupsCluster extends com.querydsl.sql.RelationalPathBase<QAvailabilityGroupsCluster> {

    private static final long serialVersionUID = 222090926;

    public static final QAvailabilityGroupsCluster availabilityGroupsCluster = new QAvailabilityGroupsCluster("availability_groups_cluster");

    public final NumberPath<Byte> automatedBackupPreference = createNumber("automatedBackupPreference", Byte.class);

    public final StringPath automatedBackupPreferenceDesc = createString("automatedBackupPreferenceDesc");

    public final NumberPath<Integer> failureConditionLevel = createNumber("failureConditionLevel", Integer.class);

    public final StringPath groupId = createString("groupId");

    public final NumberPath<Integer> healthCheckTimeout = createNumber("healthCheckTimeout", Integer.class);

    public final StringPath name = createString("name");

    public final StringPath resourceGroupId = createString("resourceGroupId");

    public final StringPath resourceId = createString("resourceId");

    public QAvailabilityGroupsCluster(String variable) {
        super(QAvailabilityGroupsCluster.class, forVariable(variable), "sys", "availability_groups_cluster");
        addMetadata();
    }

    public QAvailabilityGroupsCluster(String variable, String schema, String table) {
        super(QAvailabilityGroupsCluster.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAvailabilityGroupsCluster(Path<? extends QAvailabilityGroupsCluster> path) {
        super(path.getType(), path.getMetadata(), "sys", "availability_groups_cluster");
        addMetadata();
    }

    public QAvailabilityGroupsCluster(PathMetadata metadata) {
        super(QAvailabilityGroupsCluster.class, metadata, "sys", "availability_groups_cluster");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(automatedBackupPreference, ColumnMetadata.named("automated_backup_preference").withIndex(7).ofType(Types.TINYINT).withSize(3));
        addMetadata(automatedBackupPreferenceDesc, ColumnMetadata.named("automated_backup_preference_desc").withIndex(8).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(failureConditionLevel, ColumnMetadata.named("failure_condition_level").withIndex(5).ofType(Types.INTEGER).withSize(10));
        addMetadata(groupId, ColumnMetadata.named("group_id").withIndex(1).ofType(Types.CHAR).withSize(36).notNull());
        addMetadata(healthCheckTimeout, ColumnMetadata.named("health_check_timeout").withIndex(6).ofType(Types.INTEGER).withSize(10));
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(resourceGroupId, ColumnMetadata.named("resource_group_id").withIndex(4).ofType(Types.NVARCHAR).withSize(40));
        addMetadata(resourceId, ColumnMetadata.named("resource_id").withIndex(3).ofType(Types.NVARCHAR).withSize(40));
    }

}

