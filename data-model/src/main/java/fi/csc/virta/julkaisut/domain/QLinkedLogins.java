package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QLinkedLogins is a Querydsl query type for QLinkedLogins
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QLinkedLogins extends com.querydsl.sql.RelationalPathBase<QLinkedLogins> {

    private static final long serialVersionUID = -1297481216;

    public static final QLinkedLogins linkedLogins = new QLinkedLogins("linked_logins");

    public final NumberPath<Integer> localPrincipalId = createNumber("localPrincipalId", Integer.class);

    public final DateTimePath<java.sql.Timestamp> modifyDate = createDateTime("modifyDate", java.sql.Timestamp.class);

    public final StringPath remoteName = createString("remoteName");

    public final NumberPath<Integer> serverId = createNumber("serverId", Integer.class);

    public final BooleanPath usesSelfCredential = createBoolean("usesSelfCredential");

    public QLinkedLogins(String variable) {
        super(QLinkedLogins.class, forVariable(variable), "sys", "linked_logins");
        addMetadata();
    }

    public QLinkedLogins(String variable, String schema, String table) {
        super(QLinkedLogins.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QLinkedLogins(Path<? extends QLinkedLogins> path) {
        super(path.getType(), path.getMetadata(), "sys", "linked_logins");
        addMetadata();
    }

    public QLinkedLogins(PathMetadata metadata) {
        super(QLinkedLogins.class, metadata, "sys", "linked_logins");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(localPrincipalId, ColumnMetadata.named("local_principal_id").withIndex(2).ofType(Types.INTEGER).withSize(10));
        addMetadata(modifyDate, ColumnMetadata.named("modify_date").withIndex(5).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(remoteName, ColumnMetadata.named("remote_name").withIndex(4).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(serverId, ColumnMetadata.named("server_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(usesSelfCredential, ColumnMetadata.named("uses_self_credential").withIndex(3).ofType(Types.BIT).withSize(1).notNull());
    }

}

