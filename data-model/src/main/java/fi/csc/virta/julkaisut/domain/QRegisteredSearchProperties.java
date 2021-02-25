package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QRegisteredSearchProperties is a Querydsl query type for QRegisteredSearchProperties
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QRegisteredSearchProperties extends com.querydsl.sql.RelationalPathBase<QRegisteredSearchProperties> {

    private static final long serialVersionUID = -681984710;

    public static final QRegisteredSearchProperties registeredSearchProperties = new QRegisteredSearchProperties("registered_search_properties");

    public final StringPath propertyDescription = createString("propertyDescription");

    public final NumberPath<Integer> propertyId = createNumber("propertyId", Integer.class);

    public final NumberPath<Integer> propertyIntId = createNumber("propertyIntId", Integer.class);

    public final NumberPath<Integer> propertyListId = createNumber("propertyListId", Integer.class);

    public final StringPath propertyName = createString("propertyName");

    public final StringPath propertySetGuid = createString("propertySetGuid");

    public QRegisteredSearchProperties(String variable) {
        super(QRegisteredSearchProperties.class, forVariable(variable), "sys", "registered_search_properties");
        addMetadata();
    }

    public QRegisteredSearchProperties(String variable, String schema, String table) {
        super(QRegisteredSearchProperties.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QRegisteredSearchProperties(Path<? extends QRegisteredSearchProperties> path) {
        super(path.getType(), path.getMetadata(), "sys", "registered_search_properties");
        addMetadata();
    }

    public QRegisteredSearchProperties(PathMetadata metadata) {
        super(QRegisteredSearchProperties.class, metadata, "sys", "registered_search_properties");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(propertyDescription, ColumnMetadata.named("property_description").withIndex(6).ofType(Types.NVARCHAR).withSize(512));
        addMetadata(propertyId, ColumnMetadata.named("property_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(propertyIntId, ColumnMetadata.named("property_int_id").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(propertyListId, ColumnMetadata.named("property_list_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(propertyName, ColumnMetadata.named("property_name").withIndex(3).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(propertySetGuid, ColumnMetadata.named("property_set_guid").withIndex(4).ofType(Types.CHAR).withSize(36).notNull());
    }

}

