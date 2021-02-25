package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmAuditClassTypeMap is a Querydsl query type for QDmAuditClassTypeMap
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmAuditClassTypeMap extends com.querydsl.sql.RelationalPathBase<QDmAuditClassTypeMap> {

    private static final long serialVersionUID = 1082543647;

    public static final QDmAuditClassTypeMap dmAuditClassTypeMap = new QDmAuditClassTypeMap("dm_audit_class_type_map");

    public final StringPath classType = createString("classType");

    public final StringPath classTypeDesc = createString("classTypeDesc");

    public final StringPath securableClassDesc = createString("securableClassDesc");

    public QDmAuditClassTypeMap(String variable) {
        super(QDmAuditClassTypeMap.class, forVariable(variable), "sys", "dm_audit_class_type_map");
        addMetadata();
    }

    public QDmAuditClassTypeMap(String variable, String schema, String table) {
        super(QDmAuditClassTypeMap.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmAuditClassTypeMap(Path<? extends QDmAuditClassTypeMap> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_audit_class_type_map");
        addMetadata();
    }

    public QDmAuditClassTypeMap(PathMetadata metadata) {
        super(QDmAuditClassTypeMap.class, metadata, "sys", "dm_audit_class_type_map");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(classType, ColumnMetadata.named("class_type").withIndex(1).ofType(Types.VARCHAR).withSize(2));
        addMetadata(classTypeDesc, ColumnMetadata.named("class_type_desc").withIndex(2).ofType(Types.NVARCHAR).withSize(35));
        addMetadata(securableClassDesc, ColumnMetadata.named("securable_class_desc").withIndex(3).ofType(Types.NVARCHAR).withSize(35));
    }

}

