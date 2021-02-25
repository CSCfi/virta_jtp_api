package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTkIsbn is a Querydsl query type for QTkIsbn
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTkIsbn extends com.querydsl.sql.RelationalPathBase<QTkIsbn> {

    private static final long serialVersionUID = -1491019734;

    public static final QTkIsbn tkIsbn = new QTkIsbn("TK_ISBN");

    public final StringPath isbn = createString("isbn");

    public final StringPath julkaisunTunnus = createString("julkaisunTunnus");

    public final StringPath latausID = createString("latausID");

    public QTkIsbn(String variable) {
        super(QTkIsbn.class, forVariable(variable), "web", "TK_ISBN");
        addMetadata();
    }

    public QTkIsbn(String variable, String schema, String table) {
        super(QTkIsbn.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTkIsbn(Path<? extends QTkIsbn> path) {
        super(path.getType(), path.getMetadata(), "web", "TK_ISBN");
        addMetadata();
    }

    public QTkIsbn(PathMetadata metadata) {
        super(QTkIsbn.class, metadata, "web", "TK_ISBN");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(isbn, ColumnMetadata.named("ISBN").withIndex(2).ofType(Types.NVARCHAR).withSize(100));
        addMetadata(julkaisunTunnus, ColumnMetadata.named("JulkaisunTunnus").withIndex(1).ofType(Types.NVARCHAR).withSize(500).notNull());
        addMetadata(latausID, ColumnMetadata.named("Lataus_ID").withIndex(3).ofType(Types.NVARCHAR).withSize(255).notNull());
    }

}

