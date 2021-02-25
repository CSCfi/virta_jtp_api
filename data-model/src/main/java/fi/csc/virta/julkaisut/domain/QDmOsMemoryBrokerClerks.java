package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmOsMemoryBrokerClerks is a Querydsl query type for QDmOsMemoryBrokerClerks
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmOsMemoryBrokerClerks extends com.querydsl.sql.RelationalPathBase<QDmOsMemoryBrokerClerks> {

    private static final long serialVersionUID = -1579509022;

    public static final QDmOsMemoryBrokerClerks dmOsMemoryBrokerClerks = new QDmOsMemoryBrokerClerks("dm_os_memory_broker_clerks");

    public final StringPath clerkName = createString("clerkName");

    public final NumberPath<Double> externalBenefit = createNumber("externalBenefit", Double.class);

    public final NumberPath<Double> internalBenefit = createNumber("internalBenefit", Double.class);

    public final NumberPath<Long> internalFreedKb = createNumber("internalFreedKb", Long.class);

    public final NumberPath<Long> periodicFreedKb = createNumber("periodicFreedKb", Long.class);

    public final NumberPath<Long> simulatedKb = createNumber("simulatedKb", Long.class);

    public final NumberPath<Double> simulationBenefit = createNumber("simulationBenefit", Double.class);

    public final NumberPath<Long> totalKb = createNumber("totalKb", Long.class);

    public final NumberPath<Double> valueOfMemory = createNumber("valueOfMemory", Double.class);

    public QDmOsMemoryBrokerClerks(String variable) {
        super(QDmOsMemoryBrokerClerks.class, forVariable(variable), "sys", "dm_os_memory_broker_clerks");
        addMetadata();
    }

    public QDmOsMemoryBrokerClerks(String variable, String schema, String table) {
        super(QDmOsMemoryBrokerClerks.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmOsMemoryBrokerClerks(Path<? extends QDmOsMemoryBrokerClerks> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_os_memory_broker_clerks");
        addMetadata();
    }

    public QDmOsMemoryBrokerClerks(PathMetadata metadata) {
        super(QDmOsMemoryBrokerClerks.class, metadata, "sys", "dm_os_memory_broker_clerks");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(clerkName, ColumnMetadata.named("clerk_name").withIndex(1).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(externalBenefit, ColumnMetadata.named("external_benefit").withIndex(6).ofType(Types.DOUBLE).withSize(53).notNull());
        addMetadata(internalBenefit, ColumnMetadata.named("internal_benefit").withIndex(5).ofType(Types.DOUBLE).withSize(53).notNull());
        addMetadata(internalFreedKb, ColumnMetadata.named("internal_freed_kb").withIndex(9).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(periodicFreedKb, ColumnMetadata.named("periodic_freed_kb").withIndex(8).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(simulatedKb, ColumnMetadata.named("simulated_kb").withIndex(3).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(simulationBenefit, ColumnMetadata.named("simulation_benefit").withIndex(4).ofType(Types.DOUBLE).withSize(53).notNull());
        addMetadata(totalKb, ColumnMetadata.named("total_kb").withIndex(2).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(valueOfMemory, ColumnMetadata.named("value_of_memory").withIndex(7).ofType(Types.DOUBLE).withSize(53).notNull());
    }

}

