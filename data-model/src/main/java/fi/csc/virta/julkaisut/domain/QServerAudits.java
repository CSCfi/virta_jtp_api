package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QServerAudits is a Querydsl query type for QServerAudits
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QServerAudits extends com.querydsl.sql.RelationalPathBase<QServerAudits> {

    private static final long serialVersionUID = -1758567048;

    public static final QServerAudits serverAudits = new QServerAudits("server_audits");

    public final StringPath auditGuid = createString("auditGuid");

    public final NumberPath<Integer> auditId = createNumber("auditId", Integer.class);

    public final DateTimePath<java.sql.Timestamp> createDate = createDateTime("createDate", java.sql.Timestamp.class);

    public final BooleanPath isStateEnabled = createBoolean("isStateEnabled");

    public final DateTimePath<java.sql.Timestamp> modifyDate = createDateTime("modifyDate", java.sql.Timestamp.class);

    public final StringPath name = createString("name");

    public final NumberPath<Byte> onFailure = createNumber("onFailure", Byte.class);

    public final StringPath onFailureDesc = createString("onFailureDesc");

    public final StringPath predicate = createString("predicate");

    public final NumberPath<Integer> principalId = createNumber("principalId", Integer.class);

    public final NumberPath<Integer> queueDelay = createNumber("queueDelay", Integer.class);

    public final StringPath type = createString("type");

    public final StringPath typeDesc = createString("typeDesc");

    public QServerAudits(String variable) {
        super(QServerAudits.class, forVariable(variable), "sys", "server_audits");
        addMetadata();
    }

    public QServerAudits(String variable, String schema, String table) {
        super(QServerAudits.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QServerAudits(Path<? extends QServerAudits> path) {
        super(path.getType(), path.getMetadata(), "sys", "server_audits");
        addMetadata();
    }

    public QServerAudits(PathMetadata metadata) {
        super(QServerAudits.class, metadata, "sys", "server_audits");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(auditGuid, ColumnMetadata.named("audit_guid").withIndex(3).ofType(Types.CHAR).withSize(36));
        addMetadata(auditId, ColumnMetadata.named("audit_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(createDate, ColumnMetadata.named("create_date").withIndex(4).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(isStateEnabled, ColumnMetadata.named("is_state_enabled").withIndex(11).ofType(Types.BIT).withSize(1));
        addMetadata(modifyDate, ColumnMetadata.named("modify_date").withIndex(5).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(onFailure, ColumnMetadata.named("on_failure").withIndex(9).ofType(Types.TINYINT).withSize(3));
        addMetadata(onFailureDesc, ColumnMetadata.named("on_failure_desc").withIndex(10).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(predicate, ColumnMetadata.named("predicate").withIndex(13).ofType(Types.NVARCHAR).withSize(3000));
        addMetadata(principalId, ColumnMetadata.named("principal_id").withIndex(6).ofType(Types.INTEGER).withSize(10));
        addMetadata(queueDelay, ColumnMetadata.named("queue_delay").withIndex(12).ofType(Types.INTEGER).withSize(10));
        addMetadata(type, ColumnMetadata.named("type").withIndex(7).ofType(Types.CHAR).withSize(2).notNull());
        addMetadata(typeDesc, ColumnMetadata.named("type_desc").withIndex(8).ofType(Types.NVARCHAR).withSize(60));
    }

}

