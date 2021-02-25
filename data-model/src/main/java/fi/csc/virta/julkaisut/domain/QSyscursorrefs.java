package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSyscursorrefs is a Querydsl query type for QSyscursorrefs
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSyscursorrefs extends com.querydsl.sql.RelationalPathBase<QSyscursorrefs> {

    private static final long serialVersionUID = -340060058;

    public static final QSyscursorrefs syscursorrefs = new QSyscursorrefs("syscursorrefs");

    public final NumberPath<Integer> cursorHandl = createNumber("cursorHandl", Integer.class);

    public final NumberPath<Byte> cursorScope = createNumber("cursorScope", Byte.class);

    public final StringPath referenceName = createString("referenceName");

    public QSyscursorrefs(String variable) {
        super(QSyscursorrefs.class, forVariable(variable), "sys", "syscursorrefs");
        addMetadata();
    }

    public QSyscursorrefs(String variable, String schema, String table) {
        super(QSyscursorrefs.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSyscursorrefs(Path<? extends QSyscursorrefs> path) {
        super(path.getType(), path.getMetadata(), "sys", "syscursorrefs");
        addMetadata();
    }

    public QSyscursorrefs(PathMetadata metadata) {
        super(QSyscursorrefs.class, metadata, "sys", "syscursorrefs");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cursorHandl, ColumnMetadata.named("cursor_handl").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(cursorScope, ColumnMetadata.named("cursor_scope").withIndex(2).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(referenceName, ColumnMetadata.named("reference_name").withIndex(1).ofType(Types.NVARCHAR).withSize(128));
    }

}

