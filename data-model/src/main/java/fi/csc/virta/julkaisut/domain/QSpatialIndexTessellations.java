package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSpatialIndexTessellations is a Querydsl query type for QSpatialIndexTessellations
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSpatialIndexTessellations extends com.querydsl.sql.RelationalPathBase<QSpatialIndexTessellations> {

    private static final long serialVersionUID = -263565625;

    public static final QSpatialIndexTessellations spatialIndexTessellations = new QSpatialIndexTessellations("spatial_index_tessellations");

    public final NumberPath<Double> boundingBoxXmax = createNumber("boundingBoxXmax", Double.class);

    public final NumberPath<Double> boundingBoxXmin = createNumber("boundingBoxXmin", Double.class);

    public final NumberPath<Double> boundingBoxYmax = createNumber("boundingBoxYmax", Double.class);

    public final NumberPath<Double> boundingBoxYmin = createNumber("boundingBoxYmin", Double.class);

    public final NumberPath<Integer> cellsPerObject = createNumber("cellsPerObject", Integer.class);

    public final NumberPath<Integer> indexId = createNumber("indexId", Integer.class);

    public final NumberPath<Short> level1Grid = createNumber("level1Grid", Short.class);

    public final StringPath level1GridDesc = createString("level1GridDesc");

    public final NumberPath<Short> level2Grid = createNumber("level2Grid", Short.class);

    public final StringPath level2GridDesc = createString("level2GridDesc");

    public final NumberPath<Short> level3Grid = createNumber("level3Grid", Short.class);

    public final StringPath level3GridDesc = createString("level3GridDesc");

    public final NumberPath<Short> level4Grid = createNumber("level4Grid", Short.class);

    public final StringPath level4GridDesc = createString("level4GridDesc");

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public final StringPath tessellationScheme = createString("tessellationScheme");

    public QSpatialIndexTessellations(String variable) {
        super(QSpatialIndexTessellations.class, forVariable(variable), "sys", "spatial_index_tessellations");
        addMetadata();
    }

    public QSpatialIndexTessellations(String variable, String schema, String table) {
        super(QSpatialIndexTessellations.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSpatialIndexTessellations(Path<? extends QSpatialIndexTessellations> path) {
        super(path.getType(), path.getMetadata(), "sys", "spatial_index_tessellations");
        addMetadata();
    }

    public QSpatialIndexTessellations(PathMetadata metadata) {
        super(QSpatialIndexTessellations.class, metadata, "sys", "spatial_index_tessellations");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(boundingBoxXmax, ColumnMetadata.named("bounding_box_xmax").withIndex(6).ofType(Types.DOUBLE).withSize(53));
        addMetadata(boundingBoxXmin, ColumnMetadata.named("bounding_box_xmin").withIndex(4).ofType(Types.DOUBLE).withSize(53));
        addMetadata(boundingBoxYmax, ColumnMetadata.named("bounding_box_ymax").withIndex(7).ofType(Types.DOUBLE).withSize(53));
        addMetadata(boundingBoxYmin, ColumnMetadata.named("bounding_box_ymin").withIndex(5).ofType(Types.DOUBLE).withSize(53));
        addMetadata(cellsPerObject, ColumnMetadata.named("cells_per_object").withIndex(16).ofType(Types.INTEGER).withSize(10));
        addMetadata(indexId, ColumnMetadata.named("index_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(level1Grid, ColumnMetadata.named("level_1_grid").withIndex(8).ofType(Types.SMALLINT).withSize(5));
        addMetadata(level1GridDesc, ColumnMetadata.named("level_1_grid_desc").withIndex(9).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(level2Grid, ColumnMetadata.named("level_2_grid").withIndex(10).ofType(Types.SMALLINT).withSize(5));
        addMetadata(level2GridDesc, ColumnMetadata.named("level_2_grid_desc").withIndex(11).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(level3Grid, ColumnMetadata.named("level_3_grid").withIndex(12).ofType(Types.SMALLINT).withSize(5));
        addMetadata(level3GridDesc, ColumnMetadata.named("level_3_grid_desc").withIndex(13).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(level4Grid, ColumnMetadata.named("level_4_grid").withIndex(14).ofType(Types.SMALLINT).withSize(5));
        addMetadata(level4GridDesc, ColumnMetadata.named("level_4_grid_desc").withIndex(15).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(tessellationScheme, ColumnMetadata.named("tessellation_scheme").withIndex(3).ofType(Types.NVARCHAR).withSize(60));
    }

}

