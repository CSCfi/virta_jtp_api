package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QNumberedProcedures is a Querydsl query type for QNumberedProcedures
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QNumberedProcedures extends com.querydsl.sql.RelationalPathBase<QNumberedProcedures> {

    private static final long serialVersionUID = 327133797;

    public static final QNumberedProcedures numberedProcedures = new QNumberedProcedures("numbered_procedures");

    public final StringPath definition = createString("definition");

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public final NumberPath<Short> procedureNumber = createNumber("procedureNumber", Short.class);

    public QNumberedProcedures(String variable) {
        super(QNumberedProcedures.class, forVariable(variable), "sys", "numbered_procedures");
        addMetadata();
    }

    public QNumberedProcedures(String variable, String schema, String table) {
        super(QNumberedProcedures.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QNumberedProcedures(Path<? extends QNumberedProcedures> path) {
        super(path.getType(), path.getMetadata(), "sys", "numbered_procedures");
        addMetadata();
    }

    public QNumberedProcedures(PathMetadata metadata) {
        super(QNumberedProcedures.class, metadata, "sys", "numbered_procedures");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(definition, ColumnMetadata.named("definition").withIndex(3).ofType(Types.NVARCHAR).withSize(2147483647));
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(procedureNumber, ColumnMetadata.named("procedure_number").withIndex(2).ofType(Types.SMALLINT).withSize(5));
    }

}

