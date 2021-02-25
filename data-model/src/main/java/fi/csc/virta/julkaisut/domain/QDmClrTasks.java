package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmClrTasks is a Querydsl query type for QDmClrTasks
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmClrTasks extends com.querydsl.sql.RelationalPathBase<QDmClrTasks> {

    private static final long serialVersionUID = 431017771;

    public static final QDmClrTasks dmClrTasks = new QDmClrTasks("dm_clr_tasks");

    public final StringPath abortState = createString("abortState");

    public final NumberPath<Integer> affinityCount = createNumber("affinityCount", Integer.class);

    public final SimplePath<byte[]> appdomainAddress = createSimple("appdomainAddress", byte[].class);

    public final NumberPath<Integer> forcedYieldCount = createNumber("forcedYieldCount", Integer.class);

    public final SimplePath<byte[]> sosTaskAddress = createSimple("sosTaskAddress", byte[].class);

    public final StringPath state = createString("state");

    public final SimplePath<byte[]> taskAddress = createSimple("taskAddress", byte[].class);

    public final StringPath type = createString("type");

    public QDmClrTasks(String variable) {
        super(QDmClrTasks.class, forVariable(variable), "sys", "dm_clr_tasks");
        addMetadata();
    }

    public QDmClrTasks(String variable, String schema, String table) {
        super(QDmClrTasks.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmClrTasks(Path<? extends QDmClrTasks> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_clr_tasks");
        addMetadata();
    }

    public QDmClrTasks(PathMetadata metadata) {
        super(QDmClrTasks.class, metadata, "sys", "dm_clr_tasks");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(abortState, ColumnMetadata.named("abort_state").withIndex(5).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(affinityCount, ColumnMetadata.named("affinity_count").withIndex(7).ofType(Types.INTEGER).withSize(10));
        addMetadata(appdomainAddress, ColumnMetadata.named("appdomain_address").withIndex(3).ofType(Types.VARBINARY).withSize(8));
        addMetadata(forcedYieldCount, ColumnMetadata.named("forced_yield_count").withIndex(8).ofType(Types.INTEGER).withSize(10));
        addMetadata(sosTaskAddress, ColumnMetadata.named("sos_task_address").withIndex(2).ofType(Types.VARBINARY).withSize(8));
        addMetadata(state, ColumnMetadata.named("state").withIndex(4).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(taskAddress, ColumnMetadata.named("task_address").withIndex(1).ofType(Types.VARBINARY).withSize(8));
        addMetadata(type, ColumnMetadata.named("type").withIndex(6).ofType(Types.NVARCHAR).withSize(128));
    }

}

