package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmDbMissingIndexGroups is a Querydsl query type for QDmDbMissingIndexGroups
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmDbMissingIndexGroups extends com.querydsl.sql.RelationalPathBase<QDmDbMissingIndexGroups> {

    private static final long serialVersionUID = 1327403876;

    public static final QDmDbMissingIndexGroups dmDbMissingIndexGroups = new QDmDbMissingIndexGroups("dm_db_missing_index_groups");

    public final NumberPath<Integer> indexGroupHandle = createNumber("indexGroupHandle", Integer.class);

    public final NumberPath<Integer> indexHandle = createNumber("indexHandle", Integer.class);

    public QDmDbMissingIndexGroups(String variable) {
        super(QDmDbMissingIndexGroups.class, forVariable(variable), "sys", "dm_db_missing_index_groups");
        addMetadata();
    }

    public QDmDbMissingIndexGroups(String variable, String schema, String table) {
        super(QDmDbMissingIndexGroups.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmDbMissingIndexGroups(Path<? extends QDmDbMissingIndexGroups> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_db_missing_index_groups");
        addMetadata();
    }

    public QDmDbMissingIndexGroups(PathMetadata metadata) {
        super(QDmDbMissingIndexGroups.class, metadata, "sys", "dm_db_missing_index_groups");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(indexGroupHandle, ColumnMetadata.named("index_group_handle").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(indexHandle, ColumnMetadata.named("index_handle").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

