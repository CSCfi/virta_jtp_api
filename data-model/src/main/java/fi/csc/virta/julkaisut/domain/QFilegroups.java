package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QFilegroups is a Querydsl query type for QFilegroups
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFilegroups extends com.querydsl.sql.RelationalPathBase<QFilegroups> {

    private static final long serialVersionUID = -790733331;

    public static final QFilegroups filegroups = new QFilegroups("filegroups");

    public final NumberPath<Integer> dataSpaceId = createNumber("dataSpaceId", Integer.class);

    public final StringPath filegroupGuid = createString("filegroupGuid");

    public final BooleanPath isDefault = createBoolean("isDefault");

    public final BooleanPath isReadOnly = createBoolean("isReadOnly");

    public final BooleanPath isSystem = createBoolean("isSystem");

    public final NumberPath<Integer> logFilegroupId = createNumber("logFilegroupId", Integer.class);

    public final StringPath name = createString("name");

    public final StringPath type = createString("type");

    public final StringPath typeDesc = createString("typeDesc");

    public QFilegroups(String variable) {
        super(QFilegroups.class, forVariable(variable), "sys", "filegroups");
        addMetadata();
    }

    public QFilegroups(String variable, String schema, String table) {
        super(QFilegroups.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFilegroups(Path<? extends QFilegroups> path) {
        super(path.getType(), path.getMetadata(), "sys", "filegroups");
        addMetadata();
    }

    public QFilegroups(PathMetadata metadata) {
        super(QFilegroups.class, metadata, "sys", "filegroups");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dataSpaceId, ColumnMetadata.named("data_space_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(filegroupGuid, ColumnMetadata.named("filegroup_guid").withIndex(7).ofType(Types.CHAR).withSize(36));
        addMetadata(isDefault, ColumnMetadata.named("is_default").withIndex(5).ofType(Types.BIT).withSize(1));
        addMetadata(isReadOnly, ColumnMetadata.named("is_read_only").withIndex(9).ofType(Types.BIT).withSize(1));
        addMetadata(isSystem, ColumnMetadata.named("is_system").withIndex(6).ofType(Types.BIT).withSize(1));
        addMetadata(logFilegroupId, ColumnMetadata.named("log_filegroup_id").withIndex(8).ofType(Types.INTEGER).withSize(10));
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(type, ColumnMetadata.named("type").withIndex(3).ofType(Types.CHAR).withSize(2).notNull());
        addMetadata(typeDesc, ColumnMetadata.named("type_desc").withIndex(4).ofType(Types.NVARCHAR).withSize(60));
    }

}

