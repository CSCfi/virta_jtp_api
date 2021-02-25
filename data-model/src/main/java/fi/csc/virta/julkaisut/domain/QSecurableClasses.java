package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSecurableClasses is a Querydsl query type for QSecurableClasses
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSecurableClasses extends com.querydsl.sql.RelationalPathBase<QSecurableClasses> {

    private static final long serialVersionUID = 45629403;

    public static final QSecurableClasses securableClasses = new QSecurableClasses("securable_classes");

    public final NumberPath<Integer> classCol = createNumber("classCol", Integer.class);

    public final StringPath classDesc = createString("classDesc");

    public QSecurableClasses(String variable) {
        super(QSecurableClasses.class, forVariable(variable), "sys", "securable_classes");
        addMetadata();
    }

    public QSecurableClasses(String variable, String schema, String table) {
        super(QSecurableClasses.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSecurableClasses(Path<? extends QSecurableClasses> path) {
        super(path.getType(), path.getMetadata(), "sys", "securable_classes");
        addMetadata();
    }

    public QSecurableClasses(PathMetadata metadata) {
        super(QSecurableClasses.class, metadata, "sys", "securable_classes");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(classCol, ColumnMetadata.named("class").withIndex(2).ofType(Types.INTEGER).withSize(10));
        addMetadata(classDesc, ColumnMetadata.named("class_desc").withIndex(1).ofType(Types.NVARCHAR).withSize(60));
    }

}

