package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmClrAppdomains is a Querydsl query type for QDmClrAppdomains
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmClrAppdomains extends com.querydsl.sql.RelationalPathBase<QDmClrAppdomains> {

    private static final long serialVersionUID = -590136975;

    public static final QDmClrAppdomains dmClrAppdomains = new QDmClrAppdomains("dm_clr_appdomains");

    public final SimplePath<byte[]> appdomainAddress = createSimple("appdomainAddress", byte[].class);

    public final NumberPath<Integer> appdomainId = createNumber("appdomainId", Integer.class);

    public final StringPath appdomainName = createString("appdomainName");

    public final NumberPath<Integer> compatibilityLevel = createNumber("compatibilityLevel", Integer.class);

    public final NumberPath<Integer> cost = createNumber("cost", Integer.class);

    public final DateTimePath<java.sql.Timestamp> creationTime = createDateTime("creationTime", java.sql.Timestamp.class);

    public final NumberPath<Integer> dbId = createNumber("dbId", Integer.class);

    public final StringPath state = createString("state");

    public final NumberPath<Integer> strongRefcount = createNumber("strongRefcount", Integer.class);

    public final NumberPath<Long> survivedMemoryKb = createNumber("survivedMemoryKb", Long.class);

    public final NumberPath<Long> totalAllocatedMemoryKb = createNumber("totalAllocatedMemoryKb", Long.class);

    public final NumberPath<Long> totalProcessorTimeMs = createNumber("totalProcessorTimeMs", Long.class);

    public final NumberPath<Integer> userId = createNumber("userId", Integer.class);

    public final NumberPath<Integer> value = createNumber("value", Integer.class);

    public final NumberPath<Integer> weakRefcount = createNumber("weakRefcount", Integer.class);

    public QDmClrAppdomains(String variable) {
        super(QDmClrAppdomains.class, forVariable(variable), "sys", "dm_clr_appdomains");
        addMetadata();
    }

    public QDmClrAppdomains(String variable, String schema, String table) {
        super(QDmClrAppdomains.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmClrAppdomains(Path<? extends QDmClrAppdomains> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_clr_appdomains");
        addMetadata();
    }

    public QDmClrAppdomains(PathMetadata metadata) {
        super(QDmClrAppdomains.class, metadata, "sys", "dm_clr_appdomains");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(appdomainAddress, ColumnMetadata.named("appdomain_address").withIndex(1).ofType(Types.VARBINARY).withSize(8));
        addMetadata(appdomainId, ColumnMetadata.named("appdomain_id").withIndex(2).ofType(Types.INTEGER).withSize(10));
        addMetadata(appdomainName, ColumnMetadata.named("appdomain_name").withIndex(3).ofType(Types.NVARCHAR).withSize(386));
        addMetadata(compatibilityLevel, ColumnMetadata.named("compatibility_level").withIndex(12).ofType(Types.INTEGER).withSize(10));
        addMetadata(cost, ColumnMetadata.named("cost").withIndex(10).ofType(Types.INTEGER).withSize(10));
        addMetadata(creationTime, ColumnMetadata.named("creation_time").withIndex(4).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(dbId, ColumnMetadata.named("db_id").withIndex(5).ofType(Types.INTEGER).withSize(10));
        addMetadata(state, ColumnMetadata.named("state").withIndex(7).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(strongRefcount, ColumnMetadata.named("strong_refcount").withIndex(8).ofType(Types.INTEGER).withSize(10));
        addMetadata(survivedMemoryKb, ColumnMetadata.named("survived_memory_kb").withIndex(15).ofType(Types.BIGINT).withSize(19));
        addMetadata(totalAllocatedMemoryKb, ColumnMetadata.named("total_allocated_memory_kb").withIndex(14).ofType(Types.BIGINT).withSize(19));
        addMetadata(totalProcessorTimeMs, ColumnMetadata.named("total_processor_time_ms").withIndex(13).ofType(Types.BIGINT).withSize(19));
        addMetadata(userId, ColumnMetadata.named("user_id").withIndex(6).ofType(Types.INTEGER).withSize(10));
        addMetadata(value, ColumnMetadata.named("value").withIndex(11).ofType(Types.INTEGER).withSize(10));
        addMetadata(weakRefcount, ColumnMetadata.named("weak_refcount").withIndex(9).ofType(Types.INTEGER).withSize(10));
    }

}

