package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSysremotelogins is a Querydsl query type for QSysremotelogins
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSysremotelogins extends com.querydsl.sql.RelationalPathBase<QSysremotelogins> {

    private static final long serialVersionUID = 1173896128;

    public static final QSysremotelogins sysremotelogins = new QSysremotelogins("sysremotelogins");

    public final DateTimePath<java.sql.Timestamp> changedate = createDateTime("changedate", java.sql.Timestamp.class);

    public final NumberPath<Short> remoteserverid = createNumber("remoteserverid", Short.class);

    public final StringPath remoteusername = createString("remoteusername");

    public final SimplePath<byte[]> sid = createSimple("sid", byte[].class);

    public final NumberPath<Short> status = createNumber("status", Short.class);

    public QSysremotelogins(String variable) {
        super(QSysremotelogins.class, forVariable(variable), "sys", "sysremotelogins");
        addMetadata();
    }

    public QSysremotelogins(String variable, String schema, String table) {
        super(QSysremotelogins.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSysremotelogins(Path<? extends QSysremotelogins> path) {
        super(path.getType(), path.getMetadata(), "sys", "sysremotelogins");
        addMetadata();
    }

    public QSysremotelogins(PathMetadata metadata) {
        super(QSysremotelogins.class, metadata, "sys", "sysremotelogins");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(changedate, ColumnMetadata.named("changedate").withIndex(5).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(remoteserverid, ColumnMetadata.named("remoteserverid").withIndex(1).ofType(Types.SMALLINT).withSize(5));
        addMetadata(remoteusername, ColumnMetadata.named("remoteusername").withIndex(2).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(sid, ColumnMetadata.named("sid").withIndex(4).ofType(Types.VARBINARY).withSize(85));
        addMetadata(status, ColumnMetadata.named("status").withIndex(3).ofType(Types.SMALLINT).withSize(5));
    }

}

