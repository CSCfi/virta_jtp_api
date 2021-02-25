package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmDbMissingIndexDetails is a Querydsl query type for QDmDbMissingIndexDetails
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmDbMissingIndexDetails extends com.querydsl.sql.RelationalPathBase<QDmDbMissingIndexDetails> {

    private static final long serialVersionUID = -535860558;

    public static final QDmDbMissingIndexDetails dmDbMissingIndexDetails = new QDmDbMissingIndexDetails("dm_db_missing_index_details");

    public final NumberPath<Short> databaseId = createNumber("databaseId", Short.class);

    public final StringPath equalityColumns = createString("equalityColumns");

    public final StringPath includedColumns = createString("includedColumns");

    public final NumberPath<Integer> indexHandle = createNumber("indexHandle", Integer.class);

    public final StringPath inequalityColumns = createString("inequalityColumns");

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public final StringPath statement = createString("statement");

    public QDmDbMissingIndexDetails(String variable) {
        super(QDmDbMissingIndexDetails.class, forVariable(variable), "sys", "dm_db_missing_index_details");
        addMetadata();
    }

    public QDmDbMissingIndexDetails(String variable, String schema, String table) {
        super(QDmDbMissingIndexDetails.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmDbMissingIndexDetails(Path<? extends QDmDbMissingIndexDetails> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_db_missing_index_details");
        addMetadata();
    }

    public QDmDbMissingIndexDetails(PathMetadata metadata) {
        super(QDmDbMissingIndexDetails.class, metadata, "sys", "dm_db_missing_index_details");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(databaseId, ColumnMetadata.named("database_id").withIndex(2).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(equalityColumns, ColumnMetadata.named("equality_columns").withIndex(4).ofType(Types.NVARCHAR).withSize(4000));
        addMetadata(includedColumns, ColumnMetadata.named("included_columns").withIndex(6).ofType(Types.NVARCHAR).withSize(4000));
        addMetadata(indexHandle, ColumnMetadata.named("index_handle").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(inequalityColumns, ColumnMetadata.named("inequality_columns").withIndex(5).ofType(Types.NVARCHAR).withSize(4000));
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(statement, ColumnMetadata.named("statement").withIndex(7).ofType(Types.NVARCHAR).withSize(4000));
    }

}

