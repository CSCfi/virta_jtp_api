package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmLogpoolStats is a Querydsl query type for QDmLogpoolStats
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmLogpoolStats extends com.querydsl.sql.RelationalPathBase<QDmLogpoolStats> {

    private static final long serialVersionUID = -1070590107;

    public static final QDmLogpoolStats dmLogpoolStats = new QDmLogpoolStats("dm_logpool_stats");

    public final NumberPath<Integer> hashBucketCount = createNumber("hashBucketCount", Integer.class);

    public final NumberPath<Long> hashHits = createNumber("hashHits", Long.class);

    public final NumberPath<Long> hashHitTotalSearchLength = createNumber("hashHitTotalSearchLength", Long.class);

    public final NumberPath<Long> hashMisses = createNumber("hashMisses", Long.class);

    public final NumberPath<Long> hashMissTotalSearchLength = createNumber("hashMissTotalSearchLength", Long.class);

    public final NumberPath<Integer> logpoolmgrCount = createNumber("logpoolmgrCount", Integer.class);

    public final NumberPath<Integer> memStatus = createNumber("memStatus", Integer.class);

    public final NumberPath<Long> memStatusStamp = createNumber("memStatusStamp", Long.class);

    public final NumberPath<Long> privatePages = createNumber("privatePages", Long.class);

    public final NumberPath<Long> totalPages = createNumber("totalPages", Long.class);

    public QDmLogpoolStats(String variable) {
        super(QDmLogpoolStats.class, forVariable(variable), "sys", "dm_logpool_stats");
        addMetadata();
    }

    public QDmLogpoolStats(String variable, String schema, String table) {
        super(QDmLogpoolStats.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmLogpoolStats(Path<? extends QDmLogpoolStats> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_logpool_stats");
        addMetadata();
    }

    public QDmLogpoolStats(PathMetadata metadata) {
        super(QDmLogpoolStats.class, metadata, "sys", "dm_logpool_stats");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(hashBucketCount, ColumnMetadata.named("hash_bucket_count").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(hashHits, ColumnMetadata.named("hash_hits").withIndex(3).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(hashHitTotalSearchLength, ColumnMetadata.named("hash_hit_total_search_length").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(hashMisses, ColumnMetadata.named("hash_misses").withIndex(4).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(hashMissTotalSearchLength, ColumnMetadata.named("hash_miss_total_search_length").withIndex(2).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(logpoolmgrCount, ColumnMetadata.named("logpoolmgr_count").withIndex(8).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(memStatus, ColumnMetadata.named("mem_status").withIndex(7).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(memStatusStamp, ColumnMetadata.named("mem_status_stamp").withIndex(6).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(privatePages, ColumnMetadata.named("private_pages").withIndex(10).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(totalPages, ColumnMetadata.named("total_pages").withIndex(9).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

