package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSyslogins is a Querydsl query type for QSyslogins
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSyslogins extends com.querydsl.sql.RelationalPathBase<QSyslogins> {

    private static final long serialVersionUID = -1548178438;

    public static final QSyslogins syslogins = new QSyslogins("syslogins");

    public final DateTimePath<java.sql.Timestamp> accdate = createDateTime("accdate", java.sql.Timestamp.class);

    public final NumberPath<Integer> bulkadmin = createNumber("bulkadmin", Integer.class);

    public final DateTimePath<java.sql.Timestamp> createdate = createDateTime("createdate", java.sql.Timestamp.class);

    public final NumberPath<Integer> dbcreator = createNumber("dbcreator", Integer.class);

    public final StringPath dbname = createString("dbname");

    public final NumberPath<Integer> denylogin = createNumber("denylogin", Integer.class);

    public final NumberPath<Integer> diskadmin = createNumber("diskadmin", Integer.class);

    public final NumberPath<Integer> hasaccess = createNumber("hasaccess", Integer.class);

    public final NumberPath<Integer> isntgroup = createNumber("isntgroup", Integer.class);

    public final NumberPath<Integer> isntname = createNumber("isntname", Integer.class);

    public final NumberPath<Integer> isntuser = createNumber("isntuser", Integer.class);

    public final StringPath language = createString("language");

    public final StringPath loginname = createString("loginname");

    public final StringPath name = createString("name");

    public final StringPath password = createString("password");

    public final NumberPath<Integer> processadmin = createNumber("processadmin", Integer.class);

    public final NumberPath<Integer> resultlimit = createNumber("resultlimit", Integer.class);

    public final NumberPath<Integer> securityadmin = createNumber("securityadmin", Integer.class);

    public final NumberPath<Integer> serveradmin = createNumber("serveradmin", Integer.class);

    public final NumberPath<Integer> setupadmin = createNumber("setupadmin", Integer.class);

    public final SimplePath<byte[]> sid = createSimple("sid", byte[].class);

    public final NumberPath<Integer> spacelimit = createNumber("spacelimit", Integer.class);

    public final NumberPath<Short> status = createNumber("status", Short.class);

    public final NumberPath<Integer> sysadmin = createNumber("sysadmin", Integer.class);

    public final NumberPath<Integer> timelimit = createNumber("timelimit", Integer.class);

    public final NumberPath<Integer> totcpu = createNumber("totcpu", Integer.class);

    public final NumberPath<Integer> totio = createNumber("totio", Integer.class);

    public final DateTimePath<java.sql.Timestamp> updatedate = createDateTime("updatedate", java.sql.Timestamp.class);

    public QSyslogins(String variable) {
        super(QSyslogins.class, forVariable(variable), "sys", "syslogins");
        addMetadata();
    }

    public QSyslogins(String variable, String schema, String table) {
        super(QSyslogins.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSyslogins(Path<? extends QSyslogins> path) {
        super(path.getType(), path.getMetadata(), "sys", "syslogins");
        addMetadata();
    }

    public QSyslogins(PathMetadata metadata) {
        super(QSyslogins.class, metadata, "sys", "syslogins");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(accdate, ColumnMetadata.named("accdate").withIndex(5).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(bulkadmin, ColumnMetadata.named("bulkadmin").withIndex(27).ofType(Types.INTEGER).withSize(10));
        addMetadata(createdate, ColumnMetadata.named("createdate").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(dbcreator, ColumnMetadata.named("dbcreator").withIndex(26).ofType(Types.INTEGER).withSize(10));
        addMetadata(dbname, ColumnMetadata.named("dbname").withIndex(12).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(denylogin, ColumnMetadata.named("denylogin").withIndex(15).ofType(Types.INTEGER).withSize(10));
        addMetadata(diskadmin, ColumnMetadata.named("diskadmin").withIndex(25).ofType(Types.INTEGER).withSize(10));
        addMetadata(hasaccess, ColumnMetadata.named("hasaccess").withIndex(16).ofType(Types.INTEGER).withSize(10));
        addMetadata(isntgroup, ColumnMetadata.named("isntgroup").withIndex(18).ofType(Types.INTEGER).withSize(10));
        addMetadata(isntname, ColumnMetadata.named("isntname").withIndex(17).ofType(Types.INTEGER).withSize(10));
        addMetadata(isntuser, ColumnMetadata.named("isntuser").withIndex(19).ofType(Types.INTEGER).withSize(10));
        addMetadata(language, ColumnMetadata.named("language").withIndex(14).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(loginname, ColumnMetadata.named("loginname").withIndex(28).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(11).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(password, ColumnMetadata.named("password").withIndex(13).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(processadmin, ColumnMetadata.named("processadmin").withIndex(24).ofType(Types.INTEGER).withSize(10));
        addMetadata(resultlimit, ColumnMetadata.named("resultlimit").withIndex(10).ofType(Types.INTEGER).withSize(10));
        addMetadata(securityadmin, ColumnMetadata.named("securityadmin").withIndex(21).ofType(Types.INTEGER).withSize(10));
        addMetadata(serveradmin, ColumnMetadata.named("serveradmin").withIndex(22).ofType(Types.INTEGER).withSize(10));
        addMetadata(setupadmin, ColumnMetadata.named("setupadmin").withIndex(23).ofType(Types.INTEGER).withSize(10));
        addMetadata(sid, ColumnMetadata.named("sid").withIndex(1).ofType(Types.VARBINARY).withSize(85));
        addMetadata(spacelimit, ColumnMetadata.named("spacelimit").withIndex(8).ofType(Types.INTEGER).withSize(10));
        addMetadata(status, ColumnMetadata.named("status").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(sysadmin, ColumnMetadata.named("sysadmin").withIndex(20).ofType(Types.INTEGER).withSize(10));
        addMetadata(timelimit, ColumnMetadata.named("timelimit").withIndex(9).ofType(Types.INTEGER).withSize(10));
        addMetadata(totcpu, ColumnMetadata.named("totcpu").withIndex(6).ofType(Types.INTEGER).withSize(10));
        addMetadata(totio, ColumnMetadata.named("totio").withIndex(7).ofType(Types.INTEGER).withSize(10));
        addMetadata(updatedate, ColumnMetadata.named("updatedate").withIndex(4).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
    }

}

