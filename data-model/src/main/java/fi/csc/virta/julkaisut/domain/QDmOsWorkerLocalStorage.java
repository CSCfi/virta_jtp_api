package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmOsWorkerLocalStorage is a Querydsl query type for QDmOsWorkerLocalStorage
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmOsWorkerLocalStorage extends com.querydsl.sql.RelationalPathBase<QDmOsWorkerLocalStorage> {

    private static final long serialVersionUID = -1946383752;

    public static final QDmOsWorkerLocalStorage dmOsWorkerLocalStorage = new QDmOsWorkerLocalStorage("dm_os_worker_local_storage");

    public final SimplePath<byte[]> brokerAddress = createSimple("brokerAddress", byte[].class);

    public final SimplePath<byte[]> compExecCtxtAddress = createSimple("compExecCtxtAddress", byte[].class);

    public final SimplePath<byte[]> diagAddress = createSimple("diagAddress", byte[].class);

    public final SimplePath<byte[]> ecAddress = createSimple("ecAddress", byte[].class);

    public final SimplePath<byte[]> federatedxactAddress = createSimple("federatedxactAddress", byte[].class);

    public final SimplePath<byte[]> filestreamAddress = createSimple("filestreamAddress", byte[].class);

    public final SimplePath<byte[]> hostTaskAddress = createSimple("hostTaskAddress", byte[].class);

    public final SimplePath<byte[]> msqlxactAddress = createSimple("msqlxactAddress", byte[].class);

    public final SimplePath<byte[]> qeCcAddress = createSimple("qeCcAddress", byte[].class);

    public final SimplePath<byte[]> queryDriverAddress = createSimple("queryDriverAddress", byte[].class);

    public final SimplePath<byte[]> queryscanAddress = createSimple("queryscanAddress", byte[].class);

    public final SimplePath<byte[]> sniErrorAddress = createSimple("sniErrorAddress", byte[].class);

    public final SimplePath<byte[]> sqlProfAddress = createSimple("sqlProfAddress", byte[].class);

    public final SimplePath<byte[]> stackCheckerAddress = createSimple("stackCheckerAddress", byte[].class);

    public final SimplePath<byte[]> taskProxyAddress = createSimple("taskProxyAddress", byte[].class);

    public final SimplePath<byte[]> workerAddress = createSimple("workerAddress", byte[].class);

    public QDmOsWorkerLocalStorage(String variable) {
        super(QDmOsWorkerLocalStorage.class, forVariable(variable), "sys", "dm_os_worker_local_storage");
        addMetadata();
    }

    public QDmOsWorkerLocalStorage(String variable, String schema, String table) {
        super(QDmOsWorkerLocalStorage.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmOsWorkerLocalStorage(Path<? extends QDmOsWorkerLocalStorage> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_os_worker_local_storage");
        addMetadata();
    }

    public QDmOsWorkerLocalStorage(PathMetadata metadata) {
        super(QDmOsWorkerLocalStorage.class, metadata, "sys", "dm_os_worker_local_storage");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(brokerAddress, ColumnMetadata.named("broker_address").withIndex(4).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(compExecCtxtAddress, ColumnMetadata.named("comp_exec_ctxt_address").withIndex(2).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(diagAddress, ColumnMetadata.named("diag_address").withIndex(12).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(ecAddress, ColumnMetadata.named("ec_address").withIndex(3).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(federatedxactAddress, ColumnMetadata.named("federatedxact_address").withIndex(14).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(filestreamAddress, ColumnMetadata.named("filestream_address").withIndex(15).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(hostTaskAddress, ColumnMetadata.named("host_task_address").withIndex(9).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(msqlxactAddress, ColumnMetadata.named("msqlxact_address").withIndex(6).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(qeCcAddress, ColumnMetadata.named("qe_cc_address").withIndex(16).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(queryDriverAddress, ColumnMetadata.named("query_driver_address").withIndex(13).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(queryscanAddress, ColumnMetadata.named("queryscan_address").withIndex(11).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(sniErrorAddress, ColumnMetadata.named("sni_error_address").withIndex(10).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(sqlProfAddress, ColumnMetadata.named("sql_prof_address").withIndex(7).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(stackCheckerAddress, ColumnMetadata.named("stack_checker_address").withIndex(8).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(taskProxyAddress, ColumnMetadata.named("task_proxy_address").withIndex(5).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(workerAddress, ColumnMetadata.named("worker_address").withIndex(1).ofType(Types.VARBINARY).withSize(8).notNull());
    }

}

