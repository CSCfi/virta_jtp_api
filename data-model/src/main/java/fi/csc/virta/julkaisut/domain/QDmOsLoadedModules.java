package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmOsLoadedModules is a Querydsl query type for QDmOsLoadedModules
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmOsLoadedModules extends com.querydsl.sql.RelationalPathBase<QDmOsLoadedModules> {

    private static final long serialVersionUID = -1101679048;

    public static final QDmOsLoadedModules dmOsLoadedModules = new QDmOsLoadedModules("dm_os_loaded_modules");

    public final SimplePath<byte[]> baseAddress = createSimple("baseAddress", byte[].class);

    public final StringPath company = createString("company");

    public final BooleanPath debug = createBoolean("debug");

    public final StringPath description = createString("description");

    public final StringPath fileVersion = createString("fileVersion");

    public final NumberPath<Integer> language = createNumber("language", Integer.class);

    public final StringPath name = createString("name");

    public final BooleanPath patched = createBoolean("patched");

    public final BooleanPath prerelease = createBoolean("prerelease");

    public final BooleanPath privateBuild = createBoolean("privateBuild");

    public final StringPath productVersion = createString("productVersion");

    public final BooleanPath specialBuild = createBoolean("specialBuild");

    public QDmOsLoadedModules(String variable) {
        super(QDmOsLoadedModules.class, forVariable(variable), "sys", "dm_os_loaded_modules");
        addMetadata();
    }

    public QDmOsLoadedModules(String variable, String schema, String table) {
        super(QDmOsLoadedModules.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmOsLoadedModules(Path<? extends QDmOsLoadedModules> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_os_loaded_modules");
        addMetadata();
    }

    public QDmOsLoadedModules(PathMetadata metadata) {
        super(QDmOsLoadedModules.class, metadata, "sys", "dm_os_loaded_modules");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(baseAddress, ColumnMetadata.named("base_address").withIndex(1).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(company, ColumnMetadata.named("company").withIndex(10).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(debug, ColumnMetadata.named("debug").withIndex(4).ofType(Types.BIT).withSize(1));
        addMetadata(description, ColumnMetadata.named("description").withIndex(11).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(fileVersion, ColumnMetadata.named("file_version").withIndex(2).ofType(Types.VARCHAR).withSize(256));
        addMetadata(language, ColumnMetadata.named("language").withIndex(9).ofType(Types.INTEGER).withSize(10));
        addMetadata(name, ColumnMetadata.named("name").withIndex(12).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(patched, ColumnMetadata.named("patched").withIndex(5).ofType(Types.BIT).withSize(1));
        addMetadata(prerelease, ColumnMetadata.named("prerelease").withIndex(6).ofType(Types.BIT).withSize(1));
        addMetadata(privateBuild, ColumnMetadata.named("private_build").withIndex(7).ofType(Types.BIT).withSize(1));
        addMetadata(productVersion, ColumnMetadata.named("product_version").withIndex(3).ofType(Types.VARCHAR).withSize(256));
        addMetadata(specialBuild, ColumnMetadata.named("special_build").withIndex(8).ofType(Types.BIT).withSize(1));
    }

}

