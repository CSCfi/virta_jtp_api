package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmClrLoadedAssemblies is a Querydsl query type for QDmClrLoadedAssemblies
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmClrLoadedAssemblies extends com.querydsl.sql.RelationalPathBase<QDmClrLoadedAssemblies> {

    private static final long serialVersionUID = 96005932;

    public static final QDmClrLoadedAssemblies dmClrLoadedAssemblies = new QDmClrLoadedAssemblies("dm_clr_loaded_assemblies");

    public final SimplePath<byte[]> appdomainAddress = createSimple("appdomainAddress", byte[].class);

    public final NumberPath<Integer> assemblyId = createNumber("assemblyId", Integer.class);

    public final DateTimePath<java.sql.Timestamp> loadTime = createDateTime("loadTime", java.sql.Timestamp.class);

    public QDmClrLoadedAssemblies(String variable) {
        super(QDmClrLoadedAssemblies.class, forVariable(variable), "sys", "dm_clr_loaded_assemblies");
        addMetadata();
    }

    public QDmClrLoadedAssemblies(String variable, String schema, String table) {
        super(QDmClrLoadedAssemblies.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmClrLoadedAssemblies(Path<? extends QDmClrLoadedAssemblies> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_clr_loaded_assemblies");
        addMetadata();
    }

    public QDmClrLoadedAssemblies(PathMetadata metadata) {
        super(QDmClrLoadedAssemblies.class, metadata, "sys", "dm_clr_loaded_assemblies");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(appdomainAddress, ColumnMetadata.named("appdomain_address").withIndex(2).ofType(Types.VARBINARY).withSize(8));
        addMetadata(assemblyId, ColumnMetadata.named("assembly_id").withIndex(1).ofType(Types.INTEGER).withSize(10));
        addMetadata(loadTime, ColumnMetadata.named("load_time").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
    }

}

