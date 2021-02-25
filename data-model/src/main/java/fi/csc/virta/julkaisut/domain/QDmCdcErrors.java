package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmCdcErrors is a Querydsl query type for QDmCdcErrors
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmCdcErrors extends com.querydsl.sql.RelationalPathBase<QDmCdcErrors> {

    private static final long serialVersionUID = -1422348377;

    public static final QDmCdcErrors dmCdcErrors = new QDmCdcErrors("dm_cdc_errors");

    public final StringPath beginLsn = createString("beginLsn");

    public final DateTimePath<java.sql.Timestamp> entryTime = createDateTime("entryTime", java.sql.Timestamp.class);

    public final StringPath errorMessage = createString("errorMessage");

    public final NumberPath<Integer> errorNumber = createNumber("errorNumber", Integer.class);

    public final NumberPath<Integer> errorSeverity = createNumber("errorSeverity", Integer.class);

    public final NumberPath<Integer> errorState = createNumber("errorState", Integer.class);

    public final NumberPath<Integer> phaseNumber = createNumber("phaseNumber", Integer.class);

    public final StringPath sequenceValue = createString("sequenceValue");

    public final NumberPath<Integer> sessionId = createNumber("sessionId", Integer.class);

    public final StringPath startLsn = createString("startLsn");

    public QDmCdcErrors(String variable) {
        super(QDmCdcErrors.class, forVariable(variable), "sys", "dm_cdc_errors");
        addMetadata();
    }

    public QDmCdcErrors(String variable, String schema, String table) {
        super(QDmCdcErrors.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmCdcErrors(Path<? extends QDmCdcErrors> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_cdc_errors");
        addMetadata();
    }

    public QDmCdcErrors(PathMetadata metadata) {
        super(QDmCdcErrors.class, metadata, "sys", "dm_cdc_errors");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(beginLsn, ColumnMetadata.named("begin_lsn").withIndex(9).ofType(Types.NVARCHAR).withSize(24));
        addMetadata(entryTime, ColumnMetadata.named("entry_time").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(errorMessage, ColumnMetadata.named("error_message").withIndex(7).ofType(Types.NVARCHAR).withSize(1025));
        addMetadata(errorNumber, ColumnMetadata.named("error_number").withIndex(4).ofType(Types.INTEGER).withSize(10));
        addMetadata(errorSeverity, ColumnMetadata.named("error_severity").withIndex(5).ofType(Types.INTEGER).withSize(10));
        addMetadata(errorState, ColumnMetadata.named("error_state").withIndex(6).ofType(Types.INTEGER).withSize(10));
        addMetadata(phaseNumber, ColumnMetadata.named("phase_number").withIndex(2).ofType(Types.INTEGER).withSize(10));
        addMetadata(sequenceValue, ColumnMetadata.named("sequence_value").withIndex(10).ofType(Types.NVARCHAR).withSize(24));
        addMetadata(sessionId, ColumnMetadata.named("session_id").withIndex(1).ofType(Types.INTEGER).withSize(10));
        addMetadata(startLsn, ColumnMetadata.named("start_lsn").withIndex(8).ofType(Types.NVARCHAR).withSize(24));
    }

}

