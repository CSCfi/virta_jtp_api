package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSpatialReferenceSystems is a Querydsl query type for QSpatialReferenceSystems
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSpatialReferenceSystems extends com.querydsl.sql.RelationalPathBase<QSpatialReferenceSystems> {

    private static final long serialVersionUID = 689813248;

    public static final QSpatialReferenceSystems spatialReferenceSystems = new QSpatialReferenceSystems("spatial_reference_systems");

    public final StringPath authorityName = createString("authorityName");

    public final NumberPath<Integer> authorizedSpatialReferenceId = createNumber("authorizedSpatialReferenceId", Integer.class);

    public final NumberPath<Integer> spatialReferenceId = createNumber("spatialReferenceId", Integer.class);

    public final NumberPath<Double> unitConversionFactor = createNumber("unitConversionFactor", Double.class);

    public final StringPath unitOfMeasure = createString("unitOfMeasure");

    public final StringPath wellKnownText = createString("wellKnownText");

    public QSpatialReferenceSystems(String variable) {
        super(QSpatialReferenceSystems.class, forVariable(variable), "sys", "spatial_reference_systems");
        addMetadata();
    }

    public QSpatialReferenceSystems(String variable, String schema, String table) {
        super(QSpatialReferenceSystems.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSpatialReferenceSystems(Path<? extends QSpatialReferenceSystems> path) {
        super(path.getType(), path.getMetadata(), "sys", "spatial_reference_systems");
        addMetadata();
    }

    public QSpatialReferenceSystems(PathMetadata metadata) {
        super(QSpatialReferenceSystems.class, metadata, "sys", "spatial_reference_systems");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(authorityName, ColumnMetadata.named("authority_name").withIndex(2).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(authorizedSpatialReferenceId, ColumnMetadata.named("authorized_spatial_reference_id").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(spatialReferenceId, ColumnMetadata.named("spatial_reference_id").withIndex(1).ofType(Types.INTEGER).withSize(10));
        addMetadata(unitConversionFactor, ColumnMetadata.named("unit_conversion_factor").withIndex(6).ofType(Types.DOUBLE).withSize(53));
        addMetadata(unitOfMeasure, ColumnMetadata.named("unit_of_measure").withIndex(5).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(wellKnownText, ColumnMetadata.named("well_known_text").withIndex(4).ofType(Types.NVARCHAR).withSize(4000));
    }

}

