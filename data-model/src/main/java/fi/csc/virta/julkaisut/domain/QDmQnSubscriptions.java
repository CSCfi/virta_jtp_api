package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmQnSubscriptions is a Querydsl query type for QDmQnSubscriptions
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmQnSubscriptions extends com.querydsl.sql.RelationalPathBase<QDmQnSubscriptions> {

    private static final long serialVersionUID = -214960685;

    public static final QDmQnSubscriptions dmQnSubscriptions = new QDmQnSubscriptions("dm_qn_subscriptions");

    public final DateTimePath<java.sql.Timestamp> created = createDateTime("created", java.sql.Timestamp.class);

    public final NumberPath<Integer> databaseId = createNumber("databaseId", Integer.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public final SimplePath<byte[]> sid = createSimple("sid", byte[].class);

    public final NumberPath<Integer> status = createNumber("status", Integer.class);

    public final NumberPath<Integer> timeout = createNumber("timeout", Integer.class);

    public QDmQnSubscriptions(String variable) {
        super(QDmQnSubscriptions.class, forVariable(variable), "sys", "dm_qn_subscriptions");
        addMetadata();
    }

    public QDmQnSubscriptions(String variable, String schema, String table) {
        super(QDmQnSubscriptions.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmQnSubscriptions(Path<? extends QDmQnSubscriptions> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_qn_subscriptions");
        addMetadata();
    }

    public QDmQnSubscriptions(PathMetadata metadata) {
        super(QDmQnSubscriptions.class, metadata, "sys", "dm_qn_subscriptions");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(created, ColumnMetadata.named("created").withIndex(5).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(databaseId, ColumnMetadata.named("database_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(sid, ColumnMetadata.named("sid").withIndex(3).ofType(Types.VARBINARY).withSize(85).notNull());
        addMetadata(status, ColumnMetadata.named("status").withIndex(7).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(timeout, ColumnMetadata.named("timeout").withIndex(6).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

