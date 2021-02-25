package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSysmessages is a Querydsl query type for QSysmessages
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSysmessages extends com.querydsl.sql.RelationalPathBase<QSysmessages> {

    private static final long serialVersionUID = 69303068;

    public static final QSysmessages sysmessages = new QSysmessages("sysmessages");

    public final StringPath description = createString("description");

    public final NumberPath<Short> dlevel = createNumber("dlevel", Short.class);

    public final NumberPath<Integer> error = createNumber("error", Integer.class);

    public final NumberPath<Short> msglangid = createNumber("msglangid", Short.class);

    public final NumberPath<Byte> severity = createNumber("severity", Byte.class);

    public QSysmessages(String variable) {
        super(QSysmessages.class, forVariable(variable), "sys", "sysmessages");
        addMetadata();
    }

    public QSysmessages(String variable, String schema, String table) {
        super(QSysmessages.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSysmessages(Path<? extends QSysmessages> path) {
        super(path.getType(), path.getMetadata(), "sys", "sysmessages");
        addMetadata();
    }

    public QSysmessages(PathMetadata metadata) {
        super(QSysmessages.class, metadata, "sys", "sysmessages");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(description, ColumnMetadata.named("description").withIndex(4).ofType(Types.NVARCHAR).withSize(255));
        addMetadata(dlevel, ColumnMetadata.named("dlevel").withIndex(3).ofType(Types.SMALLINT).withSize(5));
        addMetadata(error, ColumnMetadata.named("error").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(msglangid, ColumnMetadata.named("msglangid").withIndex(5).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(severity, ColumnMetadata.named("severity").withIndex(2).ofType(Types.TINYINT).withSize(3));
    }

}

