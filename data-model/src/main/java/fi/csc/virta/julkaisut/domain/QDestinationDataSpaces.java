package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDestinationDataSpaces is a Querydsl query type for QDestinationDataSpaces
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDestinationDataSpaces extends com.querydsl.sql.RelationalPathBase<QDestinationDataSpaces> {

    private static final long serialVersionUID = 355335016;

    public static final QDestinationDataSpaces destinationDataSpaces = new QDestinationDataSpaces("destination_data_spaces");

    public final NumberPath<Integer> dataSpaceId = createNumber("dataSpaceId", Integer.class);

    public final NumberPath<Integer> destinationId = createNumber("destinationId", Integer.class);

    public final NumberPath<Integer> partitionSchemeId = createNumber("partitionSchemeId", Integer.class);

    public QDestinationDataSpaces(String variable) {
        super(QDestinationDataSpaces.class, forVariable(variable), "sys", "destination_data_spaces");
        addMetadata();
    }

    public QDestinationDataSpaces(String variable, String schema, String table) {
        super(QDestinationDataSpaces.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDestinationDataSpaces(Path<? extends QDestinationDataSpaces> path) {
        super(path.getType(), path.getMetadata(), "sys", "destination_data_spaces");
        addMetadata();
    }

    public QDestinationDataSpaces(PathMetadata metadata) {
        super(QDestinationDataSpaces.class, metadata, "sys", "destination_data_spaces");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dataSpaceId, ColumnMetadata.named("data_space_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(destinationId, ColumnMetadata.named("destination_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(partitionSchemeId, ColumnMetadata.named("partition_scheme_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

