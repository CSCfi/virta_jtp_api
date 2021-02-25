package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QPlanGuides is a Querydsl query type for QPlanGuides
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPlanGuides extends com.querydsl.sql.RelationalPathBase<QPlanGuides> {

    private static final long serialVersionUID = 1199666461;

    public static final QPlanGuides planGuides = new QPlanGuides("plan_guides");

    public final DateTimePath<java.sql.Timestamp> createDate = createDateTime("createDate", java.sql.Timestamp.class);

    public final StringPath hints = createString("hints");

    public final BooleanPath isDisabled = createBoolean("isDisabled");

    public final DateTimePath<java.sql.Timestamp> modifyDate = createDateTime("modifyDate", java.sql.Timestamp.class);

    public final StringPath name = createString("name");

    public final StringPath parameters = createString("parameters");

    public final NumberPath<Integer> planGuideId = createNumber("planGuideId", Integer.class);

    public final StringPath queryText = createString("queryText");

    public final StringPath scopeBatch = createString("scopeBatch");

    public final NumberPath<Integer> scopeObjectId = createNumber("scopeObjectId", Integer.class);

    public final NumberPath<Byte> scopeType = createNumber("scopeType", Byte.class);

    public final StringPath scopeTypeDesc = createString("scopeTypeDesc");

    public QPlanGuides(String variable) {
        super(QPlanGuides.class, forVariable(variable), "sys", "plan_guides");
        addMetadata();
    }

    public QPlanGuides(String variable, String schema, String table) {
        super(QPlanGuides.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPlanGuides(Path<? extends QPlanGuides> path) {
        super(path.getType(), path.getMetadata(), "sys", "plan_guides");
        addMetadata();
    }

    public QPlanGuides(PathMetadata metadata) {
        super(QPlanGuides.class, metadata, "sys", "plan_guides");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(createDate, ColumnMetadata.named("create_date").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(hints, ColumnMetadata.named("hints").withIndex(12).ofType(Types.NVARCHAR).withSize(2147483647));
        addMetadata(isDisabled, ColumnMetadata.named("is_disabled").withIndex(5).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(modifyDate, ColumnMetadata.named("modify_date").withIndex(4).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(parameters, ColumnMetadata.named("parameters").withIndex(11).ofType(Types.NVARCHAR).withSize(2147483647));
        addMetadata(planGuideId, ColumnMetadata.named("plan_guide_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(queryText, ColumnMetadata.named("query_text").withIndex(6).ofType(Types.NVARCHAR).withSize(2147483647));
        addMetadata(scopeBatch, ColumnMetadata.named("scope_batch").withIndex(10).ofType(Types.NVARCHAR).withSize(2147483647));
        addMetadata(scopeObjectId, ColumnMetadata.named("scope_object_id").withIndex(9).ofType(Types.INTEGER).withSize(10));
        addMetadata(scopeType, ColumnMetadata.named("scope_type").withIndex(7).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(scopeTypeDesc, ColumnMetadata.named("scope_type_desc").withIndex(8).ofType(Types.NVARCHAR).withSize(60));
    }

}

