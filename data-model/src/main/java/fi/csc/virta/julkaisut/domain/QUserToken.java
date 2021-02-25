package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QUserToken is a Querydsl query type for QUserToken
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QUserToken extends com.querydsl.sql.RelationalPathBase<QUserToken> {

    private static final long serialVersionUID = -2128117327;

    public static final QUserToken userToken = new QUserToken("user_token");

    public final StringPath name = createString("name");

    public final NumberPath<Integer> principalId = createNumber("principalId", Integer.class);

    public final SimplePath<byte[]> sid = createSimple("sid", byte[].class);

    public final StringPath type = createString("type");

    public final StringPath usage = createString("usage");

    public QUserToken(String variable) {
        super(QUserToken.class, forVariable(variable), "sys", "user_token");
        addMetadata();
    }

    public QUserToken(String variable, String schema, String table) {
        super(QUserToken.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QUserToken(Path<? extends QUserToken> path) {
        super(path.getType(), path.getMetadata(), "sys", "user_token");
        addMetadata();
    }

    public QUserToken(PathMetadata metadata) {
        super(QUserToken.class, metadata, "sys", "user_token");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(name, ColumnMetadata.named("name").withIndex(3).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(principalId, ColumnMetadata.named("principal_id").withIndex(1).ofType(Types.INTEGER).withSize(10));
        addMetadata(sid, ColumnMetadata.named("sid").withIndex(2).ofType(Types.VARBINARY).withSize(85));
        addMetadata(type, ColumnMetadata.named("type").withIndex(4).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(usage, ColumnMetadata.named("usage").withIndex(5).ofType(Types.NVARCHAR).withSize(128));
    }

}

