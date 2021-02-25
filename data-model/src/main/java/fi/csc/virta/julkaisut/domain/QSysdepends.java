package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSysdepends is a Querydsl query type for QSysdepends
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSysdepends extends com.querydsl.sql.RelationalPathBase<QSysdepends> {

    private static final long serialVersionUID = 462914487;

    public static final QSysdepends sysdepends = new QSysdepends("sysdepends");

    public final NumberPath<Short> depdbid = createNumber("depdbid", Short.class);

    public final NumberPath<Integer> depid = createNumber("depid", Integer.class);

    public final NumberPath<Short> depnumber = createNumber("depnumber", Short.class);

    public final NumberPath<Short> depsiteid = createNumber("depsiteid", Short.class);

    public final NumberPath<Byte> deptype = createNumber("deptype", Byte.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Short> number = createNumber("number", Short.class);

    public final BooleanPath readobj = createBoolean("readobj");

    public final BooleanPath resultobj = createBoolean("resultobj");

    public final BooleanPath selall = createBoolean("selall");

    public final NumberPath<Short> status = createNumber("status", Short.class);

    public QSysdepends(String variable) {
        super(QSysdepends.class, forVariable(variable), "sys", "sysdepends");
        addMetadata();
    }

    public QSysdepends(String variable, String schema, String table) {
        super(QSysdepends.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSysdepends(Path<? extends QSysdepends> path) {
        super(path.getType(), path.getMetadata(), "sys", "sysdepends");
        addMetadata();
    }

    public QSysdepends(PathMetadata metadata) {
        super(QSysdepends.class, metadata, "sys", "sysdepends");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(depdbid, ColumnMetadata.named("depdbid").withIndex(7).ofType(Types.SMALLINT).withSize(5));
        addMetadata(depid, ColumnMetadata.named("depid").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(depnumber, ColumnMetadata.named("depnumber").withIndex(4).ofType(Types.SMALLINT).withSize(5));
        addMetadata(depsiteid, ColumnMetadata.named("depsiteid").withIndex(8).ofType(Types.SMALLINT).withSize(5));
        addMetadata(deptype, ColumnMetadata.named("deptype").withIndex(6).ofType(Types.TINYINT).withSize(3));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(number, ColumnMetadata.named("number").withIndex(3).ofType(Types.SMALLINT).withSize(5));
        addMetadata(readobj, ColumnMetadata.named("readobj").withIndex(11).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(resultobj, ColumnMetadata.named("resultobj").withIndex(10).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(selall, ColumnMetadata.named("selall").withIndex(9).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(status, ColumnMetadata.named("status").withIndex(5).ofType(Types.SMALLINT).withSize(5));
    }

}

