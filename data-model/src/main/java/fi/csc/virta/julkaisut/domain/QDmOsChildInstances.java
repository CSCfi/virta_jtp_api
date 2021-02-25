package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmOsChildInstances is a Querydsl query type for QDmOsChildInstances
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmOsChildInstances extends com.querydsl.sql.RelationalPathBase<QDmOsChildInstances> {

    private static final long serialVersionUID = 889565452;

    public static final QDmOsChildInstances dmOsChildInstances = new QDmOsChildInstances("dm_os_child_instances");

    public final StringPath heartBeat = createString("heartBeat");

    public final StringPath instanceName = createString("instanceName");

    public final StringPath instancePipeName = createString("instancePipeName");

    public final DateTimePath<java.sql.Timestamp> oSProcessCreationDate = createDateTime("oSProcessCreationDate", java.sql.Timestamp.class);

    public final NumberPath<Integer> oSProcessId = createNumber("oSProcessId", Integer.class);

    public final StringPath owningPrincipalName = createString("owningPrincipalName");

    public final StringPath owningPrincipalSid = createString("owningPrincipalSid");

    public final SimplePath<byte[]> owningPrincipalSidBinary = createSimple("owningPrincipalSidBinary", byte[].class);

    public QDmOsChildInstances(String variable) {
        super(QDmOsChildInstances.class, forVariable(variable), "sys", "dm_os_child_instances");
        addMetadata();
    }

    public QDmOsChildInstances(String variable, String schema, String table) {
        super(QDmOsChildInstances.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmOsChildInstances(Path<? extends QDmOsChildInstances> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_os_child_instances");
        addMetadata();
    }

    public QDmOsChildInstances(PathMetadata metadata) {
        super(QDmOsChildInstances.class, metadata, "sys", "dm_os_child_instances");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(heartBeat, ColumnMetadata.named("heart_beat").withIndex(8).ofType(Types.NVARCHAR).withSize(5));
        addMetadata(instanceName, ColumnMetadata.named("instance_name").withIndex(4).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(instancePipeName, ColumnMetadata.named("instance_pipe_name").withIndex(5).ofType(Types.NVARCHAR).withSize(260));
        addMetadata(oSProcessCreationDate, ColumnMetadata.named("OS_process_creation_date").withIndex(7).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(oSProcessId, ColumnMetadata.named("OS_process_id").withIndex(6).ofType(Types.INTEGER).withSize(10));
        addMetadata(owningPrincipalName, ColumnMetadata.named("owning_principal_name").withIndex(1).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(owningPrincipalSid, ColumnMetadata.named("owning_principal_sid").withIndex(2).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(owningPrincipalSidBinary, ColumnMetadata.named("owning_principal_sid_binary").withIndex(3).ofType(Types.VARBINARY).withSize(85));
    }

}

