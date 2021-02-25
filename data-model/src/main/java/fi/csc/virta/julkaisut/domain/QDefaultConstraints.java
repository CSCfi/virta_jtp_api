package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDefaultConstraints is a Querydsl query type for QDefaultConstraints
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDefaultConstraints extends com.querydsl.sql.RelationalPathBase<QDefaultConstraints> {

    private static final long serialVersionUID = 464479186;

    public static final QDefaultConstraints defaultConstraints = new QDefaultConstraints("default_constraints");

    public final DateTimePath<java.sql.Timestamp> createDate = createDateTime("createDate", java.sql.Timestamp.class);

    public final StringPath definition = createString("definition");

    public final BooleanPath isMsShipped = createBoolean("isMsShipped");

    public final BooleanPath isPublished = createBoolean("isPublished");

    public final BooleanPath isSchemaPublished = createBoolean("isSchemaPublished");

    public final BooleanPath isSystemNamed = createBoolean("isSystemNamed");

    public final DateTimePath<java.sql.Timestamp> modifyDate = createDateTime("modifyDate", java.sql.Timestamp.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public final NumberPath<Integer> parentColumnId = createNumber("parentColumnId", Integer.class);

    public final NumberPath<Integer> parentObjectId = createNumber("parentObjectId", Integer.class);

    public final NumberPath<Integer> principalId = createNumber("principalId", Integer.class);

    public final NumberPath<Integer> schemaId = createNumber("schemaId", Integer.class);

    public final StringPath type = createString("type");

    public final StringPath typeDesc = createString("typeDesc");

    public QDefaultConstraints(String variable) {
        super(QDefaultConstraints.class, forVariable(variable), "sys", "default_constraints");
        addMetadata();
    }

    public QDefaultConstraints(String variable, String schema, String table) {
        super(QDefaultConstraints.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDefaultConstraints(Path<? extends QDefaultConstraints> path) {
        super(path.getType(), path.getMetadata(), "sys", "default_constraints");
        addMetadata();
    }

    public QDefaultConstraints(PathMetadata metadata) {
        super(QDefaultConstraints.class, metadata, "sys", "default_constraints");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(createDate, ColumnMetadata.named("create_date").withIndex(8).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(definition, ColumnMetadata.named("definition").withIndex(14).ofType(Types.NVARCHAR).withSize(2147483647));
        addMetadata(isMsShipped, ColumnMetadata.named("is_ms_shipped").withIndex(10).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isPublished, ColumnMetadata.named("is_published").withIndex(11).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isSchemaPublished, ColumnMetadata.named("is_schema_published").withIndex(12).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isSystemNamed, ColumnMetadata.named("is_system_named").withIndex(15).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(modifyDate, ColumnMetadata.named("modify_date").withIndex(9).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(parentColumnId, ColumnMetadata.named("parent_column_id").withIndex(13).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(parentObjectId, ColumnMetadata.named("parent_object_id").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(principalId, ColumnMetadata.named("principal_id").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(schemaId, ColumnMetadata.named("schema_id").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(type, ColumnMetadata.named("type").withIndex(6).ofType(Types.CHAR).withSize(2).notNull());
        addMetadata(typeDesc, ColumnMetadata.named("type_desc").withIndex(7).ofType(Types.NVARCHAR).withSize(60));
    }

}

