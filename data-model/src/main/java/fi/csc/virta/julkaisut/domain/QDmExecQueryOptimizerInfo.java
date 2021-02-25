package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmExecQueryOptimizerInfo is a Querydsl query type for QDmExecQueryOptimizerInfo
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmExecQueryOptimizerInfo extends com.querydsl.sql.RelationalPathBase<QDmExecQueryOptimizerInfo> {

    private static final long serialVersionUID = -1810567470;

    public static final QDmExecQueryOptimizerInfo dmExecQueryOptimizerInfo = new QDmExecQueryOptimizerInfo("dm_exec_query_optimizer_info");

    public final StringPath counter = createString("counter");

    public final NumberPath<Long> occurrence = createNumber("occurrence", Long.class);

    public final NumberPath<Double> value = createNumber("value", Double.class);

    public QDmExecQueryOptimizerInfo(String variable) {
        super(QDmExecQueryOptimizerInfo.class, forVariable(variable), "sys", "dm_exec_query_optimizer_info");
        addMetadata();
    }

    public QDmExecQueryOptimizerInfo(String variable, String schema, String table) {
        super(QDmExecQueryOptimizerInfo.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmExecQueryOptimizerInfo(Path<? extends QDmExecQueryOptimizerInfo> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_exec_query_optimizer_info");
        addMetadata();
    }

    public QDmExecQueryOptimizerInfo(PathMetadata metadata) {
        super(QDmExecQueryOptimizerInfo.class, metadata, "sys", "dm_exec_query_optimizer_info");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(counter, ColumnMetadata.named("counter").withIndex(1).ofType(Types.NVARCHAR).withSize(4000).notNull());
        addMetadata(occurrence, ColumnMetadata.named("occurrence").withIndex(2).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(value, ColumnMetadata.named("value").withIndex(3).ofType(Types.DOUBLE).withSize(53));
    }

}

