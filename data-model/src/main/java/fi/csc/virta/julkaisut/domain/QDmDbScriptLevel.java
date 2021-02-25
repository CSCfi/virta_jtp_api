package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmDbScriptLevel is a Querydsl query type for QDmDbScriptLevel
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmDbScriptLevel extends com.querydsl.sql.RelationalPathBase<QDmDbScriptLevel> {

    private static final long serialVersionUID = -1151743339;

    public static final QDmDbScriptLevel dmDbScriptLevel = new QDmDbScriptLevel("dm_db_script_level");

    public final NumberPath<Integer> databaseId = createNumber("databaseId", Integer.class);

    public final NumberPath<Integer> downgradeStartLevel = createNumber("downgradeStartLevel", Integer.class);

    public final NumberPath<Integer> downgradeTargetLevel = createNumber("downgradeTargetLevel", Integer.class);

    public final NumberPath<Integer> scriptId = createNumber("scriptId", Integer.class);

    public final NumberPath<Integer> scriptLevel = createNumber("scriptLevel", Integer.class);

    public final StringPath scriptName = createString("scriptName");

    public final NumberPath<Integer> upgradeStartLevel = createNumber("upgradeStartLevel", Integer.class);

    public final NumberPath<Integer> upgradeTargetLevel = createNumber("upgradeTargetLevel", Integer.class);

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QDmDbScriptLevel(String variable) {
        super(QDmDbScriptLevel.class, forVariable(variable), "sys", "dm_db_script_level");
        addMetadata();
    }

    public QDmDbScriptLevel(String variable, String schema, String table) {
        super(QDmDbScriptLevel.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmDbScriptLevel(Path<? extends QDmDbScriptLevel> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_db_script_level");
        addMetadata();
    }

    public QDmDbScriptLevel(PathMetadata metadata) {
        super(QDmDbScriptLevel.class, metadata, "sys", "dm_db_script_level");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(databaseId, ColumnMetadata.named("database_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(downgradeStartLevel, ColumnMetadata.named("downgrade_start_level").withIndex(6).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(downgradeTargetLevel, ColumnMetadata.named("downgrade_target_level").withIndex(7).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(scriptId, ColumnMetadata.named("script_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(scriptLevel, ColumnMetadata.named("script_level").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(scriptName, ColumnMetadata.named("script_name").withIndex(3).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(upgradeStartLevel, ColumnMetadata.named("upgrade_start_level").withIndex(8).ofType(Types.INTEGER).withSize(10));
        addMetadata(upgradeTargetLevel, ColumnMetadata.named("upgrade_target_level").withIndex(9).ofType(Types.INTEGER).withSize(10));
        addMetadata(version, ColumnMetadata.named("version").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

