package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QEndpointWebmethods is a Querydsl query type for QEndpointWebmethods
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QEndpointWebmethods extends com.querydsl.sql.RelationalPathBase<QEndpointWebmethods> {

    private static final long serialVersionUID = -417051664;

    public static final QEndpointWebmethods endpointWebmethods = new QEndpointWebmethods("endpoint_webmethods");

    public final NumberPath<Integer> endpointId = createNumber("endpointId", Integer.class);

    public final StringPath methodAlias = createString("methodAlias");

    public final StringPath namespace = createString("namespace");

    public final StringPath objectName = createString("objectName");

    public final NumberPath<Byte> resultFormat = createNumber("resultFormat", Byte.class);

    public final StringPath resultFormatDesc = createString("resultFormatDesc");

    public final NumberPath<Byte> resultSchema = createNumber("resultSchema", Byte.class);

    public final StringPath resultSchemaDesc = createString("resultSchemaDesc");

    public QEndpointWebmethods(String variable) {
        super(QEndpointWebmethods.class, forVariable(variable), "sys", "endpoint_webmethods");
        addMetadata();
    }

    public QEndpointWebmethods(String variable, String schema, String table) {
        super(QEndpointWebmethods.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QEndpointWebmethods(Path<? extends QEndpointWebmethods> path) {
        super(path.getType(), path.getMetadata(), "sys", "endpoint_webmethods");
        addMetadata();
    }

    public QEndpointWebmethods(PathMetadata metadata) {
        super(QEndpointWebmethods.class, metadata, "sys", "endpoint_webmethods");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(endpointId, ColumnMetadata.named("endpoint_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(methodAlias, ColumnMetadata.named("method_alias").withIndex(3).ofType(Types.NVARCHAR).withSize(64).notNull());
        addMetadata(namespace, ColumnMetadata.named("namespace").withIndex(2).ofType(Types.NVARCHAR).withSize(384));
        addMetadata(objectName, ColumnMetadata.named("object_name").withIndex(4).ofType(Types.NVARCHAR).withSize(776));
        addMetadata(resultFormat, ColumnMetadata.named("result_format").withIndex(7).ofType(Types.TINYINT).withSize(3));
        addMetadata(resultFormatDesc, ColumnMetadata.named("result_format_desc").withIndex(8).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(resultSchema, ColumnMetadata.named("result_schema").withIndex(5).ofType(Types.TINYINT).withSize(3));
        addMetadata(resultSchemaDesc, ColumnMetadata.named("result_schema_desc").withIndex(6).ofType(Types.NVARCHAR).withSize(60));
    }

}

