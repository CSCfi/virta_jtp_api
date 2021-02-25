package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QIsbn is a Querydsl query type for QIsbn
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QIsbn extends com.querydsl.sql.RelationalPathBase<QIsbn> {

    private static final long serialVersionUID = 771312723;

    public static final QIsbn isbn1 = new QIsbn("ISBN");

    public final StringPath isbn = createString("isbn");

    public final NumberPath<Long> isbnid = createNumber("isbnid", Long.class);

    public final NumberPath<Long> julkaisuID = createNumber("julkaisuID", Long.class);

    public final StringPath luoja = createString("luoja");

    public final DateTimePath<java.sql.Timestamp> luontipaivamaara = createDateTime("luontipaivamaara", java.sql.Timestamp.class);

    public final StringPath paivittaja = createString("paivittaja");

    public final DateTimePath<java.sql.Timestamp> paivityspaivamaara = createDateTime("paivityspaivamaara", java.sql.Timestamp.class);

    public final com.querydsl.sql.PrimaryKey<QIsbn> isbnIsbnidPk = createPrimaryKey(isbnid);

    public final com.querydsl.sql.ForeignKey<QJulkaisut> iSBNJulkaisuFK = createForeignKey(julkaisuID, "JulkaisuID");

    public QIsbn(String variable) {
        super(QIsbn.class, forVariable(variable), "dbo", "ISBN");
        addMetadata();
    }

    public QIsbn(String variable, String schema, String table) {
        super(QIsbn.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QIsbn(Path<? extends QIsbn> path) {
        super(path.getType(), path.getMetadata(), "dbo", "ISBN");
        addMetadata();
    }

    public QIsbn(PathMetadata metadata) {
        super(QIsbn.class, metadata, "dbo", "ISBN");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(isbn, ColumnMetadata.named("ISBN").withIndex(3).ofType(Types.NVARCHAR).withSize(100));
        addMetadata(isbnid, ColumnMetadata.named("ISBNID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(julkaisuID, ColumnMetadata.named("JulkaisuID").withIndex(2).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(luoja, ColumnMetadata.named("Luoja").withIndex(4).ofType(Types.NVARCHAR).withSize(30).notNull());
        addMetadata(luontipaivamaara, ColumnMetadata.named("Luontipaivamaara").withIndex(5).ofType(Types.TIMESTAMP).withSize(24).withDigits(4).notNull());
        addMetadata(paivittaja, ColumnMetadata.named("Paivittaja").withIndex(6).ofType(Types.NVARCHAR).withSize(30));
        addMetadata(paivityspaivamaara, ColumnMetadata.named("Paivityspaivamaara").withIndex(7).ofType(Types.TIMESTAMP).withSize(24).withDigits(4));
    }

}

