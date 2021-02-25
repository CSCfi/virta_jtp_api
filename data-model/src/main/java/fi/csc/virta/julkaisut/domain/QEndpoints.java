package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QEndpoints is a Querydsl query type for QEndpoints
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QEndpoints extends com.querydsl.sql.RelationalPathBase<QEndpoints> {

    private static final long serialVersionUID = -22769087;

    public static final QEndpoints endpoints = new QEndpoints("endpoints");

    public final NumberPath<Integer> endpointId = createNumber("endpointId", Integer.class);

    public final BooleanPath isAdminEndpoint = createBoolean("isAdminEndpoint");

    public final StringPath name = createString("name");

    public final NumberPath<Integer> principalId = createNumber("principalId", Integer.class);

    public final NumberPath<Byte> protocol = createNumber("protocol", Byte.class);

    public final StringPath protocolDesc = createString("protocolDesc");

    public final NumberPath<Byte> state = createNumber("state", Byte.class);

    public final StringPath stateDesc = createString("stateDesc");

    public final NumberPath<Byte> type = createNumber("type", Byte.class);

    public final StringPath typeDesc = createString("typeDesc");

    public QEndpoints(String variable) {
        super(QEndpoints.class, forVariable(variable), "sys", "endpoints");
        addMetadata();
    }

    public QEndpoints(String variable, String schema, String table) {
        super(QEndpoints.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QEndpoints(Path<? extends QEndpoints> path) {
        super(path.getType(), path.getMetadata(), "sys", "endpoints");
        addMetadata();
    }

    public QEndpoints(PathMetadata metadata) {
        super(QEndpoints.class, metadata, "sys", "endpoints");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(endpointId, ColumnMetadata.named("endpoint_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(isAdminEndpoint, ColumnMetadata.named("is_admin_endpoint").withIndex(10).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(principalId, ColumnMetadata.named("principal_id").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(protocol, ColumnMetadata.named("protocol").withIndex(4).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(protocolDesc, ColumnMetadata.named("protocol_desc").withIndex(5).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(state, ColumnMetadata.named("state").withIndex(8).ofType(Types.TINYINT).withSize(3));
        addMetadata(stateDesc, ColumnMetadata.named("state_desc").withIndex(9).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(type, ColumnMetadata.named("type").withIndex(6).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(typeDesc, ColumnMetadata.named("type_desc").withIndex(7).ofType(Types.NVARCHAR).withSize(60));
    }

}

