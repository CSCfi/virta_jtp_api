package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QInternalTables is a Querydsl query type for QInternalTables
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QInternalTables extends com.querydsl.sql.RelationalPathBase<QInternalTables> {

    private static final long serialVersionUID = 1547678879;

    public static final QInternalTables internalTables = new QInternalTables("internal_tables");

    public final DateTimePath<java.sql.Timestamp> createDate = createDateTime("createDate", java.sql.Timestamp.class);

    public final NumberPath<Integer> filestreamDataSpaceId = createNumber("filestreamDataSpaceId", Integer.class);

    public final NumberPath<Byte> internalType = createNumber("internalType", Byte.class);

    public final StringPath internalTypeDesc = createString("internalTypeDesc");

    public final BooleanPath isMsShipped = createBoolean("isMsShipped");

    public final BooleanPath isPublished = createBoolean("isPublished");

    public final BooleanPath isSchemaPublished = createBoolean("isSchemaPublished");

    public final NumberPath<Integer> lobDataSpaceId = createNumber("lobDataSpaceId", Integer.class);

    public final DateTimePath<java.sql.Timestamp> modifyDate = createDateTime("modifyDate", java.sql.Timestamp.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public final NumberPath<Integer> parentId = createNumber("parentId", Integer.class);

    public final NumberPath<Integer> parentMinorId = createNumber("parentMinorId", Integer.class);

    public final NumberPath<Integer> parentObjectId = createNumber("parentObjectId", Integer.class);

    public final NumberPath<Integer> principalId = createNumber("principalId", Integer.class);

    public final NumberPath<Integer> schemaId = createNumber("schemaId", Integer.class);

    public final StringPath type = createString("type");

    public final StringPath typeDesc = createString("typeDesc");

    public QInternalTables(String variable) {
        super(QInternalTables.class, forVariable(variable), "sys", "internal_tables");
        addMetadata();
    }

    public QInternalTables(String variable, String schema, String table) {
        super(QInternalTables.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QInternalTables(Path<? extends QInternalTables> path) {
        super(path.getType(), path.getMetadata(), "sys", "internal_tables");
        addMetadata();
    }

    public QInternalTables(PathMetadata metadata) {
        super(QInternalTables.class, metadata, "sys", "internal_tables");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(createDate, ColumnMetadata.named("create_date").withIndex(8).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(filestreamDataSpaceId, ColumnMetadata.named("filestream_data_space_id").withIndex(18).ofType(Types.INTEGER).withSize(10));
        addMetadata(internalType, ColumnMetadata.named("internal_type").withIndex(13).ofType(Types.TINYINT).withSize(3));
        addMetadata(internalTypeDesc, ColumnMetadata.named("internal_type_desc").withIndex(14).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(isMsShipped, ColumnMetadata.named("is_ms_shipped").withIndex(10).ofType(Types.BIT).withSize(1));
        addMetadata(isPublished, ColumnMetadata.named("is_published").withIndex(11).ofType(Types.BIT).withSize(1));
        addMetadata(isSchemaPublished, ColumnMetadata.named("is_schema_published").withIndex(12).ofType(Types.BIT).withSize(1));
        addMetadata(lobDataSpaceId, ColumnMetadata.named("lob_data_space_id").withIndex(17).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(modifyDate, ColumnMetadata.named("modify_date").withIndex(9).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(parentId, ColumnMetadata.named("parent_id").withIndex(15).ofType(Types.INTEGER).withSize(10));
        addMetadata(parentMinorId, ColumnMetadata.named("parent_minor_id").withIndex(16).ofType(Types.INTEGER).withSize(10));
        addMetadata(parentObjectId, ColumnMetadata.named("parent_object_id").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(principalId, ColumnMetadata.named("principal_id").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(schemaId, ColumnMetadata.named("schema_id").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(type, ColumnMetadata.named("type").withIndex(6).ofType(Types.CHAR).withSize(2).notNull());
        addMetadata(typeDesc, ColumnMetadata.named("type_desc").withIndex(7).ofType(Types.NVARCHAR).withSize(60));
    }

}

