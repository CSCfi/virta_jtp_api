package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmIoClusterSharedDrives is a Querydsl query type for QDmIoClusterSharedDrives
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmIoClusterSharedDrives extends com.querydsl.sql.RelationalPathBase<QDmIoClusterSharedDrives> {

    private static final long serialVersionUID = 482528124;

    public static final QDmIoClusterSharedDrives dmIoClusterSharedDrives = new QDmIoClusterSharedDrives("dm_io_cluster_shared_drives");

    public final StringPath driveName = createString("driveName");

    public QDmIoClusterSharedDrives(String variable) {
        super(QDmIoClusterSharedDrives.class, forVariable(variable), "sys", "dm_io_cluster_shared_drives");
        addMetadata();
    }

    public QDmIoClusterSharedDrives(String variable, String schema, String table) {
        super(QDmIoClusterSharedDrives.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmIoClusterSharedDrives(Path<? extends QDmIoClusterSharedDrives> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_io_cluster_shared_drives");
        addMetadata();
    }

    public QDmIoClusterSharedDrives(PathMetadata metadata) {
        super(QDmIoClusterSharedDrives.class, metadata, "sys", "dm_io_cluster_shared_drives");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(driveName, ColumnMetadata.named("DriveName").withIndex(1).ofType(Types.NCHAR).withSize(1));
    }

}

