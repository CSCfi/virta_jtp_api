package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTieteenalaLuokitus is a Querydsl query type for QTieteenalaLuokitus
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTieteenalaLuokitus extends com.querydsl.sql.RelationalPathBase<QTieteenalaLuokitus> {

    private static final long serialVersionUID = 185480279;

    public static final QTieteenalaLuokitus TieteenalaLuokitus = new QTieteenalaLuokitus("TieteenalaLuokitus");

    public final DateTimePath<java.sql.Timestamp> alkamispaivmaara = createDateTime("alkamispaivmaara", java.sql.Timestamp.class);

    public final StringPath koodi = createString("koodi");

    public final StringPath luoja = createString("luoja");

    public final DateTimePath<java.sql.Timestamp> luontipaivamaara = createDateTime("luontipaivamaara", java.sql.Timestamp.class);

    public final StringPath nimi = createString("nimi");

    public final DateTimePath<java.sql.Timestamp> paattymispaivamaara = createDateTime("paattymispaivamaara", java.sql.Timestamp.class);

    public final StringPath paivittaja = createString("paivittaja");

    public final DateTimePath<java.sql.Timestamp> paivityspaivamaara = createDateTime("paivityspaivamaara", java.sql.Timestamp.class);

    public final NumberPath<Long> tieteenalaID = createNumber("tieteenalaID", Long.class);

    public final com.querydsl.sql.PrimaryKey<QTieteenalaLuokitus> tieteenalaLuokitusTieteenalaIDPK = createPrimaryKey(tieteenalaID);

    public final com.querydsl.sql.ForeignKey<QJulkaisunTieteenala> _julkaisunTieteenalaDTieteenalaIDFK = createInvForeignKey(tieteenalaID, "TieteenalaID");

    public QTieteenalaLuokitus(String variable) {
        super(QTieteenalaLuokitus.class, forVariable(variable), "dbo", "TieteenalaLuokitus");
        addMetadata();
    }

    public QTieteenalaLuokitus(String variable, String schema, String table) {
        super(QTieteenalaLuokitus.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTieteenalaLuokitus(Path<? extends QTieteenalaLuokitus> path) {
        super(path.getType(), path.getMetadata(), "dbo", "TieteenalaLuokitus");
        addMetadata();
    }

    public QTieteenalaLuokitus(PathMetadata metadata) {
        super(QTieteenalaLuokitus.class, metadata, "dbo", "TieteenalaLuokitus");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(alkamispaivmaara, ColumnMetadata.named("Alkamispaivmaara").withIndex(4).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(koodi, ColumnMetadata.named("Koodi").withIndex(2).ofType(Types.NVARCHAR).withSize(5).notNull());
        addMetadata(luoja, ColumnMetadata.named("Luoja").withIndex(6).ofType(Types.NVARCHAR).withSize(30).notNull());
        addMetadata(luontipaivamaara, ColumnMetadata.named("Luontipaivamaara").withIndex(7).ofType(Types.TIMESTAMP).withSize(24).withDigits(4).notNull());
        addMetadata(nimi, ColumnMetadata.named("Nimi").withIndex(3).ofType(Types.NVARCHAR).withSize(100));
        addMetadata(paattymispaivamaara, ColumnMetadata.named("Paattymispaivamaara").withIndex(5).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(paivittaja, ColumnMetadata.named("Paivittaja").withIndex(8).ofType(Types.NVARCHAR).withSize(30));
        addMetadata(paivityspaivamaara, ColumnMetadata.named("Paivityspaivamaara").withIndex(9).ofType(Types.TIMESTAMP).withSize(24).withDigits(4));
        addMetadata(tieteenalaID, ColumnMetadata.named("TieteenalaID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

