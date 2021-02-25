package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSystemInternalsAllocationUnits is a Querydsl query type for QSystemInternalsAllocationUnits
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSystemInternalsAllocationUnits extends com.querydsl.sql.RelationalPathBase<QSystemInternalsAllocationUnits> {

    private static final long serialVersionUID = -322824539;

    public static final QSystemInternalsAllocationUnits systemInternalsAllocationUnits = new QSystemInternalsAllocationUnits("system_internals_allocation_units");

    public final NumberPath<Long> allocationUnitId = createNumber("allocationUnitId", Long.class);

    public final NumberPath<Long> containerId = createNumber("containerId", Long.class);

    public final NumberPath<Long> dataPages = createNumber("dataPages", Long.class);

    public final NumberPath<Short> filegroupId = createNumber("filegroupId", Short.class);

    public final SimplePath<byte[]> firstIamPage = createSimple("firstIamPage", byte[].class);

    public final SimplePath<byte[]> firstPage = createSimple("firstPage", byte[].class);

    public final SimplePath<byte[]> rootPage = createSimple("rootPage", byte[].class);

    public final NumberPath<Long> totalPages = createNumber("totalPages", Long.class);

    public final NumberPath<Byte> type = createNumber("type", Byte.class);

    public final StringPath typeDesc = createString("typeDesc");

    public final NumberPath<Long> usedPages = createNumber("usedPages", Long.class);

    public QSystemInternalsAllocationUnits(String variable) {
        super(QSystemInternalsAllocationUnits.class, forVariable(variable), "sys", "system_internals_allocation_units");
        addMetadata();
    }

    public QSystemInternalsAllocationUnits(String variable, String schema, String table) {
        super(QSystemInternalsAllocationUnits.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSystemInternalsAllocationUnits(Path<? extends QSystemInternalsAllocationUnits> path) {
        super(path.getType(), path.getMetadata(), "sys", "system_internals_allocation_units");
        addMetadata();
    }

    public QSystemInternalsAllocationUnits(PathMetadata metadata) {
        super(QSystemInternalsAllocationUnits.class, metadata, "sys", "system_internals_allocation_units");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(allocationUnitId, ColumnMetadata.named("allocation_unit_id").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(containerId, ColumnMetadata.named("container_id").withIndex(4).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(dataPages, ColumnMetadata.named("data_pages").withIndex(8).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(filegroupId, ColumnMetadata.named("filegroup_id").withIndex(5).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(firstIamPage, ColumnMetadata.named("first_iam_page").withIndex(11).ofType(Types.BINARY).withSize(6).notNull());
        addMetadata(firstPage, ColumnMetadata.named("first_page").withIndex(9).ofType(Types.BINARY).withSize(6).notNull());
        addMetadata(rootPage, ColumnMetadata.named("root_page").withIndex(10).ofType(Types.BINARY).withSize(6).notNull());
        addMetadata(totalPages, ColumnMetadata.named("total_pages").withIndex(6).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(type, ColumnMetadata.named("type").withIndex(2).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(typeDesc, ColumnMetadata.named("type_desc").withIndex(3).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(usedPages, ColumnMetadata.named("used_pages").withIndex(7).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

