package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCERIF is a Querydsl query type for QCERIF
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCERIF extends com.querydsl.sql.RelationalPathBase<QCERIF> {

    private static final long serialVersionUID = 1632437642;

    public static final QCERIF CERIF = new QCERIF("CERIF");

    public final StringPath ID = createString("ID");

    public final NumberPath<Long> CERIFid = createNumber("CERIFid", Long.class);
    
    public final NumberPath<Integer> tyyppi = createNumber("tyyppi", Integer.class);

    public final StringPath luoja = createString("luoja");

    public final DateTimePath<java.sql.Timestamp> luontipaivamaara = createDateTime("luontipaivamaara", java.sql.Timestamp.class);

    public final StringPath paivittaja = createString("paivittaja");

    public final DateTimePath<java.sql.Timestamp> paivityspaivamaara = createDateTime("paivityspaivamaara", java.sql.Timestamp.class);

    public final StringPath xmldata = createString("xmldata");
    
    public final StringPath identifier = createString("identifier");

    public final com.querydsl.sql.PrimaryKey<QCERIF> CERIFCERIFidPK = createPrimaryKey(CERIFid);

    public QCERIF(String variable) {
        super(QCERIF.class, forVariable(variable), "dbo", "CERIF");
        addMetadata();
    }

    public QCERIF(String variable, String schema, String table) {
        super(QCERIF.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCERIF(Path<? extends QCERIF> path) {
        super(path.getType(), path.getMetadata(), "dbo", "CERIF");
        addMetadata();
    }

    public QCERIF(PathMetadata metadata) {
        super(QCERIF.class, metadata, "dbo", "CERIF");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(ID, ColumnMetadata.named("ID").withIndex(2).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(CERIFid, ColumnMetadata.named("CERIFid").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(tyyppi, ColumnMetadata.named("Tyyppi").withIndex(3).ofType(Types.INTEGER).withSize(4).notNull());
        addMetadata(luoja, ColumnMetadata.named("Luoja").withIndex(5).ofType(Types.NVARCHAR).withSize(30).notNull());
        addMetadata(luontipaivamaara, ColumnMetadata.named("Luontipaivamaara").withIndex(6).ofType(Types.TIMESTAMP).withSize(24).withDigits(4).notNull());
        addMetadata(paivittaja, ColumnMetadata.named("Paivittaja").withIndex(7).ofType(Types.NVARCHAR).withSize(30));
        addMetadata(paivityspaivamaara, ColumnMetadata.named("Paivityspaivamaara").withIndex(8).ofType(Types.TIMESTAMP).withSize(24).withDigits(4));
        addMetadata(xmldata, ColumnMetadata.named("xmldata").withIndex(4).ofType(Types.LONGNVARCHAR).withSize(2147483647));
        addMetadata(identifier, ColumnMetadata.named("Identifier").withIndex(9).ofType(Types.LONGNVARCHAR).withSize(100));
    }

}


