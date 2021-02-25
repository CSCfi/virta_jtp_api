package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QFulltextCatalogs is a Querydsl query type for QFulltextCatalogs
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFulltextCatalogs extends com.querydsl.sql.RelationalPathBase<QFulltextCatalogs> {

    private static final long serialVersionUID = 844580275;

    public static final QFulltextCatalogs fulltextCatalogs = new QFulltextCatalogs("fulltext_catalogs");

    public final NumberPath<Integer> dataSpaceId = createNumber("dataSpaceId", Integer.class);

    public final NumberPath<Integer> fileId = createNumber("fileId", Integer.class);

    public final NumberPath<Integer> fulltextCatalogId = createNumber("fulltextCatalogId", Integer.class);

    public final BooleanPath isAccentSensitivityOn = createBoolean("isAccentSensitivityOn");

    public final BooleanPath isDefault = createBoolean("isDefault");

    public final BooleanPath isImporting = createBoolean("isImporting");

    public final StringPath name = createString("name");

    public final StringPath path = createString("path");

    public final NumberPath<Integer> principalId = createNumber("principalId", Integer.class);

    public QFulltextCatalogs(String variable) {
        super(QFulltextCatalogs.class, forVariable(variable), "sys", "fulltext_catalogs");
        addMetadata();
    }

    public QFulltextCatalogs(String variable, String schema, String table) {
        super(QFulltextCatalogs.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFulltextCatalogs(Path<? extends QFulltextCatalogs> path) {
        super(path.getType(), path.getMetadata(), "sys", "fulltext_catalogs");
        addMetadata();
    }

    public QFulltextCatalogs(PathMetadata metadata) {
        super(QFulltextCatalogs.class, metadata, "sys", "fulltext_catalogs");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dataSpaceId, ColumnMetadata.named("data_space_id").withIndex(6).ofType(Types.INTEGER).withSize(10));
        addMetadata(fileId, ColumnMetadata.named("file_id").withIndex(7).ofType(Types.INTEGER).withSize(10));
        addMetadata(fulltextCatalogId, ColumnMetadata.named("fulltext_catalog_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(isAccentSensitivityOn, ColumnMetadata.named("is_accent_sensitivity_on").withIndex(5).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isDefault, ColumnMetadata.named("is_default").withIndex(4).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isImporting, ColumnMetadata.named("is_importing").withIndex(9).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(path, ColumnMetadata.named("path").withIndex(3).ofType(Types.NVARCHAR).withSize(260));
        addMetadata(principalId, ColumnMetadata.named("principal_id").withIndex(8).ofType(Types.INTEGER).withSize(10));
    }

}

