package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSyscharsets is a Querydsl query type for QSyscharsets
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSyscharsets extends com.querydsl.sql.RelationalPathBase<QSyscharsets> {

    private static final long serialVersionUID = 1967866487;

    public static final QSyscharsets syscharsets = new QSyscharsets("syscharsets");

    public final SimplePath<byte[]> binarydefinition = createSimple("binarydefinition", byte[].class);

    public final NumberPath<Byte> csid = createNumber("csid", Byte.class);

    public final SimplePath<byte[]> definition = createSimple("definition", byte[].class);

    public final StringPath description = createString("description");

    public final NumberPath<Byte> id = createNumber("id", Byte.class);

    public final StringPath name = createString("name");

    public final NumberPath<Short> status = createNumber("status", Short.class);

    public final NumberPath<Short> type = createNumber("type", Short.class);

    public QSyscharsets(String variable) {
        super(QSyscharsets.class, forVariable(variable), "sys", "syscharsets");
        addMetadata();
    }

    public QSyscharsets(String variable, String schema, String table) {
        super(QSyscharsets.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSyscharsets(Path<? extends QSyscharsets> path) {
        super(path.getType(), path.getMetadata(), "sys", "syscharsets");
        addMetadata();
    }

    public QSyscharsets(PathMetadata metadata) {
        super(QSyscharsets.class, metadata, "sys", "syscharsets");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(binarydefinition, ColumnMetadata.named("binarydefinition").withIndex(7).ofType(Types.VARBINARY).withSize(6000));
        addMetadata(csid, ColumnMetadata.named("csid").withIndex(3).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(definition, ColumnMetadata.named("definition").withIndex(8).ofType(Types.LONGVARBINARY).withSize(2147483647));
        addMetadata(description, ColumnMetadata.named("description").withIndex(6).ofType(Types.NVARCHAR).withSize(255).notNull());
        addMetadata(id, ColumnMetadata.named("id").withIndex(2).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(5).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(status, ColumnMetadata.named("status").withIndex(4).ofType(Types.SMALLINT).withSize(5));
        addMetadata(type, ColumnMetadata.named("type").withIndex(1).ofType(Types.SMALLINT).withSize(5).notNull());
    }

}

