package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QConversationGroups is a Querydsl query type for QConversationGroups
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QConversationGroups extends com.querydsl.sql.RelationalPathBase<QConversationGroups> {

    private static final long serialVersionUID = -2006932780;

    public static final QConversationGroups conversationGroups = new QConversationGroups("conversation_groups");

    public final StringPath conversationGroupId = createString("conversationGroupId");

    public final BooleanPath isSystem = createBoolean("isSystem");

    public final NumberPath<Integer> serviceId = createNumber("serviceId", Integer.class);

    public QConversationGroups(String variable) {
        super(QConversationGroups.class, forVariable(variable), "sys", "conversation_groups");
        addMetadata();
    }

    public QConversationGroups(String variable, String schema, String table) {
        super(QConversationGroups.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QConversationGroups(Path<? extends QConversationGroups> path) {
        super(path.getType(), path.getMetadata(), "sys", "conversation_groups");
        addMetadata();
    }

    public QConversationGroups(PathMetadata metadata) {
        super(QConversationGroups.class, metadata, "sys", "conversation_groups");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(conversationGroupId, ColumnMetadata.named("conversation_group_id").withIndex(1).ofType(Types.CHAR).withSize(36).notNull());
        addMetadata(isSystem, ColumnMetadata.named("is_system").withIndex(3).ofType(Types.BIT).withSize(1));
        addMetadata(serviceId, ColumnMetadata.named("service_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

