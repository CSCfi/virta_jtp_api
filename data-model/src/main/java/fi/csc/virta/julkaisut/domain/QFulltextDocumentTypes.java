package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QFulltextDocumentTypes is a Querydsl query type for QFulltextDocumentTypes
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFulltextDocumentTypes extends com.querydsl.sql.RelationalPathBase<QFulltextDocumentTypes> {

    private static final long serialVersionUID = 653781381;

    public static final QFulltextDocumentTypes fulltextDocumentTypes = new QFulltextDocumentTypes("fulltext_document_types");

    public final StringPath classId = createString("classId");

    public final StringPath documentType = createString("documentType");

    public final StringPath manufacturer = createString("manufacturer");

    public final StringPath path = createString("path");

    public final StringPath version = createString("version");

    public QFulltextDocumentTypes(String variable) {
        super(QFulltextDocumentTypes.class, forVariable(variable), "sys", "fulltext_document_types");
        addMetadata();
    }

    public QFulltextDocumentTypes(String variable, String schema, String table) {
        super(QFulltextDocumentTypes.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFulltextDocumentTypes(Path<? extends QFulltextDocumentTypes> path) {
        super(path.getType(), path.getMetadata(), "sys", "fulltext_document_types");
        addMetadata();
    }

    public QFulltextDocumentTypes(PathMetadata metadata) {
        super(QFulltextDocumentTypes.class, metadata, "sys", "fulltext_document_types");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(classId, ColumnMetadata.named("class_id").withIndex(2).ofType(Types.CHAR).withSize(36).notNull());
        addMetadata(documentType, ColumnMetadata.named("document_type").withIndex(1).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(manufacturer, ColumnMetadata.named("manufacturer").withIndex(5).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(path, ColumnMetadata.named("path").withIndex(3).ofType(Types.NVARCHAR).withSize(260));
        addMetadata(version, ColumnMetadata.named("version").withIndex(4).ofType(Types.NVARCHAR).withSize(128).notNull());
    }

}

