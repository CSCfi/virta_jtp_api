package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmServerMemoryDumps is a Querydsl query type for QDmServerMemoryDumps
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmServerMemoryDumps extends com.querydsl.sql.RelationalPathBase<QDmServerMemoryDumps> {

    private static final long serialVersionUID = -2038920011;

    public static final QDmServerMemoryDumps dmServerMemoryDumps = new QDmServerMemoryDumps("dm_server_memory_dumps");

    public final SimplePath<Object> creationTime = createSimple("creationTime", Object.class);

    public final StringPath filename = createString("filename");

    public final NumberPath<Long> sizeInBytes = createNumber("sizeInBytes", Long.class);

    public QDmServerMemoryDumps(String variable) {
        super(QDmServerMemoryDumps.class, forVariable(variable), "sys", "dm_server_memory_dumps");
        addMetadata();
    }

    public QDmServerMemoryDumps(String variable, String schema, String table) {
        super(QDmServerMemoryDumps.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmServerMemoryDumps(Path<? extends QDmServerMemoryDumps> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_server_memory_dumps");
        addMetadata();
    }

    public QDmServerMemoryDumps(PathMetadata metadata) {
        super(QDmServerMemoryDumps.class, metadata, "sys", "dm_server_memory_dumps");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(creationTime, ColumnMetadata.named("creation_time").withIndex(2).ofType(-155).withSize(34).withDigits(7).notNull());
        addMetadata(filename, ColumnMetadata.named("filename").withIndex(1).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(sizeInBytes, ColumnMetadata.named("size_in_bytes").withIndex(3).ofType(Types.BIGINT).withSize(19));
    }

}

