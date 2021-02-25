package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QJulkaisunKoulutusala is a Querydsl query type for QJulkaisunKoulutusala
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QJulkaisunKoulutusala extends com.querydsl.sql.RelationalPathBase<QJulkaisunKoulutusala> {

    private static final long serialVersionUID = 615263041;

    public static final QJulkaisunKoulutusala JulkaisunKoulutusala = new QJulkaisunKoulutusala("JulkaisunKoulutusala");

    public final NumberPath<Long> jKoulutusalaID = createNumber("jKoulutusalaID", Long.class);

    public final NumberPath<Integer> jnro = createNumber("jnro", Integer.class);

    public final NumberPath<Long> julkaisuID = createNumber("julkaisuID", Long.class);

    public final NumberPath<Long> koulutusalaID = createNumber("koulutusalaID", Long.class);

    public final StringPath luoja = createString("luoja");

    public final DateTimePath<java.sql.Timestamp> luontipaivamaara = createDateTime("luontipaivamaara", java.sql.Timestamp.class);

    public final StringPath paivittaja = createString("paivittaja");

    public final DateTimePath<java.sql.Timestamp> paivityspaivamaara = createDateTime("paivityspaivamaara", java.sql.Timestamp.class);

    public final com.querydsl.sql.PrimaryKey<QJulkaisunKoulutusala> julkaisunKoulutusalaJKoulutsalaIDPK = createPrimaryKey(jKoulutusalaID);

    public final com.querydsl.sql.ForeignKey<QKoulutusala> kOulutusalatDKoulutusalaIDFK = createForeignKey(koulutusalaID, "KoulutusalaID");

    public final com.querydsl.sql.ForeignKey<QJulkaisut> julkaisunKoulutusalaDJulkaisuIDFK = createForeignKey(julkaisuID, "JulkaisuID");

    public QJulkaisunKoulutusala(String variable) {
        super(QJulkaisunKoulutusala.class, forVariable(variable), "dbo", "JulkaisunKoulutusala");
        addMetadata();
    }

    public QJulkaisunKoulutusala(String variable, String schema, String table) {
        super(QJulkaisunKoulutusala.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJulkaisunKoulutusala(Path<? extends QJulkaisunKoulutusala> path) {
        super(path.getType(), path.getMetadata(), "dbo", "JulkaisunKoulutusala");
        addMetadata();
    }

    public QJulkaisunKoulutusala(PathMetadata metadata) {
        super(QJulkaisunKoulutusala.class, metadata, "dbo", "JulkaisunKoulutusala");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(jKoulutusalaID, ColumnMetadata.named("JKoulutusalaID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(jnro, ColumnMetadata.named("Jnro").withIndex(4).ofType(Types.INTEGER).withSize(10));
        addMetadata(julkaisuID, ColumnMetadata.named("JulkaisuID").withIndex(2).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(koulutusalaID, ColumnMetadata.named("KoulutusalaID").withIndex(3).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(luoja, ColumnMetadata.named("Luoja").withIndex(5).ofType(Types.NVARCHAR).withSize(30).notNull());
        addMetadata(luontipaivamaara, ColumnMetadata.named("Luontipaivamaara").withIndex(6).ofType(Types.TIMESTAMP).withSize(24).withDigits(4).notNull());
        addMetadata(paivittaja, ColumnMetadata.named("Paivittaja").withIndex(7).ofType(Types.NVARCHAR).withSize(30));
        addMetadata(paivityspaivamaara, ColumnMetadata.named("Paivityspaivamaara").withIndex(8).ofType(Types.TIMESTAMP).withSize(24).withDigits(4));
    }

}

