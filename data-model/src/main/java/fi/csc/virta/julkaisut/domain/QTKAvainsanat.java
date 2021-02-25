package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTKAvainsanat is a Querydsl query type for QTKAvainsanat
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTKAvainsanat extends com.querydsl.sql.RelationalPathBase<QTKAvainsanat> {

    private static final long serialVersionUID = -1901655082;

    public static final QTKAvainsanat TKAvainsanat = new QTKAvainsanat("TK_Avainsanat");

    public final StringPath avainsana = createString("avainsana");

    public final StringPath julkaisunTunnus = createString("julkaisunTunnus");

    public final StringPath latausID = createString("latausID");

    public QTKAvainsanat(String variable) {
        super(QTKAvainsanat.class, forVariable(variable), "web", "TK_Avainsanat");
        addMetadata();
    }

    public QTKAvainsanat(String variable, String schema, String table) {
        super(QTKAvainsanat.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTKAvainsanat(Path<? extends QTKAvainsanat> path) {
        super(path.getType(), path.getMetadata(), "web", "TK_Avainsanat");
        addMetadata();
    }

    public QTKAvainsanat(PathMetadata metadata) {
        super(QTKAvainsanat.class, metadata, "web", "TK_Avainsanat");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(avainsana, ColumnMetadata.named("Avainsana").withIndex(2).ofType(Types.NVARCHAR).withSize(100));
        addMetadata(julkaisunTunnus, ColumnMetadata.named("JulkaisunTunnus").withIndex(1).ofType(Types.NVARCHAR).withSize(500).notNull());
        addMetadata(latausID, ColumnMetadata.named("Lataus_ID").withIndex(3).ofType(Types.NVARCHAR).withSize(255).notNull());
    }

}

