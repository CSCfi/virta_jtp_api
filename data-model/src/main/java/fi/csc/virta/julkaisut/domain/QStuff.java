package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QStuff is a Querydsl query type for QStuff
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QStuff extends com.querydsl.sql.RelationalPathBase<QStuff> {

    private static final long serialVersionUID = -1849826249;

    public static final QStuff stuff = new QStuff("stuff");

    public final StringPath content = createString("content");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QStuff> _stuff_3213E83F1F7BF414PK = createPrimaryKey(id);

    public QStuff(String variable) {
        super(QStuff.class, forVariable(variable), "dbo", "stuff");
        addMetadata();
    }

    public QStuff(String variable, String schema, String table) {
        super(QStuff.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QStuff(Path<? extends QStuff> path) {
        super(path.getType(), path.getMetadata(), "dbo", "stuff");
        addMetadata();
    }

    public QStuff(PathMetadata metadata) {
        super(QStuff.class, metadata, "dbo", "stuff");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(content, ColumnMetadata.named("content").withIndex(2).ofType(Types.VARCHAR).withSize(255));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

