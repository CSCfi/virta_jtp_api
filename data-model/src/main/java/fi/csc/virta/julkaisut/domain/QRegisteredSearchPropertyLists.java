package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QRegisteredSearchPropertyLists is a Querydsl query type for QRegisteredSearchPropertyLists
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QRegisteredSearchPropertyLists extends com.querydsl.sql.RelationalPathBase<QRegisteredSearchPropertyLists> {

    private static final long serialVersionUID = -1376390823;

    public static final QRegisteredSearchPropertyLists registeredSearchPropertyLists = new QRegisteredSearchPropertyLists("registered_search_property_lists");

    public final DateTimePath<java.sql.Timestamp> createDate = createDateTime("createDate", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> modifyDate = createDateTime("modifyDate", java.sql.Timestamp.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> principalId = createNumber("principalId", Integer.class);

    public final NumberPath<Integer> propertyListId = createNumber("propertyListId", Integer.class);

    public QRegisteredSearchPropertyLists(String variable) {
        super(QRegisteredSearchPropertyLists.class, forVariable(variable), "sys", "registered_search_property_lists");
        addMetadata();
    }

    public QRegisteredSearchPropertyLists(String variable, String schema, String table) {
        super(QRegisteredSearchPropertyLists.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QRegisteredSearchPropertyLists(Path<? extends QRegisteredSearchPropertyLists> path) {
        super(path.getType(), path.getMetadata(), "sys", "registered_search_property_lists");
        addMetadata();
    }

    public QRegisteredSearchPropertyLists(PathMetadata metadata) {
        super(QRegisteredSearchPropertyLists.class, metadata, "sys", "registered_search_property_lists");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(createDate, ColumnMetadata.named("create_date").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(modifyDate, ColumnMetadata.named("modify_date").withIndex(4).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(principalId, ColumnMetadata.named("principal_id").withIndex(5).ofType(Types.INTEGER).withSize(10));
        addMetadata(propertyListId, ColumnMetadata.named("property_list_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

