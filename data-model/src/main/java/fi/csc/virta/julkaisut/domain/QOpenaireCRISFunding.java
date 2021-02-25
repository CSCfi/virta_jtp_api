package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;

@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QOpenaireCRISFunding extends com.querydsl.sql.RelationalPathBase<QOpenaireCRISFunding> {
    
    private static final long serialVersionUID = 155585555;

    public static final QOpenaireCRISFunding OpenaireCRISFunding = new QOpenaireCRISFunding("OpenaireCRISFunding");
    
    public final DateTimePath<java.sql.Timestamp> alkamispaivmaara = createDateTime("alkamispaivmaara", java.sql.Timestamp.class);

    public final StringPath koodi = createString("koodi");

    public final StringPath luoja = createString("luoja");

    public final DateTimePath<java.sql.Timestamp> luontipaivamaara = createDateTime("luontipaivamaara", java.sql.Timestamp.class);

    public final StringPath setSpec = createString("setSpec");
    
    public final StringPath setName = createString("setName");

    public final DateTimePath<java.sql.Timestamp> paattymispaivamaara = createDateTime("paattymispaivamaara", java.sql.Timestamp.class);

    public final StringPath paivittaja = createString("paivittaja");

    public final DateTimePath<java.sql.Timestamp> paivityspaivamaara = createDateTime("paivityspaivamaara", java.sql.Timestamp.class);
    
    public final NumberPath<Long> OCFID = createNumber("OCFID", Long.class);

    public final com.querydsl.sql.PrimaryKey<QOpenaireCRISFunding> openaireCRISFundingOCFIDPK = createPrimaryKey(OCFID);

    public QOpenaireCRISFunding(String variable) {
        super(QOpenaireCRISFunding.class, forVariable(variable), "dbo", "OpenaireCRISFunding");
        addMetadata();
    }

    public QOpenaireCRISFunding(String variable, String schema, String table) {
        super(QOpenaireCRISFunding.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QOpenaireCRISFunding(Path<? extends QOpenaireCRISFunding> path) {
        super(path.getType(), path.getMetadata(), "dbo", "OpenaireCRISFunding");
        addMetadata();
    }

    public QOpenaireCRISFunding(PathMetadata metadata) {
        super(QOpenaireCRISFunding.class, metadata, "dbo", "OpenaireCRISFunding");
        addMetadata();
    }
    
    public void addMetadata() {
        addMetadata(OCFID, ColumnMetadata.named("OCFID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(koodi, ColumnMetadata.named("Koodi").withIndex(2).ofType(Types.NVARCHAR).withSize(5));
        addMetadata(setSpec, ColumnMetadata.named("SetSpec").withIndex(3).ofType(Types.NVARCHAR).withSize(100));
        addMetadata(setName, ColumnMetadata.named("SetName").withIndex(4).ofType(Types.NVARCHAR).withSize(100));
        addMetadata(alkamispaivmaara, ColumnMetadata.named("Alkamispaivmaara").withIndex(5).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(paattymispaivamaara, ColumnMetadata.named("Paattymispaivamaara").withIndex(6).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(luoja, ColumnMetadata.named("Luoja").withIndex(7).ofType(Types.NVARCHAR).withSize(30).notNull());
        addMetadata(luontipaivamaara, ColumnMetadata.named("Luontipaivamaara").withIndex(8).ofType(Types.TIMESTAMP).withSize(24).withDigits(4).notNull());   
        addMetadata(paivittaja, ColumnMetadata.named("Paivittaja").withIndex(9).ofType(Types.NVARCHAR).withSize(30));
        addMetadata(paivityspaivamaara, ColumnMetadata.named("Paivityspaivamaara").withIndex(10).ofType(Types.TIMESTAMP).withSize(24).withDigits(4));
        
    }
    
}
    