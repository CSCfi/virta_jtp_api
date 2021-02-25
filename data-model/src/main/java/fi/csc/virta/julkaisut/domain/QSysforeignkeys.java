package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSysforeignkeys is a Querydsl query type for QSysforeignkeys
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSysforeignkeys extends com.querydsl.sql.RelationalPathBase<QSysforeignkeys> {

    private static final long serialVersionUID = -1846765320;

    public static final QSysforeignkeys sysforeignkeys = new QSysforeignkeys("sysforeignkeys");

    public final NumberPath<Integer> constid = createNumber("constid", Integer.class);

    public final NumberPath<Short> fkey = createNumber("fkey", Short.class);

    public final NumberPath<Integer> fkeyid = createNumber("fkeyid", Integer.class);

    public final NumberPath<Short> keyno = createNumber("keyno", Short.class);

    public final NumberPath<Short> rkey = createNumber("rkey", Short.class);

    public final NumberPath<Integer> rkeyid = createNumber("rkeyid", Integer.class);

    public QSysforeignkeys(String variable) {
        super(QSysforeignkeys.class, forVariable(variable), "sys", "sysforeignkeys");
        addMetadata();
    }

    public QSysforeignkeys(String variable, String schema, String table) {
        super(QSysforeignkeys.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSysforeignkeys(Path<? extends QSysforeignkeys> path) {
        super(path.getType(), path.getMetadata(), "sys", "sysforeignkeys");
        addMetadata();
    }

    public QSysforeignkeys(PathMetadata metadata) {
        super(QSysforeignkeys.class, metadata, "sys", "sysforeignkeys");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(constid, ColumnMetadata.named("constid").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(fkey, ColumnMetadata.named("fkey").withIndex(4).ofType(Types.SMALLINT).withSize(5));
        addMetadata(fkeyid, ColumnMetadata.named("fkeyid").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(keyno, ColumnMetadata.named("keyno").withIndex(6).ofType(Types.SMALLINT).withSize(5));
        addMetadata(rkey, ColumnMetadata.named("rkey").withIndex(5).ofType(Types.SMALLINT).withSize(5));
        addMetadata(rkeyid, ColumnMetadata.named("rkeyid").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

