package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTables is a Querydsl query type for QTables
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTables extends com.querydsl.sql.RelationalPathBase<QTables> {

    private static final long serialVersionUID = -1499516798;

    public static final QTables tables = new QTables("tables");

    public final DateTimePath<java.sql.Timestamp> createDate = createDateTime("createDate", java.sql.Timestamp.class);

    public final NumberPath<Integer> filestreamDataSpaceId = createNumber("filestreamDataSpaceId", Integer.class);

    public final BooleanPath hasReplicationFilter = createBoolean("hasReplicationFilter");

    public final BooleanPath hasUncheckedAssemblyData = createBoolean("hasUncheckedAssemblyData");

    public final BooleanPath isFiletable = createBoolean("isFiletable");

    public final BooleanPath isMergePublished = createBoolean("isMergePublished");

    public final BooleanPath isMsShipped = createBoolean("isMsShipped");

    public final BooleanPath isPublished = createBoolean("isPublished");

    public final BooleanPath isReplicated = createBoolean("isReplicated");

    public final BooleanPath isSchemaPublished = createBoolean("isSchemaPublished");

    public final BooleanPath isSyncTranSubscribed = createBoolean("isSyncTranSubscribed");

    public final BooleanPath isTrackedByCdc = createBoolean("isTrackedByCdc");

    public final BooleanPath largeValueTypesOutOfRow = createBoolean("largeValueTypesOutOfRow");

    public final NumberPath<Integer> lobDataSpaceId = createNumber("lobDataSpaceId", Integer.class);

    public final NumberPath<Byte> lockEscalation = createNumber("lockEscalation", Byte.class);

    public final StringPath lockEscalationDesc = createString("lockEscalationDesc");

    public final BooleanPath lockOnBulkLoad = createBoolean("lockOnBulkLoad");

    public final NumberPath<Integer> maxColumnIdUsed = createNumber("maxColumnIdUsed", Integer.class);

    public final DateTimePath<java.sql.Timestamp> modifyDate = createDateTime("modifyDate", java.sql.Timestamp.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public final NumberPath<Integer> parentObjectId = createNumber("parentObjectId", Integer.class);

    public final NumberPath<Integer> principalId = createNumber("principalId", Integer.class);

    public final NumberPath<Integer> schemaId = createNumber("schemaId", Integer.class);

    public final NumberPath<Integer> textInRowLimit = createNumber("textInRowLimit", Integer.class);

    public final StringPath type = createString("type");

    public final StringPath typeDesc = createString("typeDesc");

    public final BooleanPath usesAnsiNulls = createBoolean("usesAnsiNulls");

    public QTables(String variable) {
        super(QTables.class, forVariable(variable), "sys", "tables");
        addMetadata();
    }

    public QTables(String variable, String schema, String table) {
        super(QTables.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTables(Path<? extends QTables> path) {
        super(path.getType(), path.getMetadata(), "sys", "tables");
        addMetadata();
    }

    public QTables(PathMetadata metadata) {
        super(QTables.class, metadata, "sys", "tables");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(createDate, ColumnMetadata.named("create_date").withIndex(8).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(filestreamDataSpaceId, ColumnMetadata.named("filestream_data_space_id").withIndex(14).ofType(Types.INTEGER).withSize(10));
        addMetadata(hasReplicationFilter, ColumnMetadata.named("has_replication_filter").withIndex(19).ofType(Types.BIT).withSize(1));
        addMetadata(hasUncheckedAssemblyData, ColumnMetadata.named("has_unchecked_assembly_data").withIndex(22).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isFiletable, ColumnMetadata.named("is_filetable").withIndex(28).ofType(Types.BIT).withSize(1));
        addMetadata(isMergePublished, ColumnMetadata.named("is_merge_published").withIndex(20).ofType(Types.BIT).withSize(1));
        addMetadata(isMsShipped, ColumnMetadata.named("is_ms_shipped").withIndex(10).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isPublished, ColumnMetadata.named("is_published").withIndex(11).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isReplicated, ColumnMetadata.named("is_replicated").withIndex(18).ofType(Types.BIT).withSize(1));
        addMetadata(isSchemaPublished, ColumnMetadata.named("is_schema_published").withIndex(12).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isSyncTranSubscribed, ColumnMetadata.named("is_sync_tran_subscribed").withIndex(21).ofType(Types.BIT).withSize(1));
        addMetadata(isTrackedByCdc, ColumnMetadata.named("is_tracked_by_cdc").withIndex(25).ofType(Types.BIT).withSize(1));
        addMetadata(largeValueTypesOutOfRow, ColumnMetadata.named("large_value_types_out_of_row").withIndex(24).ofType(Types.BIT).withSize(1));
        addMetadata(lobDataSpaceId, ColumnMetadata.named("lob_data_space_id").withIndex(13).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(lockEscalation, ColumnMetadata.named("lock_escalation").withIndex(26).ofType(Types.TINYINT).withSize(3));
        addMetadata(lockEscalationDesc, ColumnMetadata.named("lock_escalation_desc").withIndex(27).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(lockOnBulkLoad, ColumnMetadata.named("lock_on_bulk_load").withIndex(16).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(maxColumnIdUsed, ColumnMetadata.named("max_column_id_used").withIndex(15).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(modifyDate, ColumnMetadata.named("modify_date").withIndex(9).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(parentObjectId, ColumnMetadata.named("parent_object_id").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(principalId, ColumnMetadata.named("principal_id").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(schemaId, ColumnMetadata.named("schema_id").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(textInRowLimit, ColumnMetadata.named("text_in_row_limit").withIndex(23).ofType(Types.INTEGER).withSize(10));
        addMetadata(type, ColumnMetadata.named("type").withIndex(6).ofType(Types.CHAR).withSize(2).notNull());
        addMetadata(typeDesc, ColumnMetadata.named("type_desc").withIndex(7).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(usesAnsiNulls, ColumnMetadata.named("uses_ansi_nulls").withIndex(17).ofType(Types.BIT).withSize(1));
    }

}

