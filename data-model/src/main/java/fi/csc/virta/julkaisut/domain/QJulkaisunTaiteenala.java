package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;

@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QJulkaisunTaiteenala extends com.querydsl.sql.RelationalPathBase<QJulkaisunTaiteenala> {
    
    private static final long serialVersionUID = 1000868398;

    public static final QJulkaisunTaiteenala JulkaisunTaiteenala = new QJulkaisunTaiteenala("JulkaisunTaiteenala");

    public final NumberPath<Integer> jnro = createNumber("jnro", Integer.class);

    public final NumberPath<Long> jTaiteenalaID = createNumber("jTaiteenalaID", Long.class);

    public final NumberPath<Long> julkaisuID = createNumber("julkaisuID", Long.class);

    public final StringPath luoja = createString("luoja");

    public final DateTimePath<java.sql.Timestamp> luontipaivamaara = createDateTime("luontipaivamaara", java.sql.Timestamp.class);

    public final StringPath paivittaja = createString("paivittaja");

    public final DateTimePath<java.sql.Timestamp> paivityspaivamaara = createDateTime("paivityspaivamaara", java.sql.Timestamp.class);

    public final NumberPath<Long> taiteenalaID = createNumber("taiteenalaID", Long.class);

    public final com.querydsl.sql.PrimaryKey<QJulkaisunTaiteenala> julkaisunTaiteenalaJTaiteenalaIDPK = createPrimaryKey(jTaiteenalaID);

    public final com.querydsl.sql.ForeignKey<QTaiteenalaLuokitus> julkaisunTaiteenalaDTaiteenalaIDFK = createForeignKey(taiteenalaID, "TaiteenalaID");

    public final com.querydsl.sql.ForeignKey<QJulkaisut> julkaisunTaiteenalaDJulkaisuIDFK = createForeignKey(julkaisuID, "JulkaisuID");

    public QJulkaisunTaiteenala(String variable) {
        super(QJulkaisunTaiteenala.class, forVariable(variable), "dbo", "JulkaisunTaiteenala");
        addMetadata();
    }

    public QJulkaisunTaiteenala(String variable, String schema, String table) {
        super(QJulkaisunTaiteenala.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJulkaisunTaiteenala(Path<? extends QJulkaisunTaiteenala> path) {
        super(path.getType(), path.getMetadata(), "dbo", "JulkaisunTaiteenala");
        addMetadata();
    }

    public QJulkaisunTaiteenala(PathMetadata metadata) {
        super(QJulkaisunTaiteenala.class, metadata, "dbo", "JulkaisunTaiteenala");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(jnro, ColumnMetadata.named("Jnro").withIndex(4).ofType(Types.INTEGER).withSize(10));
        addMetadata(jTaiteenalaID, ColumnMetadata.named("JTaiteenalaID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(julkaisuID, ColumnMetadata.named("JulkaisuID").withIndex(2).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(luoja, ColumnMetadata.named("Luoja").withIndex(5).ofType(Types.NVARCHAR).withSize(30).notNull());
        addMetadata(luontipaivamaara, ColumnMetadata.named("Luontipaivamaara").withIndex(6).ofType(Types.TIMESTAMP).withSize(24).withDigits(4).notNull());
        addMetadata(paivittaja, ColumnMetadata.named("Paivittaja").withIndex(7).ofType(Types.NVARCHAR).withSize(30));
        addMetadata(paivityspaivamaara, ColumnMetadata.named("Paivityspaivamaara").withIndex(8).ofType(Types.TIMESTAMP).withSize(24).withDigits(4));
        addMetadata(taiteenalaID, ColumnMetadata.named("TaiteenalaID").withIndex(3).ofType(Types.BIGINT).withSize(19).notNull());
    }
    
}
