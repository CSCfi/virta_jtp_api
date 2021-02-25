package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QViews is a Querydsl query type for QViews
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QViews extends com.querydsl.sql.RelationalPathBase<QViews> {

    private static final long serialVersionUID = -1847398223;

    public static final QViews views = new QViews("views");

    public final DateTimePath<java.sql.Timestamp> createDate = createDateTime("createDate", java.sql.Timestamp.class);

    public final BooleanPath hasOpaqueMetadata = createBoolean("hasOpaqueMetadata");

    public final BooleanPath hasReplicationFilter = createBoolean("hasReplicationFilter");

    public final BooleanPath hasUncheckedAssemblyData = createBoolean("hasUncheckedAssemblyData");

    public final BooleanPath isDateCorrelationView = createBoolean("isDateCorrelationView");

    public final BooleanPath isMsShipped = createBoolean("isMsShipped");

    public final BooleanPath isPublished = createBoolean("isPublished");

    public final BooleanPath isReplicated = createBoolean("isReplicated");

    public final BooleanPath isSchemaPublished = createBoolean("isSchemaPublished");

    public final BooleanPath isTrackedByCdc = createBoolean("isTrackedByCdc");

    public final DateTimePath<java.sql.Timestamp> modifyDate = createDateTime("modifyDate", java.sql.Timestamp.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public final NumberPath<Integer> parentObjectId = createNumber("parentObjectId", Integer.class);

    public final NumberPath<Integer> principalId = createNumber("principalId", Integer.class);

    public final NumberPath<Integer> schemaId = createNumber("schemaId", Integer.class);

    public final StringPath type = createString("type");

    public final StringPath typeDesc = createString("typeDesc");

    public final BooleanPath withCheckOption = createBoolean("withCheckOption");

    public QViews(String variable) {
        super(QViews.class, forVariable(variable), "sys", "views");
        addMetadata();
    }

    public QViews(String variable, String schema, String table) {
        super(QViews.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QViews(Path<? extends QViews> path) {
        super(path.getType(), path.getMetadata(), "sys", "views");
        addMetadata();
    }

    public QViews(PathMetadata metadata) {
        super(QViews.class, metadata, "sys", "views");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(createDate, ColumnMetadata.named("create_date").withIndex(8).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(hasOpaqueMetadata, ColumnMetadata.named("has_opaque_metadata").withIndex(15).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(hasReplicationFilter, ColumnMetadata.named("has_replication_filter").withIndex(14).ofType(Types.BIT).withSize(1));
        addMetadata(hasUncheckedAssemblyData, ColumnMetadata.named("has_unchecked_assembly_data").withIndex(16).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isDateCorrelationView, ColumnMetadata.named("is_date_correlation_view").withIndex(18).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isMsShipped, ColumnMetadata.named("is_ms_shipped").withIndex(10).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isPublished, ColumnMetadata.named("is_published").withIndex(11).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isReplicated, ColumnMetadata.named("is_replicated").withIndex(13).ofType(Types.BIT).withSize(1));
        addMetadata(isSchemaPublished, ColumnMetadata.named("is_schema_published").withIndex(12).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isTrackedByCdc, ColumnMetadata.named("is_tracked_by_cdc").withIndex(19).ofType(Types.BIT).withSize(1));
        addMetadata(modifyDate, ColumnMetadata.named("modify_date").withIndex(9).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(parentObjectId, ColumnMetadata.named("parent_object_id").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(principalId, ColumnMetadata.named("principal_id").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(schemaId, ColumnMetadata.named("schema_id").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(type, ColumnMetadata.named("type").withIndex(6).ofType(Types.CHAR).withSize(2).notNull());
        addMetadata(typeDesc, ColumnMetadata.named("type_desc").withIndex(7).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(withCheckOption, ColumnMetadata.named("with_check_option").withIndex(17).ofType(Types.BIT).withSize(1).notNull());
    }

}

