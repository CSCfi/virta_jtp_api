package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmOsStacks is a Querydsl query type for QDmOsStacks
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmOsStacks extends com.querydsl.sql.RelationalPathBase<QDmOsStacks> {

    private static final long serialVersionUID = 929497397;

    public static final QDmOsStacks dmOsStacks = new QDmOsStacks("dm_os_stacks");

    public final SimplePath<byte[]> frameAddress = createSimple("frameAddress", byte[].class);

    public final NumberPath<Integer> frameIndex = createNumber("frameIndex", Integer.class);

    public final SimplePath<byte[]> stackAddress = createSimple("stackAddress", byte[].class);

    public QDmOsStacks(String variable) {
        super(QDmOsStacks.class, forVariable(variable), "sys", "dm_os_stacks");
        addMetadata();
    }

    public QDmOsStacks(String variable, String schema, String table) {
        super(QDmOsStacks.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmOsStacks(Path<? extends QDmOsStacks> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_os_stacks");
        addMetadata();
    }

    public QDmOsStacks(PathMetadata metadata) {
        super(QDmOsStacks.class, metadata, "sys", "dm_os_stacks");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(frameAddress, ColumnMetadata.named("frame_address").withIndex(3).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(frameIndex, ColumnMetadata.named("frame_index").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(stackAddress, ColumnMetadata.named("stack_address").withIndex(1).ofType(Types.VARBINARY).withSize(8).notNull());
    }

}

