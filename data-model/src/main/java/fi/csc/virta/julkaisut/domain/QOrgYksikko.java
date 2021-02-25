package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QOrgYksikko is a Querydsl query type for QOrgYksikko
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QOrgYksikko extends com.querydsl.sql.RelationalPathBase<QOrgYksikko> {

    private static final long serialVersionUID = 579416384;

    public static final QOrgYksikko OrgYksikko = new QOrgYksikko("OrgYksikko");

    public final StringPath luoja = createString("luoja");

    public final DateTimePath<java.sql.Timestamp> luontipaivamaara = createDateTime("luontipaivamaara", java.sql.Timestamp.class);

    public final StringPath nimi = createString("nimi");

    public final NumberPath<Long> orgID = createNumber("orgID", Long.class);

    public final StringPath paivittaja = createString("paivittaja");

    public final DateTimePath<java.sql.Timestamp> paivityspaivamaara = createDateTime("paivityspaivamaara", java.sql.Timestamp.class);

    public final NumberPath<Long> yksikkoID = createNumber("yksikkoID", Long.class);

    public final StringPath yksikkoKoodi = createString("yksikkoKoodi");

    public final com.querydsl.sql.PrimaryKey<QOrgYksikko> orgYksikkoYksikkoIDPK = createPrimaryKey(yksikkoID);

    public final com.querydsl.sql.ForeignKey<QOrganisaatio> orgYksikkoOrganisaatioFK = createForeignKey(orgID, "OrgID");

    public final com.querydsl.sql.ForeignKey<QJulkaisunOrgYksikko> _julkaisunOrgYksikkoVanhempiIDFK = createInvForeignKey(yksikkoID, "YksikkoID");

    public final com.querydsl.sql.ForeignKey<QTekijanOrgYksikko> _tekijanOrgYksikkoYksikkoIDFK = createInvForeignKey(yksikkoID, "YksikkoID");

    public final com.querydsl.sql.ForeignKey<QJulkaisunOrgYksikko> _julkaisunOrgYksikkoYksikkoIDFK = createInvForeignKey(yksikkoID, "YksikkoID");

    public QOrgYksikko(String variable) {
        super(QOrgYksikko.class, forVariable(variable), "dbo", "OrgYksikko");
        addMetadata();
    }

    public QOrgYksikko(String variable, String schema, String table) {
        super(QOrgYksikko.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QOrgYksikko(Path<? extends QOrgYksikko> path) {
        super(path.getType(), path.getMetadata(), "dbo", "OrgYksikko");
        addMetadata();
    }

    public QOrgYksikko(PathMetadata metadata) {
        super(QOrgYksikko.class, metadata, "dbo", "OrgYksikko");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(luoja, ColumnMetadata.named("Luoja").withIndex(5).ofType(Types.NVARCHAR).withSize(30).notNull());
        addMetadata(luontipaivamaara, ColumnMetadata.named("Luontipaivamaara").withIndex(6).ofType(Types.TIMESTAMP).withSize(24).withDigits(4).notNull());
        addMetadata(nimi, ColumnMetadata.named("Nimi").withIndex(4).ofType(Types.NVARCHAR).withSize(100));
        addMetadata(orgID, ColumnMetadata.named("OrgID").withIndex(2).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(paivittaja, ColumnMetadata.named("Paivittaja").withIndex(7).ofType(Types.NVARCHAR).withSize(30));
        addMetadata(paivityspaivamaara, ColumnMetadata.named("Paivityspaivamaara").withIndex(8).ofType(Types.TIMESTAMP).withSize(24).withDigits(4));
        addMetadata(yksikkoID, ColumnMetadata.named("YksikkoID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(yksikkoKoodi, ColumnMetadata.named("YksikkoKoodi").withIndex(3).ofType(Types.NVARCHAR).withSize(200));
    }

}

