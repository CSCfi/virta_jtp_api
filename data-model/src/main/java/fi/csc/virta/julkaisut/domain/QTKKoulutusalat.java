package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTKKoulutusalat is a Querydsl query type for QTKKoulutusalat
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTKKoulutusalat extends com.querydsl.sql.RelationalPathBase<QTKKoulutusalat> {

    private static final long serialVersionUID = -1128076886;

    public static final QTKKoulutusalat TKKoulutusalat = new QTKKoulutusalat("TK_Koulutusalat");

    public final NumberPath<Integer> jNro = createNumber("jNro", Integer.class);

    public final StringPath julkaisunTunnus = createString("julkaisunTunnus");

    public final NumberPath<Integer> koulutusala = createNumber("koulutusala", Integer.class);

    public final StringPath latausID = createString("latausID");

    public QTKKoulutusalat(String variable) {
        super(QTKKoulutusalat.class, forVariable(variable), "web", "TK_Koulutusalat");
        addMetadata();
    }

    public QTKKoulutusalat(String variable, String schema, String table) {
        super(QTKKoulutusalat.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTKKoulutusalat(Path<? extends QTKKoulutusalat> path) {
        super(path.getType(), path.getMetadata(), "web", "TK_Koulutusalat");
        addMetadata();
    }

    public QTKKoulutusalat(PathMetadata metadata) {
        super(QTKKoulutusalat.class, metadata, "web", "TK_Koulutusalat");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(jNro, ColumnMetadata.named("JNro").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(julkaisunTunnus, ColumnMetadata.named("JulkaisunTunnus").withIndex(1).ofType(Types.NVARCHAR).withSize(500).notNull());
        addMetadata(koulutusala, ColumnMetadata.named("Koulutusala").withIndex(2).ofType(Types.INTEGER).withSize(10));
        addMetadata(latausID, ColumnMetadata.named("Lataus_ID").withIndex(4).ofType(Types.NVARCHAR).withSize(255).notNull());
    }

}

