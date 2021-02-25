package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCryptographicProviders is a Querydsl query type for QCryptographicProviders
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCryptographicProviders extends com.querydsl.sql.RelationalPathBase<QCryptographicProviders> {

    private static final long serialVersionUID = 1020350840;

    public static final QCryptographicProviders cryptographicProviders = new QCryptographicProviders("cryptographic_providers");

    public final StringPath dllPath = createString("dllPath");

    public final StringPath guid = createString("guid");

    public final BooleanPath isEnabled = createBoolean("isEnabled");

    public final StringPath name = createString("name");

    public final NumberPath<Integer> providerId = createNumber("providerId", Integer.class);

    public final StringPath version = createString("version");

    public QCryptographicProviders(String variable) {
        super(QCryptographicProviders.class, forVariable(variable), "sys", "cryptographic_providers");
        addMetadata();
    }

    public QCryptographicProviders(String variable, String schema, String table) {
        super(QCryptographicProviders.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCryptographicProviders(Path<? extends QCryptographicProviders> path) {
        super(path.getType(), path.getMetadata(), "sys", "cryptographic_providers");
        addMetadata();
    }

    public QCryptographicProviders(PathMetadata metadata) {
        super(QCryptographicProviders.class, metadata, "sys", "cryptographic_providers");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dllPath, ColumnMetadata.named("dll_path").withIndex(5).ofType(Types.NVARCHAR).withSize(520));
        addMetadata(guid, ColumnMetadata.named("guid").withIndex(3).ofType(Types.CHAR).withSize(36));
        addMetadata(isEnabled, ColumnMetadata.named("is_enabled").withIndex(6).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(providerId, ColumnMetadata.named("provider_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(version, ColumnMetadata.named("version").withIndex(4).ofType(Types.NVARCHAR).withSize(24));
    }

}

