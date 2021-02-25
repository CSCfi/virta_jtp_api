package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTKTekijat is a Querydsl query type for QTKTekijat
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTKTekijat extends com.querydsl.sql.RelationalPathBase<QTKTekijat> {

    private static final long serialVersionUID = 427589224;

    public static final QTKTekijat TKTekijat = new QTKTekijat("TK_Tekijat");

    public final StringPath etunimet = createString("etunimet");

    public final StringPath julkaisunTunnus = createString("julkaisunTunnus");

    public final StringPath latausID = createString("latausID");

    public final StringPath orcid = createString("orcid");
    
    public final StringPath sukunimi = createString("sukunimi");

    public final StringPath yksikko = createString("yksikko");
    
    public final StringPath rooli = createString("rooli");

    public QTKTekijat(String variable) {
        super(QTKTekijat.class, forVariable(variable), "web", "TK_Tekijat");
        addMetadata();
    }

    public QTKTekijat(String variable, String schema, String table) {
        super(QTKTekijat.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTKTekijat(Path<? extends QTKTekijat> path) {
        super(path.getType(), path.getMetadata(), "web", "TK_Tekijat");
        addMetadata();
    }

    public QTKTekijat(PathMetadata metadata) {
        super(QTKTekijat.class, metadata, "web", "TK_Tekijat");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(julkaisunTunnus, ColumnMetadata.named("JulkaisunTunnus").withIndex(1).ofType(Types.NVARCHAR).withSize(500).notNull());
        addMetadata(etunimet, ColumnMetadata.named("Etunimet").withIndex(2).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(sukunimi, ColumnMetadata.named("Sukunimi").withIndex(3).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(orcid, ColumnMetadata.named("ORCID").withIndex(4).ofType(Types.NVARCHAR).withSize(20));
        addMetadata(yksikko, ColumnMetadata.named("Yksikko").withIndex(5).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(latausID, ColumnMetadata.named("Lataus_ID").withIndex(6).ofType(Types.NVARCHAR).withSize(255).notNull());
        addMetadata(rooli, ColumnMetadata.named("Rooli").withIndex(7).ofType(Types.NVARCHAR).withSize(255));
        
            
    }

}

