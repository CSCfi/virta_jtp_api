package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSyspermissions is a Querydsl query type for QSyspermissions
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSyspermissions extends com.querydsl.sql.RelationalPathBase<QSyspermissions> {

    private static final long serialVersionUID = 734423220;

    public static final QSyspermissions syspermissions = new QSyspermissions("syspermissions");

    public final NumberPath<Short> actadd = createNumber("actadd", Short.class);

    public final NumberPath<Short> actmod = createNumber("actmod", Short.class);

    public final NumberPath<Short> grantee = createNumber("grantee", Short.class);

    public final NumberPath<Short> grantor = createNumber("grantor", Short.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final SimplePath<byte[]> refadd = createSimple("refadd", byte[].class);

    public final SimplePath<byte[]> refmod = createSimple("refmod", byte[].class);

    public final SimplePath<byte[]> seladd = createSimple("seladd", byte[].class);

    public final SimplePath<byte[]> selmod = createSimple("selmod", byte[].class);

    public final SimplePath<byte[]> updadd = createSimple("updadd", byte[].class);

    public final SimplePath<byte[]> updmod = createSimple("updmod", byte[].class);

    public QSyspermissions(String variable) {
        super(QSyspermissions.class, forVariable(variable), "sys", "syspermissions");
        addMetadata();
    }

    public QSyspermissions(String variable, String schema, String table) {
        super(QSyspermissions.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSyspermissions(Path<? extends QSyspermissions> path) {
        super(path.getType(), path.getMetadata(), "sys", "syspermissions");
        addMetadata();
    }

    public QSyspermissions(PathMetadata metadata) {
        super(QSyspermissions.class, metadata, "sys", "syspermissions");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(actadd, ColumnMetadata.named("actadd").withIndex(4).ofType(Types.SMALLINT).withSize(5));
        addMetadata(actmod, ColumnMetadata.named("actmod").withIndex(5).ofType(Types.SMALLINT).withSize(5));
        addMetadata(grantee, ColumnMetadata.named("grantee").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(grantor, ColumnMetadata.named("grantor").withIndex(3).ofType(Types.SMALLINT).withSize(5));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(refadd, ColumnMetadata.named("refadd").withIndex(10).ofType(Types.VARBINARY).withSize(4000));
        addMetadata(refmod, ColumnMetadata.named("refmod").withIndex(11).ofType(Types.VARBINARY).withSize(4000));
        addMetadata(seladd, ColumnMetadata.named("seladd").withIndex(6).ofType(Types.VARBINARY).withSize(4000));
        addMetadata(selmod, ColumnMetadata.named("selmod").withIndex(7).ofType(Types.VARBINARY).withSize(4000));
        addMetadata(updadd, ColumnMetadata.named("updadd").withIndex(8).ofType(Types.VARBINARY).withSize(4000));
        addMetadata(updmod, ColumnMetadata.named("updmod").withIndex(9).ofType(Types.VARBINARY).withSize(4000));
    }

}

