package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSyslanguages is a Querydsl query type for QSyslanguages
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSyslanguages extends com.querydsl.sql.RelationalPathBase<QSyslanguages> {

    private static final long serialVersionUID = 811767883;

    public static final QSyslanguages syslanguages = new QSyslanguages("syslanguages");

    public final StringPath alias = createString("alias");

    public final NumberPath<Byte> datefirst = createNumber("datefirst", Byte.class);

    public final StringPath dateformat = createString("dateformat");

    public final StringPath days = createString("days");

    public final NumberPath<Short> langid = createNumber("langid", Short.class);

    public final NumberPath<Integer> lcid = createNumber("lcid", Integer.class);

    public final StringPath months = createString("months");

    public final NumberPath<Short> msglangid = createNumber("msglangid", Short.class);

    public final StringPath name = createString("name");

    public final StringPath shortmonths = createString("shortmonths");

    public final NumberPath<Integer> upgrade = createNumber("upgrade", Integer.class);

    public QSyslanguages(String variable) {
        super(QSyslanguages.class, forVariable(variable), "sys", "syslanguages");
        addMetadata();
    }

    public QSyslanguages(String variable, String schema, String table) {
        super(QSyslanguages.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSyslanguages(Path<? extends QSyslanguages> path) {
        super(path.getType(), path.getMetadata(), "sys", "syslanguages");
        addMetadata();
    }

    public QSyslanguages(PathMetadata metadata) {
        super(QSyslanguages.class, metadata, "sys", "syslanguages");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(alias, ColumnMetadata.named("alias").withIndex(6).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(datefirst, ColumnMetadata.named("datefirst").withIndex(3).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(dateformat, ColumnMetadata.named("dateformat").withIndex(2).ofType(Types.NCHAR).withSize(3).notNull());
        addMetadata(days, ColumnMetadata.named("days").withIndex(9).ofType(Types.NVARCHAR).withSize(217));
        addMetadata(langid, ColumnMetadata.named("langid").withIndex(1).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(lcid, ColumnMetadata.named("lcid").withIndex(10).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(months, ColumnMetadata.named("months").withIndex(7).ofType(Types.NVARCHAR).withSize(372));
        addMetadata(msglangid, ColumnMetadata.named("msglangid").withIndex(11).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(5).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(shortmonths, ColumnMetadata.named("shortmonths").withIndex(8).ofType(Types.NVARCHAR).withSize(132));
        addMetadata(upgrade, ColumnMetadata.named("upgrade").withIndex(4).ofType(Types.INTEGER).withSize(10));
    }

}

