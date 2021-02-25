package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmOsVirtualAddressDump is a Querydsl query type for QDmOsVirtualAddressDump
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmOsVirtualAddressDump extends com.querydsl.sql.RelationalPathBase<QDmOsVirtualAddressDump> {

    private static final long serialVersionUID = 1600702279;

    public static final QDmOsVirtualAddressDump dmOsVirtualAddressDump = new QDmOsVirtualAddressDump("dm_os_virtual_address_dump");

    public final SimplePath<byte[]> regionAllocationBaseAddress = createSimple("regionAllocationBaseAddress", byte[].class);

    public final SimplePath<byte[]> regionAllocationProtection = createSimple("regionAllocationProtection", byte[].class);

    public final SimplePath<byte[]> regionBaseAddress = createSimple("regionBaseAddress", byte[].class);

    public final SimplePath<byte[]> regionCurrentProtection = createSimple("regionCurrentProtection", byte[].class);

    public final NumberPath<Long> regionSizeInBytes = createNumber("regionSizeInBytes", Long.class);

    public final SimplePath<byte[]> regionState = createSimple("regionState", byte[].class);

    public final SimplePath<byte[]> regionType = createSimple("regionType", byte[].class);

    public QDmOsVirtualAddressDump(String variable) {
        super(QDmOsVirtualAddressDump.class, forVariable(variable), "sys", "dm_os_virtual_address_dump");
        addMetadata();
    }

    public QDmOsVirtualAddressDump(String variable, String schema, String table) {
        super(QDmOsVirtualAddressDump.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmOsVirtualAddressDump(Path<? extends QDmOsVirtualAddressDump> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_os_virtual_address_dump");
        addMetadata();
    }

    public QDmOsVirtualAddressDump(PathMetadata metadata) {
        super(QDmOsVirtualAddressDump.class, metadata, "sys", "dm_os_virtual_address_dump");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(regionAllocationBaseAddress, ColumnMetadata.named("region_allocation_base_address").withIndex(2).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(regionAllocationProtection, ColumnMetadata.named("region_allocation_protection").withIndex(3).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(regionBaseAddress, ColumnMetadata.named("region_base_address").withIndex(1).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(regionCurrentProtection, ColumnMetadata.named("region_current_protection").withIndex(6).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(regionSizeInBytes, ColumnMetadata.named("region_size_in_bytes").withIndex(4).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(regionState, ColumnMetadata.named("region_state").withIndex(5).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(regionType, ColumnMetadata.named("region_type").withIndex(7).ofType(Types.VARBINARY).withSize(8).notNull());
    }

}

