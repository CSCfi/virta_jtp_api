package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDatabaseFiles is a Querydsl query type for QDatabaseFiles
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDatabaseFiles extends com.querydsl.sql.RelationalPathBase<QDatabaseFiles> {

    private static final long serialVersionUID = -349220609;

    public static final QDatabaseFiles databaseFiles = new QDatabaseFiles("database_files");

    public final NumberPath<java.math.BigInteger> backupLsn = createNumber("backupLsn", java.math.BigInteger.class);

    public final NumberPath<java.math.BigInteger> createLsn = createNumber("createLsn", java.math.BigInteger.class);

    public final NumberPath<Integer> dataSpaceId = createNumber("dataSpaceId", Integer.class);

    public final StringPath differentialBaseGuid = createString("differentialBaseGuid");

    public final NumberPath<java.math.BigInteger> differentialBaseLsn = createNumber("differentialBaseLsn", java.math.BigInteger.class);

    public final DateTimePath<java.sql.Timestamp> differentialBaseTime = createDateTime("differentialBaseTime", java.sql.Timestamp.class);

    public final NumberPath<java.math.BigInteger> dropLsn = createNumber("dropLsn", java.math.BigInteger.class);

    public final StringPath fileGuid = createString("fileGuid");

    public final NumberPath<Integer> fileId = createNumber("fileId", Integer.class);

    public final NumberPath<Integer> growth = createNumber("growth", Integer.class);

    public final BooleanPath isMediaReadOnly = createBoolean("isMediaReadOnly");

    public final BooleanPath isNameReserved = createBoolean("isNameReserved");

    public final BooleanPath isPercentGrowth = createBoolean("isPercentGrowth");

    public final BooleanPath isReadOnly = createBoolean("isReadOnly");

    public final BooleanPath isSparse = createBoolean("isSparse");

    public final NumberPath<Integer> maxSize = createNumber("maxSize", Integer.class);

    public final StringPath name = createString("name");

    public final StringPath physicalName = createString("physicalName");

    public final NumberPath<java.math.BigInteger> readOnlyLsn = createNumber("readOnlyLsn", java.math.BigInteger.class);

    public final NumberPath<java.math.BigInteger> readWriteLsn = createNumber("readWriteLsn", java.math.BigInteger.class);

    public final StringPath redoStartForkGuid = createString("redoStartForkGuid");

    public final NumberPath<java.math.BigInteger> redoStartLsn = createNumber("redoStartLsn", java.math.BigInteger.class);

    public final StringPath redoTargetForkGuid = createString("redoTargetForkGuid");

    public final NumberPath<java.math.BigInteger> redoTargetLsn = createNumber("redoTargetLsn", java.math.BigInteger.class);

    public final NumberPath<Integer> size = createNumber("size", Integer.class);

    public final NumberPath<Byte> state = createNumber("state", Byte.class);

    public final StringPath stateDesc = createString("stateDesc");

    public final NumberPath<Byte> type = createNumber("type", Byte.class);

    public final StringPath typeDesc = createString("typeDesc");

    public QDatabaseFiles(String variable) {
        super(QDatabaseFiles.class, forVariable(variable), "sys", "database_files");
        addMetadata();
    }

    public QDatabaseFiles(String variable, String schema, String table) {
        super(QDatabaseFiles.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDatabaseFiles(Path<? extends QDatabaseFiles> path) {
        super(path.getType(), path.getMetadata(), "sys", "database_files");
        addMetadata();
    }

    public QDatabaseFiles(PathMetadata metadata) {
        super(QDatabaseFiles.class, metadata, "sys", "database_files");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(backupLsn, ColumnMetadata.named("backup_lsn").withIndex(29).ofType(Types.NUMERIC).withSize(25));
        addMetadata(createLsn, ColumnMetadata.named("create_lsn").withIndex(18).ofType(Types.NUMERIC).withSize(25));
        addMetadata(dataSpaceId, ColumnMetadata.named("data_space_id").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(differentialBaseGuid, ColumnMetadata.named("differential_base_guid").withIndex(23).ofType(Types.CHAR).withSize(36));
        addMetadata(differentialBaseLsn, ColumnMetadata.named("differential_base_lsn").withIndex(22).ofType(Types.NUMERIC).withSize(25));
        addMetadata(differentialBaseTime, ColumnMetadata.named("differential_base_time").withIndex(24).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(dropLsn, ColumnMetadata.named("drop_lsn").withIndex(19).ofType(Types.NUMERIC).withSize(25));
        addMetadata(fileGuid, ColumnMetadata.named("file_guid").withIndex(2).ofType(Types.CHAR).withSize(36));
        addMetadata(fileId, ColumnMetadata.named("file_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(growth, ColumnMetadata.named("growth").withIndex(12).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(isMediaReadOnly, ColumnMetadata.named("is_media_read_only").withIndex(13).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isNameReserved, ColumnMetadata.named("is_name_reserved").withIndex(17).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isPercentGrowth, ColumnMetadata.named("is_percent_growth").withIndex(16).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isReadOnly, ColumnMetadata.named("is_read_only").withIndex(14).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isSparse, ColumnMetadata.named("is_sparse").withIndex(15).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(maxSize, ColumnMetadata.named("max_size").withIndex(11).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(6).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(physicalName, ColumnMetadata.named("physical_name").withIndex(7).ofType(Types.NVARCHAR).withSize(260).notNull());
        addMetadata(readOnlyLsn, ColumnMetadata.named("read_only_lsn").withIndex(20).ofType(Types.NUMERIC).withSize(25));
        addMetadata(readWriteLsn, ColumnMetadata.named("read_write_lsn").withIndex(21).ofType(Types.NUMERIC).withSize(25));
        addMetadata(redoStartForkGuid, ColumnMetadata.named("redo_start_fork_guid").withIndex(26).ofType(Types.CHAR).withSize(36));
        addMetadata(redoStartLsn, ColumnMetadata.named("redo_start_lsn").withIndex(25).ofType(Types.NUMERIC).withSize(25));
        addMetadata(redoTargetForkGuid, ColumnMetadata.named("redo_target_fork_guid").withIndex(28).ofType(Types.CHAR).withSize(36));
        addMetadata(redoTargetLsn, ColumnMetadata.named("redo_target_lsn").withIndex(27).ofType(Types.NUMERIC).withSize(25));
        addMetadata(size, ColumnMetadata.named("size").withIndex(10).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(state, ColumnMetadata.named("state").withIndex(8).ofType(Types.TINYINT).withSize(3));
        addMetadata(stateDesc, ColumnMetadata.named("state_desc").withIndex(9).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(type, ColumnMetadata.named("type").withIndex(3).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(typeDesc, ColumnMetadata.named("type_desc").withIndex(4).ofType(Types.NVARCHAR).withSize(60));
    }

}

