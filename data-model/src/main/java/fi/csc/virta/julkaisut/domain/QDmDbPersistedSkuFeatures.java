package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmDbPersistedSkuFeatures is a Querydsl query type for QDmDbPersistedSkuFeatures
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmDbPersistedSkuFeatures extends com.querydsl.sql.RelationalPathBase<QDmDbPersistedSkuFeatures> {

    private static final long serialVersionUID = -1432641685;

    public static final QDmDbPersistedSkuFeatures dmDbPersistedSkuFeatures = new QDmDbPersistedSkuFeatures("dm_db_persisted_sku_features");

    public final NumberPath<Integer> featureId = createNumber("featureId", Integer.class);

    public final StringPath featureName = createString("featureName");

    public QDmDbPersistedSkuFeatures(String variable) {
        super(QDmDbPersistedSkuFeatures.class, forVariable(variable), "sys", "dm_db_persisted_sku_features");
        addMetadata();
    }

    public QDmDbPersistedSkuFeatures(String variable, String schema, String table) {
        super(QDmDbPersistedSkuFeatures.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmDbPersistedSkuFeatures(Path<? extends QDmDbPersistedSkuFeatures> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_db_persisted_sku_features");
        addMetadata();
    }

    public QDmDbPersistedSkuFeatures(PathMetadata metadata) {
        super(QDmDbPersistedSkuFeatures.class, metadata, "sys", "dm_db_persisted_sku_features");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(featureId, ColumnMetadata.named("feature_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(featureName, ColumnMetadata.named("feature_name").withIndex(1).ofType(Types.NVARCHAR).withSize(4000));
    }

}

