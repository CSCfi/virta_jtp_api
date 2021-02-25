package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmOsSublatches is a Querydsl query type for QDmOsSublatches
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmOsSublatches extends com.querydsl.sql.RelationalPathBase<QDmOsSublatches> {

    private static final long serialVersionUID = 72566012;

    public static final QDmOsSublatches dmOsSublatches = new QDmOsSublatches("dm_os_sublatches");

    public final NumberPath<Integer> partitionId = createNumber("partitionId", Integer.class);

    public final SimplePath<byte[]> sublatchAddress = createSimple("sublatchAddress", byte[].class);

    public final SimplePath<byte[]> superlatchAddress = createSimple("superlatchAddress", byte[].class);

    public QDmOsSublatches(String variable) {
        super(QDmOsSublatches.class, forVariable(variable), "sys", "dm_os_sublatches");
        addMetadata();
    }

    public QDmOsSublatches(String variable, String schema, String table) {
        super(QDmOsSublatches.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmOsSublatches(Path<? extends QDmOsSublatches> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_os_sublatches");
        addMetadata();
    }

    public QDmOsSublatches(PathMetadata metadata) {
        super(QDmOsSublatches.class, metadata, "sys", "dm_os_sublatches");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(partitionId, ColumnMetadata.named("partition_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(sublatchAddress, ColumnMetadata.named("sublatch_address").withIndex(2).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(superlatchAddress, ColumnMetadata.named("superlatch_address").withIndex(1).ofType(Types.VARBINARY).withSize(8));
    }

}

