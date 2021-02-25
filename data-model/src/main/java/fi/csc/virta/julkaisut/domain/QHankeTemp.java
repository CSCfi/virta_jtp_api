package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QHankeTemp is a Querydsl query type for QHankeTemp
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QHankeTemp extends com.querydsl.sql.RelationalPathBase<QHankeTemp> {

    private static final long serialVersionUID = 2095191014;

    public static final QHankeTemp HankeTemp = new QHankeTemp("Hanke_temp");

    public final StringPath hankenumero = createString("hankenumero");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath julkaisunTunnus = createString("julkaisunTunnus");

    public final StringPath luoja = createString("luoja");

    public final DateTimePath<java.sql.Timestamp> luontipaivamaara = createDateTime("luontipaivamaara", java.sql.Timestamp.class);

    public final StringPath organisaatioTunnus = createString("organisaatioTunnus");

    public final StringPath paivittaja = createString("paivittaja");

    public final DateTimePath<java.sql.Timestamp> paivityspaivamaara = createDateTime("paivityspaivamaara", java.sql.Timestamp.class);

    public final com.querydsl.sql.PrimaryKey<QHankeTemp> hankeTempPK = createPrimaryKey(id);

    public QHankeTemp(String variable) {
        super(QHankeTemp.class, forVariable(variable), "web", "Hanke_temp");
        addMetadata();
    }

    public QHankeTemp(String variable, String schema, String table) {
        super(QHankeTemp.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QHankeTemp(Path<? extends QHankeTemp> path) {
        super(path.getType(), path.getMetadata(), "web", "Hanke_temp");
        addMetadata();
    }

    public QHankeTemp(PathMetadata metadata) {
        super(QHankeTemp.class, metadata, "web", "Hanke_temp");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(hankenumero, ColumnMetadata.named("Hankenumero").withIndex(4).ofType(Types.NVARCHAR).withSize(100).notNull());
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(julkaisunTunnus, ColumnMetadata.named("JulkaisunTunnus").withIndex(2).ofType(Types.NVARCHAR).withSize(50).notNull());
        addMetadata(luoja, ColumnMetadata.named("Luoja").withIndex(5).ofType(Types.NVARCHAR).withSize(30));
        addMetadata(luontipaivamaara, ColumnMetadata.named("Luontipaivamaara").withIndex(6).ofType(Types.TIMESTAMP).withSize(24).withDigits(4).notNull());
        addMetadata(organisaatioTunnus, ColumnMetadata.named("OrganisaatioTunnus").withIndex(3).ofType(Types.NVARCHAR).withSize(20).notNull());
        addMetadata(paivittaja, ColumnMetadata.named("Paivittaja").withIndex(7).ofType(Types.NVARCHAR).withSize(30));
        addMetadata(paivityspaivamaara, ColumnMetadata.named("Paivityspaivamaara").withIndex(8).ofType(Types.TIMESTAMP).withSize(24).withDigits(4));
    }

}

