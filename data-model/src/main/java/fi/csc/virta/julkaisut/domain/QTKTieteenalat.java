package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTKTieteenalat is a Querydsl query type for QTKTieteenalat
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTKTieteenalat extends com.querydsl.sql.RelationalPathBase<QTKTieteenalat> {

    private static final long serialVersionUID = -1074978700;

    public static final QTKTieteenalat TKTieteenalat = new QTKTieteenalat("TK_Tieteenalat");

    public final NumberPath<Integer> jNro = createNumber("jNro", Integer.class);

    public final StringPath julkaisunTunnus = createString("julkaisunTunnus");

    public final StringPath latausID = createString("latausID");

    public final NumberPath<Integer> tieteenala = createNumber("tieteenala", Integer.class);

    public QTKTieteenalat(String variable) {
        super(QTKTieteenalat.class, forVariable(variable), "web", "TK_Tieteenalat");
        addMetadata();
    }

    public QTKTieteenalat(String variable, String schema, String table) {
        super(QTKTieteenalat.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTKTieteenalat(Path<? extends QTKTieteenalat> path) {
        super(path.getType(), path.getMetadata(), "web", "TK_Tieteenalat");
        addMetadata();
    }

    public QTKTieteenalat(PathMetadata metadata) {
        super(QTKTieteenalat.class, metadata, "web", "TK_Tieteenalat");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(jNro, ColumnMetadata.named("JNro").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(julkaisunTunnus, ColumnMetadata.named("JulkaisunTunnus").withIndex(1).ofType(Types.NVARCHAR).withSize(500).notNull());
        addMetadata(latausID, ColumnMetadata.named("Lataus_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(255).notNull());
        addMetadata(tieteenala, ColumnMetadata.named("Tieteenala").withIndex(2).ofType(Types.INTEGER).withSize(10));
    }

}

