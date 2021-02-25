package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QServers is a Querydsl query type for QServers
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QServers extends com.querydsl.sql.RelationalPathBase<QServers> {

    private static final long serialVersionUID = 1706771;

    public static final QServers servers = new QServers("servers");

    public final StringPath catalog = createString("catalog");

    public final StringPath collationName = createString("collationName");

    public final NumberPath<Integer> connectTimeout = createNumber("connectTimeout", Integer.class);

    public final StringPath dataSource = createString("dataSource");

    public final BooleanPath isCollationCompatible = createBoolean("isCollationCompatible");

    public final BooleanPath isDataAccessEnabled = createBoolean("isDataAccessEnabled");

    public final BooleanPath isDistributor = createBoolean("isDistributor");

    public final BooleanPath isLinked = createBoolean("isLinked");

    public final BooleanPath isNonsqlSubscriber = createBoolean("isNonsqlSubscriber");

    public final BooleanPath isPublisher = createBoolean("isPublisher");

    public final BooleanPath isRemoteLoginEnabled = createBoolean("isRemoteLoginEnabled");

    public final BooleanPath isRemoteProcTransactionPromotionEnabled = createBoolean("isRemoteProcTransactionPromotionEnabled");

    public final BooleanPath isRpcOutEnabled = createBoolean("isRpcOutEnabled");

    public final BooleanPath isSubscriber = createBoolean("isSubscriber");

    public final BooleanPath isSystem = createBoolean("isSystem");

    public final BooleanPath lazySchemaValidation = createBoolean("lazySchemaValidation");

    public final StringPath location = createString("location");

    public final DateTimePath<java.sql.Timestamp> modifyDate = createDateTime("modifyDate", java.sql.Timestamp.class);

    public final StringPath name = createString("name");

    public final StringPath product = createString("product");

    public final StringPath provider = createString("provider");

    public final StringPath providerString = createString("providerString");

    public final NumberPath<Integer> queryTimeout = createNumber("queryTimeout", Integer.class);

    public final NumberPath<Integer> serverId = createNumber("serverId", Integer.class);

    public final BooleanPath usesRemoteCollation = createBoolean("usesRemoteCollation");

    public QServers(String variable) {
        super(QServers.class, forVariable(variable), "sys", "servers");
        addMetadata();
    }

    public QServers(String variable, String schema, String table) {
        super(QServers.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QServers(Path<? extends QServers> path) {
        super(path.getType(), path.getMetadata(), "sys", "servers");
        addMetadata();
    }

    public QServers(PathMetadata metadata) {
        super(QServers.class, metadata, "sys", "servers");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(catalog, ColumnMetadata.named("catalog").withIndex(8).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(collationName, ColumnMetadata.named("collation_name").withIndex(17).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(connectTimeout, ColumnMetadata.named("connect_timeout").withIndex(9).ofType(Types.INTEGER).withSize(10));
        addMetadata(dataSource, ColumnMetadata.named("data_source").withIndex(5).ofType(Types.NVARCHAR).withSize(4000));
        addMetadata(isCollationCompatible, ColumnMetadata.named("is_collation_compatible").withIndex(15).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isDataAccessEnabled, ColumnMetadata.named("is_data_access_enabled").withIndex(14).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isDistributor, ColumnMetadata.named("is_distributor").withIndex(22).ofType(Types.BIT).withSize(1));
        addMetadata(isLinked, ColumnMetadata.named("is_linked").withIndex(11).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isNonsqlSubscriber, ColumnMetadata.named("is_nonsql_subscriber").withIndex(23).ofType(Types.BIT).withSize(1));
        addMetadata(isPublisher, ColumnMetadata.named("is_publisher").withIndex(20).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isRemoteLoginEnabled, ColumnMetadata.named("is_remote_login_enabled").withIndex(12).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isRemoteProcTransactionPromotionEnabled, ColumnMetadata.named("is_remote_proc_transaction_promotion_enabled").withIndex(24).ofType(Types.BIT).withSize(1));
        addMetadata(isRpcOutEnabled, ColumnMetadata.named("is_rpc_out_enabled").withIndex(13).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isSubscriber, ColumnMetadata.named("is_subscriber").withIndex(21).ofType(Types.BIT).withSize(1));
        addMetadata(isSystem, ColumnMetadata.named("is_system").withIndex(19).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(lazySchemaValidation, ColumnMetadata.named("lazy_schema_validation").withIndex(18).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(location, ColumnMetadata.named("location").withIndex(6).ofType(Types.NVARCHAR).withSize(4000));
        addMetadata(modifyDate, ColumnMetadata.named("modify_date").withIndex(25).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(product, ColumnMetadata.named("product").withIndex(3).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(provider, ColumnMetadata.named("provider").withIndex(4).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(providerString, ColumnMetadata.named("provider_string").withIndex(7).ofType(Types.NVARCHAR).withSize(4000));
        addMetadata(queryTimeout, ColumnMetadata.named("query_timeout").withIndex(10).ofType(Types.INTEGER).withSize(10));
        addMetadata(serverId, ColumnMetadata.named("server_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(usesRemoteCollation, ColumnMetadata.named("uses_remote_collation").withIndex(16).ofType(Types.BIT).withSize(1).notNull());
    }

}

