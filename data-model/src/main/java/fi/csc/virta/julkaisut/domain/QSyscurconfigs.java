package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSyscurconfigs is a Querydsl query type for QSyscurconfigs
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSyscurconfigs extends com.querydsl.sql.RelationalPathBase<QSyscurconfigs> {

    private static final long serialVersionUID = -1659264767;

    public static final QSyscurconfigs syscurconfigs = new QSyscurconfigs("syscurconfigs");

    public final StringPath comment = createString("comment");

    public final NumberPath<Short> config = createNumber("config", Short.class);

    public final NumberPath<Short> status = createNumber("status", Short.class);

    public final NumberPath<Integer> value = createNumber("value", Integer.class);

    public QSyscurconfigs(String variable) {
        super(QSyscurconfigs.class, forVariable(variable), "sys", "syscurconfigs");
        addMetadata();
    }

    public QSyscurconfigs(String variable, String schema, String table) {
        super(QSyscurconfigs.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSyscurconfigs(Path<? extends QSyscurconfigs> path) {
        super(path.getType(), path.getMetadata(), "sys", "syscurconfigs");
        addMetadata();
    }

    public QSyscurconfigs(PathMetadata metadata) {
        super(QSyscurconfigs.class, metadata, "sys", "syscurconfigs");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(comment, ColumnMetadata.named("comment").withIndex(3).ofType(Types.NVARCHAR).withSize(255).notNull());
        addMetadata(config, ColumnMetadata.named("config").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(status, ColumnMetadata.named("status").withIndex(4).ofType(Types.SMALLINT).withSize(5));
        addMetadata(value, ColumnMetadata.named("value").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

