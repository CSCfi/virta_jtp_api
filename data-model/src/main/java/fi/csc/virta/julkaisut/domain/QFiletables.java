package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QFiletables is a Querydsl query type for QFiletables
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFiletables extends com.querydsl.sql.RelationalPathBase<QFiletables> {

    private static final long serialVersionUID = -434650498;

    public static final QFiletables filetables = new QFiletables("filetables");

    public final StringPath directoryName = createString("directoryName");

    public final NumberPath<Integer> filenameCollationId = createNumber("filenameCollationId", Integer.class);

    public final StringPath filenameCollationName = createString("filenameCollationName");

    public final BooleanPath isEnabled = createBoolean("isEnabled");

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public QFiletables(String variable) {
        super(QFiletables.class, forVariable(variable), "sys", "filetables");
        addMetadata();
    }

    public QFiletables(String variable, String schema, String table) {
        super(QFiletables.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFiletables(Path<? extends QFiletables> path) {
        super(path.getType(), path.getMetadata(), "sys", "filetables");
        addMetadata();
    }

    public QFiletables(PathMetadata metadata) {
        super(QFiletables.class, metadata, "sys", "filetables");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(directoryName, ColumnMetadata.named("directory_name").withIndex(3).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(filenameCollationId, ColumnMetadata.named("filename_collation_id").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(filenameCollationName, ColumnMetadata.named("filename_collation_name").withIndex(5).ofType(Types.NVARCHAR).withSize(129).notNull());
        addMetadata(isEnabled, ColumnMetadata.named("is_enabled").withIndex(2).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

