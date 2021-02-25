package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSyscomments is a Querydsl query type for QSyscomments
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSyscomments extends com.querydsl.sql.RelationalPathBase<QSyscomments> {

    private static final long serialVersionUID = -71018556;

    public static final QSyscomments syscomments = new QSyscomments("syscomments");

    public final NumberPath<Short> colid = createNumber("colid", Short.class);

    public final BooleanPath compressed = createBoolean("compressed");

    public final SimplePath<byte[]> ctext = createSimple("ctext", byte[].class);

    public final BooleanPath encrypted = createBoolean("encrypted");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Short> language = createNumber("language", Short.class);

    public final NumberPath<Short> number = createNumber("number", Short.class);

    public final NumberPath<Short> status = createNumber("status", Short.class);

    public final StringPath text = createString("text");

    public final NumberPath<Short> texttype = createNumber("texttype", Short.class);

    public QSyscomments(String variable) {
        super(QSyscomments.class, forVariable(variable), "sys", "syscomments");
        addMetadata();
    }

    public QSyscomments(String variable, String schema, String table) {
        super(QSyscomments.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSyscomments(Path<? extends QSyscomments> path) {
        super(path.getType(), path.getMetadata(), "sys", "syscomments");
        addMetadata();
    }

    public QSyscomments(PathMetadata metadata) {
        super(QSyscomments.class, metadata, "sys", "syscomments");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(colid, ColumnMetadata.named("colid").withIndex(3).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(compressed, ColumnMetadata.named("compressed").withIndex(9).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(ctext, ColumnMetadata.named("ctext").withIndex(5).ofType(Types.VARBINARY).withSize(8000));
        addMetadata(encrypted, ColumnMetadata.named("encrypted").withIndex(8).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(language, ColumnMetadata.named("language").withIndex(7).ofType(Types.SMALLINT).withSize(5));
        addMetadata(number, ColumnMetadata.named("number").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(status, ColumnMetadata.named("status").withIndex(4).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(text, ColumnMetadata.named("text").withIndex(10).ofType(Types.NVARCHAR).withSize(4000));
        addMetadata(texttype, ColumnMetadata.named("texttype").withIndex(6).ofType(Types.SMALLINT).withSize(5));
    }

}

