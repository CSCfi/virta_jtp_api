package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVirheraportti is a Querydsl query type for QVirheraportti
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVirheraportti extends com.querydsl.sql.RelationalPathBase<QVirheraportti> {

    private static final long serialVersionUID = 1493655500;

    public static final QVirheraportti Virheraportti = new QVirheraportti("Virheraportti");

    public final StringPath organisaatioTunnus = createString("OrganisaatioTunnus");
    public final StringPath nimi = createString("nimi");
    public final StringPath kuvaus = createString("Kuvaus");
    public final StringPath julkaisunOrgTunnus = createString("JulkaisunOrgTunnus");
    public final StringPath julkaisunNimi = createString("JulkaisunNimi");
    public final StringPath julkaisutyyppikoodi = createString("Julkaisutyyppikoodi");
    public final StringPath koodi = createString("Koodi");
    public final StringPath virheviesti = createString("virheviesti");
    public final NumberPath<Long> virheraporttiID = createNumber("virheraporttiID", Long.class);
    public final NumberPath<Integer> tila = createNumber("Tila", Integer.class);
    public final NumberPath<Integer> tarkistusID = createNumber("TarkistusID", Integer.class);
    public final NumberPath<Integer> ilmoitusVuosi = createNumber("IlmoitusVuosi", Integer.class);
    public final NumberPath<Integer> julkaisuVuosi = createNumber("JulkaisuVuosi", Integer.class);

    
    public QVirheraportti(String variable) {
        super(QVirheraportti.class, forVariable(variable), "web", "Virheraportti");
        addMetadata();
    }

    public QVirheraportti(String variable, String schema, String table) {
        super(QVirheraportti.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVirheraportti(Path<? extends QVirheraportti> path) {
        super(path.getType(), path.getMetadata(), "web", "Virheraportti");
        addMetadata();
    }

    public QVirheraportti(PathMetadata metadata) {
        super(QVirheraportti.class, metadata, "web", "Virheraportti");
        addMetadata();
    }
    
    
    public void addMetadata() {

		addMetadata(organisaatioTunnus, ColumnMetadata.named("OrganisaatioTunnus").withIndex(2).ofType(Types.NVARCHAR).withSize(20));
		addMetadata(nimi, ColumnMetadata.named("nimi").withIndex(3).ofType(Types.NVARCHAR).withSize(100));
		addMetadata(kuvaus, ColumnMetadata.named("Kuvaus").withIndex(4).ofType(Types.NVARCHAR).withSize(255));
		addMetadata(julkaisunOrgTunnus, ColumnMetadata.named("JulkaisunOrgTunnus").withIndex(5).ofType(Types.NVARCHAR).withSize(100));
		addMetadata(julkaisunNimi, ColumnMetadata.named("JulkaisunNimi").withIndex(6).ofType(Types.NVARCHAR).withSize(500));
		addMetadata(julkaisutyyppikoodi, ColumnMetadata.named("Julkaisutyyppikoodi").withIndex(7).ofType(Types.NVARCHAR).withSize(2));
		addMetadata(koodi, ColumnMetadata.named("Koodi").withIndex(10).ofType(Types.NVARCHAR).withSize(50));
		addMetadata(virheviesti, ColumnMetadata.named("virheviesti").withIndex(11).ofType(Types.NVARCHAR).withSize(200));
		addMetadata(virheraporttiID, ColumnMetadata.named("virheraporttiID").withIndex(1).ofType(Types.BIGINT).withSize(19));
		addMetadata(tila, ColumnMetadata.named("Tila").withIndex(8).ofType(Types.INTEGER).withSize(10));
		addMetadata(tarkistusID, ColumnMetadata.named("TarkistusID").withIndex(9).ofType(Types.INTEGER).withSize(10));
                addMetadata(ilmoitusVuosi, ColumnMetadata.named("IlmoitusVuosi").withIndex(12).ofType(Types.INTEGER).withSize(4));
                addMetadata(julkaisuVuosi, ColumnMetadata.named("JulkaisuVuosi").withIndex(13).ofType(Types.INTEGER).withSize(4));
    }
    
    
    
}
