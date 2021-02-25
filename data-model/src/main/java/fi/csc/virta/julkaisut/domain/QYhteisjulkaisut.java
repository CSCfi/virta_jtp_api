package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QYhteisjulkaisut is a Querydsl query type for QYhteisjulkaisut
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QYhteisjulkaisut extends com.querydsl.sql.RelationalPathBase<QYhteisjulkaisut> {

    private static final long serialVersionUID = -343345607;

    public static final QYhteisjulkaisut Yhteisjulkaisut = new QYhteisjulkaisut("Yhteisjulkaisut");

    public final NumberPath<Long> julkaisuID = createNumber("julkaisuID", Long.class);

    public final StringPath julkaisunTunnus = createString("julkaisunTunnus");

    public final NumberPath<Long> liittyvaID = createNumber("liittyvaID", Long.class);

    public final StringPath luoja = createString("luoja");

    public final DateTimePath<java.sql.Timestamp> luontipaivamaara = createDateTime("luontipaivamaara", java.sql.Timestamp.class);

    public final StringPath paivittaja = createString("paivittaja");

    public final DateTimePath<java.sql.Timestamp> paivityspaivamaara = createDateTime("paivityspaivamaara", java.sql.Timestamp.class);

    public final NumberPath<Long> yhteisjulkaisuID = createNumber("yhteisjulkaisuID", Long.class);

    public final com.querydsl.sql.PrimaryKey<QYhteisjulkaisut> yhteisjulkaisutYhteisjulkaisuIDPK = createPrimaryKey(yhteisjulkaisuID);

    public final com.querydsl.sql.ForeignKey<QJulkaisut> yhteisjulkaisutJulkaisuFK = createForeignKey(julkaisuID, "JulkaisuID");

    public QYhteisjulkaisut(String variable) {
        super(QYhteisjulkaisut.class, forVariable(variable), "dbo", "Yhteisjulkaisut");
        addMetadata();
    }

    public QYhteisjulkaisut(String variable, String schema, String table) {
        super(QYhteisjulkaisut.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QYhteisjulkaisut(Path<? extends QYhteisjulkaisut> path) {
        super(path.getType(), path.getMetadata(), "dbo", "Yhteisjulkaisut");
        addMetadata();
    }

    public QYhteisjulkaisut(PathMetadata metadata) {
        super(QYhteisjulkaisut.class, metadata, "dbo", "Yhteisjulkaisut");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(julkaisuID, ColumnMetadata.named("JulkaisuID").withIndex(2).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(julkaisunTunnus, ColumnMetadata.named("JulkaisunTunnus").withIndex(3).ofType(Types.NVARCHAR).withSize(50).notNull());
        addMetadata(liittyvaID, ColumnMetadata.named("LiittyvaID").withIndex(8).ofType(Types.BIGINT).withSize(19));
        addMetadata(luoja, ColumnMetadata.named("Luoja").withIndex(4).ofType(Types.NVARCHAR).withSize(30).notNull());
        addMetadata(luontipaivamaara, ColumnMetadata.named("Luontipaivamaara").withIndex(5).ofType(Types.TIMESTAMP).withSize(24).withDigits(4).notNull());
        addMetadata(paivittaja, ColumnMetadata.named("Paivittaja").withIndex(6).ofType(Types.NVARCHAR).withSize(30));
        addMetadata(paivityspaivamaara, ColumnMetadata.named("Paivityspaivamaara").withIndex(7).ofType(Types.TIMESTAMP).withSize(24).withDigits(4));
        addMetadata(yhteisjulkaisuID, ColumnMetadata.named("YhteisjulkaisuID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

