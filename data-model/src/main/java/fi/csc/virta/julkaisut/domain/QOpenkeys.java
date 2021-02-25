package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QOpenkeys is a Querydsl query type for QOpenkeys
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QOpenkeys extends com.querydsl.sql.RelationalPathBase<QOpenkeys> {

    private static final long serialVersionUID = -1830158821;

    public static final QOpenkeys openkeys = new QOpenkeys("openkeys");

    public final NumberPath<Integer> databaseId = createNumber("databaseId", Integer.class);

    public final StringPath databaseName = createString("databaseName");

    public final StringPath keyGuid = createString("keyGuid");

    public final NumberPath<Integer> keyId = createNumber("keyId", Integer.class);

    public final StringPath keyName = createString("keyName");

    public final DateTimePath<java.sql.Timestamp> openedDate = createDateTime("openedDate", java.sql.Timestamp.class);

    public final NumberPath<Short> status = createNumber("status", Short.class);

    public QOpenkeys(String variable) {
        super(QOpenkeys.class, forVariable(variable), "sys", "openkeys");
        addMetadata();
    }

    public QOpenkeys(String variable, String schema, String table) {
        super(QOpenkeys.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QOpenkeys(Path<? extends QOpenkeys> path) {
        super(path.getType(), path.getMetadata(), "sys", "openkeys");
        addMetadata();
    }

    public QOpenkeys(PathMetadata metadata) {
        super(QOpenkeys.class, metadata, "sys", "openkeys");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(databaseId, ColumnMetadata.named("database_id").withIndex(1).ofType(Types.INTEGER).withSize(10));
        addMetadata(databaseName, ColumnMetadata.named("database_name").withIndex(2).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(keyGuid, ColumnMetadata.named("key_guid").withIndex(5).ofType(Types.CHAR).withSize(36));
        addMetadata(keyId, ColumnMetadata.named("key_id").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(keyName, ColumnMetadata.named("key_name").withIndex(4).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(openedDate, ColumnMetadata.named("opened_date").withIndex(6).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(status, ColumnMetadata.named("status").withIndex(7).ofType(Types.SMALLINT).withSize(5));
    }

}

