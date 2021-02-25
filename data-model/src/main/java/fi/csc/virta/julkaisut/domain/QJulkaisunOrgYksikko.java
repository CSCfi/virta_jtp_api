package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QJulkaisunOrgYksikko is a Querydsl query type for QJulkaisunOrgYksikko
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QJulkaisunOrgYksikko extends com.querydsl.sql.RelationalPathBase<QJulkaisunOrgYksikko> {

    private static final long serialVersionUID = -216329824;

    public static final QJulkaisunOrgYksikko JulkaisunOrgYksikko = new QJulkaisunOrgYksikko("JulkaisunOrgYksikko");

    public final NumberPath<Long> jOrgYksikkoID = createNumber("jOrgYksikkoID", Long.class);

    public final NumberPath<Long> julkaisuID = createNumber("julkaisuID", Long.class);

    public final StringPath luoja = createString("luoja");

    public final DateTimePath<java.sql.Timestamp> luontipaivamaara = createDateTime("luontipaivamaara", java.sql.Timestamp.class);

    public final StringPath paivittaja = createString("paivittaja");

    public final DateTimePath<java.sql.Timestamp> paivityspaivamaara = createDateTime("paivityspaivamaara", java.sql.Timestamp.class);

    public final NumberPath<Long> vanhempiID = createNumber("vanhempiID", Long.class);

    public final NumberPath<Long> yksikkoID = createNumber("yksikkoID", Long.class);

    public final com.querydsl.sql.PrimaryKey<QJulkaisunOrgYksikko> julkaisunOrgYksikkoJOrgYksikkoIDPK = createPrimaryKey(jOrgYksikkoID);

    public final com.querydsl.sql.ForeignKey<QOrgYksikko> julkaisunOrgYksikkoVanhempiIDFK = createForeignKey(yksikkoID, "YksikkoID");

    public final com.querydsl.sql.ForeignKey<QJulkaisut> julkaisunOrgYksikkoJulkaisuIDFK = createForeignKey(julkaisuID, "JulkaisuID");

    public final com.querydsl.sql.ForeignKey<QOrgYksikko> julkaisunOrgYksikkoYksikkoIDFK = createForeignKey(yksikkoID, "YksikkoID");

    public QJulkaisunOrgYksikko(String variable) {
        super(QJulkaisunOrgYksikko.class, forVariable(variable), "dbo", "JulkaisunOrgYksikko");
        addMetadata();
    }

    public QJulkaisunOrgYksikko(String variable, String schema, String table) {
        super(QJulkaisunOrgYksikko.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJulkaisunOrgYksikko(Path<? extends QJulkaisunOrgYksikko> path) {
        super(path.getType(), path.getMetadata(), "dbo", "JulkaisunOrgYksikko");
        addMetadata();
    }

    public QJulkaisunOrgYksikko(PathMetadata metadata) {
        super(QJulkaisunOrgYksikko.class, metadata, "dbo", "JulkaisunOrgYksikko");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(jOrgYksikkoID, ColumnMetadata.named("JOrgYksikkoID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(julkaisuID, ColumnMetadata.named("JulkaisuID").withIndex(2).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(luoja, ColumnMetadata.named("Luoja").withIndex(4).ofType(Types.NVARCHAR).withSize(30).notNull());
        addMetadata(luontipaivamaara, ColumnMetadata.named("Luontipaivamaara").withIndex(5).ofType(Types.TIMESTAMP).withSize(24).withDigits(4).notNull());
        addMetadata(paivittaja, ColumnMetadata.named("Paivittaja").withIndex(6).ofType(Types.NVARCHAR).withSize(30));
        addMetadata(paivityspaivamaara, ColumnMetadata.named("Paivityspaivamaara").withIndex(7).ofType(Types.TIMESTAMP).withSize(24).withDigits(4));
        addMetadata(vanhempiID, ColumnMetadata.named("VanhempiID").withIndex(8).ofType(Types.BIGINT).withSize(19));
        addMetadata(yksikkoID, ColumnMetadata.named("YksikkoID").withIndex(3).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

