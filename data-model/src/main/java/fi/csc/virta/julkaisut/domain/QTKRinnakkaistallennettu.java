package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTKRinnakkaistallennettu is a Querydsl query type for QTKRinnakkaistallennettu
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTKRinnakkaistallennettu extends com.querydsl.sql.RelationalPathBase<QTKRinnakkaistallennettu> {

    private static final long serialVersionUID = 1487288883;

    public static final QTKRinnakkaistallennettu TKRinnakkaistallennettu = new QTKRinnakkaistallennettu("TK_Rinnakkaistallennettu");

    public final StringPath julkaisunTunnus = createString("julkaisunTunnus");

    public final StringPath latausID = createString("latausID");

    public final StringPath rinnakkaistallennettuOsoite = createString("rinnakkaistallennettuOsoite");

    public QTKRinnakkaistallennettu(String variable) {
        super(QTKRinnakkaistallennettu.class, forVariable(variable), "dbo", "TK_Rinnakkaistallennettu");
        addMetadata();
    }

    public QTKRinnakkaistallennettu(String variable, String schema, String table) {
        super(QTKRinnakkaistallennettu.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTKRinnakkaistallennettu(Path<? extends QTKRinnakkaistallennettu> path) {
        super(path.getType(), path.getMetadata(), "dbo", "TK_Rinnakkaistallennettu");
        addMetadata();
    }

    public QTKRinnakkaistallennettu(PathMetadata metadata) {
        super(QTKRinnakkaistallennettu.class, metadata, "dbo", "TK_Rinnakkaistallennettu");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(julkaisunTunnus, ColumnMetadata.named("JulkaisunTunnus").withIndex(1).ofType(Types.NVARCHAR).withSize(500).notNull());
        addMetadata(latausID, ColumnMetadata.named("Lataus_ID").withIndex(3).ofType(Types.NVARCHAR).withSize(255).notNull());
        addMetadata(rinnakkaistallennettuOsoite, ColumnMetadata.named("RinnakkaistallennettuOsoite").withIndex(2).ofType(Types.NVARCHAR).withSize(400));
    }

}

