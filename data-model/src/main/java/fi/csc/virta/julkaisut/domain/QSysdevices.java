package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSysdevices is a Querydsl query type for QSysdevices
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSysdevices extends com.querydsl.sql.RelationalPathBase<QSysdevices> {

    private static final long serialVersionUID = 468564237;

    public static final QSysdevices sysdevices = new QSysdevices("sysdevices");

    public final NumberPath<Short> cntrltype = createNumber("cntrltype", Short.class);

    public final NumberPath<Integer> high = createNumber("high", Integer.class);

    public final NumberPath<Integer> low = createNumber("low", Integer.class);

    public final StringPath name = createString("name");

    public final StringPath phyname = createString("phyname");

    public final NumberPath<Integer> size = createNumber("size", Integer.class);

    public final NumberPath<Short> status = createNumber("status", Short.class);

    public QSysdevices(String variable) {
        super(QSysdevices.class, forVariable(variable), "sys", "sysdevices");
        addMetadata();
    }

    public QSysdevices(String variable, String schema, String table) {
        super(QSysdevices.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSysdevices(Path<? extends QSysdevices> path) {
        super(path.getType(), path.getMetadata(), "sys", "sysdevices");
        addMetadata();
    }

    public QSysdevices(PathMetadata metadata) {
        super(QSysdevices.class, metadata, "sys", "sysdevices");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cntrltype, ColumnMetadata.named("cntrltype").withIndex(6).ofType(Types.SMALLINT).withSize(5));
        addMetadata(high, ColumnMetadata.named("high").withIndex(4).ofType(Types.INTEGER).withSize(10));
        addMetadata(low, ColumnMetadata.named("low").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(phyname, ColumnMetadata.named("phyname").withIndex(7).ofType(Types.NVARCHAR).withSize(260));
        addMetadata(size, ColumnMetadata.named("size").withIndex(2).ofType(Types.INTEGER).withSize(10));
        addMetadata(status, ColumnMetadata.named("status").withIndex(5).ofType(Types.SMALLINT).withSize(5));
    }

}

