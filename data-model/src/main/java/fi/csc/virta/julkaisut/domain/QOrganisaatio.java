package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QOrganisaatio is a Querydsl query type for QOrganisaatio
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QOrganisaatio extends com.querydsl.sql.RelationalPathBase<QOrganisaatio> {

    private static final long serialVersionUID = 2118758076;

    public static final QOrganisaatio Organisaatio = new QOrganisaatio("Organisaatio");

    public final StringPath luoja = createString("luoja");

    public final DateTimePath<java.sql.Timestamp> luontipaivamaara = createDateTime("luontipaivamaara", java.sql.Timestamp.class);

    public final StringPath nimi = createString("nimi");

    public final NumberPath<Long> orgID = createNumber("orgID", Long.class);

    public final StringPath orgTunnus = createString("orgTunnus");

    public final StringPath paivittaja = createString("paivittaja");

    public final DateTimePath<java.sql.Timestamp> paivityspaivamaara = createDateTime("paivityspaivamaara", java.sql.Timestamp.class);

    public final NumberPath<Integer> tyyppi = createNumber("tyyppi", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QOrganisaatio> organisaatioOrgIDPK = createPrimaryKey(orgID);

    public final com.querydsl.sql.ForeignKey<QJulkaisut> _julkaisuOrganisaatioFK = createInvForeignKey(orgID, "OrgID");

    public final com.querydsl.sql.ForeignKey<QHanke> _hankeOrgIDFK = createInvForeignKey(orgID, "OrgID");

    public final com.querydsl.sql.ForeignKey<QOrgYksikko> _orgYksikkoOrganisaatioFK = createInvForeignKey(orgID, "OrgID");

    public QOrganisaatio(String variable) {
        super(QOrganisaatio.class, forVariable(variable), "dbo", "Organisaatio");
        addMetadata();
    }

    public QOrganisaatio(String variable, String schema, String table) {
        super(QOrganisaatio.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QOrganisaatio(Path<? extends QOrganisaatio> path) {
        super(path.getType(), path.getMetadata(), "dbo", "Organisaatio");
        addMetadata();
    }

    public QOrganisaatio(PathMetadata metadata) {
        super(QOrganisaatio.class, metadata, "dbo", "Organisaatio");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(luoja, ColumnMetadata.named("Luoja").withIndex(5).ofType(Types.NVARCHAR).withSize(30).notNull());
        addMetadata(luontipaivamaara, ColumnMetadata.named("Luontipaivamaara").withIndex(6).ofType(Types.TIMESTAMP).withSize(24).withDigits(4).notNull());
        addMetadata(nimi, ColumnMetadata.named("Nimi").withIndex(3).ofType(Types.NVARCHAR).withSize(100));
        addMetadata(orgID, ColumnMetadata.named("OrgID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(orgTunnus, ColumnMetadata.named("OrgTunnus").withIndex(2).ofType(Types.NVARCHAR).withSize(100).notNull());
        addMetadata(paivittaja, ColumnMetadata.named("Paivittaja").withIndex(7).ofType(Types.NVARCHAR).withSize(30));
        addMetadata(paivityspaivamaara, ColumnMetadata.named("Paivityspaivamaara").withIndex(8).ofType(Types.TIMESTAMP).withSize(24).withDigits(4));
        addMetadata(tyyppi, ColumnMetadata.named("Tyyppi").withIndex(4).ofType(Types.INTEGER).withSize(10));
    }

}

