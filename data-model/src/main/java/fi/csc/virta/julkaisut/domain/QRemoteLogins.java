package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QRemoteLogins is a Querydsl query type for QRemoteLogins
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QRemoteLogins extends com.querydsl.sql.RelationalPathBase<QRemoteLogins> {

    private static final long serialVersionUID = 891371117;

    public static final QRemoteLogins remoteLogins = new QRemoteLogins("remote_logins");

    public final NumberPath<Integer> localPrincipalId = createNumber("localPrincipalId", Integer.class);

    public final DateTimePath<java.sql.Timestamp> modifyDate = createDateTime("modifyDate", java.sql.Timestamp.class);

    public final StringPath remoteName = createString("remoteName");

    public final NumberPath<Integer> serverId = createNumber("serverId", Integer.class);

    public QRemoteLogins(String variable) {
        super(QRemoteLogins.class, forVariable(variable), "sys", "remote_logins");
        addMetadata();
    }

    public QRemoteLogins(String variable, String schema, String table) {
        super(QRemoteLogins.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QRemoteLogins(Path<? extends QRemoteLogins> path) {
        super(path.getType(), path.getMetadata(), "sys", "remote_logins");
        addMetadata();
    }

    public QRemoteLogins(PathMetadata metadata) {
        super(QRemoteLogins.class, metadata, "sys", "remote_logins");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(localPrincipalId, ColumnMetadata.named("local_principal_id").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(modifyDate, ColumnMetadata.named("modify_date").withIndex(4).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(remoteName, ColumnMetadata.named("remote_name").withIndex(2).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(serverId, ColumnMetadata.named("server_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

