package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCredentials is a Querydsl query type for QCredentials
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCredentials extends com.querydsl.sql.RelationalPathBase<QCredentials> {

    private static final long serialVersionUID = 1018493695;

    public static final QCredentials credentials = new QCredentials("credentials");

    public final DateTimePath<java.sql.Timestamp> createDate = createDateTime("createDate", java.sql.Timestamp.class);

    public final NumberPath<Integer> credentialId = createNumber("credentialId", Integer.class);

    public final StringPath credentialIdentity = createString("credentialIdentity");

    public final DateTimePath<java.sql.Timestamp> modifyDate = createDateTime("modifyDate", java.sql.Timestamp.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> targetId = createNumber("targetId", Integer.class);

    public final StringPath targetType = createString("targetType");

    public QCredentials(String variable) {
        super(QCredentials.class, forVariable(variable), "sys", "credentials");
        addMetadata();
    }

    public QCredentials(String variable, String schema, String table) {
        super(QCredentials.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCredentials(Path<? extends QCredentials> path) {
        super(path.getType(), path.getMetadata(), "sys", "credentials");
        addMetadata();
    }

    public QCredentials(PathMetadata metadata) {
        super(QCredentials.class, metadata, "sys", "credentials");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(createDate, ColumnMetadata.named("create_date").withIndex(4).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(credentialId, ColumnMetadata.named("credential_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(credentialIdentity, ColumnMetadata.named("credential_identity").withIndex(3).ofType(Types.NVARCHAR).withSize(4000));
        addMetadata(modifyDate, ColumnMetadata.named("modify_date").withIndex(5).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(targetId, ColumnMetadata.named("target_id").withIndex(7).ofType(Types.INTEGER).withSize(10));
        addMetadata(targetType, ColumnMetadata.named("target_type").withIndex(6).ofType(Types.NVARCHAR).withSize(60));
    }

}

