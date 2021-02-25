package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QJulkaisunTieteenala is a Querydsl query type for QJulkaisunTieteenala
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QJulkaisunTieteenala extends com.querydsl.sql.RelationalPathBase<QJulkaisunTieteenala> {

    private static final long serialVersionUID = 1000868329;

    public static final QJulkaisunTieteenala JulkaisunTieteenala = new QJulkaisunTieteenala("JulkaisunTieteenala");

    public final NumberPath<Integer> jnro = createNumber("jnro", Integer.class);

    public final NumberPath<Long> jTieteenalaID = createNumber("jTieteenalaID", Long.class);

    public final NumberPath<Long> julkaisuID = createNumber("julkaisuID", Long.class);

    public final StringPath luoja = createString("luoja");

    public final DateTimePath<java.sql.Timestamp> luontipaivamaara = createDateTime("luontipaivamaara", java.sql.Timestamp.class);

    public final StringPath paivittaja = createString("paivittaja");

    public final DateTimePath<java.sql.Timestamp> paivityspaivamaara = createDateTime("paivityspaivamaara", java.sql.Timestamp.class);

    public final NumberPath<Long> tieteenalaID = createNumber("tieteenalaID", Long.class);

    public final com.querydsl.sql.PrimaryKey<QJulkaisunTieteenala> julkaisunTieteenalaJTieteenalaIDPK = createPrimaryKey(jTieteenalaID);

    public final com.querydsl.sql.ForeignKey<QTieteenalaLuokitus> julkaisunTieteenalaDTieteenalaIDFK = createForeignKey(tieteenalaID, "TieteenalaID");

    public final com.querydsl.sql.ForeignKey<QJulkaisut> julkaisunTieteenalaDJulkaisuIDFK = createForeignKey(julkaisuID, "JulkaisuID");

    public QJulkaisunTieteenala(String variable) {
        super(QJulkaisunTieteenala.class, forVariable(variable), "dbo", "JulkaisunTieteenala");
        addMetadata();
    }

    public QJulkaisunTieteenala(String variable, String schema, String table) {
        super(QJulkaisunTieteenala.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJulkaisunTieteenala(Path<? extends QJulkaisunTieteenala> path) {
        super(path.getType(), path.getMetadata(), "dbo", "JulkaisunTieteenala");
        addMetadata();
    }

    public QJulkaisunTieteenala(PathMetadata metadata) {
        super(QJulkaisunTieteenala.class, metadata, "dbo", "JulkaisunTieteenala");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(jnro, ColumnMetadata.named("Jnro").withIndex(4).ofType(Types.INTEGER).withSize(10));
        addMetadata(jTieteenalaID, ColumnMetadata.named("JTieteenalaID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(julkaisuID, ColumnMetadata.named("JulkaisuID").withIndex(2).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(luoja, ColumnMetadata.named("Luoja").withIndex(5).ofType(Types.NVARCHAR).withSize(30).notNull());
        addMetadata(luontipaivamaara, ColumnMetadata.named("Luontipaivamaara").withIndex(6).ofType(Types.TIMESTAMP).withSize(24).withDigits(4).notNull());
        addMetadata(paivittaja, ColumnMetadata.named("Paivittaja").withIndex(7).ofType(Types.NVARCHAR).withSize(30));
        addMetadata(paivityspaivamaara, ColumnMetadata.named("Paivityspaivamaara").withIndex(8).ofType(Types.TIMESTAMP).withSize(24).withDigits(4));
        addMetadata(tieteenalaID, ColumnMetadata.named("TieteenalaID").withIndex(3).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

