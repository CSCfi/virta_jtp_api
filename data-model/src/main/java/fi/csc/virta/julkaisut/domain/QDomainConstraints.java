package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDomainConstraints is a Querydsl query type for QDomainConstraints
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDomainConstraints extends com.querydsl.sql.RelationalPathBase<QDomainConstraints> {

    private static final long serialVersionUID = -1850466155;

    public static final QDomainConstraints domainConstraints = new QDomainConstraints("DOMAIN_CONSTRAINTS");

    public final StringPath constraintCatalog = createString("constraintCatalog");

    public final StringPath constraintName = createString("constraintName");

    public final StringPath constraintSchema = createString("constraintSchema");

    public final StringPath domainCatalog = createString("domainCatalog");

    public final StringPath domainName = createString("domainName");

    public final StringPath domainSchema = createString("domainSchema");

    public final StringPath initiallyDeferred = createString("initiallyDeferred");

    public final StringPath isDeferrable = createString("isDeferrable");

    public QDomainConstraints(String variable) {
        super(QDomainConstraints.class, forVariable(variable), "INFORMATION_SCHEMA", "DOMAIN_CONSTRAINTS");
        addMetadata();
    }

    public QDomainConstraints(String variable, String schema, String table) {
        super(QDomainConstraints.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDomainConstraints(Path<? extends QDomainConstraints> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "DOMAIN_CONSTRAINTS");
        addMetadata();
    }

    public QDomainConstraints(PathMetadata metadata) {
        super(QDomainConstraints.class, metadata, "INFORMATION_SCHEMA", "DOMAIN_CONSTRAINTS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(constraintCatalog, ColumnMetadata.named("CONSTRAINT_CATALOG").withIndex(1).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(constraintName, ColumnMetadata.named("CONSTRAINT_NAME").withIndex(3).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(constraintSchema, ColumnMetadata.named("CONSTRAINT_SCHEMA").withIndex(2).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(domainCatalog, ColumnMetadata.named("DOMAIN_CATALOG").withIndex(4).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(domainName, ColumnMetadata.named("DOMAIN_NAME").withIndex(6).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(domainSchema, ColumnMetadata.named("DOMAIN_SCHEMA").withIndex(5).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(initiallyDeferred, ColumnMetadata.named("INITIALLY_DEFERRED").withIndex(8).ofType(Types.VARCHAR).withSize(2).notNull());
        addMetadata(isDeferrable, ColumnMetadata.named("IS_DEFERRABLE").withIndex(7).ofType(Types.VARCHAR).withSize(2).notNull());
    }

}

