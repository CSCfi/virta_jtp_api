package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QRinnakkaisOsoite is a Querydsl query type for QRinnakkaisOsoite
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QRinnakkaisOsoite extends com.querydsl.sql.RelationalPathBase<QRinnakkaisOsoite> {

    private static final long serialVersionUID = -1753435123;

    public static final QRinnakkaisOsoite RinnakkaisOsoite = new QRinnakkaisOsoite("RinnakkaisOsoite");

    public final NumberPath<Long> julkaisuID = createNumber("julkaisuID", Long.class);

    public final StringPath luoja = createString("luoja");

    public final DateTimePath<java.sql.Timestamp> luontipaivamaara = createDateTime("luontipaivamaara", java.sql.Timestamp.class);

    public final StringPath paivittaja = createString("paivittaja");

    public final DateTimePath<java.sql.Timestamp> paivityspaivamaara = createDateTime("paivityspaivamaara", java.sql.Timestamp.class);

    public final StringPath rinnakkaisOsoite = createString("rinnakkaisOsoite");

    public final NumberPath<Long> rinnakkaisOsoiteID = createNumber("rinnakkaisOsoiteID", Long.class);

    public final com.querydsl.sql.PrimaryKey<QRinnakkaisOsoite> rosoiteRosoiteidPk = createPrimaryKey(rinnakkaisOsoiteID);

    public final com.querydsl.sql.ForeignKey<QJulkaisut> rOSOITEJulkaisuFK = createForeignKey(julkaisuID, "JulkaisuID");

    public QRinnakkaisOsoite(String variable) {
        super(QRinnakkaisOsoite.class, forVariable(variable), "dbo", "RinnakkaisOsoite");
        addMetadata();
    }

    public QRinnakkaisOsoite(String variable, String schema, String table) {
        super(QRinnakkaisOsoite.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QRinnakkaisOsoite(Path<? extends QRinnakkaisOsoite> path) {
        super(path.getType(), path.getMetadata(), "dbo", "RinnakkaisOsoite");
        addMetadata();
    }

    public QRinnakkaisOsoite(PathMetadata metadata) {
        super(QRinnakkaisOsoite.class, metadata, "dbo", "RinnakkaisOsoite");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(julkaisuID, ColumnMetadata.named("JulkaisuID").withIndex(2).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(luoja, ColumnMetadata.named("Luoja").withIndex(4).ofType(Types.NVARCHAR).withSize(30).notNull());
        addMetadata(luontipaivamaara, ColumnMetadata.named("Luontipaivamaara").withIndex(5).ofType(Types.TIMESTAMP).withSize(24).withDigits(4).notNull());
        addMetadata(paivittaja, ColumnMetadata.named("Paivittaja").withIndex(6).ofType(Types.NVARCHAR).withSize(30));
        addMetadata(paivityspaivamaara, ColumnMetadata.named("Paivityspaivamaara").withIndex(7).ofType(Types.TIMESTAMP).withSize(24).withDigits(4));
        addMetadata(rinnakkaisOsoite, ColumnMetadata.named("RinnakkaisOsoite").withIndex(3).ofType(Types.NVARCHAR).withSize(400));
        addMetadata(rinnakkaisOsoiteID, ColumnMetadata.named("RinnakkaisOsoiteID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

