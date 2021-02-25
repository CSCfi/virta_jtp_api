package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QJuuliTemp is a Querydsl query type for QJuuliTemp
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QJuuliTemp extends com.querydsl.sql.RelationalPathBase<QJuuliTemp> {

    private static final long serialVersionUID = 926632126;

    public static final QJuuliTemp JuuliTemp = new QJuuliTemp("Juuli_temp");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath julkaisunTunnus = createString("julkaisunTunnus");

    public final StringPath juuliID = createString("juuliID");

    public final StringPath luoja = createString("luoja");

    public final DateTimePath<java.sql.Timestamp> luontipaivamaara = createDateTime("luontipaivamaara", java.sql.Timestamp.class);

    public final StringPath paivittaja = createString("paivittaja");

    public final DateTimePath<java.sql.Timestamp> paivityspaivamaara = createDateTime("paivityspaivamaara", java.sql.Timestamp.class);

    public final com.querydsl.sql.PrimaryKey<QJuuliTemp> juuliTempPK = createPrimaryKey(id);

    public QJuuliTemp(String variable) {
        super(QJuuliTemp.class, forVariable(variable), "web", "Juuli_temp");
        addMetadata();
    }

    public QJuuliTemp(String variable, String schema, String table) {
        super(QJuuliTemp.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJuuliTemp(Path<? extends QJuuliTemp> path) {
        super(path.getType(), path.getMetadata(), "web", "Juuli_temp");
        addMetadata();
    }

    public QJuuliTemp(PathMetadata metadata) {
        super(QJuuliTemp.class, metadata, "web", "Juuli_temp");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(julkaisunTunnus, ColumnMetadata.named("JulkaisunTunnus").withIndex(2).ofType(Types.NVARCHAR).withSize(50).notNull());
        addMetadata(juuliID, ColumnMetadata.named("Juuli-ID").withIndex(3).ofType(Types.NVARCHAR).withSize(400).notNull());
        addMetadata(luoja, ColumnMetadata.named("Luoja").withIndex(4).ofType(Types.NVARCHAR).withSize(30));
        addMetadata(luontipaivamaara, ColumnMetadata.named("Luontipaivamaara").withIndex(5).ofType(Types.TIMESTAMP).withSize(24).withDigits(4).notNull());
        addMetadata(paivittaja, ColumnMetadata.named("Paivittaja").withIndex(6).ofType(Types.NVARCHAR).withSize(30));
        addMetadata(paivityspaivamaara, ColumnMetadata.named("Paivityspaivamaara").withIndex(7).ofType(Types.TIMESTAMP).withSize(24).withDigits(4));
    }

}

