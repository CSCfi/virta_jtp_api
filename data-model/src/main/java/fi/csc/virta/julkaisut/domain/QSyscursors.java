package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSyscursors is a Querydsl query type for QSyscursors
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSyscursors extends com.querydsl.sql.RelationalPathBase<QSyscursors> {

    private static final long serialVersionUID = 35742733;

    public static final QSyscursors syscursors = new QSyscursors("syscursors");

    public final NumberPath<Short> columnCount = createNumber("columnCount", Short.class);

    public final NumberPath<Byte> concurrency = createNumber("concurrency", Byte.class);

    public final NumberPath<Integer> cursorHandle = createNumber("cursorHandle", Integer.class);

    public final StringPath cursorName = createString("cursorName");

    public final NumberPath<Long> cursorRows = createNumber("cursorRows", Long.class);

    public final NumberPath<Short> fetchStatus = createNumber("fetchStatus", Short.class);

    public final NumberPath<Byte> lastOperation = createNumber("lastOperation", Byte.class);

    public final NumberPath<Byte> model = createNumber("model", Byte.class);

    public final NumberPath<Byte> openStatus = createNumber("openStatus", Byte.class);

    public final NumberPath<Long> rowCount = createNumber("rowCount", Long.class);

    public final NumberPath<Byte> scrollable = createNumber("scrollable", Byte.class);

    public final NumberPath<Integer> status = createNumber("status", Integer.class);

    public QSyscursors(String variable) {
        super(QSyscursors.class, forVariable(variable), "sys", "syscursors");
        addMetadata();
    }

    public QSyscursors(String variable, String schema, String table) {
        super(QSyscursors.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSyscursors(Path<? extends QSyscursors> path) {
        super(path.getType(), path.getMetadata(), "sys", "syscursors");
        addMetadata();
    }

    public QSyscursors(PathMetadata metadata) {
        super(QSyscursors.class, metadata, "sys", "syscursors");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(columnCount, ColumnMetadata.named("column_count").withIndex(10).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(concurrency, ColumnMetadata.named("concurrency").withIndex(5).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(cursorHandle, ColumnMetadata.named("cursor_handle").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(cursorName, ColumnMetadata.named("cursor_name").withIndex(2).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(cursorRows, ColumnMetadata.named("cursor_rows").withIndex(8).ofType(Types.NUMERIC).withSize(10));
        addMetadata(fetchStatus, ColumnMetadata.named("fetch_status").withIndex(9).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(lastOperation, ColumnMetadata.named("last_operation").withIndex(12).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(model, ColumnMetadata.named("model").withIndex(4).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(openStatus, ColumnMetadata.named("open_status").withIndex(7).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(rowCount, ColumnMetadata.named("row_count").withIndex(11).ofType(Types.NUMERIC).withSize(10));
        addMetadata(scrollable, ColumnMetadata.named("scrollable").withIndex(6).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(status, ColumnMetadata.named("status").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

