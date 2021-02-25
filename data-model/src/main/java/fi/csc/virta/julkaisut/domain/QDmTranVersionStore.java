package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmTranVersionStore is a Querydsl query type for QDmTranVersionStore
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmTranVersionStore extends com.querydsl.sql.RelationalPathBase<QDmTranVersionStore> {

    private static final long serialVersionUID = 1994612474;

    public static final QDmTranVersionStore dmTranVersionStore = new QDmTranVersionStore("dm_tran_version_store");

    public final NumberPath<Short> databaseId = createNumber("databaseId", Short.class);

    public final NumberPath<Short> minLengthInBytes = createNumber("minLengthInBytes", Short.class);

    public final SimplePath<byte[]> recordImageFirstPart = createSimple("recordImageFirstPart", byte[].class);

    public final SimplePath<byte[]> recordImageSecondPart = createSimple("recordImageSecondPart", byte[].class);

    public final NumberPath<Short> recordLengthFirstPartInBytes = createNumber("recordLengthFirstPartInBytes", Short.class);

    public final NumberPath<Short> recordLengthSecondPartInBytes = createNumber("recordLengthSecondPartInBytes", Short.class);

    public final NumberPath<Long> rowsetId = createNumber("rowsetId", Long.class);

    public final NumberPath<Byte> status = createNumber("status", Byte.class);

    public final NumberPath<Long> transactionSequenceNum = createNumber("transactionSequenceNum", Long.class);

    public final NumberPath<Long> versionSequenceNum = createNumber("versionSequenceNum", Long.class);

    public QDmTranVersionStore(String variable) {
        super(QDmTranVersionStore.class, forVariable(variable), "sys", "dm_tran_version_store");
        addMetadata();
    }

    public QDmTranVersionStore(String variable, String schema, String table) {
        super(QDmTranVersionStore.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmTranVersionStore(Path<? extends QDmTranVersionStore> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_tran_version_store");
        addMetadata();
    }

    public QDmTranVersionStore(PathMetadata metadata) {
        super(QDmTranVersionStore.class, metadata, "sys", "dm_tran_version_store");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(databaseId, ColumnMetadata.named("database_id").withIndex(3).ofType(Types.SMALLINT).withSize(5));
        addMetadata(minLengthInBytes, ColumnMetadata.named("min_length_in_bytes").withIndex(6).ofType(Types.SMALLINT).withSize(5));
        addMetadata(recordImageFirstPart, ColumnMetadata.named("record_image_first_part").withIndex(8).ofType(Types.VARBINARY).withSize(8000));
        addMetadata(recordImageSecondPart, ColumnMetadata.named("record_image_second_part").withIndex(10).ofType(Types.VARBINARY).withSize(8000));
        addMetadata(recordLengthFirstPartInBytes, ColumnMetadata.named("record_length_first_part_in_bytes").withIndex(7).ofType(Types.SMALLINT).withSize(5));
        addMetadata(recordLengthSecondPartInBytes, ColumnMetadata.named("record_length_second_part_in_bytes").withIndex(9).ofType(Types.SMALLINT).withSize(5));
        addMetadata(rowsetId, ColumnMetadata.named("rowset_id").withIndex(4).ofType(Types.BIGINT).withSize(19));
        addMetadata(status, ColumnMetadata.named("status").withIndex(5).ofType(Types.TINYINT).withSize(3));
        addMetadata(transactionSequenceNum, ColumnMetadata.named("transaction_sequence_num").withIndex(1).ofType(Types.BIGINT).withSize(19));
        addMetadata(versionSequenceNum, ColumnMetadata.named("version_sequence_num").withIndex(2).ofType(Types.BIGINT).withSize(19));
    }

}

