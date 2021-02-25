package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDataSpaces is a Querydsl query type for QDataSpaces
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDataSpaces extends com.querydsl.sql.RelationalPathBase<QDataSpaces> {

    private static final long serialVersionUID = -1890271212;

    public static final QDataSpaces dataSpaces = new QDataSpaces("data_spaces");

    public final NumberPath<Integer> dataSpaceId = createNumber("dataSpaceId", Integer.class);

    public final BooleanPath isDefault = createBoolean("isDefault");

    public final BooleanPath isSystem = createBoolean("isSystem");

    public final StringPath name = createString("name");

    public final StringPath type = createString("type");

    public final StringPath typeDesc = createString("typeDesc");

    public QDataSpaces(String variable) {
        super(QDataSpaces.class, forVariable(variable), "sys", "data_spaces");
        addMetadata();
    }

    public QDataSpaces(String variable, String schema, String table) {
        super(QDataSpaces.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDataSpaces(Path<? extends QDataSpaces> path) {
        super(path.getType(), path.getMetadata(), "sys", "data_spaces");
        addMetadata();
    }

    public QDataSpaces(PathMetadata metadata) {
        super(QDataSpaces.class, metadata, "sys", "data_spaces");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dataSpaceId, ColumnMetadata.named("data_space_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(isDefault, ColumnMetadata.named("is_default").withIndex(5).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isSystem, ColumnMetadata.named("is_system").withIndex(6).ofType(Types.BIT).withSize(1));
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(type, ColumnMetadata.named("type").withIndex(3).ofType(Types.CHAR).withSize(2).notNull());
        addMetadata(typeDesc, ColumnMetadata.named("type_desc").withIndex(4).ofType(Types.NVARCHAR).withSize(60));
    }

}

