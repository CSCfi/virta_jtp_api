package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDatabases is a Querydsl query type for QDatabases
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDatabases extends com.querydsl.sql.RelationalPathBase<QDatabases> {

    private static final long serialVersionUID = 1476467483;

    public static final QDatabases databases = new QDatabases("databases");

    public final StringPath collationName = createString("collationName");

    public final NumberPath<Byte> compatibilityLevel = createNumber("compatibilityLevel", Byte.class);

    public final NumberPath<Byte> containment = createNumber("containment", Byte.class);

    public final StringPath containmentDesc = createString("containmentDesc");

    public final DateTimePath<java.sql.Timestamp> createDate = createDateTime("createDate", java.sql.Timestamp.class);

    public final NumberPath<Integer> databaseId = createNumber("databaseId", Integer.class);

    public final NumberPath<Integer> defaultFulltextLanguageLcid = createNumber("defaultFulltextLanguageLcid", Integer.class);

    public final StringPath defaultFulltextLanguageName = createString("defaultFulltextLanguageName");

    public final NumberPath<Short> defaultLanguageLcid = createNumber("defaultLanguageLcid", Short.class);

    public final StringPath defaultLanguageName = createString("defaultLanguageName");

    public final StringPath groupDatabaseId = createString("groupDatabaseId");

    public final BooleanPath isAnsiNullDefaultOn = createBoolean("isAnsiNullDefaultOn");

    public final BooleanPath isAnsiNullsOn = createBoolean("isAnsiNullsOn");

    public final BooleanPath isAnsiPaddingOn = createBoolean("isAnsiPaddingOn");

    public final BooleanPath isAnsiWarningsOn = createBoolean("isAnsiWarningsOn");

    public final BooleanPath isArithabortOn = createBoolean("isArithabortOn");

    public final BooleanPath isAutoCloseOn = createBoolean("isAutoCloseOn");

    public final BooleanPath isAutoCreateStatsOn = createBoolean("isAutoCreateStatsOn");

    public final BooleanPath isAutoShrinkOn = createBoolean("isAutoShrinkOn");

    public final BooleanPath isAutoUpdateStatsAsyncOn = createBoolean("isAutoUpdateStatsAsyncOn");

    public final BooleanPath isAutoUpdateStatsOn = createBoolean("isAutoUpdateStatsOn");

    public final BooleanPath isBrokerEnabled = createBoolean("isBrokerEnabled");

    public final BooleanPath isCdcEnabled = createBoolean("isCdcEnabled");

    public final BooleanPath isCleanlyShutdown = createBoolean("isCleanlyShutdown");

    public final BooleanPath isConcatNullYieldsNullOn = createBoolean("isConcatNullYieldsNullOn");

    public final BooleanPath isCursorCloseOnCommitOn = createBoolean("isCursorCloseOnCommitOn");

    public final BooleanPath isDateCorrelationOn = createBoolean("isDateCorrelationOn");

    public final BooleanPath isDbChainingOn = createBoolean("isDbChainingOn");

    public final BooleanPath isDistributor = createBoolean("isDistributor");

    public final BooleanPath isEncrypted = createBoolean("isEncrypted");

    public final BooleanPath isFulltextEnabled = createBoolean("isFulltextEnabled");

    public final BooleanPath isHonorBrokerPriorityOn = createBoolean("isHonorBrokerPriorityOn");

    public final BooleanPath isInStandby = createBoolean("isInStandby");

    public final BooleanPath isLocalCursorDefault = createBoolean("isLocalCursorDefault");

    public final BooleanPath isMasterKeyEncryptedByServer = createBoolean("isMasterKeyEncryptedByServer");

    public final BooleanPath isMergePublished = createBoolean("isMergePublished");

    public final BooleanPath isNestedTriggersOn = createBoolean("isNestedTriggersOn");

    public final BooleanPath isNumericRoundabortOn = createBoolean("isNumericRoundabortOn");

    public final BooleanPath isParameterizationForced = createBoolean("isParameterizationForced");

    public final BooleanPath isPublished = createBoolean("isPublished");

    public final BooleanPath isQuotedIdentifierOn = createBoolean("isQuotedIdentifierOn");

    public final BooleanPath isReadCommittedSnapshotOn = createBoolean("isReadCommittedSnapshotOn");

    public final BooleanPath isReadOnly = createBoolean("isReadOnly");

    public final BooleanPath isRecursiveTriggersOn = createBoolean("isRecursiveTriggersOn");

    public final BooleanPath isSubscribed = createBoolean("isSubscribed");

    public final BooleanPath isSupplementalLoggingEnabled = createBoolean("isSupplementalLoggingEnabled");

    public final BooleanPath isSyncWithBackup = createBoolean("isSyncWithBackup");

    public final BooleanPath isTransformNoiseWordsOn = createBoolean("isTransformNoiseWordsOn");

    public final BooleanPath isTrustworthyOn = createBoolean("isTrustworthyOn");

    public final NumberPath<Byte> logReuseWait = createNumber("logReuseWait", Byte.class);

    public final StringPath logReuseWaitDesc = createString("logReuseWaitDesc");

    public final StringPath name = createString("name");

    public final SimplePath<byte[]> ownerSid = createSimple("ownerSid", byte[].class);

    public final NumberPath<Byte> pageVerifyOption = createNumber("pageVerifyOption", Byte.class);

    public final StringPath pageVerifyOptionDesc = createString("pageVerifyOptionDesc");

    public final NumberPath<Byte> recoveryModel = createNumber("recoveryModel", Byte.class);

    public final StringPath recoveryModelDesc = createString("recoveryModelDesc");

    public final StringPath replicaId = createString("replicaId");

    public final StringPath serviceBrokerGuid = createString("serviceBrokerGuid");

    public final NumberPath<Byte> snapshotIsolationState = createNumber("snapshotIsolationState", Byte.class);

    public final StringPath snapshotIsolationStateDesc = createString("snapshotIsolationStateDesc");

    public final NumberPath<Integer> sourceDatabaseId = createNumber("sourceDatabaseId", Integer.class);

    public final NumberPath<Byte> state = createNumber("state", Byte.class);

    public final StringPath stateDesc = createString("stateDesc");

    public final NumberPath<Integer> targetRecoveryTimeInSeconds = createNumber("targetRecoveryTimeInSeconds", Integer.class);

    public final NumberPath<Short> twoDigitYearCutoff = createNumber("twoDigitYearCutoff", Short.class);

    public final NumberPath<Byte> userAccess = createNumber("userAccess", Byte.class);

    public final StringPath userAccessDesc = createString("userAccessDesc");

    public QDatabases(String variable) {
        super(QDatabases.class, forVariable(variable), "sys", "databases");
        addMetadata();
    }

    public QDatabases(String variable, String schema, String table) {
        super(QDatabases.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDatabases(Path<? extends QDatabases> path) {
        super(path.getType(), path.getMetadata(), "sys", "databases");
        addMetadata();
    }

    public QDatabases(PathMetadata metadata) {
        super(QDatabases.class, metadata, "sys", "databases");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(collationName, ColumnMetadata.named("collation_name").withIndex(7).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(compatibilityLevel, ColumnMetadata.named("compatibility_level").withIndex(6).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(containment, ColumnMetadata.named("containment").withIndex(66).ofType(Types.TINYINT).withSize(3));
        addMetadata(containmentDesc, ColumnMetadata.named("containment_desc").withIndex(67).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(createDate, ColumnMetadata.named("create_date").withIndex(5).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(databaseId, ColumnMetadata.named("database_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(defaultFulltextLanguageLcid, ColumnMetadata.named("default_fulltext_language_lcid").withIndex(61).ofType(Types.INTEGER).withSize(10));
        addMetadata(defaultFulltextLanguageName, ColumnMetadata.named("default_fulltext_language_name").withIndex(62).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(defaultLanguageLcid, ColumnMetadata.named("default_language_lcid").withIndex(59).ofType(Types.SMALLINT).withSize(5));
        addMetadata(defaultLanguageName, ColumnMetadata.named("default_language_name").withIndex(60).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(groupDatabaseId, ColumnMetadata.named("group_database_id").withIndex(58).ofType(Types.CHAR).withSize(36));
        addMetadata(isAnsiNullDefaultOn, ColumnMetadata.named("is_ansi_null_default_on").withIndex(28).ofType(Types.BIT).withSize(1));
        addMetadata(isAnsiNullsOn, ColumnMetadata.named("is_ansi_nulls_on").withIndex(29).ofType(Types.BIT).withSize(1));
        addMetadata(isAnsiPaddingOn, ColumnMetadata.named("is_ansi_padding_on").withIndex(30).ofType(Types.BIT).withSize(1));
        addMetadata(isAnsiWarningsOn, ColumnMetadata.named("is_ansi_warnings_on").withIndex(31).ofType(Types.BIT).withSize(1));
        addMetadata(isArithabortOn, ColumnMetadata.named("is_arithabort_on").withIndex(32).ofType(Types.BIT).withSize(1));
        addMetadata(isAutoCloseOn, ColumnMetadata.named("is_auto_close_on").withIndex(11).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isAutoCreateStatsOn, ColumnMetadata.named("is_auto_create_stats_on").withIndex(25).ofType(Types.BIT).withSize(1));
        addMetadata(isAutoShrinkOn, ColumnMetadata.named("is_auto_shrink_on").withIndex(12).ofType(Types.BIT).withSize(1));
        addMetadata(isAutoUpdateStatsAsyncOn, ColumnMetadata.named("is_auto_update_stats_async_on").withIndex(27).ofType(Types.BIT).withSize(1));
        addMetadata(isAutoUpdateStatsOn, ColumnMetadata.named("is_auto_update_stats_on").withIndex(26).ofType(Types.BIT).withSize(1));
        addMetadata(isBrokerEnabled, ColumnMetadata.named("is_broker_enabled").withIndex(50).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isCdcEnabled, ColumnMetadata.named("is_cdc_enabled").withIndex(54).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isCleanlyShutdown, ColumnMetadata.named("is_cleanly_shutdown").withIndex(16).ofType(Types.BIT).withSize(1));
        addMetadata(isConcatNullYieldsNullOn, ColumnMetadata.named("is_concat_null_yields_null_on").withIndex(33).ofType(Types.BIT).withSize(1));
        addMetadata(isCursorCloseOnCommitOn, ColumnMetadata.named("is_cursor_close_on_commit_on").withIndex(37).ofType(Types.BIT).withSize(1));
        addMetadata(isDateCorrelationOn, ColumnMetadata.named("is_date_correlation_on").withIndex(53).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isDbChainingOn, ColumnMetadata.named("is_db_chaining_on").withIndex(41).ofType(Types.BIT).withSize(1));
        addMetadata(isDistributor, ColumnMetadata.named("is_distributor").withIndex(47).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isEncrypted, ColumnMetadata.named("is_encrypted").withIndex(55).ofType(Types.BIT).withSize(1));
        addMetadata(isFulltextEnabled, ColumnMetadata.named("is_fulltext_enabled").withIndex(39).ofType(Types.BIT).withSize(1));
        addMetadata(isHonorBrokerPriorityOn, ColumnMetadata.named("is_honor_broker_priority_on").withIndex(56).ofType(Types.BIT).withSize(1));
        addMetadata(isInStandby, ColumnMetadata.named("is_in_standby").withIndex(15).ofType(Types.BIT).withSize(1));
        addMetadata(isLocalCursorDefault, ColumnMetadata.named("is_local_cursor_default").withIndex(38).ofType(Types.BIT).withSize(1));
        addMetadata(isMasterKeyEncryptedByServer, ColumnMetadata.named("is_master_key_encrypted_by_server").withIndex(43).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isMergePublished, ColumnMetadata.named("is_merge_published").withIndex(46).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isNestedTriggersOn, ColumnMetadata.named("is_nested_triggers_on").withIndex(63).ofType(Types.BIT).withSize(1));
        addMetadata(isNumericRoundabortOn, ColumnMetadata.named("is_numeric_roundabort_on").withIndex(34).ofType(Types.BIT).withSize(1));
        addMetadata(isParameterizationForced, ColumnMetadata.named("is_parameterization_forced").withIndex(42).ofType(Types.BIT).withSize(1));
        addMetadata(isPublished, ColumnMetadata.named("is_published").withIndex(44).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isQuotedIdentifierOn, ColumnMetadata.named("is_quoted_identifier_on").withIndex(35).ofType(Types.BIT).withSize(1));
        addMetadata(isReadCommittedSnapshotOn, ColumnMetadata.named("is_read_committed_snapshot_on").withIndex(20).ofType(Types.BIT).withSize(1));
        addMetadata(isReadOnly, ColumnMetadata.named("is_read_only").withIndex(10).ofType(Types.BIT).withSize(1));
        addMetadata(isRecursiveTriggersOn, ColumnMetadata.named("is_recursive_triggers_on").withIndex(36).ofType(Types.BIT).withSize(1));
        addMetadata(isSubscribed, ColumnMetadata.named("is_subscribed").withIndex(45).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isSupplementalLoggingEnabled, ColumnMetadata.named("is_supplemental_logging_enabled").withIndex(17).ofType(Types.BIT).withSize(1));
        addMetadata(isSyncWithBackup, ColumnMetadata.named("is_sync_with_backup").withIndex(48).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isTransformNoiseWordsOn, ColumnMetadata.named("is_transform_noise_words_on").withIndex(64).ofType(Types.BIT).withSize(1));
        addMetadata(isTrustworthyOn, ColumnMetadata.named("is_trustworthy_on").withIndex(40).ofType(Types.BIT).withSize(1));
        addMetadata(logReuseWait, ColumnMetadata.named("log_reuse_wait").withIndex(51).ofType(Types.TINYINT).withSize(3));
        addMetadata(logReuseWaitDesc, ColumnMetadata.named("log_reuse_wait_desc").withIndex(52).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(ownerSid, ColumnMetadata.named("owner_sid").withIndex(4).ofType(Types.VARBINARY).withSize(85));
        addMetadata(pageVerifyOption, ColumnMetadata.named("page_verify_option").withIndex(23).ofType(Types.TINYINT).withSize(3));
        addMetadata(pageVerifyOptionDesc, ColumnMetadata.named("page_verify_option_desc").withIndex(24).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(recoveryModel, ColumnMetadata.named("recovery_model").withIndex(21).ofType(Types.TINYINT).withSize(3));
        addMetadata(recoveryModelDesc, ColumnMetadata.named("recovery_model_desc").withIndex(22).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(replicaId, ColumnMetadata.named("replica_id").withIndex(57).ofType(Types.CHAR).withSize(36));
        addMetadata(serviceBrokerGuid, ColumnMetadata.named("service_broker_guid").withIndex(49).ofType(Types.CHAR).withSize(36).notNull());
        addMetadata(snapshotIsolationState, ColumnMetadata.named("snapshot_isolation_state").withIndex(18).ofType(Types.TINYINT).withSize(3));
        addMetadata(snapshotIsolationStateDesc, ColumnMetadata.named("snapshot_isolation_state_desc").withIndex(19).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(sourceDatabaseId, ColumnMetadata.named("source_database_id").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(state, ColumnMetadata.named("state").withIndex(13).ofType(Types.TINYINT).withSize(3));
        addMetadata(stateDesc, ColumnMetadata.named("state_desc").withIndex(14).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(targetRecoveryTimeInSeconds, ColumnMetadata.named("target_recovery_time_in_seconds").withIndex(68).ofType(Types.INTEGER).withSize(10));
        addMetadata(twoDigitYearCutoff, ColumnMetadata.named("two_digit_year_cutoff").withIndex(65).ofType(Types.SMALLINT).withSize(5));
        addMetadata(userAccess, ColumnMetadata.named("user_access").withIndex(8).ofType(Types.TINYINT).withSize(3));
        addMetadata(userAccessDesc, ColumnMetadata.named("user_access_desc").withIndex(9).ofType(Types.NVARCHAR).withSize(60));
    }

}

