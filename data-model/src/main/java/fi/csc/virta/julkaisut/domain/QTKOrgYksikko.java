package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTKOrgYksikko is a Querydsl query type for QTKOrgYksikko
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTKOrgYksikko extends com.querydsl.sql.RelationalPathBase<QTKOrgYksikko> {

    private static final long serialVersionUID = -1251874889;

    public static final QTKOrgYksikko TKOrgYksikko = new QTKOrgYksikko("TK_OrgYksikko");

    public final StringPath julkaisunTunnus = createString("julkaisunTunnus");

    public final StringPath julkaisuYksikko = createString("julkaisuYksikko");

    public final StringPath latausID = createString("latausID");

    public final StringPath organisaatioTunnus = createString("organisaatioTunnus");

    public final StringPath tekijaYksikko = createString("tekijaYksikko");

    public QTKOrgYksikko(String variable) {
        super(QTKOrgYksikko.class, forVariable(variable), "web", "TK_OrgYksikko");
        addMetadata();
    }

    public QTKOrgYksikko(String variable, String schema, String table) {
        super(QTKOrgYksikko.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTKOrgYksikko(Path<? extends QTKOrgYksikko> path) {
        super(path.getType(), path.getMetadata(), "web", "TK_OrgYksikko");
        addMetadata();
    }

    public QTKOrgYksikko(PathMetadata metadata) {
        super(QTKOrgYksikko.class, metadata, "web", "TK_OrgYksikko");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(julkaisunTunnus, ColumnMetadata.named("JulkaisunTunnus").withIndex(1).ofType(Types.NVARCHAR).withSize(500).notNull());
        addMetadata(julkaisuYksikko, ColumnMetadata.named("julkaisu_yksikko").withIndex(3).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(latausID, ColumnMetadata.named("Lataus_ID").withIndex(5).ofType(Types.NVARCHAR).withSize(255).notNull());
        addMetadata(organisaatioTunnus, ColumnMetadata.named("OrganisaatioTunnus").withIndex(2).ofType(Types.NVARCHAR).withSize(20));
        addMetadata(tekijaYksikko, ColumnMetadata.named("tekija_yksikko").withIndex(4).ofType(Types.NVARCHAR).withSize(200));
    }

}

