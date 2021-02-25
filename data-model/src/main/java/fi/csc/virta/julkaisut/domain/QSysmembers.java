package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSysmembers is a Querydsl query type for QSysmembers
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSysmembers extends com.querydsl.sql.RelationalPathBase<QSysmembers> {

    private static final long serialVersionUID = -142355127;

    public static final QSysmembers sysmembers = new QSysmembers("sysmembers");

    public final NumberPath<Short> groupuid = createNumber("groupuid", Short.class);

    public final NumberPath<Short> memberuid = createNumber("memberuid", Short.class);

    public QSysmembers(String variable) {
        super(QSysmembers.class, forVariable(variable), "sys", "sysmembers");
        addMetadata();
    }

    public QSysmembers(String variable, String schema, String table) {
        super(QSysmembers.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSysmembers(Path<? extends QSysmembers> path) {
        super(path.getType(), path.getMetadata(), "sys", "sysmembers");
        addMetadata();
    }

    public QSysmembers(PathMetadata metadata) {
        super(QSysmembers.class, metadata, "sys", "sysmembers");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(groupuid, ColumnMetadata.named("groupuid").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(memberuid, ColumnMetadata.named("memberuid").withIndex(1).ofType(Types.SMALLINT).withSize(5));
    }

}

