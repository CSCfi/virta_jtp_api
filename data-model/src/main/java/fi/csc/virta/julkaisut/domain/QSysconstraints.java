package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSysconstraints is a Querydsl query type for QSysconstraints
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSysconstraints extends com.querydsl.sql.RelationalPathBase<QSysconstraints> {

    private static final long serialVersionUID = -2005984666;

    public static final QSysconstraints sysconstraints = new QSysconstraints("sysconstraints");

    public final NumberPath<Integer> actions = createNumber("actions", Integer.class);

    public final NumberPath<Short> colid = createNumber("colid", Short.class);

    public final NumberPath<Integer> constid = createNumber("constid", Integer.class);

    public final NumberPath<Integer> error = createNumber("error", Integer.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Byte> spare1 = createNumber("spare1", Byte.class);

    public final NumberPath<Integer> status = createNumber("status", Integer.class);

    public QSysconstraints(String variable) {
        super(QSysconstraints.class, forVariable(variable), "sys", "sysconstraints");
        addMetadata();
    }

    public QSysconstraints(String variable, String schema, String table) {
        super(QSysconstraints.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSysconstraints(Path<? extends QSysconstraints> path) {
        super(path.getType(), path.getMetadata(), "sys", "sysconstraints");
        addMetadata();
    }

    public QSysconstraints(PathMetadata metadata) {
        super(QSysconstraints.class, metadata, "sys", "sysconstraints");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(actions, ColumnMetadata.named("actions").withIndex(6).ofType(Types.INTEGER).withSize(10));
        addMetadata(colid, ColumnMetadata.named("colid").withIndex(3).ofType(Types.SMALLINT).withSize(5));
        addMetadata(constid, ColumnMetadata.named("constid").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(error, ColumnMetadata.named("error").withIndex(7).ofType(Types.INTEGER).withSize(10));
        addMetadata(id, ColumnMetadata.named("id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(spare1, ColumnMetadata.named("spare1").withIndex(4).ofType(Types.TINYINT).withSize(3));
        addMetadata(status, ColumnMetadata.named("status").withIndex(5).ofType(Types.INTEGER).withSize(10));
    }

}

