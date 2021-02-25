package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSysoledbusers is a Querydsl query type for QSysoledbusers
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSysoledbusers extends com.querydsl.sql.RelationalPathBase<QSysoledbusers> {

    private static final long serialVersionUID = -1294763278;

    public static final QSysoledbusers sysoledbusers = new QSysoledbusers("sysoledbusers");

    public final DateTimePath<java.sql.Timestamp> changedate = createDateTime("changedate", java.sql.Timestamp.class);

    public final SimplePath<byte[]> loginsid = createSimple("loginsid", byte[].class);

    public final StringPath rmtloginame = createString("rmtloginame");

    public final StringPath rmtpassword = createString("rmtpassword");

    public final NumberPath<Short> rmtsrvid = createNumber("rmtsrvid", Short.class);

    public final NumberPath<Short> status = createNumber("status", Short.class);

    public QSysoledbusers(String variable) {
        super(QSysoledbusers.class, forVariable(variable), "sys", "sysoledbusers");
        addMetadata();
    }

    public QSysoledbusers(String variable, String schema, String table) {
        super(QSysoledbusers.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSysoledbusers(Path<? extends QSysoledbusers> path) {
        super(path.getType(), path.getMetadata(), "sys", "sysoledbusers");
        addMetadata();
    }

    public QSysoledbusers(PathMetadata metadata) {
        super(QSysoledbusers.class, metadata, "sys", "sysoledbusers");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(changedate, ColumnMetadata.named("changedate").withIndex(6).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(loginsid, ColumnMetadata.named("loginsid").withIndex(4).ofType(Types.VARBINARY).withSize(85));
        addMetadata(rmtloginame, ColumnMetadata.named("rmtloginame").withIndex(2).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(rmtpassword, ColumnMetadata.named("rmtpassword").withIndex(3).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(rmtsrvid, ColumnMetadata.named("rmtsrvid").withIndex(1).ofType(Types.SMALLINT).withSize(5));
        addMetadata(status, ColumnMetadata.named("status").withIndex(5).ofType(Types.SMALLINT).withSize(5));
    }

}

