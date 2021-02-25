package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QServerEventSessionTargets is a Querydsl query type for QServerEventSessionTargets
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QServerEventSessionTargets extends com.querydsl.sql.RelationalPathBase<QServerEventSessionTargets> {

    private static final long serialVersionUID = 1936323910;

    public static final QServerEventSessionTargets serverEventSessionTargets = new QServerEventSessionTargets("server_event_session_targets");

    public final NumberPath<Integer> eventSessionId = createNumber("eventSessionId", Integer.class);

    public final StringPath module = createString("module");

    public final StringPath name = createString("name");

    public final StringPath packageCol = createString("packageCol");

    public final NumberPath<Integer> targetId = createNumber("targetId", Integer.class);

    public QServerEventSessionTargets(String variable) {
        super(QServerEventSessionTargets.class, forVariable(variable), "sys", "server_event_session_targets");
        addMetadata();
    }

    public QServerEventSessionTargets(String variable, String schema, String table) {
        super(QServerEventSessionTargets.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QServerEventSessionTargets(Path<? extends QServerEventSessionTargets> path) {
        super(path.getType(), path.getMetadata(), "sys", "server_event_session_targets");
        addMetadata();
    }

    public QServerEventSessionTargets(PathMetadata metadata) {
        super(QServerEventSessionTargets.class, metadata, "sys", "server_event_session_targets");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(eventSessionId, ColumnMetadata.named("event_session_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(module, ColumnMetadata.named("module").withIndex(5).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(name, ColumnMetadata.named("name").withIndex(3).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(packageCol, ColumnMetadata.named("package").withIndex(4).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(targetId, ColumnMetadata.named("target_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

