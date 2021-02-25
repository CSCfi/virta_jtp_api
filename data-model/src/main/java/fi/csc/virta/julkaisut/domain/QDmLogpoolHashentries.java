package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmLogpoolHashentries is a Querydsl query type for QDmLogpoolHashentries
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmLogpoolHashentries extends com.querydsl.sql.RelationalPathBase<QDmLogpoolHashentries> {

    private static final long serialVersionUID = 1325973000;

    public static final QDmLogpoolHashentries dmLogpoolHashentries = new QDmLogpoolHashentries("dm_logpool_hashentries");

    public final NumberPath<Integer> bucketNo = createNumber("bucketNo", Integer.class);

    public final SimplePath<byte[]> cacheBuffer = createSimple("cacheBuffer", byte[].class);

    public final NumberPath<Integer> databaseId = createNumber("databaseId", Integer.class);

    public final NumberPath<Long> logBlockId = createNumber("logBlockId", Long.class);

    public final NumberPath<Integer> recoveryUnitId = createNumber("recoveryUnitId", Integer.class);

    public QDmLogpoolHashentries(String variable) {
        super(QDmLogpoolHashentries.class, forVariable(variable), "sys", "dm_logpool_hashentries");
        addMetadata();
    }

    public QDmLogpoolHashentries(String variable, String schema, String table) {
        super(QDmLogpoolHashentries.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmLogpoolHashentries(Path<? extends QDmLogpoolHashentries> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_logpool_hashentries");
        addMetadata();
    }

    public QDmLogpoolHashentries(PathMetadata metadata) {
        super(QDmLogpoolHashentries.class, metadata, "sys", "dm_logpool_hashentries");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(bucketNo, ColumnMetadata.named("bucket_no").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(cacheBuffer, ColumnMetadata.named("cache_buffer").withIndex(5).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(databaseId, ColumnMetadata.named("database_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(logBlockId, ColumnMetadata.named("log_block_id").withIndex(4).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(recoveryUnitId, ColumnMetadata.named("recovery_unit_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

