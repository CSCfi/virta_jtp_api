package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QMessages is a Querydsl query type for QMessages
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QMessages extends com.querydsl.sql.RelationalPathBase<QMessages> {

    private static final long serialVersionUID = -1788288983;

    public static final QMessages messages = new QMessages("messages");

    public final BooleanPath isEventLogged = createBoolean("isEventLogged");

    public final NumberPath<Short> languageId = createNumber("languageId", Short.class);

    public final NumberPath<Integer> messageId = createNumber("messageId", Integer.class);

    public final NumberPath<Byte> severity = createNumber("severity", Byte.class);

    public final StringPath text = createString("text");

    public QMessages(String variable) {
        super(QMessages.class, forVariable(variable), "sys", "messages");
        addMetadata();
    }

    public QMessages(String variable, String schema, String table) {
        super(QMessages.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QMessages(Path<? extends QMessages> path) {
        super(path.getType(), path.getMetadata(), "sys", "messages");
        addMetadata();
    }

    public QMessages(PathMetadata metadata) {
        super(QMessages.class, metadata, "sys", "messages");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(isEventLogged, ColumnMetadata.named("is_event_logged").withIndex(4).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(languageId, ColumnMetadata.named("language_id").withIndex(2).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(messageId, ColumnMetadata.named("message_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(severity, ColumnMetadata.named("severity").withIndex(3).ofType(Types.TINYINT).withSize(3));
        addMetadata(text, ColumnMetadata.named("text").withIndex(5).ofType(Types.NVARCHAR).withSize(2048).notNull());
    }

}

