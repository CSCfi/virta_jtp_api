package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSysopentapes is a Querydsl query type for QSysopentapes
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSysopentapes extends com.querydsl.sql.RelationalPathBase<QSysopentapes> {

    private static final long serialVersionUID = 858613687;

    public static final QSysopentapes sysopentapes = new QSysopentapes("sysopentapes");

    public final StringPath openTape = createString("openTape");

    public QSysopentapes(String variable) {
        super(QSysopentapes.class, forVariable(variable), "sys", "sysopentapes");
        addMetadata();
    }

    public QSysopentapes(String variable, String schema, String table) {
        super(QSysopentapes.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSysopentapes(Path<? extends QSysopentapes> path) {
        super(path.getType(), path.getMetadata(), "sys", "sysopentapes");
        addMetadata();
    }

    public QSysopentapes(PathMetadata metadata) {
        super(QSysopentapes.class, metadata, "sys", "sysopentapes");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(openTape, ColumnMetadata.named("openTape").withIndex(1).ofType(Types.NVARCHAR).withSize(64).notNull());
    }

}

