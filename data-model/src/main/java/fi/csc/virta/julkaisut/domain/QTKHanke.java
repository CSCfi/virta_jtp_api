package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTKHanke is a Querydsl query type for QTKHanke
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTKHanke extends com.querydsl.sql.RelationalPathBase<QTKHanke> {

    private static final long serialVersionUID = 105447451;

    public static final QTKHanke TKHanke = new QTKHanke("TK_Hanke");

    public final StringPath hankenumero = createString("hankenumero");

    public final StringPath julkaisunTunnus = createString("julkaisunTunnus");

    public final StringPath latausID = createString("latausID");

    public final StringPath rahoittajaOrg = createString("rahoittajaOrg");

    public QTKHanke(String variable) {
        super(QTKHanke.class, forVariable(variable), "web", "TK_Hanke");
        addMetadata();
    }

    public QTKHanke(String variable, String schema, String table) {
        super(QTKHanke.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTKHanke(Path<? extends QTKHanke> path) {
        super(path.getType(), path.getMetadata(), "web", "TK_Hanke");
        addMetadata();
    }

    public QTKHanke(PathMetadata metadata) {
        super(QTKHanke.class, metadata, "web", "TK_Hanke");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(hankenumero, ColumnMetadata.named("Hankenumero").withIndex(2).ofType(Types.NVARCHAR).withSize(100));
        addMetadata(julkaisunTunnus, ColumnMetadata.named("JulkaisunTunnus").withIndex(1).ofType(Types.NVARCHAR).withSize(500).notNull());
        addMetadata(latausID, ColumnMetadata.named("Lataus_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(255).notNull());
        addMetadata(rahoittajaOrg, ColumnMetadata.named("RahoittajaOrg").withIndex(3).ofType(Types.NVARCHAR).withSize(5));
    }

}

