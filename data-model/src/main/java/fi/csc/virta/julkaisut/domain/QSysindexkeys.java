package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSysindexkeys is a Querydsl query type for QSysindexkeys
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSysindexkeys extends com.querydsl.sql.RelationalPathBase<QSysindexkeys> {

    private static final long serialVersionUID = -1513398794;

    public static final QSysindexkeys sysindexkeys = new QSysindexkeys("sysindexkeys");

    public final NumberPath<Short> colid = createNumber("colid", Short.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Short> indid = createNumber("indid", Short.class);

    public final NumberPath<Short> keyno = createNumber("keyno", Short.class);

    public QSysindexkeys(String variable) {
        super(QSysindexkeys.class, forVariable(variable), "sys", "sysindexkeys");
        addMetadata();
    }

    public QSysindexkeys(String variable, String schema, String table) {
        super(QSysindexkeys.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSysindexkeys(Path<? extends QSysindexkeys> path) {
        super(path.getType(), path.getMetadata(), "sys", "sysindexkeys");
        addMetadata();
    }

    public QSysindexkeys(PathMetadata metadata) {
        super(QSysindexkeys.class, metadata, "sys", "sysindexkeys");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(colid, ColumnMetadata.named("colid").withIndex(3).ofType(Types.SMALLINT).withSize(5));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(indid, ColumnMetadata.named("indid").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(keyno, ColumnMetadata.named("keyno").withIndex(4).ofType(Types.SMALLINT).withSize(5));
    }

}

