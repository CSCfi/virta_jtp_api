package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSysusers is a Querydsl query type for QSysusers
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSysusers extends com.querydsl.sql.RelationalPathBase<QSysusers> {

    private static final long serialVersionUID = 651224632;

    public static final QSysusers sysusers = new QSysusers("sysusers");

    public final NumberPath<Short> altuid = createNumber("altuid", Short.class);

    public final DateTimePath<java.sql.Timestamp> createdate = createDateTime("createdate", java.sql.Timestamp.class);

    public final StringPath environ = createString("environ");

    public final NumberPath<Short> gid = createNumber("gid", Short.class);

    public final NumberPath<Integer> hasdbaccess = createNumber("hasdbaccess", Integer.class);

    public final NumberPath<Integer> isaliased = createNumber("isaliased", Integer.class);

    public final NumberPath<Integer> isapprole = createNumber("isapprole", Integer.class);

    public final NumberPath<Integer> islogin = createNumber("islogin", Integer.class);

    public final NumberPath<Integer> isntgroup = createNumber("isntgroup", Integer.class);

    public final NumberPath<Integer> isntname = createNumber("isntname", Integer.class);

    public final NumberPath<Integer> isntuser = createNumber("isntuser", Integer.class);

    public final NumberPath<Integer> issqlrole = createNumber("issqlrole", Integer.class);

    public final NumberPath<Integer> issqluser = createNumber("issqluser", Integer.class);

    public final StringPath name = createString("name");

    public final SimplePath<byte[]> password = createSimple("password", byte[].class);

    public final SimplePath<byte[]> roles = createSimple("roles", byte[].class);

    public final SimplePath<byte[]> sid = createSimple("sid", byte[].class);

    public final NumberPath<Short> status = createNumber("status", Short.class);

    public final NumberPath<Short> uid = createNumber("uid", Short.class);

    public final DateTimePath<java.sql.Timestamp> updatedate = createDateTime("updatedate", java.sql.Timestamp.class);

    public QSysusers(String variable) {
        super(QSysusers.class, forVariable(variable), "sys", "sysusers");
        addMetadata();
    }

    public QSysusers(String variable, String schema, String table) {
        super(QSysusers.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSysusers(Path<? extends QSysusers> path) {
        super(path.getType(), path.getMetadata(), "sys", "sysusers");
        addMetadata();
    }

    public QSysusers(PathMetadata metadata) {
        super(QSysusers.class, metadata, "sys", "sysusers");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(altuid, ColumnMetadata.named("altuid").withIndex(8).ofType(Types.SMALLINT).withSize(5));
        addMetadata(createdate, ColumnMetadata.named("createdate").withIndex(6).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(environ, ColumnMetadata.named("environ").withIndex(11).ofType(Types.VARCHAR).withSize(255));
        addMetadata(gid, ColumnMetadata.named("gid").withIndex(10).ofType(Types.SMALLINT).withSize(5));
        addMetadata(hasdbaccess, ColumnMetadata.named("hasdbaccess").withIndex(12).ofType(Types.INTEGER).withSize(10));
        addMetadata(isaliased, ColumnMetadata.named("isaliased").withIndex(18).ofType(Types.INTEGER).withSize(10));
        addMetadata(isapprole, ColumnMetadata.named("isapprole").withIndex(20).ofType(Types.INTEGER).withSize(10));
        addMetadata(islogin, ColumnMetadata.named("islogin").withIndex(13).ofType(Types.INTEGER).withSize(10));
        addMetadata(isntgroup, ColumnMetadata.named("isntgroup").withIndex(15).ofType(Types.INTEGER).withSize(10));
        addMetadata(isntname, ColumnMetadata.named("isntname").withIndex(14).ofType(Types.INTEGER).withSize(10));
        addMetadata(isntuser, ColumnMetadata.named("isntuser").withIndex(16).ofType(Types.INTEGER).withSize(10));
        addMetadata(issqlrole, ColumnMetadata.named("issqlrole").withIndex(19).ofType(Types.INTEGER).withSize(10));
        addMetadata(issqluser, ColumnMetadata.named("issqluser").withIndex(17).ofType(Types.INTEGER).withSize(10));
        addMetadata(name, ColumnMetadata.named("name").withIndex(3).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(password, ColumnMetadata.named("password").withIndex(9).ofType(Types.VARBINARY).withSize(256));
        addMetadata(roles, ColumnMetadata.named("roles").withIndex(5).ofType(Types.VARBINARY).withSize(2048));
        addMetadata(sid, ColumnMetadata.named("sid").withIndex(4).ofType(Types.VARBINARY).withSize(85));
        addMetadata(status, ColumnMetadata.named("status").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(uid, ColumnMetadata.named("uid").withIndex(1).ofType(Types.SMALLINT).withSize(5));
        addMetadata(updatedate, ColumnMetadata.named("updatedate").withIndex(7).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
    }

}

