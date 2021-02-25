package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmHadrAutoPageRepair is a Querydsl query type for QDmHadrAutoPageRepair
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmHadrAutoPageRepair extends com.querydsl.sql.RelationalPathBase<QDmHadrAutoPageRepair> {

    private static final long serialVersionUID = -1847129864;

    public static final QDmHadrAutoPageRepair dmHadrAutoPageRepair = new QDmHadrAutoPageRepair("dm_hadr_auto_page_repair");

    public final NumberPath<Integer> databaseId = createNumber("databaseId", Integer.class);

    public final NumberPath<Short> errorType = createNumber("errorType", Short.class);

    public final NumberPath<Integer> fileId = createNumber("fileId", Integer.class);

    public final DateTimePath<java.sql.Timestamp> modificationTime = createDateTime("modificationTime", java.sql.Timestamp.class);

    public final NumberPath<Long> pageId = createNumber("pageId", Long.class);

    public final NumberPath<Byte> pageStatus = createNumber("pageStatus", Byte.class);

    public QDmHadrAutoPageRepair(String variable) {
        super(QDmHadrAutoPageRepair.class, forVariable(variable), "sys", "dm_hadr_auto_page_repair");
        addMetadata();
    }

    public QDmHadrAutoPageRepair(String variable, String schema, String table) {
        super(QDmHadrAutoPageRepair.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmHadrAutoPageRepair(Path<? extends QDmHadrAutoPageRepair> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_hadr_auto_page_repair");
        addMetadata();
    }

    public QDmHadrAutoPageRepair(PathMetadata metadata) {
        super(QDmHadrAutoPageRepair.class, metadata, "sys", "dm_hadr_auto_page_repair");
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

