package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmOsWindowsInfo is a Querydsl query type for QDmOsWindowsInfo
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmOsWindowsInfo extends com.querydsl.sql.RelationalPathBase<QDmOsWindowsInfo> {

    private static final long serialVersionUID = 82570695;

    public static final QDmOsWindowsInfo dmOsWindowsInfo = new QDmOsWindowsInfo("dm_os_windows_info");

    public final NumberPath<Integer> osLanguageVersion = createNumber("osLanguageVersion", Integer.class);

    public final StringPath windowsRelease = createString("windowsRelease");

    public final StringPath windowsServicePackLevel = createString("windowsServicePackLevel");

    public final NumberPath<Integer> windowsSku = createNumber("windowsSku", Integer.class);

    public QDmOsWindowsInfo(String variable) {
        super(QDmOsWindowsInfo.class, forVariable(variable), "sys", "dm_os_windows_info");
        addMetadata();
    }

    public QDmOsWindowsInfo(String variable, String schema, String table) {
        super(QDmOsWindowsInfo.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmOsWindowsInfo(Path<? extends QDmOsWindowsInfo> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_os_windows_info");
        addMetadata();
    }

    public QDmOsWindowsInfo(PathMetadata metadata) {
        super(QDmOsWindowsInfo.class, metadata, "sys", "dm_os_windows_info");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(osLanguageVersion, ColumnMetadata.named("os_language_version").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(windowsRelease, ColumnMetadata.named("windows_release").withIndex(1).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(windowsServicePackLevel, ColumnMetadata.named("windows_service_pack_level").withIndex(2).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(windowsSku, ColumnMetadata.named("windows_sku").withIndex(3).ofType(Types.INTEGER).withSize(10));
    }

}

