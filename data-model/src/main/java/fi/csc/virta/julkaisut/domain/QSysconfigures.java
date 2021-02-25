package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSysconfigures is a Querydsl query type for QSysconfigures
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSysconfigures extends com.querydsl.sql.RelationalPathBase<QSysconfigures> {

    private static final long serialVersionUID = 403980317;

    public static final QSysconfigures sysconfigures = new QSysconfigures("sysconfigures");

    public final StringPath comment = createString("comment");

    public final NumberPath<Integer> config = createNumber("config", Integer.class);

    public final NumberPath<Short> status = createNumber("status", Short.class);

    public final NumberPath<Integer> value = createNumber("value", Integer.class);

    public QSysconfigures(String variable) {
        super(QSysconfigures.class, forVariable(variable), "sys", "sysconfigures");
        addMetadata();
    }

    public QSysconfigures(String variable, String schema, String table) {
        super(QSysconfigures.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSysconfigures(Path<? extends QSysconfigures> path) {
        super(path.getType(), path.getMetadata(), "sys", "sysconfigures");
        addMetadata();
    }

    public QSysconfigures(PathMetadata metadata) {
        super(QSysconfigures.class, metadata, "sys", "sysconfigures");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(comment, ColumnMetadata.named("comment").withIndex(3).ofType(Types.NVARCHAR).withSize(255).notNull());
        addMetadata(config, ColumnMetadata.named("config").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(status, ColumnMetadata.named("status").withIndex(4).ofType(Types.SMALLINT).withSize(5));
        addMetadata(value, ColumnMetadata.named("value").withIndex(1).ofType(Types.INTEGER).withSize(10));
    }

}

