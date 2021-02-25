package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmFtsPopulationRanges is a Querydsl query type for QDmFtsPopulationRanges
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmFtsPopulationRanges extends com.querydsl.sql.RelationalPathBase<QDmFtsPopulationRanges> {

    private static final long serialVersionUID = -494883582;

    public static final QDmFtsPopulationRanges dmFtsPopulationRanges = new QDmFtsPopulationRanges("dm_fts_population_ranges");

    public final NumberPath<Integer> errorCount = createNumber("errorCount", Integer.class);

    public final BooleanPath isRetry = createBoolean("isRetry");

    public final SimplePath<byte[]> memoryAddress = createSimple("memoryAddress", byte[].class);

    public final SimplePath<byte[]> parentMemoryAddress = createSimple("parentMemoryAddress", byte[].class);

    public final NumberPath<Integer> processedRowCount = createNumber("processedRowCount", Integer.class);

    public final NumberPath<Short> sessionId = createNumber("sessionId", Short.class);

    public QDmFtsPopulationRanges(String variable) {
        super(QDmFtsPopulationRanges.class, forVariable(variable), "sys", "dm_fts_population_ranges");
        addMetadata();
    }

    public QDmFtsPopulationRanges(String variable, String schema, String table) {
        super(QDmFtsPopulationRanges.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmFtsPopulationRanges(Path<? extends QDmFtsPopulationRanges> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_fts_population_ranges");
        addMetadata();
    }

    public QDmFtsPopulationRanges(PathMetadata metadata) {
        super(QDmFtsPopulationRanges.class, metadata, "sys", "dm_fts_population_ranges");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(errorCount, ColumnMetadata.named("error_count").withIndex(6).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(isRetry, ColumnMetadata.named("is_retry").withIndex(3).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(memoryAddress, ColumnMetadata.named("memory_address").withIndex(1).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(parentMemoryAddress, ColumnMetadata.named("parent_memory_address").withIndex(2).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(processedRowCount, ColumnMetadata.named("processed_row_count").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(sessionId, ColumnMetadata.named("session_id").withIndex(4).ofType(Types.SMALLINT).withSize(5).notNull());
    }

}

