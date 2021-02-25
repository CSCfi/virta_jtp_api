package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAvailabilityGroups is a Querydsl query type for QAvailabilityGroups
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAvailabilityGroups extends com.querydsl.sql.RelationalPathBase<QAvailabilityGroups> {

    private static final long serialVersionUID = 1426774444;

    public static final QAvailabilityGroups availabilityGroups = new QAvailabilityGroups("availability_groups");

    public final NumberPath<Byte> automatedBackupPreference = createNumber("automatedBackupPreference", Byte.class);

    public final StringPath automatedBackupPreferenceDesc = createString("automatedBackupPreferenceDesc");

    public final NumberPath<Integer> failureConditionLevel = createNumber("failureConditionLevel", Integer.class);

    public final StringPath groupId = createString("groupId");

    public final NumberPath<Integer> healthCheckTimeout = createNumber("healthCheckTimeout", Integer.class);

    public final StringPath name = createString("name");

    public final StringPath resourceGroupId = createString("resourceGroupId");

    public final StringPath resourceId = createString("resourceId");

    public QAvailabilityGroups(String variable) {
        super(QAvailabilityGroups.class, forVariable(variable), "sys", "availability_groups");
        addMetadata();
    }

    public QAvailabilityGroups(String variable, String schema, String table) {
        super(QAvailabilityGroups.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAvailabilityGroups(Path<? extends QAvailabilityGroups> path) {
        super(path.getType(), path.getMetadata(), "sys", "availability_groups");
        addMetadata();
    }

    public QAvailabilityGroups(PathMetadata metadata) {
        super(QAvailabilityGroups.class, metadata, "sys", "availability_groups");
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

