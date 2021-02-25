package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmServerRegistry is a Querydsl query type for QDmServerRegistry
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmServerRegistry extends com.querydsl.sql.RelationalPathBase<QDmServerRegistry> {

    private static final long serialVersionUID = 1778005862;

    public static final QDmServerRegistry dmServerRegistry = new QDmServerRegistry("dm_server_registry");

    public final StringPath registryKey = createString("registryKey");

    public final SimplePath<Object> valueData = createSimple("valueData", Object.class);

    public final StringPath valueName = createString("valueName");

    public QDmServerRegistry(String variable) {
        super(QDmServerRegistry.class, forVariable(variable), "sys", "dm_server_registry");
        addMetadata();
    }

    public QDmServerRegistry(String variable, String schema, String table) {
        super(QDmServerRegistry.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmServerRegistry(Path<? extends QDmServerRegistry> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_server_registry");
        addMetadata();
    }

    public QDmServerRegistry(PathMetadata metadata) {
        super(QDmServerRegistry.class, metadata, "sys", "dm_server_registry");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(registryKey, ColumnMetadata.named("registry_key").withIndex(1).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(valueData, ColumnMetadata.named("value_data").withIndex(3).ofType(-150).withSize(2147483647));
        addMetadata(valueName, ColumnMetadata.named("value_name").withIndex(2).ofType(Types.NVARCHAR).withSize(256));
    }

}

