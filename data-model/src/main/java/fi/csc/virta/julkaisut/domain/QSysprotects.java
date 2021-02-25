package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSysprotects is a Querydsl query type for QSysprotects
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSysprotects extends com.querydsl.sql.RelationalPathBase<QSysprotects> {

    private static final long serialVersionUID = -458064556;

    public static final QSysprotects sysprotects = new QSysprotects("sysprotects");

    public final NumberPath<Byte> action = createNumber("action", Byte.class);

    public final SimplePath<byte[]> columns = createSimple("columns", byte[].class);

    public final NumberPath<Short> grantor = createNumber("grantor", Short.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Byte> protecttype = createNumber("protecttype", Byte.class);

    public final NumberPath<Short> uid = createNumber("uid", Short.class);

    public QSysprotects(String variable) {
        super(QSysprotects.class, forVariable(variable), "sys", "sysprotects");
        addMetadata();
    }

    public QSysprotects(String variable, String schema, String table) {
        super(QSysprotects.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSysprotects(Path<? extends QSysprotects> path) {
        super(path.getType(), path.getMetadata(), "sys", "sysprotects");
        addMetadata();
    }

    public QSysprotects(PathMetadata metadata) {
        super(QSysprotects.class, metadata, "sys", "sysprotects");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(action, ColumnMetadata.named("action").withIndex(3).ofType(Types.TINYINT).withSize(3));
        addMetadata(columns, ColumnMetadata.named("columns").withIndex(5).ofType(Types.VARBINARY).withSize(8000));
        addMetadata(grantor, ColumnMetadata.named("grantor").withIndex(6).ofType(Types.SMALLINT).withSize(5));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(protecttype, ColumnMetadata.named("protecttype").withIndex(4).ofType(Types.TINYINT).withSize(3));
        addMetadata(uid, ColumnMetadata.named("uid").withIndex(2).ofType(Types.SMALLINT).withSize(5));
    }

}

