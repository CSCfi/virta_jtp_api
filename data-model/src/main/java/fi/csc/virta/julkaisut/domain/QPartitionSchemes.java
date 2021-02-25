package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QPartitionSchemes is a Querydsl query type for QPartitionSchemes
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPartitionSchemes extends com.querydsl.sql.RelationalPathBase<QPartitionSchemes> {

    private static final long serialVersionUID = 1558805249;

    public static final QPartitionSchemes partitionSchemes = new QPartitionSchemes("partition_schemes");

    public final NumberPath<Integer> dataSpaceId = createNumber("dataSpaceId", Integer.class);

    public final NumberPath<Integer> functionId = createNumber("functionId", Integer.class);

    public final BooleanPath isDefault = createBoolean("isDefault");

    public final BooleanPath isSystem = createBoolean("isSystem");

    public final StringPath name = createString("name");

    public final StringPath type = createString("type");

    public final StringPath typeDesc = createString("typeDesc");

    public QPartitionSchemes(String variable) {
        super(QPartitionSchemes.class, forVariable(variable), "sys", "partition_schemes");
        addMetadata();
    }

    public QPartitionSchemes(String variable, String schema, String table) {
        super(QPartitionSchemes.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPartitionSchemes(Path<? extends QPartitionSchemes> path) {
        super(path.getType(), path.getMetadata(), "sys", "partition_schemes");
        addMetadata();
    }

    public QPartitionSchemes(PathMetadata metadata) {
        super(QPartitionSchemes.class, metadata, "sys", "partition_schemes");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dataSpaceId, ColumnMetadata.named("data_space_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(functionId, ColumnMetadata.named("function_id").withIndex(7).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(isDefault, ColumnMetadata.named("is_default").withIndex(5).ofType(Types.BIT).withSize(1));
        addMetadata(isSystem, ColumnMetadata.named("is_system").withIndex(6).ofType(Types.BIT).withSize(1));
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(type, ColumnMetadata.named("type").withIndex(3).ofType(Types.CHAR).withSize(2).notNull());
        addMetadata(typeDesc, ColumnMetadata.named("type_desc").withIndex(4).ofType(Types.NVARCHAR).withSize(60));
    }

}

