package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QServiceQueues is a Querydsl query type for QServiceQueues
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QServiceQueues extends com.querydsl.sql.RelationalPathBase<QServiceQueues> {

    private static final long serialVersionUID = -1117912102;

    public static final QServiceQueues serviceQueues = new QServiceQueues("service_queues");

    public final StringPath activationProcedure = createString("activationProcedure");

    public final DateTimePath<java.sql.Timestamp> createDate = createDateTime("createDate", java.sql.Timestamp.class);

    public final NumberPath<Integer> executeAsPrincipalId = createNumber("executeAsPrincipalId", Integer.class);

    public final BooleanPath isActivationEnabled = createBoolean("isActivationEnabled");

    public final BooleanPath isEnqueueEnabled = createBoolean("isEnqueueEnabled");

    public final BooleanPath isMsShipped = createBoolean("isMsShipped");

    public final BooleanPath isPoisonMessageHandlingEnabled = createBoolean("isPoisonMessageHandlingEnabled");

    public final BooleanPath isPublished = createBoolean("isPublished");

    public final BooleanPath isReceiveEnabled = createBoolean("isReceiveEnabled");

    public final BooleanPath isRetentionEnabled = createBoolean("isRetentionEnabled");

    public final BooleanPath isSchemaPublished = createBoolean("isSchemaPublished");

    public final NumberPath<Short> maxReaders = createNumber("maxReaders", Short.class);

    public final DateTimePath<java.sql.Timestamp> modifyDate = createDateTime("modifyDate", java.sql.Timestamp.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public final NumberPath<Integer> parentObjectId = createNumber("parentObjectId", Integer.class);

    public final NumberPath<Integer> principalId = createNumber("principalId", Integer.class);

    public final NumberPath<Integer> schemaId = createNumber("schemaId", Integer.class);

    public final StringPath type = createString("type");

    public final StringPath typeDesc = createString("typeDesc");

    public QServiceQueues(String variable) {
        super(QServiceQueues.class, forVariable(variable), "sys", "service_queues");
        addMetadata();
    }

    public QServiceQueues(String variable, String schema, String table) {
        super(QServiceQueues.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QServiceQueues(Path<? extends QServiceQueues> path) {
        super(path.getType(), path.getMetadata(), "sys", "service_queues");
        addMetadata();
    }

    public QServiceQueues(PathMetadata metadata) {
        super(QServiceQueues.class, metadata, "sys", "service_queues");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(activationProcedure, ColumnMetadata.named("activation_procedure").withIndex(14).ofType(Types.NVARCHAR).withSize(776));
        addMetadata(createDate, ColumnMetadata.named("create_date").withIndex(8).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(executeAsPrincipalId, ColumnMetadata.named("execute_as_principal_id").withIndex(15).ofType(Types.INTEGER).withSize(10));
        addMetadata(isActivationEnabled, ColumnMetadata.named("is_activation_enabled").withIndex(16).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isEnqueueEnabled, ColumnMetadata.named("is_enqueue_enabled").withIndex(18).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isMsShipped, ColumnMetadata.named("is_ms_shipped").withIndex(10).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isPoisonMessageHandlingEnabled, ColumnMetadata.named("is_poison_message_handling_enabled").withIndex(20).ofType(Types.BIT).withSize(1));
        addMetadata(isPublished, ColumnMetadata.named("is_published").withIndex(11).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isReceiveEnabled, ColumnMetadata.named("is_receive_enabled").withIndex(17).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isRetentionEnabled, ColumnMetadata.named("is_retention_enabled").withIndex(19).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isSchemaPublished, ColumnMetadata.named("is_schema_published").withIndex(12).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(maxReaders, ColumnMetadata.named("max_readers").withIndex(13).ofType(Types.SMALLINT).withSize(5));
        addMetadata(modifyDate, ColumnMetadata.named("modify_date").withIndex(9).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(parentObjectId, ColumnMetadata.named("parent_object_id").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(principalId, ColumnMetadata.named("principal_id").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(schemaId, ColumnMetadata.named("schema_id").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(type, ColumnMetadata.named("type").withIndex(6).ofType(Types.CHAR).withSize(2).notNull());
        addMetadata(typeDesc, ColumnMetadata.named("type_desc").withIndex(7).ofType(Types.NVARCHAR).withSize(60));
    }

}

