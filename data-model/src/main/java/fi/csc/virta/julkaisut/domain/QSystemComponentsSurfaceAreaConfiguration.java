package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSystemComponentsSurfaceAreaConfiguration is a Querydsl query type for QSystemComponentsSurfaceAreaConfiguration
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSystemComponentsSurfaceAreaConfiguration extends com.querydsl.sql.RelationalPathBase<QSystemComponentsSurfaceAreaConfiguration> {

    private static final long serialVersionUID = -547318050;

    public static final QSystemComponentsSurfaceAreaConfiguration systemComponentsSurfaceAreaConfiguration = new QSystemComponentsSurfaceAreaConfiguration("system_components_surface_area_configuration");

    public final StringPath componentName = createString("componentName");

    public final StringPath databaseName = createString("databaseName");

    public final StringPath objectName = createString("objectName");

    public final StringPath schemaName = createString("schemaName");

    public final NumberPath<Byte> state = createNumber("state", Byte.class);

    public final StringPath type = createString("type");

    public final StringPath typeDesc = createString("typeDesc");

    public QSystemComponentsSurfaceAreaConfiguration(String variable) {
        super(QSystemComponentsSurfaceAreaConfiguration.class, forVariable(variable), "sys", "system_components_surface_area_configuration");
        addMetadata();
    }

    public QSystemComponentsSurfaceAreaConfiguration(String variable, String schema, String table) {
        super(QSystemComponentsSurfaceAreaConfiguration.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSystemComponentsSurfaceAreaConfiguration(Path<? extends QSystemComponentsSurfaceAreaConfiguration> path) {
        super(path.getType(), path.getMetadata(), "sys", "system_components_surface_area_configuration");
        addMetadata();
    }

    public QSystemComponentsSurfaceAreaConfiguration(PathMetadata metadata) {
        super(QSystemComponentsSurfaceAreaConfiguration.class, metadata, "sys", "system_components_surface_area_configuration");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(componentName, ColumnMetadata.named("component_name").withIndex(1).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(databaseName, ColumnMetadata.named("database_name").withIndex(2).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(objectName, ColumnMetadata.named("object_name").withIndex(4).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(schemaName, ColumnMetadata.named("schema_name").withIndex(3).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(state, ColumnMetadata.named("state").withIndex(5).ofType(Types.TINYINT).withSize(3));
        addMetadata(type, ColumnMetadata.named("type").withIndex(6).ofType(Types.CHAR).withSize(2).notNull());
        addMetadata(typeDesc, ColumnMetadata.named("type_desc").withIndex(7).ofType(Types.NVARCHAR).withSize(60));
    }

}

