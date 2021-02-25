package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmDbUncontainedEntities is a Querydsl query type for QDmDbUncontainedEntities
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmDbUncontainedEntities extends com.querydsl.sql.RelationalPathBase<QDmDbUncontainedEntities> {

    private static final long serialVersionUID = 1944713463;

    public static final QDmDbUncontainedEntities dmDbUncontainedEntities = new QDmDbUncontainedEntities("dm_db_uncontained_entities");

    public final NumberPath<Integer> classCol = createNumber("classCol", Integer.class);

    public final StringPath classDesc = createString("classDesc");

    public final StringPath featureName = createString("featureName");

    public final StringPath featureTypeName = createString("featureTypeName");

    public final NumberPath<Integer> majorId = createNumber("majorId", Integer.class);

    public final NumberPath<Integer> statementLineNumber = createNumber("statementLineNumber", Integer.class);

    public final NumberPath<Integer> statementOffsetBegin = createNumber("statementOffsetBegin", Integer.class);

    public final NumberPath<Integer> statementOffsetEnd = createNumber("statementOffsetEnd", Integer.class);

    public final StringPath statementType = createString("statementType");

    public QDmDbUncontainedEntities(String variable) {
        super(QDmDbUncontainedEntities.class, forVariable(variable), "sys", "dm_db_uncontained_entities");
        addMetadata();
    }

    public QDmDbUncontainedEntities(String variable, String schema, String table) {
        super(QDmDbUncontainedEntities.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmDbUncontainedEntities(Path<? extends QDmDbUncontainedEntities> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_db_uncontained_entities");
        addMetadata();
    }

    public QDmDbUncontainedEntities(PathMetadata metadata) {
        super(QDmDbUncontainedEntities.class, metadata, "sys", "dm_db_uncontained_entities");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(classCol, ColumnMetadata.named("class").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(classDesc, ColumnMetadata.named("class_desc").withIndex(2).ofType(Types.NVARCHAR).withSize(60).notNull());
        addMetadata(featureName, ColumnMetadata.named("feature_name").withIndex(8).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(featureTypeName, ColumnMetadata.named("feature_type_name").withIndex(9).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(majorId, ColumnMetadata.named("major_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(statementLineNumber, ColumnMetadata.named("statement_line_number").withIndex(4).ofType(Types.INTEGER).withSize(10));
        addMetadata(statementOffsetBegin, ColumnMetadata.named("statement_offset_begin").withIndex(5).ofType(Types.INTEGER).withSize(10));
        addMetadata(statementOffsetEnd, ColumnMetadata.named("statement_offset_end").withIndex(6).ofType(Types.INTEGER).withSize(10));
        addMetadata(statementType, ColumnMetadata.named("statement_type").withIndex(7).ofType(Types.NVARCHAR).withSize(256));
    }

}

