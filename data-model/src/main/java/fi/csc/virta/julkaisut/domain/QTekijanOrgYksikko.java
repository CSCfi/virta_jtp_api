package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTekijanOrgYksikko is a Querydsl query type for QTekijanOrgYksikko
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTekijanOrgYksikko extends com.querydsl.sql.RelationalPathBase<QTekijanOrgYksikko> {

    private static final long serialVersionUID = -19439186;

    public static final QTekijanOrgYksikko TekijanOrgYksikko = new QTekijanOrgYksikko("TekijanOrgYksikko");

    public final StringPath luoja = createString("luoja");

    public final DateTimePath<java.sql.Timestamp> luontipaivamaara = createDateTime("luontipaivamaara", java.sql.Timestamp.class);

    public final StringPath paivittaja = createString("paivittaja");

    public final DateTimePath<java.sql.Timestamp> paivityspaivamaara = createDateTime("paivityspaivamaara", java.sql.Timestamp.class);

    public final NumberPath<Long> tekijaID = createNumber("tekijaID", Long.class);

    public final NumberPath<Long> tOrgYksikkoID = createNumber("tOrgYksikkoID", Long.class);

    public final NumberPath<Long> vanhempiID = createNumber("vanhempiID", Long.class);

    public final NumberPath<Long> yksikkoID = createNumber("yksikkoID", Long.class);

    public final com.querydsl.sql.PrimaryKey<QTekijanOrgYksikko> tekijanOrgYksikkoDTOrgYksikkoIDPK = createPrimaryKey(tOrgYksikkoID);

    public final com.querydsl.sql.ForeignKey<QTekijat> tekijanOrgYksikkoTekijaIDFK = createForeignKey(tekijaID, "TekijaID");

    public final com.querydsl.sql.ForeignKey<QOrgYksikko> tekijanOrgYksikkoYksikkoIDFK = createForeignKey(yksikkoID, "YksikkoID");

    public QTekijanOrgYksikko(String variable) {
        super(QTekijanOrgYksikko.class, forVariable(variable), "dbo", "TekijanOrgYksikko");
        addMetadata();
    }

    public QTekijanOrgYksikko(String variable, String schema, String table) {
        super(QTekijanOrgYksikko.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTekijanOrgYksikko(Path<? extends QTekijanOrgYksikko> path) {
        super(path.getType(), path.getMetadata(), "dbo", "TekijanOrgYksikko");
        addMetadata();
    }

    public QTekijanOrgYksikko(PathMetadata metadata) {
        super(QTekijanOrgYksikko.class, metadata, "dbo", "TekijanOrgYksikko");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(luoja, ColumnMetadata.named("Luoja").withIndex(4).ofType(Types.NVARCHAR).withSize(30).notNull());
        addMetadata(luontipaivamaara, ColumnMetadata.named("Luontipaivamaara").withIndex(5).ofType(Types.TIMESTAMP).withSize(24).withDigits(4).notNull());
        addMetadata(paivittaja, ColumnMetadata.named("Paivittaja").withIndex(6).ofType(Types.NVARCHAR).withSize(30));
        addMetadata(paivityspaivamaara, ColumnMetadata.named("Paivityspaivamaara").withIndex(7).ofType(Types.TIMESTAMP).withSize(24).withDigits(4));
        addMetadata(tekijaID, ColumnMetadata.named("TekijaID").withIndex(2).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(tOrgYksikkoID, ColumnMetadata.named("TOrgYksikkoID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(vanhempiID, ColumnMetadata.named("VanhempiID").withIndex(8).ofType(Types.BIGINT).withSize(19));
        addMetadata(yksikkoID, ColumnMetadata.named("YksikkoID").withIndex(3).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

