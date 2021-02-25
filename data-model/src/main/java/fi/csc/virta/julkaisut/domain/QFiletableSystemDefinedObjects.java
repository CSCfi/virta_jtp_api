package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QFiletableSystemDefinedObjects is a Querydsl query type for QFiletableSystemDefinedObjects
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFiletableSystemDefinedObjects extends com.querydsl.sql.RelationalPathBase<QFiletableSystemDefinedObjects> {

    private static final long serialVersionUID = -445875441;

    public static final QFiletableSystemDefinedObjects filetableSystemDefinedObjects = new QFiletableSystemDefinedObjects("filetable_system_defined_objects");

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public final NumberPath<Integer> parentObjectId = createNumber("parentObjectId", Integer.class);

    public QFiletableSystemDefinedObjects(String variable) {
        super(QFiletableSystemDefinedObjects.class, forVariable(variable), "sys", "filetable_system_defined_objects");
        addMetadata();
    }

    public QFiletableSystemDefinedObjects(String variable, String schema, String table) {
        super(QFiletableSystemDefinedObjects.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFiletableSystemDefinedObjects(Path<? extends QFiletableSystemDefinedObjects> path) {
        super(path.getType(), path.getMetadata(), "sys", "filetable_system_defined_objects");
        addMetadata();
    }

    public QFiletableSystemDefinedObjects(PathMetadata metadata) {
        super(QFiletableSystemDefinedObjects.class, metadata, "sys", "filetable_system_defined_objects");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(parentObjectId, ColumnMetadata.named("parent_object_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

