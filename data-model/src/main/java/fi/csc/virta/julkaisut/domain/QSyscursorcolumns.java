package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSyscursorcolumns is a Querydsl query type for QSyscursorcolumns
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSyscursorcolumns extends com.querydsl.sql.RelationalPathBase<QSyscursorcolumns> {

    private static final long serialVersionUID = 963010551;

    public static final QSyscursorcolumns syscursorcolumns = new QSyscursorcolumns("syscursorcolumns");

    public final NumberPath<Integer> columnCharacteristicsFlags = createNumber("columnCharacteristicsFlags", Integer.class);

    public final NumberPath<Integer> columnid = createNumber("columnid", Integer.class);

    public final StringPath columnName = createString("columnName");

    public final NumberPath<Byte> columnPrecision = createNumber("columnPrecision", Byte.class);

    public final NumberPath<Byte> columnScale = createNumber("columnScale", Byte.class);

    public final NumberPath<Integer> columnSize = createNumber("columnSize", Integer.class);

    public final NumberPath<Integer> cursorHandle = createNumber("cursorHandle", Integer.class);

    public final NumberPath<Integer> dataTypeSql = createNumber("dataTypeSql", Integer.class);

    public final NumberPath<Integer> dbid = createNumber("dbid", Integer.class);

    public final StringPath dbname = createString("dbname");

    public final NumberPath<Short> hiddenColumn = createNumber("hiddenColumn", Short.class);

    public final NumberPath<Integer> objectid = createNumber("objectid", Integer.class);

    public final StringPath orderDirection = createString("orderDirection");

    public final NumberPath<Integer> orderPosition = createNumber("orderPosition", Integer.class);

    public final NumberPath<Integer> ordinalPosition = createNumber("ordinalPosition", Integer.class);

    public QSyscursorcolumns(String variable) {
        super(QSyscursorcolumns.class, forVariable(variable), "sys", "syscursorcolumns");
        addMetadata();
    }

    public QSyscursorcolumns(String variable, String schema, String table) {
        super(QSyscursorcolumns.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSyscursorcolumns(Path<? extends QSyscursorcolumns> path) {
        super(path.getType(), path.getMetadata(), "sys", "syscursorcolumns");
        addMetadata();
    }

    public QSyscursorcolumns(PathMetadata metadata) {
        super(QSyscursorcolumns.class, metadata, "sys", "syscursorcolumns");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(columnCharacteristicsFlags, ColumnMetadata.named("column_characteristics_flags").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(columnid, ColumnMetadata.named("columnid").withIndex(12).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(columnName, ColumnMetadata.named("column_name").withIndex(2).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(columnPrecision, ColumnMetadata.named("column_precision").withIndex(7).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(columnScale, ColumnMetadata.named("column_scale").withIndex(8).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(columnSize, ColumnMetadata.named("column_size").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(cursorHandle, ColumnMetadata.named("cursor_handle").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(dataTypeSql, ColumnMetadata.named("data_type_sql").withIndex(6).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(dbid, ColumnMetadata.named("dbid").withIndex(14).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(dbname, ColumnMetadata.named("dbname").withIndex(15).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(hiddenColumn, ColumnMetadata.named("hidden_column").withIndex(11).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(objectid, ColumnMetadata.named("objectid").withIndex(13).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(orderDirection, ColumnMetadata.named("order_direction").withIndex(10).ofType(Types.NVARCHAR).withSize(1));
        addMetadata(orderPosition, ColumnMetadata.named("order_position").withIndex(9).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(ordinalPosition, ColumnMetadata.named("ordinal_position").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

