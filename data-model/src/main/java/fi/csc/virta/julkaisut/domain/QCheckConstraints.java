package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCheckConstraints is a Querydsl query type for QCheckConstraints
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCheckConstraints extends com.querydsl.sql.RelationalPathBase<QCheckConstraints> {

    private static final long serialVersionUID = -1243142677;

    public static final QCheckConstraints checkConstraints = new QCheckConstraints("check_constraints");

    public final DateTimePath<java.sql.Timestamp> createDate = createDateTime("createDate", java.sql.Timestamp.class);

    public final StringPath definition = createString("definition");

    public final BooleanPath isDisabled = createBoolean("isDisabled");

    public final BooleanPath isMsShipped = createBoolean("isMsShipped");

    public final BooleanPath isNotForReplication = createBoolean("isNotForReplication");

    public final BooleanPath isNotTrusted = createBoolean("isNotTrusted");

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

    public final BooleanPath usesDatabaseCollation = createBoolean("usesDatabaseCollation");

    public QCheckConstraints(String variable) {
        super(QCheckConstraints.class, forVariable(variable), "sys", "check_constraints");
        addMetadata();
    }

    public QCheckConstraints(String variable, String schema, String table) {
        super(QCheckConstraints.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCheckConstraints(Path<? extends QCheckConstraints> path) {
        super(path.getType(), path.getMetadata(), "sys", "check_constraints");
        addMetadata();
    }

    public QCheckConstraints(PathMetadata metadata) {
        super(QCheckConstraints.class, metadata, "sys", "check_constraints");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(createDate, ColumnMetadata.named("create_date").withIndex(8).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(definition, ColumnMetadata.named("definition").withIndex(17).ofType(Types.NVARCHAR).withSize(2147483647));
        addMetadata(isDisabled, ColumnMetadata.named("is_disabled").withIndex(13).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isMsShipped, ColumnMetadata.named("is_ms_shipped").withIndex(10).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isNotForReplication, ColumnMetadata.named("is_not_for_replication").withIndex(14).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isNotTrusted, ColumnMetadata.named("is_not_trusted").withIndex(15).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isPublished, ColumnMetadata.named("is_published").withIndex(11).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isSchemaPublished, ColumnMetadata.named("is_schema_published").withIndex(12).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isSystemNamed, ColumnMetadata.named("is_system_named").withIndex(19).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(modifyDate, ColumnMetadata.named("modify_date").withIndex(9).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(parentColumnId, ColumnMetadata.named("parent_column_id").withIndex(16).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(parentObjectId, ColumnMetadata.named("parent_object_id").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(principalId, ColumnMetadata.named("principal_id").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(schemaId, ColumnMetadata.named("schema_id").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(type, ColumnMetadata.named("type").withIndex(6).ofType(Types.CHAR).withSize(2).notNull());
        addMetadata(typeDesc, ColumnMetadata.named("type_desc").withIndex(7).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(usesDatabaseCollation, ColumnMetadata.named("uses_database_collation").withIndex(18).ofType(Types.BIT).withSize(1));
    }

}

