package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmDbMirroringAutoPageRepair is a Querydsl query type for QDmDbMirroringAutoPageRepair
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmDbMirroringAutoPageRepair extends com.querydsl.sql.RelationalPathBase<QDmDbMirroringAutoPageRepair> {

    private static final long serialVersionUID = 615558090;

    public static final QDmDbMirroringAutoPageRepair dmDbMirroringAutoPageRepair = new QDmDbMirroringAutoPageRepair("dm_db_mirroring_auto_page_repair");

    public final NumberPath<Integer> databaseId = createNumber("databaseId", Integer.class);

    public final NumberPath<Short> errorType = createNumber("errorType", Short.class);

    public final NumberPath<Integer> fileId = createNumber("fileId", Integer.class);

    public final DateTimePath<java.sql.Timestamp> modificationTime = createDateTime("modificationTime", java.sql.Timestamp.class);

    public final NumberPath<Long> pageId = createNumber("pageId", Long.class);

    public final NumberPath<Byte> pageStatus = createNumber("pageStatus", Byte.class);

    public QDmDbMirroringAutoPageRepair(String variable) {
        super(QDmDbMirroringAutoPageRepair.class, forVariable(variable), "sys", "dm_db_mirroring_auto_page_repair");
        addMetadata();
    }

    public QDmDbMirroringAutoPageRepair(String variable, String schema, String table) {
        super(QDmDbMirroringAutoPageRepair.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmDbMirroringAutoPageRepair(Path<? extends QDmDbMirroringAutoPageRepair> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_db_mirroring_auto_page_repair");
        addMetadata();
    }

    public QDmDbMirroringAutoPageRepair(PathMetadata metadata) {
        super(QDmDbMirroringAutoPageRepair.class, metadata, "sys", "dm_db_mirroring_auto_page_repair");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(databaseId, ColumnMetadata.named("database_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(errorType, ColumnMetadata.named("error_type").withIndex(4).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(fileId, ColumnMetadata.named("file_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(modificationTime, ColumnMetadata.named("modification_time").withIndex(6).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(pageId, ColumnMetadata.named("page_id").withIndex(3).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(pageStatus, ColumnMetadata.named("page_status").withIndex(5).ofType(Types.TINYINT).withSize(3).notNull());
    }

}

