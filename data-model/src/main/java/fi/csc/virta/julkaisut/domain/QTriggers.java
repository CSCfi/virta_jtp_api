package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTriggers is a Querydsl query type for QTriggers
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTriggers extends com.querydsl.sql.RelationalPathBase<QTriggers> {

    private static final long serialVersionUID = 176898200;

    public static final QTriggers triggers = new QTriggers("triggers");

    public final DateTimePath<java.sql.Timestamp> createDate = createDateTime("createDate", java.sql.Timestamp.class);

    public final BooleanPath isDisabled = createBoolean("isDisabled");

    public final BooleanPath isInsteadOfTrigger = createBoolean("isInsteadOfTrigger");

    public final BooleanPath isMsShipped = createBoolean("isMsShipped");

    public final BooleanPath isNotForReplication = createBoolean("isNotForReplication");

    public final DateTimePath<java.sql.Timestamp> modifyDate = createDateTime("modifyDate", java.sql.Timestamp.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public final NumberPath<Byte> parentClass = createNumber("parentClass", Byte.class);

    public final StringPath parentClassDesc = createString("parentClassDesc");

    public final NumberPath<Integer> parentId = createNumber("parentId", Integer.class);

    public final StringPath type = createString("type");

    public final StringPath typeDesc = createString("typeDesc");

    public QTriggers(String variable) {
        super(QTriggers.class, forVariable(variable), "sys", "triggers");
        addMetadata();
    }

    public QTriggers(String variable, String schema, String table) {
        super(QTriggers.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTriggers(Path<? extends QTriggers> path) {
        super(path.getType(), path.getMetadata(), "sys", "triggers");
        addMetadata();
    }

    public QTriggers(PathMetadata metadata) {
        super(QTriggers.class, metadata, "sys", "triggers");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(createDate, ColumnMetadata.named("create_date").withIndex(8).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(isDisabled, ColumnMetadata.named("is_disabled").withIndex(11).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isInsteadOfTrigger, ColumnMetadata.named("is_instead_of_trigger").withIndex(13).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isMsShipped, ColumnMetadata.named("is_ms_shipped").withIndex(10).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isNotForReplication, ColumnMetadata.named("is_not_for_replication").withIndex(12).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(modifyDate, ColumnMetadata.named("modify_date").withIndex(9).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(parentClass, ColumnMetadata.named("parent_class").withIndex(3).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(parentClassDesc, ColumnMetadata.named("parent_class_desc").withIndex(4).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(parentId, ColumnMetadata.named("parent_id").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(type, ColumnMetadata.named("type").withIndex(6).ofType(Types.CHAR).withSize(2).notNull());
        addMetadata(typeDesc, ColumnMetadata.named("type_desc").withIndex(7).ofType(Types.NVARCHAR).withSize(60));
    }

}

