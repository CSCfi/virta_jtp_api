package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QServiceMessageTypes is a Querydsl query type for QServiceMessageTypes
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QServiceMessageTypes extends com.querydsl.sql.RelationalPathBase<QServiceMessageTypes> {

    private static final long serialVersionUID = -622187254;

    public static final QServiceMessageTypes serviceMessageTypes = new QServiceMessageTypes("service_message_types");

    public final NumberPath<Integer> messageTypeId = createNumber("messageTypeId", Integer.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> principalId = createNumber("principalId", Integer.class);

    public final StringPath validation = createString("validation");

    public final StringPath validationDesc = createString("validationDesc");

    public final NumberPath<Integer> xmlCollectionId = createNumber("xmlCollectionId", Integer.class);

    public QServiceMessageTypes(String variable) {
        super(QServiceMessageTypes.class, forVariable(variable), "sys", "service_message_types");
        addMetadata();
    }

    public QServiceMessageTypes(String variable, String schema, String table) {
        super(QServiceMessageTypes.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QServiceMessageTypes(Path<? extends QServiceMessageTypes> path) {
        super(path.getType(), path.getMetadata(), "sys", "service_message_types");
        addMetadata();
    }

    public QServiceMessageTypes(PathMetadata metadata) {
        super(QServiceMessageTypes.class, metadata, "sys", "service_message_types");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(messageTypeId, ColumnMetadata.named("message_type_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(principalId, ColumnMetadata.named("principal_id").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(validation, ColumnMetadata.named("validation").withIndex(4).ofType(Types.CHAR).withSize(2).notNull());
        addMetadata(validationDesc, ColumnMetadata.named("validation_desc").withIndex(5).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(xmlCollectionId, ColumnMetadata.named("xml_collection_id").withIndex(6).ofType(Types.INTEGER).withSize(10));
    }

}

