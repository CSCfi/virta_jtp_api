package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QViewTableUsage is a Querydsl query type for QViewTableUsage
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QViewTableUsage extends com.querydsl.sql.RelationalPathBase<QViewTableUsage> {

    private static final long serialVersionUID = -1932733419;

    public static final QViewTableUsage viewTableUsage = new QViewTableUsage("VIEW_TABLE_USAGE");

    public final StringPath tableCatalog = createString("tableCatalog");

    public final StringPath tableName = createString("tableName");

    public final StringPath tableSchema = createString("tableSchema");

    public final StringPath viewCatalog = createString("viewCatalog");

    public final StringPath viewName = createString("viewName");

    public final StringPath viewSchema = createString("viewSchema");

    public QViewTableUsage(String variable) {
        super(QViewTableUsage.class, forVariable(variable), "INFORMATION_SCHEMA", "VIEW_TABLE_USAGE");
        addMetadata();
    }

    public QViewTableUsage(String variable, String schema, String table) {
        super(QViewTableUsage.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QViewTableUsage(Path<? extends QViewTableUsage> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "VIEW_TABLE_USAGE");
        addMetadata();
    }

    public QViewTableUsage(PathMetadata metadata) {
        super(QViewTableUsage.class, metadata, "INFORMATION_SCHEMA", "VIEW_TABLE_USAGE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(tableCatalog, ColumnMetadata.named("TABLE_CATALOG").withIndex(4).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(tableName, ColumnMetadata.named("TABLE_NAME").withIndex(6).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(tableSchema, ColumnMetadata.named("TABLE_SCHEMA").withIndex(5).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(viewCatalog, ColumnMetadata.named("VIEW_CATALOG").withIndex(1).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(viewName, ColumnMetadata.named("VIEW_NAME").withIndex(3).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(viewSchema, ColumnMetadata.named("VIEW_SCHEMA").withIndex(2).ofType(Types.NVARCHAR).withSize(128));
    }

}

