package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QHanke is a Querydsl query type for QHanke
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QHanke extends com.querydsl.sql.RelationalPathBase<QHanke> {

    private static final long serialVersionUID = -1860557582;

    public static final QHanke Hanke = new QHanke("Hanke");

    public final NumberPath<Long> hankeID = createNumber("hankeID", Long.class);

    public final StringPath hankenumero = createString("hankenumero");

    public final NumberPath<Long> julkaisuID = createNumber("julkaisuID", Long.class);

    public final StringPath luoja = createString("luoja");

    public final DateTimePath<java.sql.Timestamp> luontipaivamaara = createDateTime("luontipaivamaara", java.sql.Timestamp.class);

    public final NumberPath<Long> orgID = createNumber("orgID", Long.class);

    public final StringPath paivittaja = createString("paivittaja");

    public final DateTimePath<java.sql.Timestamp> paivityspaivamaara = createDateTime("paivityspaivamaara", java.sql.Timestamp.class);

    public final com.querydsl.sql.PrimaryKey<QHanke> hankeHankeIDPK = createPrimaryKey(hankeID);

    public final com.querydsl.sql.ForeignKey<QJulkaisut> hankeJulkaisuIDFK = createForeignKey(julkaisuID, "JulkaisuID");

    public final com.querydsl.sql.ForeignKey<QOrganisaatio> hankeOrgIDFK = createForeignKey(orgID, "OrgID");

    public QHanke(String variable) {
        super(QHanke.class, forVariable(variable), "dbo", "Hanke");
        addMetadata();
    }

    public QHanke(String variable, String schema, String table) {
        super(QHanke.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QHanke(Path<? extends QHanke> path) {
        super(path.getType(), path.getMetadata(), "dbo", "Hanke");
        addMetadata();
    }

    public QHanke(PathMetadata metadata) {
        super(QHanke.class, metadata, "dbo", "Hanke");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(hankeID, ColumnMetadata.named("HankeID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(hankenumero, ColumnMetadata.named("Hankenumero").withIndex(4).ofType(Types.NVARCHAR).withSize(100));
        addMetadata(julkaisuID, ColumnMetadata.named("JulkaisuID").withIndex(2).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(luoja, ColumnMetadata.named("Luoja").withIndex(5).ofType(Types.NVARCHAR).withSize(30).notNull());
        addMetadata(luontipaivamaara, ColumnMetadata.named("Luontipaivamaara").withIndex(6).ofType(Types.TIMESTAMP).withSize(24).withDigits(4).notNull());
        addMetadata(orgID, ColumnMetadata.named("OrgID").withIndex(3).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(paivittaja, ColumnMetadata.named("Paivittaja").withIndex(7).ofType(Types.NVARCHAR).withSize(30));
        addMetadata(paivityspaivamaara, ColumnMetadata.named("Paivityspaivamaara").withIndex(8).ofType(Types.TIMESTAMP).withSize(24).withDigits(4));
    }

}

