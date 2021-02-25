package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmOsMemoryNodeAccessStats is a Querydsl query type for QDmOsMemoryNodeAccessStats
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmOsMemoryNodeAccessStats extends com.querydsl.sql.RelationalPathBase<QDmOsMemoryNodeAccessStats> {

    private static final long serialVersionUID = -1759704210;

    public static final QDmOsMemoryNodeAccessStats dmOsMemoryNodeAccessStats = new QDmOsMemoryNodeAccessStats("dm_os_memory_node_access_stats");

    public final NumberPath<Integer> localNode = createNumber("localNode", Integer.class);

    public final StringPath pageClass = createString("pageClass");

    public final NumberPath<Long> readCount = createNumber("readCount", Long.class);

    public final NumberPath<Integer> remoteNode = createNumber("remoteNode", Integer.class);

    public final NumberPath<Long> writeCount = createNumber("writeCount", Long.class);

    public QDmOsMemoryNodeAccessStats(String variable) {
        super(QDmOsMemoryNodeAccessStats.class, forVariable(variable), "sys", "dm_os_memory_node_access_stats");
        addMetadata();
    }

    public QDmOsMemoryNodeAccessStats(String variable, String schema, String table) {
        super(QDmOsMemoryNodeAccessStats.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmOsMemoryNodeAccessStats(Path<? extends QDmOsMemoryNodeAccessStats> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_os_memory_node_access_stats");
        addMetadata();
    }

    public QDmOsMemoryNodeAccessStats(PathMetadata metadata) {
        super(QDmOsMemoryNodeAccessStats.class, metadata, "sys", "dm_os_memory_node_access_stats");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(localNode, ColumnMetadata.named("local_node").withIndex(1).ofType(Types.INTEGER).withSize(10));
        addMetadata(pageClass, ColumnMetadata.named("page_class").withIndex(3).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(readCount, ColumnMetadata.named("read_count").withIndex(4).ofType(Types.BIGINT).withSize(19));
        addMetadata(remoteNode, ColumnMetadata.named("remote_node").withIndex(2).ofType(Types.INTEGER).withSize(10));
        addMetadata(writeCount, ColumnMetadata.named("write_count").withIndex(5).ofType(Types.BIGINT).withSize(19));
    }

}

