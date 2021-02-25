package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
//import java.sql.Date;   // onko tama oikea vai pitaako olla import java.util.Date
//import java.util.Date;
import java.sql.Types;

@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QYhteisjulkaisutRistiriitaiset extends com.querydsl.sql.RelationalPathBase<QYhteisjulkaisutRistiriitaiset> {
    
    private static final long serialVersionUID = 1493666603;

    public static final QYhteisjulkaisutRistiriitaiset YhteisjulkaisutRistiriitaiset = new QYhteisjulkaisutRistiriitaiset("YhteisjulkaisutRistiriitaiset");

    public final NumberPath<Long> rrID = createNumber("rrID", Long.class);
    public final StringPath yhteisjulkaisunTunnus = createString("YhteisjulkaisunTunnus");
    public final StringPath julkaisunTunnus = createString("JulkaisunTunnus");
    public final StringPath organisaatioNimi = createString("Organisaationimi");
    public final StringPath organisaatioTunnus = createString("OrganisaatioTunnus");
    public final NumberPath<Integer> julkaisuVuosi = createNumber("JulkaisuVuosi", Integer.class);
    public final NumberPath<Integer> ilmoitusVuosi = createNumber("IlmoitusVuosi", Integer.class);
    public final StringPath julkaisunNimi = createString("JulkaisunNimi");
    public final StringPath julkaisutyyppi = createString("Julkaisutyyppi");
    public final StringPath julkaisunOrgTunnus = createString("JulkaisunOrgTunnus");
    public final StringPath luontipaivamaara = createString("Luontipaivamaara");
    public final NumberPath<Integer> tila = createNumber("tila", Integer.class);
    public final StringPath kuvaus = createString("Kuvaus");
    public final StringPath liittyvaJulkaisunOrgTunnus = createString("LiittyvaJulkaisunOrgTunnus");

    
    public QYhteisjulkaisutRistiriitaiset(String variable) {
        super(QYhteisjulkaisutRistiriitaiset.class, forVariable(variable), "web", "YhteisjulkaisutRistiriitaiset");
        addMetadata();
    }

    public QYhteisjulkaisutRistiriitaiset(String variable, String schema, String table) {
        super(QYhteisjulkaisutRistiriitaiset.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QYhteisjulkaisutRistiriitaiset(Path<? extends QYhteisjulkaisutRistiriitaiset> path) {
        super(path.getType(), path.getMetadata(), "web", "YhteisjulkaisutRistiriitaiset");
        addMetadata();
    }

    public QYhteisjulkaisutRistiriitaiset(PathMetadata metadata) {
        super(QYhteisjulkaisutRistiriitaiset.class, metadata, "web", "YhteisjulkaisutRistiriitaiset");
        addMetadata();
    }
    
    public void addMetadata() {

        addMetadata(yhteisjulkaisunTunnus, ColumnMetadata.named("YhteisjulkaisunTunnus").withIndex(2).ofType(Types.NVARCHAR).withSize(500));
        addMetadata(julkaisunTunnus, ColumnMetadata.named("JulkaisunTunnus").withIndex(3).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(organisaatioNimi, ColumnMetadata.named("Organisaationimi").withIndex(4).ofType(Types.NVARCHAR).withSize(255));
        addMetadata(organisaatioTunnus, ColumnMetadata.named("OrganisaatioTunnus").withIndex(5).ofType(Types.NVARCHAR).withSize(100));
        addMetadata(julkaisuVuosi, ColumnMetadata.named("JulkaisuVuosi").withIndex(6).ofType(Types.INTEGER).withSize(10));
        addMetadata(ilmoitusVuosi, ColumnMetadata.named("IlmoitusVuosi").withIndex(7).ofType(Types.INTEGER).withSize(10));
        addMetadata(julkaisunNimi, ColumnMetadata.named("JulkaisunNimi").withIndex(8).ofType(Types.NVARCHAR).withSize(4000));
	addMetadata(julkaisutyyppi, ColumnMetadata.named("Julkaisutyyppi").withIndex(9).ofType(Types.NVARCHAR).withSize(4000));       
	addMetadata(julkaisunOrgTunnus, ColumnMetadata.named("JulkaisunOrgTunnus").withIndex(10).ofType(Types.NVARCHAR).withSize(100));
        addMetadata(luontipaivamaara, ColumnMetadata.named("Luontipaivamaara").withIndex(11).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(kuvaus, ColumnMetadata.named("Kuvaus").withIndex(12).ofType(Types.NVARCHAR).withSize(255));
        addMetadata(tila, ColumnMetadata.named("tila").withIndex(13).ofType(Types.INTEGER).withSize(10));
	addMetadata(rrID, ColumnMetadata.named("rrID").withIndex(1).ofType(Types.BIGINT).withSize(19));	
        addMetadata(liittyvaJulkaisunOrgTunnus, ColumnMetadata.named("LiittyvaJulkaisunOrgTunnus").withIndex(14).ofType(Types.NVARCHAR).withSize(100));
    }
    
}
