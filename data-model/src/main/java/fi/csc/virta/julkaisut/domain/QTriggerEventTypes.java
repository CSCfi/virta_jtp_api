package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTriggerEventTypes is a Querydsl query type for QTriggerEventTypes
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTriggerEventTypes extends com.querydsl.sql.RelationalPathBase<QTriggerEventTypes> {

    private static final long serialVersionUID = -39879782;

    public static final QTriggerEventTypes triggerEventTypes = new QTriggerEventTypes("trigger_event_types");

    public final NumberPath<Integer> parentType = createNumber("parentType", Integer.class);

    public final NumberPath<Integer> type = createNumber("type", Integer.class);

    public final StringPath typeName = createString("typeName");

    public QTriggerEventTypes(String variable) {
        super(QTriggerEventTypes.class, forVariable(variable), "sys", "trigger_event_types");
        addMetadata();
    }

    public QTriggerEventTypes(String variable, String schema, String table) {
        super(QTriggerEventTypes.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTriggerEventTypes(Path<? extends QTriggerEventTypes> path) {
        super(path.getType(), path.getMetadata(), "sys", "trigger_event_types");
        addMetadata();
    }

    public QTriggerEventTypes(PathMetadata metadata) {
        super(QTriggerEventTypes.class, metadata, "sys", "trigger_event_types");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(parentType, ColumnMetadata.named("parent_type").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(type, ColumnMetadata.named("type").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(typeName, ColumnMetadata.named("type_name").withIndex(2).ofType(Types.NVARCHAR).withSize(64));
    }

}

