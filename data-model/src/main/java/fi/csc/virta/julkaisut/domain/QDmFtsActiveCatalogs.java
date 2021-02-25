package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmFtsActiveCatalogs is a Querydsl query type for QDmFtsActiveCatalogs
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmFtsActiveCatalogs extends com.querydsl.sql.RelationalPathBase<QDmFtsActiveCatalogs> {

    private static final long serialVersionUID = -377388833;

    public static final QDmFtsActiveCatalogs dmFtsActiveCatalogs = new QDmFtsActiveCatalogs("dm_fts_active_catalogs");

    public final NumberPath<Integer> activeFtsIndexCount = createNumber("activeFtsIndexCount", Integer.class);

    public final NumberPath<Integer> autoPopulationCount = createNumber("autoPopulationCount", Integer.class);

    public final NumberPath<Integer> catalogId = createNumber("catalogId", Integer.class);

    public final NumberPath<Integer> databaseId = createNumber("databaseId", Integer.class);

    public final NumberPath<Integer> fullIncrementalPopulationCount = createNumber("fullIncrementalPopulationCount", Integer.class);

    public final BooleanPath isImporting = createBoolean("isImporting");

    public final BooleanPath isPaused = createBoolean("isPaused");

    public final NumberPath<Integer> manualPopulationCount = createNumber("manualPopulationCount", Integer.class);

    public final SimplePath<byte[]> memoryAddress = createSimple("memoryAddress", byte[].class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> previousStatus = createNumber("previousStatus", Integer.class);

    public final StringPath previousStatusDescription = createString("previousStatusDescription");

    public final NumberPath<Integer> rowCountInThousands = createNumber("rowCountInThousands", Integer.class);

    public final NumberPath<Integer> status = createNumber("status", Integer.class);

    public final StringPath statusDescription = createString("statusDescription");

    public final NumberPath<Integer> workerCount = createNumber("workerCount", Integer.class);

    public QDmFtsActiveCatalogs(String variable) {
        super(QDmFtsActiveCatalogs.class, forVariable(variable), "sys", "dm_fts_active_catalogs");
        addMetadata();
    }

    public QDmFtsActiveCatalogs(String variable, String schema, String table) {
        super(QDmFtsActiveCatalogs.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmFtsActiveCatalogs(Path<? extends QDmFtsActiveCatalogs> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_fts_active_catalogs");
        addMetadata();
    }

    public QDmFtsActiveCatalogs(PathMetadata metadata) {
        super(QDmFtsActiveCatalogs.class, metadata, "sys", "dm_fts_active_catalogs");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(activeFtsIndexCount, ColumnMetadata.named("active_fts_index_count").withIndex(11).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(autoPopulationCount, ColumnMetadata.named("auto_population_count").withIndex(12).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(catalogId, ColumnMetadata.named("catalog_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(databaseId, ColumnMetadata.named("database_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(fullIncrementalPopulationCount, ColumnMetadata.named("full_incremental_population_count").withIndex(14).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(isImporting, ColumnMetadata.named("is_importing").withIndex(16).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isPaused, ColumnMetadata.named("is_paused").withIndex(5).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(manualPopulationCount, ColumnMetadata.named("manual_population_count").withIndex(13).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(memoryAddress, ColumnMetadata.named("memory_address").withIndex(3).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(4).ofType(Types.NVARCHAR).withSize(4000).notNull());
        addMetadata(previousStatus, ColumnMetadata.named("previous_status").withIndex(8).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(previousStatusDescription, ColumnMetadata.named("previous_status_description").withIndex(9).ofType(Types.NVARCHAR).withSize(64));
        addMetadata(rowCountInThousands, ColumnMetadata.named("row_count_in_thousands").withIndex(15).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(status, ColumnMetadata.named("status").withIndex(6).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(statusDescription, ColumnMetadata.named("status_description").withIndex(7).ofType(Types.NVARCHAR).withSize(64));
        addMetadata(workerCount, ColumnMetadata.named("worker_count").withIndex(10).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

