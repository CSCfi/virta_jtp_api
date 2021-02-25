package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QBackupDevices is a Querydsl query type for QBackupDevices
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QBackupDevices extends com.querydsl.sql.RelationalPathBase<QBackupDevices> {

    private static final long serialVersionUID = 427627518;

    public static final QBackupDevices backupDevices = new QBackupDevices("backup_devices");

    public final StringPath name = createString("name");

    public final StringPath physicalName = createString("physicalName");

    public final NumberPath<Byte> type = createNumber("type", Byte.class);

    public final StringPath typeDesc = createString("typeDesc");

    public QBackupDevices(String variable) {
        super(QBackupDevices.class, forVariable(variable), "sys", "backup_devices");
        addMetadata();
    }

    public QBackupDevices(String variable, String schema, String table) {
        super(QBackupDevices.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QBackupDevices(Path<? extends QBackupDevices> path) {
        super(path.getType(), path.getMetadata(), "sys", "backup_devices");
        addMetadata();
    }

    public QBackupDevices(PathMetadata metadata) {
        super(QBackupDevices.class, metadata, "sys", "backup_devices");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(physicalName, ColumnMetadata.named("physical_name").withIndex(4).ofType(Types.NVARCHAR).withSize(260));
        addMetadata(type, ColumnMetadata.named("type").withIndex(2).ofType(Types.TINYINT).withSize(3));
        addMetadata(typeDesc, ColumnMetadata.named("type_desc").withIndex(3).ofType(Types.NVARCHAR).withSize(60));
    }

}

