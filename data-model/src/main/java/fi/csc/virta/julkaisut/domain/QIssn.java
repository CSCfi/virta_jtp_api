package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QIssn is a Querydsl query type for QIssn
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QIssn extends com.querydsl.sql.RelationalPathBase<QIssn> {

    private static final long serialVersionUID = 771313250;

    public static final QIssn issn1 = new QIssn("ISSN");

    public final StringPath issn = createString("issn");

    public final NumberPath<Long> issnid = createNumber("issnid", Long.class);

    public final NumberPath<Long> julkaisuID = createNumber("julkaisuID", Long.class);

    public final StringPath luoja = createString("luoja");

    public final DateTimePath<java.sql.Timestamp> luontipaivamaara = createDateTime("luontipaivamaara", java.sql.Timestamp.class);

    public final StringPath paivittaja = createString("paivittaja");

    public final DateTimePath<java.sql.Timestamp> paivityspaivamaara = createDateTime("paivityspaivamaara", java.sql.Timestamp.class);

    public final com.querydsl.sql.PrimaryKey<QIssn> issnIssnidPk = createPrimaryKey(issnid);

    public final com.querydsl.sql.ForeignKey<QJulkaisut> iSSNJulkaisuFK = createForeignKey(julkaisuID, "JulkaisuID");

    public QIssn(String variable) {
        super(QIssn.class, forVariable(variable), "dbo", "ISSN");
        addMetadata();
    }

    public QIssn(String variable, String schema, String table) {
        super(QIssn.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QIssn(Path<? extends QIssn> path) {
        super(path.getType(), path.getMetadata(), "dbo", "ISSN");
        addMetadata();
    }

    public QIssn(PathMetadata metadata) {
        super(QIssn.class, metadata, "dbo", "ISSN");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(issn, ColumnMetadata.named("ISSN").withIndex(3).ofType(Types.NVARCHAR).withSize(100));
        addMetadata(issnid, ColumnMetadata.named("ISSNID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(julkaisuID, ColumnMetadata.named("JulkaisuID").withIndex(2).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(luoja, ColumnMetadata.named("Luoja").withIndex(4).ofType(Types.NVARCHAR).withSize(30).notNull());
        addMetadata(luontipaivamaara, ColumnMetadata.named("Luontipaivamaara").withIndex(5).ofType(Types.TIMESTAMP).withSize(24).withDigits(4).notNull());
        addMetadata(paivittaja, ColumnMetadata.named("Paivittaja").withIndex(6).ofType(Types.NVARCHAR).withSize(30));
        addMetadata(paivityspaivamaara, ColumnMetadata.named("Paivityspaivamaara").withIndex(7).ofType(Types.TIMESTAMP).withSize(24).withDigits(4));
    }

}

