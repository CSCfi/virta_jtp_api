package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSysfulltextcatalogs is a Querydsl query type for QSysfulltextcatalogs
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSysfulltextcatalogs extends com.querydsl.sql.RelationalPathBase<QSysfulltextcatalogs> {

    private static final long serialVersionUID = 1290852742;

    public static final QSysfulltextcatalogs sysfulltextcatalogs = new QSysfulltextcatalogs("sysfulltextcatalogs");

    public final NumberPath<Short> ftcatid = createNumber("ftcatid", Short.class);

    public final StringPath name = createString("name");

    public final StringPath path = createString("path");

    public final NumberPath<Short> status = createNumber("status", Short.class);

    public QSysfulltextcatalogs(String variable) {
        super(QSysfulltextcatalogs.class, forVariable(variable), "sys", "sysfulltextcatalogs");
        addMetadata();
    }

    public QSysfulltextcatalogs(String variable, String schema, String table) {
        super(QSysfulltextcatalogs.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSysfulltextcatalogs(Path<? extends QSysfulltextcatalogs> path) {
        super(path.getType(), path.getMetadata(), "sys", "sysfulltextcatalogs");
        addMetadata();
    }

    public QSysfulltextcatalogs(PathMetadata metadata) {
        super(QSysfulltextcatalogs.class, metadata, "sys", "sysfulltextcatalogs");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(ftcatid, ColumnMetadata.named("ftcatid").withIndex(1).ofType(Types.SMALLINT).withSize(5));
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(path, ColumnMetadata.named("path").withIndex(4).ofType(Types.NVARCHAR).withSize(260));
        addMetadata(status, ColumnMetadata.named("status").withIndex(3).ofType(Types.SMALLINT).withSize(5));
    }

}

