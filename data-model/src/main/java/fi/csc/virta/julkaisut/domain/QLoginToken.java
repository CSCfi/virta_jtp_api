package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QLoginToken is a Querydsl query type for QLoginToken
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QLoginToken extends com.querydsl.sql.RelationalPathBase<QLoginToken> {

    private static final long serialVersionUID = -626020435;

    public static final QLoginToken loginToken = new QLoginToken("login_token");

    public final StringPath name = createString("name");

    public final NumberPath<Integer> principalId = createNumber("principalId", Integer.class);

    public final SimplePath<byte[]> sid = createSimple("sid", byte[].class);

    public final StringPath type = createString("type");

    public final StringPath usage = createString("usage");

    public QLoginToken(String variable) {
        super(QLoginToken.class, forVariable(variable), "sys", "login_token");
        addMetadata();
    }

    public QLoginToken(String variable, String schema, String table) {
        super(QLoginToken.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QLoginToken(Path<? extends QLoginToken> path) {
        super(path.getType(), path.getMetadata(), "sys", "login_token");
        addMetadata();
    }

    public QLoginToken(PathMetadata metadata) {
        super(QLoginToken.class, metadata, "sys", "login_token");
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

