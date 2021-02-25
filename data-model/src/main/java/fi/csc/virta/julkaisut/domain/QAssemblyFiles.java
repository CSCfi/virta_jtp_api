package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAssemblyFiles is a Querydsl query type for QAssemblyFiles
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAssemblyFiles extends com.querydsl.sql.RelationalPathBase<QAssemblyFiles> {

    private static final long serialVersionUID = 1561079668;

    public static final QAssemblyFiles assemblyFiles = new QAssemblyFiles("assembly_files");

    public final NumberPath<Integer> assemblyId = createNumber("assemblyId", Integer.class);

    public final SimplePath<byte[]> content = createSimple("content", byte[].class);

    public final NumberPath<Integer> fileId = createNumber("fileId", Integer.class);

    public final StringPath name = createString("name");

    public QAssemblyFiles(String variable) {
        super(QAssemblyFiles.class, forVariable(variable), "sys", "assembly_files");
        addMetadata();
    }

    public QAssemblyFiles(String variable, String schema, String table) {
        super(QAssemblyFiles.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAssemblyFiles(Path<? extends QAssemblyFiles> path) {
        super(path.getType(), path.getMetadata(), "sys", "assembly_files");
        addMetadata();
    }

    public QAssemblyFiles(PathMetadata metadata) {
        super(QAssemblyFiles.class, metadata, "sys", "assembly_files");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(assemblyId, ColumnMetadata.named("assembly_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(content, ColumnMetadata.named("content").withIndex(4).ofType(Types.VARBINARY).withSize(2147483647));
        addMetadata(fileId, ColumnMetadata.named("file_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.NVARCHAR).withSize(260));
    }

}

