package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmHadrNameIdMap is a Querydsl query type for QDmHadrNameIdMap
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmHadrNameIdMap extends com.querydsl.sql.RelationalPathBase<QDmHadrNameIdMap> {

    private static final long serialVersionUID = -804125847;

    public static final QDmHadrNameIdMap dmHadrNameIdMap = new QDmHadrNameIdMap("dm_hadr_name_id_map");

    public final StringPath agGroupId = createString("agGroupId");

    public final StringPath agId = createString("agId");

    public final StringPath agName = createString("agName");

    public final StringPath agResourceId = createString("agResourceId");

    public QDmHadrNameIdMap(String variable) {
        super(QDmHadrNameIdMap.class, forVariable(variable), "sys", "dm_hadr_name_id_map");
        addMetadata();
    }

    public QDmHadrNameIdMap(String variable, String schema, String table) {
        super(QDmHadrNameIdMap.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmHadrNameIdMap(Path<? extends QDmHadrNameIdMap> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_hadr_name_id_map");
        addMetadata();
    }

    public QDmHadrNameIdMap(PathMetadata metadata) {
        super(QDmHadrNameIdMap.class, metadata, "sys", "dm_hadr_name_id_map");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(agGroupId, ColumnMetadata.named("ag_group_id").withIndex(4).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(agId, ColumnMetadata.named("ag_id").withIndex(2).ofType(Types.CHAR).withSize(36).notNull());
        addMetadata(agName, ColumnMetadata.named("ag_name").withIndex(1).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(agResourceId, ColumnMetadata.named("ag_resource_id").withIndex(3).ofType(Types.NVARCHAR).withSize(256).notNull());
    }

}

