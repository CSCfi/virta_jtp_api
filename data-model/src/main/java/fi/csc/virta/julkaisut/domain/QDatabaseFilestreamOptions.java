package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDatabaseFilestreamOptions is a Querydsl query type for QDatabaseFilestreamOptions
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDatabaseFilestreamOptions extends com.querydsl.sql.RelationalPathBase<QDatabaseFilestreamOptions> {

    private static final long serialVersionUID = -803717750;

    public static final QDatabaseFilestreamOptions databaseFilestreamOptions = new QDatabaseFilestreamOptions("database_filestream_options");

    public final NumberPath<Integer> databaseId = createNumber("databaseId", Integer.class);

    public final StringPath directoryName = createString("directoryName");

    public final NumberPath<Byte> nonTransactedAccess = createNumber("nonTransactedAccess", Byte.class);

    public final StringPath nonTransactedAccessDesc = createString("nonTransactedAccessDesc");

    public QDatabaseFilestreamOptions(String variable) {
        super(QDatabaseFilestreamOptions.class, forVariable(variable), "sys", "database_filestream_options");
        addMetadata();
    }

    public QDatabaseFilestreamOptions(String variable, String schema, String table) {
        super(QDatabaseFilestreamOptions.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDatabaseFilestreamOptions(Path<? extends QDatabaseFilestreamOptions> path) {
        super(path.getType(), path.getMetadata(), "sys", "database_filestream_options");
        addMetadata();
    }

    public QDatabaseFilestreamOptions(PathMetadata metadata) {
        super(QDatabaseFilestreamOptions.class, metadata, "sys", "database_filestream_options");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(databaseId, ColumnMetadata.named("database_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(directoryName, ColumnMetadata.named("directory_name").withIndex(4).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(nonTransactedAccess, ColumnMetadata.named("non_transacted_access").withIndex(2).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(nonTransactedAccessDesc, ColumnMetadata.named("non_transacted_access_desc").withIndex(3).ofType(Types.NVARCHAR).withSize(60).notNull());
    }

}

