package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTkIssn is a Querydsl query type for QTkIssn
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTkIssn extends com.querydsl.sql.RelationalPathBase<QTkIssn> {

    private static final long serialVersionUID = -1491019207;

    public static final QTkIssn tkIssn = new QTkIssn("TK_ISSN");

    public final StringPath issn = createString("issn");

    public final StringPath julkaisunTunnus = createString("julkaisunTunnus");

    public final StringPath latausID = createString("latausID");

    public QTkIssn(String variable) {
        super(QTkIssn.class, forVariable(variable), "web", "TK_ISSN");
        addMetadata();
    }

    public QTkIssn(String variable, String schema, String table) {
        super(QTkIssn.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTkIssn(Path<? extends QTkIssn> path) {
        super(path.getType(), path.getMetadata(), "web", "TK_ISSN");
        addMetadata();
    }

    public QTkIssn(PathMetadata metadata) {
        super(QTkIssn.class, metadata, "web", "TK_ISSN");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(issn, ColumnMetadata.named("ISSN").withIndex(2).ofType(Types.NVARCHAR).withSize(100));
        addMetadata(julkaisunTunnus, ColumnMetadata.named("JulkaisunTunnus").withIndex(1).ofType(Types.NVARCHAR).withSize(500).notNull());
        addMetadata(latausID, ColumnMetadata.named("Lataus_ID").withIndex(3).ofType(Types.NVARCHAR).withSize(255).notNull());
    }

}

