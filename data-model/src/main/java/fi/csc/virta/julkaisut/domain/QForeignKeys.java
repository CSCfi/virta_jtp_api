package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QForeignKeys is a Querydsl query type for QForeignKeys
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QForeignKeys extends com.querydsl.sql.RelationalPathBase<QForeignKeys> {

    private static final long serialVersionUID = -718901013;

    public static final QForeignKeys foreignKeys = new QForeignKeys("foreign_keys");

    public final DateTimePath<java.sql.Timestamp> createDate = createDateTime("createDate", java.sql.Timestamp.class);

    public final NumberPath<Byte> deleteReferentialAction = createNumber("deleteReferentialAction", Byte.class);

    public final StringPath deleteReferentialActionDesc = createString("deleteReferentialActionDesc");

    public final BooleanPath isDisabled = createBoolean("isDisabled");

    public final BooleanPath isMsShipped = createBoolean("isMsShipped");

    public final BooleanPath isNotForReplication = createBoolean("isNotForReplication");

    public final BooleanPath isNotTrusted = createBoolean("isNotTrusted");

    public final BooleanPath isPublished = createBoolean("isPublished");

    public final BooleanPath isSchemaPublished = createBoolean("isSchemaPublished");

    public final BooleanPath isSystemNamed = createBoolean("isSystemNamed");

    public final NumberPath<Integer> keyIndexId = createNumber("keyIndexId", Integer.class);

    public final DateTimePath<java.sql.Timestamp> modifyDate = createDateTime("modifyDate", java.sql.Timestamp.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public final NumberPath<Integer> parentObjectId = createNumber("parentObjectId", Integer.class);

    public final NumberPath<Integer> principalId = createNumber("principalId", Integer.class);

    public final NumberPath<Integer> referencedObjectId = createNumber("referencedObjectId", Integer.class);

    public final NumberPath<Integer> schemaId = createNumber("schemaId", Integer.class);

    public final StringPath type = createString("type");

    public final StringPath typeDesc = createString("typeDesc");

    public final NumberPath<Byte> updateReferentialAction = createNumber("updateReferentialAction", Byte.class);

    public final StringPath updateReferentialActionDesc = createString("updateReferentialActionDesc");

    public QForeignKeys(String variable) {
        super(QForeignKeys.class, forVariable(variable), "sys", "foreign_keys");
        addMetadata();
    }

    public QForeignKeys(String variable, String schema, String table) {
        super(QForeignKeys.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QForeignKeys(Path<? extends QForeignKeys> path) {
        super(path.getType(), path.getMetadata(), "sys", "foreign_keys");
        addMetadata();
    }

    public QForeignKeys(PathMetadata metadata) {
        super(QForeignKeys.class, metadata, "sys", "foreign_keys");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(createDate, ColumnMetadata.named("create_date").withIndex(8).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(deleteReferentialAction, ColumnMetadata.named("delete_referential_action").withIndex(18).ofType(Types.TINYINT).withSize(3));
        addMetadata(deleteReferentialActionDesc, ColumnMetadata.named("delete_referential_action_desc").withIndex(19).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(isDisabled, ColumnMetadata.named("is_disabled").withIndex(15).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isMsShipped, ColumnMetadata.named("is_ms_shipped").withIndex(10).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isNotForReplication, ColumnMetadata.named("is_not_for_replication").withIndex(16).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isNotTrusted, ColumnMetadata.named("is_not_trusted").withIndex(17).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isPublished, ColumnMetadata.named("is_published").withIndex(11).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isSchemaPublished, ColumnMetadata.named("is_schema_published").withIndex(12).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isSystemNamed, ColumnMetadata.named("is_system_named").withIndex(22).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(keyIndexId, ColumnMetadata.named("key_index_id").withIndex(14).ofType(Types.INTEGER).withSize(10));
        addMetadata(modifyDate, ColumnMetadata.named("modify_date").withIndex(9).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(parentObjectId, ColumnMetadata.named("parent_object_id").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(principalId, ColumnMetadata.named("principal_id").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(referencedObjectId, ColumnMetadata.named("referenced_object_id").withIndex(13).ofType(Types.INTEGER).withSize(10));
        addMetadata(schemaId, ColumnMetadata.named("schema_id").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(type, ColumnMetadata.named("type").withIndex(6).ofType(Types.CHAR).withSize(2).notNull());
        addMetadata(typeDesc, ColumnMetadata.named("type_desc").withIndex(7).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(updateReferentialAction, ColumnMetadata.named("update_referential_action").withIndex(20).ofType(Types.TINYINT).withSize(3));
        addMetadata(updateReferentialActionDesc, ColumnMetadata.named("update_referential_action_desc").withIndex(21).ofType(Types.NVARCHAR).withSize(60));
    }

}

