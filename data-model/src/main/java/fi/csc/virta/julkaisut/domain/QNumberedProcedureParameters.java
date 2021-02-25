package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QNumberedProcedureParameters is a Querydsl query type for QNumberedProcedureParameters
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QNumberedProcedureParameters extends com.querydsl.sql.RelationalPathBase<QNumberedProcedureParameters> {

    private static final long serialVersionUID = 1722090584;

    public static final QNumberedProcedureParameters numberedProcedureParameters = new QNumberedProcedureParameters("numbered_procedure_parameters");

    public final BooleanPath isCursorRef = createBoolean("isCursorRef");

    public final BooleanPath isOutput = createBoolean("isOutput");

    public final NumberPath<Short> maxLength = createNumber("maxLength", Short.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public final NumberPath<Integer> parameterId = createNumber("parameterId", Integer.class);

    public final NumberPath<Byte> precision = createNumber("precision", Byte.class);

    public final NumberPath<Short> procedureNumber = createNumber("procedureNumber", Short.class);

    public final NumberPath<Byte> scale = createNumber("scale", Byte.class);

    public final NumberPath<Byte> systemTypeId = createNumber("systemTypeId", Byte.class);

    public final NumberPath<Integer> userTypeId = createNumber("userTypeId", Integer.class);

    public QNumberedProcedureParameters(String variable) {
        super(QNumberedProcedureParameters.class, forVariable(variable), "sys", "numbered_procedure_parameters");
        addMetadata();
    }

    public QNumberedProcedureParameters(String variable, String schema, String table) {
        super(QNumberedProcedureParameters.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QNumberedProcedureParameters(Path<? extends QNumberedProcedureParameters> path) {
        super(path.getType(), path.getMetadata(), "sys", "numbered_procedure_parameters");
        addMetadata();
    }

    public QNumberedProcedureParameters(PathMetadata metadata) {
        super(QNumberedProcedureParameters.class, metadata, "sys", "numbered_procedure_parameters");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(isCursorRef, ColumnMetadata.named("is_cursor_ref").withIndex(11).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isOutput, ColumnMetadata.named("is_output").withIndex(10).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(maxLength, ColumnMetadata.named("max_length").withIndex(7).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(3).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(parameterId, ColumnMetadata.named("parameter_id").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(precision, ColumnMetadata.named("precision").withIndex(8).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(procedureNumber, ColumnMetadata.named("procedure_number").withIndex(2).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(scale, ColumnMetadata.named("scale").withIndex(9).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(systemTypeId, ColumnMetadata.named("system_type_id").withIndex(5).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(userTypeId, ColumnMetadata.named("user_type_id").withIndex(6).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

