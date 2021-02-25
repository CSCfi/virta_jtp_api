package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmTranTopVersionGenerators is a Querydsl query type for QDmTranTopVersionGenerators
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmTranTopVersionGenerators extends com.querydsl.sql.RelationalPathBase<QDmTranTopVersionGenerators> {

    private static final long serialVersionUID = 1381484852;

    public static final QDmTranTopVersionGenerators dmTranTopVersionGenerators = new QDmTranTopVersionGenerators("dm_tran_top_version_generators");

    public final NumberPath<Integer> aggregatedRecordLengthInBytes = createNumber("aggregatedRecordLengthInBytes", Integer.class);

    public final NumberPath<Short> databaseId = createNumber("databaseId", Short.class);

    public final NumberPath<Long> rowsetId = createNumber("rowsetId", Long.class);

    public QDmTranTopVersionGenerators(String variable) {
        super(QDmTranTopVersionGenerators.class, forVariable(variable), "sys", "dm_tran_top_version_generators");
        addMetadata();
    }

    public QDmTranTopVersionGenerators(String variable, String schema, String table) {
        super(QDmTranTopVersionGenerators.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmTranTopVersionGenerators(Path<? extends QDmTranTopVersionGenerators> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_tran_top_version_generators");
        addMetadata();
    }

    public QDmTranTopVersionGenerators(PathMetadata metadata) {
        super(QDmTranTopVersionGenerators.class, metadata, "sys", "dm_tran_top_version_generators");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(aggregatedRecordLengthInBytes, ColumnMetadata.named("aggregated_record_length_in_bytes").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(databaseId, ColumnMetadata.named("database_id").withIndex(1).ofType(Types.SMALLINT).withSize(5));
        addMetadata(rowsetId, ColumnMetadata.named("rowset_id").withIndex(2).ofType(Types.BIGINT).withSize(19));
    }

}

