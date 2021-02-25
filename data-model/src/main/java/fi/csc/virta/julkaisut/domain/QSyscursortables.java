package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSyscursortables is a Querydsl query type for QSyscursortables
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSyscursortables extends com.querydsl.sql.RelationalPathBase<QSyscursortables> {

    private static final long serialVersionUID = -326759669;

    public static final QSyscursortables syscursortables = new QSyscursortables("syscursortables");

    public final NumberPath<Integer> cursorHandle = createNumber("cursorHandle", Integer.class);

    public final NumberPath<Integer> dbid = createNumber("dbid", Integer.class);

    public final StringPath dbname = createString("dbname");

    public final NumberPath<Short> lockType = createNumber("lockType", Short.class);

    public final NumberPath<Integer> objectid = createNumber("objectid", Integer.class);

    public final NumberPath<Short> optimizerHint = createNumber("optimizerHint", Short.class);

    public final StringPath serverName = createString("serverName");

    public final StringPath tableName = createString("tableName");

    public final StringPath tableOwner = createString("tableOwner");

    public QSyscursortables(String variable) {
        super(QSyscursortables.class, forVariable(variable), "sys", "syscursortables");
        addMetadata();
    }

    public QSyscursortables(String variable, String schema, String table) {
        super(QSyscursortables.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSyscursortables(Path<? extends QSyscursortables> path) {
        super(path.getType(), path.getMetadata(), "sys", "syscursortables");
        addMetadata();
    }

    public QSyscursortables(PathMetadata metadata) {
        super(QSyscursortables.class, metadata, "sys", "syscursortables");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cursorHandle, ColumnMetadata.named("cursor_handle").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(dbid, ColumnMetadata.named("dbid").withIndex(8).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(dbname, ColumnMetadata.named("dbname").withIndex(9).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(lockType, ColumnMetadata.named("lock_type").withIndex(5).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(objectid, ColumnMetadata.named("objectid").withIndex(7).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(optimizerHint, ColumnMetadata.named("optimizer_hint").withIndex(4).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(serverName, ColumnMetadata.named("server_name").withIndex(6).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(tableName, ColumnMetadata.named("table_name").withIndex(3).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(tableOwner, ColumnMetadata.named("table_owner").withIndex(2).ofType(Types.NVARCHAR).withSize(128));
    }

}

