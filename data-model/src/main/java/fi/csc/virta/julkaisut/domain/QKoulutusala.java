package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QKoulutusala is a Querydsl query type for QKoulutusala
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QKoulutusala extends com.querydsl.sql.RelationalPathBase<QKoulutusala> {

    private static final long serialVersionUID = -486408287;

    public static final QKoulutusala Koulutusala = new QKoulutusala("Koulutusala");

    public final DateTimePath<java.sql.Timestamp> alkamispaivmaara = createDateTime("alkamispaivmaara", java.sql.Timestamp.class);

    public final StringPath koodi = createString("koodi");

    public final NumberPath<Long> koulutusalaID = createNumber("koulutusalaID", Long.class);

    public final StringPath luoja = createString("luoja");

    public final DateTimePath<java.sql.Timestamp> luontipaivamaara = createDateTime("luontipaivamaara", java.sql.Timestamp.class);

    public final StringPath nimi = createString("nimi");

    public final DateTimePath<java.sql.Timestamp> paattymispaivamaara = createDateTime("paattymispaivamaara", java.sql.Timestamp.class);

    public final StringPath paivittaja = createString("paivittaja");

    public final DateTimePath<java.sql.Timestamp> paivityspaivamaara = createDateTime("paivityspaivamaara", java.sql.Timestamp.class);

    public final com.querydsl.sql.PrimaryKey<QKoulutusala> kOulutusalatKooditKoulutusalaIDPK = createPrimaryKey(koulutusalaID);

    public final com.querydsl.sql.ForeignKey<QJulkaisunKoulutusala> _kOulutusalatDKoulutusalaIDFK = createInvForeignKey(koulutusalaID, "KoulutusalaID");

    public QKoulutusala(String variable) {
        super(QKoulutusala.class, forVariable(variable), "dbo", "Koulutusala");
        addMetadata();
    }

    public QKoulutusala(String variable, String schema, String table) {
        super(QKoulutusala.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QKoulutusala(Path<? extends QKoulutusala> path) {
        super(path.getType(), path.getMetadata(), "dbo", "Koulutusala");
        addMetadata();
    }

    public QKoulutusala(PathMetadata metadata) {
        super(QKoulutusala.class, metadata, "dbo", "Koulutusala");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(alkamispaivmaara, ColumnMetadata.named("Alkamispaivmaara").withIndex(4).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(koodi, ColumnMetadata.named("Koodi").withIndex(2).ofType(Types.NVARCHAR).withSize(5).notNull());
        addMetadata(koulutusalaID, ColumnMetadata.named("KoulutusalaID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(luoja, ColumnMetadata.named("Luoja").withIndex(6).ofType(Types.NVARCHAR).withSize(30).notNull());
        addMetadata(luontipaivamaara, ColumnMetadata.named("Luontipaivamaara").withIndex(7).ofType(Types.TIMESTAMP).withSize(24).withDigits(4).notNull());
        addMetadata(nimi, ColumnMetadata.named("Nimi").withIndex(3).ofType(Types.NVARCHAR).withSize(100));
        addMetadata(paattymispaivamaara, ColumnMetadata.named("Paattymispaivamaara").withIndex(5).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(paivittaja, ColumnMetadata.named("Paivittaja").withIndex(8).ofType(Types.NVARCHAR).withSize(30));
        addMetadata(paivityspaivamaara, ColumnMetadata.named("Paivityspaivamaara").withIndex(9).ofType(Types.TIMESTAMP).withSize(24).withDigits(4));
    }

}

