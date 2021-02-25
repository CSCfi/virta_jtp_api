package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QReferentialConstraints is a Querydsl query type for QReferentialConstraints
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QReferentialConstraints extends com.querydsl.sql.RelationalPathBase<QReferentialConstraints> {

    private static final long serialVersionUID = -115013494;

    public static final QReferentialConstraints referentialConstraints = new QReferentialConstraints("REFERENTIAL_CONSTRAINTS");

    public final StringPath constraintCatalog = createString("constraintCatalog");

    public final StringPath constraintName = createString("constraintName");

    public final StringPath constraintSchema = createString("constraintSchema");

    public final StringPath deleteRule = createString("deleteRule");

    public final StringPath matchOption = createString("matchOption");

    public final StringPath uniqueConstraintCatalog = createString("uniqueConstraintCatalog");

    public final StringPath uniqueConstraintName = createString("uniqueConstraintName");

    public final StringPath uniqueConstraintSchema = createString("uniqueConstraintSchema");

    public final StringPath updateRule = createString("updateRule");

    public QReferentialConstraints(String variable) {
        super(QReferentialConstraints.class, forVariable(variable), "INFORMATION_SCHEMA", "REFERENTIAL_CONSTRAINTS");
        addMetadata();
    }

    public QReferentialConstraints(String variable, String schema, String table) {
        super(QReferentialConstraints.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QReferentialConstraints(Path<? extends QReferentialConstraints> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "REFERENTIAL_CONSTRAINTS");
        addMetadata();
    }

    public QReferentialConstraints(PathMetadata metadata) {
        super(QReferentialConstraints.class, metadata, "INFORMATION_SCHEMA", "REFERENTIAL_CONSTRAINTS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(constraintCatalog, ColumnMetadata.named("CONSTRAINT_CATALOG").withIndex(1).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(constraintName, ColumnMetadata.named("CONSTRAINT_NAME").withIndex(3).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(constraintSchema, ColumnMetadata.named("CONSTRAINT_SCHEMA").withIndex(2).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(deleteRule, ColumnMetadata.named("DELETE_RULE").withIndex(9).ofType(Types.VARCHAR).withSize(11));
        addMetadata(matchOption, ColumnMetadata.named("MATCH_OPTION").withIndex(7).ofType(Types.VARCHAR).withSize(7));
        addMetadata(uniqueConstraintCatalog, ColumnMetadata.named("UNIQUE_CONSTRAINT_CATALOG").withIndex(4).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(uniqueConstraintName, ColumnMetadata.named("UNIQUE_CONSTRAINT_NAME").withIndex(6).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(uniqueConstraintSchema, ColumnMetadata.named("UNIQUE_CONSTRAINT_SCHEMA").withIndex(5).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(updateRule, ColumnMetadata.named("UPDATE_RULE").withIndex(8).ofType(Types.VARCHAR).withSize(11));
    }

}

