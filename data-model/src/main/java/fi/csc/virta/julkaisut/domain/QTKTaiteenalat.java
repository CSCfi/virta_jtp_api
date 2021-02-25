package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;

@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTKTaiteenalat extends com.querydsl.sql.RelationalPathBase<QTKTaiteenalat> {
    
    private static final long serialVersionUID = -1074978655;

    public static final QTKTaiteenalat TKTaiteenalat = new QTKTaiteenalat("TK_Taiteenalat");

    public final NumberPath<Integer> jNro = createNumber("jNro", Integer.class);

    public final StringPath julkaisunTunnus = createString("julkaisunTunnus");

    public final StringPath latausID = createString("latausID");

    public final NumberPath<Integer> taiteenala = createNumber("taiteenala", Integer.class);

    public QTKTaiteenalat(String variable) {
        super(QTKTaiteenalat.class, forVariable(variable), "web", "TK_Taiteenalat");
        addMetadata();
    }

    public QTKTaiteenalat(String variable, String schema, String table) {
        super(QTKTaiteenalat.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTKTaiteenalat(Path<? extends QTKTaiteenalat> path) {
        super(path.getType(), path.getMetadata(), "web", "TK_Taiteenalat");
        addMetadata();
    }

    public QTKTaiteenalat(PathMetadata metadata) {
        super(QTKTaiteenalat.class, metadata, "web", "TK_Taiteenalat");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(jNro, ColumnMetadata.named("JNro").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(julkaisunTunnus, ColumnMetadata.named("JulkaisunTunnus").withIndex(1).ofType(Types.NVARCHAR).withSize(500).notNull());
        addMetadata(latausID, ColumnMetadata.named("Lataus_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(255).notNull());
        addMetadata(taiteenala, ColumnMetadata.named("Taiteenala").withIndex(2).ofType(Types.INTEGER).withSize(10));
    }
    
}
