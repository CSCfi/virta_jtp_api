package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSysobjects is a Querydsl query type for QSysobjects
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSysobjects extends com.querydsl.sql.RelationalPathBase<QSysobjects> {

    private static final long serialVersionUID = 1544081732;

    public static final QSysobjects sysobjects = new QSysobjects("sysobjects");

    public final NumberPath<Integer> baseSchemaVer = createNumber("baseSchemaVer", Integer.class);

    public final NumberPath<Short> cache = createNumber("cache", Short.class);

    public final NumberPath<Integer> category = createNumber("category", Integer.class);

    public final DateTimePath<java.sql.Timestamp> crdate = createDateTime("crdate", java.sql.Timestamp.class);

    public final NumberPath<Integer> deltrig = createNumber("deltrig", Integer.class);

    public final NumberPath<Short> ftcatid = createNumber("ftcatid", Short.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Short> indexdel = createNumber("indexdel", Short.class);

    public final NumberPath<Short> info = createNumber("info", Short.class);

    public final NumberPath<Integer> instrig = createNumber("instrig", Integer.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> parentObj = createNumber("parentObj", Integer.class);

    public final DateTimePath<java.sql.Timestamp> refdate = createDateTime("refdate", java.sql.Timestamp.class);

    public final NumberPath<Integer> replinfo = createNumber("replinfo", Integer.class);

    public final NumberPath<Integer> schemaVer = createNumber("schemaVer", Integer.class);

    public final NumberPath<Integer> seltrig = createNumber("seltrig", Integer.class);

    public final NumberPath<Integer> statsSchemaVer = createNumber("statsSchemaVer", Integer.class);

    public final NumberPath<Integer> status = createNumber("status", Integer.class);

    public final NumberPath<Short> sysstat = createNumber("sysstat", Short.class);

    public final StringPath type = createString("type");

    public final NumberPath<Short> uid = createNumber("uid", Short.class);

    public final NumberPath<Integer> updtrig = createNumber("updtrig", Integer.class);

    public final NumberPath<Short> userstat = createNumber("userstat", Short.class);

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public final StringPath xtype = createString("xtype");

    public QSysobjects(String variable) {
        super(QSysobjects.class, forVariable(variable), "sys", "sysobjects");
        addMetadata();
    }

    public QSysobjects(String variable, String schema, String table) {
        super(QSysobjects.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSysobjects(Path<? extends QSysobjects> path) {
        super(path.getType(), path.getMetadata(), "sys", "sysobjects");
        addMetadata();
    }

    public QSysobjects(PathMetadata metadata) {
        super(QSysobjects.class, metadata, "sys", "sysobjects");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(baseSchemaVer, ColumnMetadata.named("base_schema_ver").withIndex(7).ofType(Types.INTEGER).withSize(10));
        addMetadata(cache, ColumnMetadata.named("cache").withIndex(25).ofType(Types.SMALLINT).withSize(5));
        addMetadata(category, ColumnMetadata.named("category").withIndex(24).ofType(Types.INTEGER).withSize(10));
        addMetadata(crdate, ColumnMetadata.named("crdate").withIndex(10).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(deltrig, ColumnMetadata.named("deltrig").withIndex(20).ofType(Types.INTEGER).withSize(10));
        addMetadata(ftcatid, ColumnMetadata.named("ftcatid").withIndex(11).ofType(Types.SMALLINT).withSize(5));
        addMetadata(id, ColumnMetadata.named("id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(indexdel, ColumnMetadata.named("indexdel").withIndex(17).ofType(Types.SMALLINT).withSize(5));
        addMetadata(info, ColumnMetadata.named("info").withIndex(5).ofType(Types.SMALLINT).withSize(5));
        addMetadata(instrig, ColumnMetadata.named("instrig").withIndex(21).ofType(Types.INTEGER).withSize(10));
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(parentObj, ColumnMetadata.named("parent_obj").withIndex(9).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(refdate, ColumnMetadata.named("refdate").withIndex(18).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(replinfo, ColumnMetadata.named("replinfo").withIndex(8).ofType(Types.INTEGER).withSize(10));
        addMetadata(schemaVer, ColumnMetadata.named("schema_ver").withIndex(12).ofType(Types.INTEGER).withSize(10));
        addMetadata(seltrig, ColumnMetadata.named("seltrig").withIndex(23).ofType(Types.INTEGER).withSize(10));
        addMetadata(statsSchemaVer, ColumnMetadata.named("stats_schema_ver").withIndex(13).ofType(Types.INTEGER).withSize(10));
        addMetadata(status, ColumnMetadata.named("status").withIndex(6).ofType(Types.INTEGER).withSize(10));
        addMetadata(sysstat, ColumnMetadata.named("sysstat").withIndex(16).ofType(Types.SMALLINT).withSize(5));
        addMetadata(type, ColumnMetadata.named("type").withIndex(14).ofType(Types.CHAR).withSize(2));
        addMetadata(uid, ColumnMetadata.named("uid").withIndex(4).ofType(Types.SMALLINT).withSize(5));
        addMetadata(updtrig, ColumnMetadata.named("updtrig").withIndex(22).ofType(Types.INTEGER).withSize(10));
        addMetadata(userstat, ColumnMetadata.named("userstat").withIndex(15).ofType(Types.SMALLINT).withSize(5));
        addMetadata(version, ColumnMetadata.named("version").withIndex(19).ofType(Types.INTEGER).withSize(10));
        addMetadata(xtype, ColumnMetadata.named("xtype").withIndex(3).ofType(Types.CHAR).withSize(2).notNull());
    }

}

