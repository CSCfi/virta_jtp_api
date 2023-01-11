package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTilanneraportti is a Querydsl query type for QTilanneraportti
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTilanneraportti extends com.querydsl.sql.RelationalPathBase<QTilanneraportti> {

    private static final long serialVersionUID = 1493655580;

    public static final QTilanneraportti Tilanneraportti = new QTilanneraportti("Tilanneraportti");

	    
	public final StringPath organisaatioNimi = createString("Organisaationimi");
	public final StringPath organisaatioTunnus = createString("OrganisaatioTunnus");
	public final StringPath julkaisunNimi = createString("JulkaisunNimi");
	public final StringPath julkaisuTyyppi = createString("JulkaisuTyyppi");
	public final StringPath julkaisunTunnus = createString("JulkaisunTunnus");
	public final StringPath organisaationJulkaisuTunnus = createString("OrganisaationJulkaisuTunnus");
	public final StringPath luontiPaivamaara = createString("Luontipaivamaara");
	public final StringPath paivitysPaivamaara = createString("paivityspaivamaara");
	public final NumberPath<Long> tilanneRaporttiID = createNumber("tilanneraporttiID", Long.class);
	public final NumberPath<Integer> julkaisuVuosi = createNumber("JulkaisuVuosi", Integer.class);
	public final NumberPath<Integer> ilmoitusVuosi = createNumber("IlmoitusVuosi", Integer.class);
	public final NumberPath<Integer> julkaisunTila = createNumber("JulkaisunTila", Integer.class);
        public final StringPath jufoTunnus = createString("JufoTunnus");
        public final StringPath jufoLuokkaKoodi = createString("JufoLuokkaKoodi");
        public final StringPath avoinSaatavuusJulkaisumaksu = createString("avoinSaatavuusJulkaisumaksu");
        public final NumberPath<Integer> avoinSaatavuusJulkaisumaksuVuosi =  createNumber("avoinSaatavuusJulkaisumaksuVuosi", Integer.class);
        public final StringPath julkaisuKanavaOA = createString("julkaisuKanavaOA");
        public final StringPath avoinSaatavuusKytkin = createString("avoinSaatavuusKytkin");
        public final StringPath lisenssiKoodi = createString("lisenssiKoodi");
        public final StringPath muotoKoodi = createString("muotoKoodi");
        public final StringPath yleisoKoodi = createString("yleisoKoodi");
        public final StringPath emojulkaisuntyyppiKoodi = createString("emojulkaisuntyyppiKoodi");
        public final StringPath artikkelityyppiKoodi = createString("artikkelityyppiKoodi");
        public final StringPath vertaisarvioituKytkin = createString("vertaisarvioituKytkin");
        public final StringPath raporttiKytkin = createString("raporttiKytkin");
        public final StringPath opinnayteKoodi = createString("opinnayteKoodi");
        public final StringPath taidetyyppiKoodi = createString("taidetyyppiKoodi");
        public final StringPath	avSovellusTyyppiKoodi = createString("avSovellusTyyppiKoodi");


    public QTilanneraportti(String variable) {
        super(QTilanneraportti.class, forVariable(variable), "web", "Tilanneraportti");
        addMetadata();
    }

    public QTilanneraportti(String variable, String schema, String table) {
        super(QTilanneraportti.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTilanneraportti(Path<? extends QTilanneraportti> path) {
        super(path.getType(), path.getMetadata(), "web", "Tilanneraportti");
        addMetadata();
    }

    public QTilanneraportti(PathMetadata metadata) {
        super(QTilanneraportti.class, metadata, "web", "Tilanneraportti");
        addMetadata();
    }

    public void addMetadata() {

	addMetadata(organisaatioNimi, ColumnMetadata.named("Organisaationimi").withIndex(2).ofType(Types.NVARCHAR).withSize(100));
	addMetadata(organisaatioTunnus, ColumnMetadata.named("OrganisaatioTunnus").withIndex(3).ofType(Types.NVARCHAR).withSize(100));
	addMetadata(julkaisunNimi, ColumnMetadata.named("JulkaisunNimi").withIndex(6).ofType(Types.NVARCHAR).withSize(500));
	addMetadata(julkaisuTyyppi, ColumnMetadata.named("JulkaisuTyyppi").withIndex(7).ofType(Types.NVARCHAR).withSize(2));
	addMetadata(julkaisunTunnus, ColumnMetadata.named("JulkaisunTunnus").withIndex(9).ofType(Types.NVARCHAR).withSize(50));
	addMetadata(organisaationJulkaisuTunnus, ColumnMetadata.named("OrganisaationJulkaisuTunnus").withIndex(10).ofType(Types.NVARCHAR).withSize(100));
	addMetadata(luontiPaivamaara, ColumnMetadata.named("Luontipaivamaara").withIndex(11).ofType(Types.NVARCHAR).withSize(12));
	addMetadata(paivitysPaivamaara, ColumnMetadata.named("paivityspaivamaara").withIndex(12).ofType(Types.NVARCHAR).withSize(12));
	addMetadata(tilanneRaporttiID, ColumnMetadata.named("tilanneraporttiID").withIndex(1).ofType(Types.BIGINT).withSize(19));
	addMetadata(julkaisuVuosi, ColumnMetadata.named("JulkaisuVuosi").withIndex(4).ofType(Types.INTEGER).withSize(10));
	addMetadata(ilmoitusVuosi, ColumnMetadata.named("IlmoitusVuosi").withIndex(5).ofType(Types.INTEGER).withSize(10));
	addMetadata(julkaisunTila, ColumnMetadata.named("JulkaisunTila").withIndex(8).ofType(Types.INTEGER).withSize(10));
        addMetadata(jufoTunnus, ColumnMetadata.named("JufoTunnus").withIndex(13).ofType(Types.NVARCHAR).withSize(10));
        addMetadata(jufoLuokkaKoodi, ColumnMetadata.named("JufoLuokkaKoodi").withIndex(14).ofType(Types.NVARCHAR).withSize(1));
        addMetadata(avoinSaatavuusJulkaisumaksu, ColumnMetadata.named("avoinSaatavuusJulkaisumaksu").withIndex(15).ofType(Types.NVARCHAR).withSize(30));
        addMetadata(avoinSaatavuusJulkaisumaksuVuosi, ColumnMetadata.named("avoinSaatavuusJulkaisumaksuVuosi").withIndex(16).ofType(Types.INTEGER).withSize(10));
        addMetadata(julkaisuKanavaOA, ColumnMetadata.named("julkaisuKanavaOA").withIndex(17).ofType(Types.NVARCHAR).withSize(1));
        addMetadata(avoinSaatavuusKytkin, ColumnMetadata.named("avoinSaatavuusKytkin").withIndex(18).ofType(Types.NVARCHAR).withSize(1));
        addMetadata(lisenssiKoodi, ColumnMetadata.named("lisenssiKoodi").withIndex(19).ofType(Types.NVARCHAR).withSize(1));
        addMetadata(muotoKoodi, ColumnMetadata.named("muotoKoodi").withIndex(20).ofType(Types.NVARCHAR).withSize(1));
        addMetadata(yleisoKoodi, ColumnMetadata.named("yleisoKoodi").withIndex(21).ofType(Types.NVARCHAR).withSize(1));
        addMetadata(emojulkaisuntyyppiKoodi, ColumnMetadata.named("emojulkaisuntyyppiKoodi").withIndex(22).ofType(Types.NVARCHAR).withSize(1));
        addMetadata(artikkelityyppiKoodi, ColumnMetadata.named("artikkelityyppiKoodi").withIndex(23).ofType(Types.NVARCHAR).withSize(1));
        addMetadata(vertaisarvioituKytkin, ColumnMetadata.named("vertaisarvioituKytkin").withIndex(24).ofType(Types.NVARCHAR).withSize(1));
        addMetadata(raporttiKytkin, ColumnMetadata.named("raporttiKytkin").withIndex(25).ofType(Types.NVARCHAR).withSize(1));
        addMetadata(opinnayteKoodi, ColumnMetadata.named("opinnayteKoodi").withIndex(26).ofType(Types.NVARCHAR).withSize(1));
        addMetadata(taidetyyppiKoodi, ColumnMetadata.named("taidetyyppiKoodi").withIndex(27).ofType(Types.NVARCHAR).withSize(1));
        addMetadata(avSovellusTyyppiKoodi, ColumnMetadata.named("avSovellusTyyppiKoodi").withIndex(28).ofType(Types.NVARCHAR).withSize(1));
    }

}


