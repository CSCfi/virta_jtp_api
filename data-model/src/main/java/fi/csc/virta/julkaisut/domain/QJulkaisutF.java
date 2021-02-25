package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QJulkaisutF is a Querydsl query type for QJulkaisutF
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QJulkaisutF extends com.querydsl.sql.RelationalPathBase<QJulkaisutF> {

    private static final long serialVersionUID = -941316989;

    public static final QJulkaisutF julkaisutF = new QJulkaisutF("julkaisut_f");

    public final NumberPath<Long> avain = createNumber("avain", Long.class);

    public final StringPath doi = createString("doi");

    public final StringPath etunimet = createString("etunimet");

    public final NumberPath<Integer> ilmoitusVuosi = createNumber("ilmoitusVuosi", Integer.class);

    public final StringPath isbn = createString("isbn");

    public final StringPath issn = createString("issn");

    public final StringPath jufoTunnus = createString("jufoTunnus");

    public final NumberPath<Long> julkaisuID = createNumber("julkaisuID", Long.class);

    public final StringPath julkaisunNimi = createString("julkaisunNimi");

    public final StringPath julkaisunOrgTunnus = createString("julkaisunOrgTunnus");

    public final NumberPath<Integer> julkaisunTila = createNumber("julkaisunTila", Integer.class);

    public final StringPath julkaisunTunnus = createString("julkaisunTunnus");

    public final StringPath julkaisuTyyppi = createString("julkaisuTyyppi");

    public final NumberPath<Integer> julkaisuVuosi = createNumber("julkaisuVuosi", Integer.class);

    public final StringPath kustantajanNimi = createString("kustantajanNimi");

    public final StringPath lehdenNimi = createString("lehdenNimi");

    public final DateTimePath<java.sql.Timestamp> luontipvm = createDateTime("luontipvm", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> muutospvm = createDateTime("muutospvm", java.sql.Timestamp.class);

    public final StringPath orcid = createString("orcid");

    public final StringPath orgTunnus = createString("orgTunnus");

    public final StringPath sukuNimi = createString("sukuNimi");

    public final StringPath tekijatiedot = createString("tekijatiedot");

    public final StringPath yhteisJulkaisunTunnus = createString("yhteisJulkaisunTunnus");

    public final com.querydsl.sql.PrimaryKey<QJulkaisutF> _3bb73006b0Pk = createPrimaryKey(avain);

    public QJulkaisutF(String variable) {
        super(QJulkaisutF.class, forVariable(variable), "web", "julkaisut_f");
        addMetadata();
    }

    public QJulkaisutF(String variable, String schema, String table) {
        super(QJulkaisutF.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJulkaisutF(Path<? extends QJulkaisutF> path) {
        super(path.getType(), path.getMetadata(), "web", "julkaisut_f");
        addMetadata();
    }

    public QJulkaisutF(PathMetadata metadata) {
        super(QJulkaisutF.class, metadata, "web", "julkaisut_f");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(avain, ColumnMetadata.named("avain").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(doi, ColumnMetadata.named("DOI").withIndex(20).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(etunimet, ColumnMetadata.named("Etunimet").withIndex(7).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(ilmoitusVuosi, ColumnMetadata.named("IlmoitusVuosi").withIndex(23).ofType(Types.INTEGER).withSize(10));
        addMetadata(isbn, ColumnMetadata.named("ISBN").withIndex(14).ofType(Types.NVARCHAR).withSize(100));
        addMetadata(issn, ColumnMetadata.named("ISSN").withIndex(13).ofType(Types.NVARCHAR).withSize(100));
        addMetadata(jufoTunnus, ColumnMetadata.named("JufoTunnus").withIndex(22).ofType(Types.NVARCHAR).withSize(10));
        addMetadata(julkaisuID, ColumnMetadata.named("JulkaisuID").withIndex(2).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(julkaisunNimi, ColumnMetadata.named("JulkaisunNimi").withIndex(5).ofType(Types.NVARCHAR).withSize(500));
        addMetadata(julkaisunOrgTunnus, ColumnMetadata.named("JulkaisunOrgTunnus").withIndex(4).ofType(Types.NVARCHAR).withSize(100).notNull());
        addMetadata(julkaisunTila, ColumnMetadata.named("JulkaisunTila").withIndex(17).ofType(Types.INTEGER).withSize(10));
        addMetadata(julkaisunTunnus, ColumnMetadata.named("JulkaisunTunnus").withIndex(3).ofType(Types.NVARCHAR).withSize(50).notNull());
        addMetadata(julkaisuTyyppi, ColumnMetadata.named("JulkaisuTyyppi").withIndex(10).ofType(Types.NVARCHAR).withSize(2).notNull());
        addMetadata(julkaisuVuosi, ColumnMetadata.named("JulkaisuVuosi").withIndex(9).ofType(Types.INTEGER).withSize(10));
        addMetadata(kustantajanNimi, ColumnMetadata.named("KustantajanNimi").withIndex(12).ofType(Types.NVARCHAR).withSize(500));
        addMetadata(lehdenNimi, ColumnMetadata.named("LehdenNimi").withIndex(11).ofType(Types.NVARCHAR).withSize(500));
        addMetadata(luontipvm, ColumnMetadata.named("Luontipvm").withIndex(15).ofType(Types.TIMESTAMP).withSize(24).withDigits(4).notNull());
        addMetadata(muutospvm, ColumnMetadata.named("Muutospvm").withIndex(16).ofType(Types.TIMESTAMP).withSize(24).withDigits(4));
        addMetadata(orcid, ColumnMetadata.named("ORCID").withIndex(19).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(orgTunnus, ColumnMetadata.named("OrgTunnus").withIndex(18).ofType(Types.NVARCHAR).withSize(20));
        addMetadata(sukuNimi, ColumnMetadata.named("SukuNimi").withIndex(6).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(tekijatiedot, ColumnMetadata.named("Tekijatiedot").withIndex(8).ofType(Types.NVARCHAR).withSize(800));
        addMetadata(yhteisJulkaisunTunnus, ColumnMetadata.named("YhteisJulkaisunTunnus").withIndex(21).ofType(Types.NVARCHAR).withSize(50));
    }

}

