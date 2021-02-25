package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmOsSpinlockStats is a Querydsl query type for QDmOsSpinlockStats
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmOsSpinlockStats extends com.querydsl.sql.RelationalPathBase<QDmOsSpinlockStats> {

    private static final long serialVersionUID = -2043540824;

    public static final QDmOsSpinlockStats dmOsSpinlockStats = new QDmOsSpinlockStats("dm_os_spinlock_stats");

    public final NumberPath<Integer> backoffs = createNumber("backoffs", Integer.class);

    public final NumberPath<Long> collisions = createNumber("collisions", Long.class);

    public final StringPath name = createString("name");

    public final NumberPath<Long> sleepTime = createNumber("sleepTime", Long.class);

    public final NumberPath<Long> spins = createNumber("spins", Long.class);

    public final NumberPath<Float> spinsPerCollision = createNumber("spinsPerCollision", Float.class);

    public QDmOsSpinlockStats(String variable) {
        super(QDmOsSpinlockStats.class, forVariable(variable), "sys", "dm_os_spinlock_stats");
        addMetadata();
    }

    public QDmOsSpinlockStats(String variable, String schema, String table) {
        super(QDmOsSpinlockStats.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmOsSpinlockStats(Path<? extends QDmOsSpinlockStats> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_os_spinlock_stats");
        addMetadata();
    }

    public QDmOsSpinlockStats(PathMetadata metadata) {
        super(QDmOsSpinlockStats.class, metadata, "sys", "dm_os_spinlock_stats");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(backoffs, ColumnMetadata.named("backoffs").withIndex(6).ofType(Types.INTEGER).withSize(10));
        addMetadata(collisions, ColumnMetadata.named("collisions").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(sleepTime, ColumnMetadata.named("sleep_time").withIndex(5).ofType(Types.BIGINT).withSize(19));
        addMetadata(spins, ColumnMetadata.named("spins").withIndex(3).ofType(Types.BIGINT).withSize(19));
        addMetadata(spinsPerCollision, ColumnMetadata.named("spins_per_collision").withIndex(4).ofType(Types.REAL).withSize(24));
    }

}

