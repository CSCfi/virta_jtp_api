package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAvainsanatF is a Querydsl query type for QAvainsanatF
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAvainsanatF extends com.querydsl.sql.RelationalPathBase<QAvainsanatF> {

    private static final long serialVersionUID = 2113689287;

    public static final QAvainsanatF avainsanatF = new QAvainsanatF("avainsanat_f");

    public final NumberPath<Long> avain = createNumber("avain", Long.class);

    public final NumberPath<Long> julkaisuID = createNumber("julkaisuID", Long.class);

    public final StringPath sana = createString("sana");

    public final com.querydsl.sql.PrimaryKey<QAvainsanatF> df77136ce5Pk = createPrimaryKey(avain);

    public QAvainsanatF(String variable) {
        super(QAvainsanatF.class, forVariable(variable), "web", "avainsanat_f");
        addMetadata();
    }

    public QAvainsanatF(String variable, String schema, String table) {
        super(QAvainsanatF.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAvainsanatF(Path<? extends QAvainsanatF> path) {
        super(path.getType(), path.getMetadata(), "web", "avainsanat_f");
        addMetadata();
    }

    public QAvainsanatF(PathMetadata metadata) {
        super(QAvainsanatF.class, metadata, "web", "avainsanat_f");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(avain, ColumnMetadata.named("avain").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(julkaisuID, ColumnMetadata.named("JulkaisuID").withIndex(2).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(sana, ColumnMetadata.named("Sana").withIndex(3).ofType(Types.NVARCHAR).withSize(100));
    }

}

