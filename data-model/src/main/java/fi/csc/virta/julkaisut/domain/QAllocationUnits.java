package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAllocationUnits is a Querydsl query type for QAllocationUnits
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAllocationUnits extends com.querydsl.sql.RelationalPathBase<QAllocationUnits> {

    private static final long serialVersionUID = -1006059278;

    public static final QAllocationUnits allocationUnits = new QAllocationUnits("allocation_units");

    public final NumberPath<Long> allocationUnitId = createNumber("allocationUnitId", Long.class);

    public final NumberPath<Long> containerId = createNumber("containerId", Long.class);

    public final NumberPath<Long> dataPages = createNumber("dataPages", Long.class);

    public final NumberPath<Integer> dataSpaceId = createNumber("dataSpaceId", Integer.class);

    public final NumberPath<Long> totalPages = createNumber("totalPages", Long.class);

    public final NumberPath<Byte> type = createNumber("type", Byte.class);

    public final StringPath typeDesc = createString("typeDesc");

    public final NumberPath<Long> usedPages = createNumber("usedPages", Long.class);

    public QAllocationUnits(String variable) {
        super(QAllocationUnits.class, forVariable(variable), "sys", "allocation_units");
        addMetadata();
    }

    public QAllocationUnits(String variable, String schema, String table) {
        super(QAllocationUnits.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAllocationUnits(Path<? extends QAllocationUnits> path) {
        super(path.getType(), path.getMetadata(), "sys", "allocation_units");
        addMetadata();
    }

    public QAllocationUnits(PathMetadata metadata) {
        super(QAllocationUnits.class, metadata, "sys", "allocation_units");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(allocationUnitId, ColumnMetadata.named("allocation_unit_id").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(containerId, ColumnMetadata.named("container_id").withIndex(4).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(dataPages, ColumnMetadata.named("data_pages").withIndex(8).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(dataSpaceId, ColumnMetadata.named("data_space_id").withIndex(5).ofType(Types.INTEGER).withSize(10));
        addMetadata(totalPages, ColumnMetadata.named("total_pages").withIndex(6).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(type, ColumnMetadata.named("type").withIndex(2).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(typeDesc, ColumnMetadata.named("type_desc").withIndex(3).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(usedPages, ColumnMetadata.named("used_pages").withIndex(7).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

