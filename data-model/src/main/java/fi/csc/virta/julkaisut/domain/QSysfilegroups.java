package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSysfilegroups is a Querydsl query type for QSysfilegroups
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSysfilegroups extends com.querydsl.sql.RelationalPathBase<QSysfilegroups> {

    private static final long serialVersionUID = 1943799840;

    public static final QSysfilegroups sysfilegroups = new QSysfilegroups("sysfilegroups");

    public final NumberPath<Short> allocpolicy = createNumber("allocpolicy", Short.class);

    public final NumberPath<Short> groupid = createNumber("groupid", Short.class);

    public final StringPath groupname = createString("groupname");

    public final NumberPath<Integer> status = createNumber("status", Integer.class);

    public QSysfilegroups(String variable) {
        super(QSysfilegroups.class, forVariable(variable), "sys", "sysfilegroups");
        addMetadata();
    }

    public QSysfilegroups(String variable, String schema, String table) {
        super(QSysfilegroups.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSysfilegroups(Path<? extends QSysfilegroups> path) {
        super(path.getType(), path.getMetadata(), "sys", "sysfilegroups");
        addMetadata();
    }

    public QSysfilegroups(PathMetadata metadata) {
        super(QSysfilegroups.class, metadata, "sys", "sysfilegroups");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(allocpolicy, ColumnMetadata.named("allocpolicy").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(groupid, ColumnMetadata.named("groupid").withIndex(1).ofType(Types.SMALLINT).withSize(5));
        addMetadata(groupname, ColumnMetadata.named("groupname").withIndex(4).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(status, ColumnMetadata.named("status").withIndex(3).ofType(Types.INTEGER).withSize(10));
    }

}

