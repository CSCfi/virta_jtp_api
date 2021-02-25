package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmClrProperties is a Querydsl query type for QDmClrProperties
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmClrProperties extends com.querydsl.sql.RelationalPathBase<QDmClrProperties> {

    private static final long serialVersionUID = 1473377206;

    public static final QDmClrProperties dmClrProperties = new QDmClrProperties("dm_clr_properties");

    public final StringPath name = createString("name");

    public final StringPath value = createString("value");

    public QDmClrProperties(String variable) {
        super(QDmClrProperties.class, forVariable(variable), "sys", "dm_clr_properties");
        addMetadata();
    }

    public QDmClrProperties(String variable, String schema, String table) {
        super(QDmClrProperties.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmClrProperties(Path<? extends QDmClrProperties> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_clr_properties");
        addMetadata();
    }

    public QDmClrProperties(PathMetadata metadata) {
        super(QDmClrProperties.class, metadata, "sys", "dm_clr_properties");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(value, ColumnMetadata.named("value").withIndex(2).ofType(Types.NVARCHAR).withSize(128));
    }

}

