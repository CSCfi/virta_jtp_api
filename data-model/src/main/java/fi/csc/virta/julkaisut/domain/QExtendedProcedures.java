package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QExtendedProcedures is a Querydsl query type for QExtendedProcedures
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QExtendedProcedures extends com.querydsl.sql.RelationalPathBase<QExtendedProcedures> {

    private static final long serialVersionUID = 982342838;

    public static final QExtendedProcedures extendedProcedures = new QExtendedProcedures("extended_procedures");

    public final DateTimePath<java.sql.Timestamp> createDate = createDateTime("createDate", java.sql.Timestamp.class);

    public final StringPath dllName = createString("dllName");

    public final BooleanPath isMsShipped = createBoolean("isMsShipped");

    public final BooleanPath isPublished = createBoolean("isPublished");

    public final BooleanPath isSchemaPublished = createBoolean("isSchemaPublished");

    public final DateTimePath<java.sql.Timestamp> modifyDate = createDateTime("modifyDate", java.sql.Timestamp.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public final NumberPath<Integer> parentObjectId = createNumber("parentObjectId", Integer.class);

    public final NumberPath<Integer> principalId = createNumber("principalId", Integer.class);

    public final NumberPath<Integer> schemaId = createNumber("schemaId", Integer.class);

    public final StringPath type = createString("type");

    public final StringPath typeDesc = createString("typeDesc");

    public QExtendedProcedures(String variable) {
        super(QExtendedProcedures.class, forVariable(variable), "sys", "extended_procedures");
        addMetadata();
    }

    public QExtendedProcedures(String variable, String schema, String table) {
        super(QExtendedProcedures.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QExtendedProcedures(Path<? extends QExtendedProcedures> path) {
        super(path.getType(), path.getMetadata(), "sys", "extended_procedures");
        addMetadata();
    }

    public QExtendedProcedures(PathMetadata metadata) {
        super(QExtendedProcedures.class, metadata, "sys", "extended_procedures");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(createDate, ColumnMetadata.named("create_date").withIndex(8).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(dllName, ColumnMetadata.named("dll_name").withIndex(13).ofType(Types.NVARCHAR).withSize(260));
        addMetadata(isMsShipped, ColumnMetadata.named("is_ms_shipped").withIndex(10).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isPublished, ColumnMetadata.named("is_published").withIndex(11).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isSchemaPublished, ColumnMetadata.named("is_schema_published").withIndex(12).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(modifyDate, ColumnMetadata.named("modify_date").withIndex(9).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(parentObjectId, ColumnMetadata.named("parent_object_id").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(principalId, ColumnMetadata.named("principal_id").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(schemaId, ColumnMetadata.named("schema_id").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(type, ColumnMetadata.named("type").withIndex(6).ofType(Types.CHAR).withSize(2).notNull());
        addMetadata(typeDesc, ColumnMetadata.named("type_desc").withIndex(7).ofType(Types.NVARCHAR).withSize(60));
    }

}

