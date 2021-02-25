package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSysservers is a Querydsl query type for QSysservers
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSysservers extends com.querydsl.sql.RelationalPathBase<QSysservers> {

    private static final long serialVersionUID = 892913088;

    public static final QSysservers sysservers = new QSysservers("sysservers");

    public final StringPath catalog = createString("catalog");

    public final StringPath collation = createString("collation");

    public final BooleanPath collationcompatible = createBoolean("collationcompatible");

    public final NumberPath<Integer> connecttimeout = createNumber("connecttimeout", Integer.class);

    public final BooleanPath dataaccess = createBoolean("dataaccess");

    public final StringPath datasource = createString("datasource");

    public final BooleanPath dist = createBoolean("dist");

    public final BooleanPath dpub = createBoolean("dpub");

    public final BooleanPath isremote = createBoolean("isremote");

    public final BooleanPath lazyschemavalidation = createBoolean("lazyschemavalidation");

    public final StringPath location = createString("location");

    public final BooleanPath nonsqlsub = createBoolean("nonsqlsub");

    public final StringPath providername = createString("providername");

    public final StringPath providerstring = createString("providerstring");

    public final BooleanPath pub = createBoolean("pub");

    public final NumberPath<Integer> querytimeout = createNumber("querytimeout", Integer.class);

    public final BooleanPath rpc = createBoolean("rpc");

    public final BooleanPath rpcout = createBoolean("rpcout");

    public final DateTimePath<java.sql.Timestamp> schemadate = createDateTime("schemadate", java.sql.Timestamp.class);

    public final StringPath srvcollation = createString("srvcollation");

    public final NumberPath<Short> srvid = createNumber("srvid", Short.class);

    public final StringPath srvname = createString("srvname");

    public final StringPath srvnetname = createString("srvnetname");

    public final StringPath srvproduct = createString("srvproduct");

    public final NumberPath<Short> srvstatus = createNumber("srvstatus", Short.class);

    public final BooleanPath sub = createBoolean("sub");

    public final BooleanPath system = createBoolean("system");

    public final NumberPath<Integer> topologyx = createNumber("topologyx", Integer.class);

    public final NumberPath<Integer> topologyy = createNumber("topologyy", Integer.class);

    public final BooleanPath useremotecollation = createBoolean("useremotecollation");

    public QSysservers(String variable) {
        super(QSysservers.class, forVariable(variable), "sys", "sysservers");
        addMetadata();
    }

    public QSysservers(String variable, String schema, String table) {
        super(QSysservers.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSysservers(Path<? extends QSysservers> path) {
        super(path.getType(), path.getMetadata(), "sys", "sysservers");
        addMetadata();
    }

    public QSysservers(PathMetadata metadata) {
        super(QSysservers.class, metadata, "sys", "sysservers");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(catalog, ColumnMetadata.named("catalog").withIndex(12).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(collation, ColumnMetadata.named("collation").withIndex(29).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(collationcompatible, ColumnMetadata.named("collationcompatible").withIndex(25).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(connecttimeout, ColumnMetadata.named("connecttimeout").withIndex(14).ofType(Types.INTEGER).withSize(10));
        addMetadata(dataaccess, ColumnMetadata.named("dataaccess").withIndex(24).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(datasource, ColumnMetadata.named("datasource").withIndex(6).ofType(Types.NVARCHAR).withSize(4000));
        addMetadata(dist, ColumnMetadata.named("dist").withIndex(21).ofType(Types.BIT).withSize(1));
        addMetadata(dpub, ColumnMetadata.named("dpub").withIndex(22).ofType(Types.BIT).withSize(1));
        addMetadata(isremote, ColumnMetadata.named("isremote").withIndex(17).ofType(Types.BIT).withSize(1));
        addMetadata(lazyschemavalidation, ColumnMetadata.named("lazyschemavalidation").withIndex(28).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(location, ColumnMetadata.named("location").withIndex(7).ofType(Types.NVARCHAR).withSize(4000));
        addMetadata(nonsqlsub, ColumnMetadata.named("nonsqlsub").withIndex(30).ofType(Types.BIT).withSize(1));
        addMetadata(providername, ColumnMetadata.named("providername").withIndex(5).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(providerstring, ColumnMetadata.named("providerstring").withIndex(8).ofType(Types.NVARCHAR).withSize(4000));
        addMetadata(pub, ColumnMetadata.named("pub").withIndex(19).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(querytimeout, ColumnMetadata.named("querytimeout").withIndex(15).ofType(Types.INTEGER).withSize(10));
        addMetadata(rpc, ColumnMetadata.named("rpc").withIndex(18).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(rpcout, ColumnMetadata.named("rpcout").withIndex(23).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(schemadate, ColumnMetadata.named("schemadate").withIndex(9).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(srvcollation, ColumnMetadata.named("srvcollation").withIndex(13).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(srvid, ColumnMetadata.named("srvid").withIndex(1).ofType(Types.SMALLINT).withSize(5));
        addMetadata(srvname, ColumnMetadata.named("srvname").withIndex(3).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(srvnetname, ColumnMetadata.named("srvnetname").withIndex(16).ofType(Types.CHAR).withSize(30));
        addMetadata(srvproduct, ColumnMetadata.named("srvproduct").withIndex(4).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(srvstatus, ColumnMetadata.named("srvstatus").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(sub, ColumnMetadata.named("sub").withIndex(20).ofType(Types.BIT).withSize(1));
        addMetadata(system, ColumnMetadata.named("system").withIndex(26).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(topologyx, ColumnMetadata.named("topologyx").withIndex(10).ofType(Types.INTEGER).withSize(10));
        addMetadata(topologyy, ColumnMetadata.named("topologyy").withIndex(11).ofType(Types.INTEGER).withSize(10));
        addMetadata(useremotecollation, ColumnMetadata.named("useremotecollation").withIndex(27).ofType(Types.BIT).withSize(1).notNull());
    }

}

