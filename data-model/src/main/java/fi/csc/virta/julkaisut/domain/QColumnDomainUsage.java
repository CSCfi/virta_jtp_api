package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QColumnDomainUsage is a Querydsl query type for QColumnDomainUsage
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QColumnDomainUsage extends com.querydsl.sql.RelationalPathBase<QColumnDomainUsage> {

    private static final long serialVersionUID = -1409474614;

    public static final QColumnDomainUsage columnDomainUsage = new QColumnDomainUsage("COLUMN_DOMAIN_USAGE");

    public final StringPath columnName = createString("columnName");

    public final StringPath domainCatalog = createString("domainCatalog");

    public final StringPath domainName = createString("domainName");

    public final StringPath domainSchema = createString("domainSchema");

    public final StringPath tableCatalog = createString("tableCatalog");

    public final StringPath tableName = createString("tableName");

    public final StringPath tableSchema = createString("tableSchema");

    public QColumnDomainUsage(String variable) {
        super(QColumnDomainUsage.class, forVariable(variable), "INFORMATION_SCHEMA", "COLUMN_DOMAIN_USAGE");
        addMetadata();
    }

    public QColumnDomainUsage(String variable, String schema, String table) {
        super(QColumnDomainUsage.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QColumnDomainUsage(Path<? extends QColumnDomainUsage> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "COLUMN_DOMAIN_USAGE");
        addMetadata();
    }

    public QColumnDomainUsage(PathMetadata metadata) {
        super(QColumnDomainUsage.class, metadata, "INFORMATION_SCHEMA", "COLUMN_DOMAIN_USAGE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(columnName, ColumnMetadata.named("COLUMN_NAME").withIndex(7).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(domainCatalog, ColumnMetadata.named("DOMAIN_CATALOG").withIndex(1).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(domainName, ColumnMetadata.named("DOMAIN_NAME").withIndex(3).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(domainSchema, ColumnMetadata.named("DOMAIN_SCHEMA").withIndex(2).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(tableCatalog, ColumnMetadata.named("TABLE_CATALOG").withIndex(4).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(tableName, ColumnMetadata.named("TABLE_NAME").withIndex(6).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(tableSchema, ColumnMetadata.named("TABLE_SCHEMA").withIndex(5).ofType(Types.NVARCHAR).withSize(128));
    }

}

