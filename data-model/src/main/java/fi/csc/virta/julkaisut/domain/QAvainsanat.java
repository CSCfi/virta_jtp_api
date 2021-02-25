package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAvainsanat is a Querydsl query type for QAvainsanat
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAvainsanat extends com.querydsl.sql.RelationalPathBase<QAvainsanat> {

    private static final long serialVersionUID = -70363809;

    public static final QAvainsanat Avainsanat = new QAvainsanat("Avainsanat");

    public final NumberPath<Long> avainsanaID = createNumber("avainsanaID", Long.class);

    public final NumberPath<Long> julkaisuID = createNumber("julkaisuID", Long.class);

    public final StringPath luoja = createString("luoja");

    public final DateTimePath<java.sql.Timestamp> luontipaivamaara = createDateTime("luontipaivamaara", java.sql.Timestamp.class);

    public final StringPath paivittaja = createString("paivittaja");

    public final DateTimePath<java.sql.Timestamp> paivityspaivamaara = createDateTime("paivityspaivamaara", java.sql.Timestamp.class);

    public final StringPath sana = createString("sana");

    public final com.querydsl.sql.PrimaryKey<QAvainsanat> avainsanatAvainsanaIDPK = createPrimaryKey(avainsanaID);

    public final com.querydsl.sql.ForeignKey<QJulkaisut> avainsanatJulkaisuFK = createForeignKey(julkaisuID, "JulkaisuID");

    public QAvainsanat(String variable) {
        super(QAvainsanat.class, forVariable(variable), "dbo", "Avainsanat");
        addMetadata();
    }

    public QAvainsanat(String variable, String schema, String table) {
        super(QAvainsanat.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAvainsanat(Path<? extends QAvainsanat> path) {
        super(path.getType(), path.getMetadata(), "dbo", "Avainsanat");
        addMetadata();
    }

    public QAvainsanat(PathMetadata metadata) {
        super(QAvainsanat.class, metadata, "dbo", "Avainsanat");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(avainsanaID, ColumnMetadata.named("AvainsanaID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(julkaisuID, ColumnMetadata.named("JulkaisuID").withIndex(2).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(luoja, ColumnMetadata.named("Luoja").withIndex(4).ofType(Types.NVARCHAR).withSize(30).notNull());
        addMetadata(luontipaivamaara, ColumnMetadata.named("Luontipaivamaara").withIndex(5).ofType(Types.TIMESTAMP).withSize(24).withDigits(4).notNull());
        addMetadata(paivittaja, ColumnMetadata.named("Paivittaja").withIndex(6).ofType(Types.NVARCHAR).withSize(30));
        addMetadata(paivityspaivamaara, ColumnMetadata.named("Paivityspaivamaara").withIndex(7).ofType(Types.TIMESTAMP).withSize(24).withDigits(4));
        addMetadata(sana, ColumnMetadata.named("Sana").withIndex(3).ofType(Types.NVARCHAR).withSize(100));
    }

}

