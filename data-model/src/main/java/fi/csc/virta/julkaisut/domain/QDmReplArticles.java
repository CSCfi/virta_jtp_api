package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmReplArticles is a Querydsl query type for QDmReplArticles
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmReplArticles extends com.querydsl.sql.RelationalPathBase<QDmReplArticles> {

    private static final long serialVersionUID = 1711280914;

    public static final QDmReplArticles dmReplArticles = new QDmReplArticles("dm_repl_articles");

    public final SimplePath<byte[]> artcacheArticleAddress = createSimple("artcacheArticleAddress", byte[].class);

    public final SimplePath<byte[]> artcacheDbAddress = createSimple("artcacheDbAddress", byte[].class);

    public final SimplePath<byte[]> artcacheSchemaAddress = createSimple("artcacheSchemaAddress", byte[].class);

    public final SimplePath<byte[]> artcacheTableAddress = createSimple("artcacheTableAddress", byte[].class);

    public final NumberPath<Byte> artcmdtype = createNumber("artcmdtype", Byte.class);

    public final NumberPath<Integer> artfilter = createNumber("artfilter", Integer.class);

    public final StringPath artgendel2cmd = createString("artgendel2cmd");

    public final StringPath artgendelcmd = createString("artgendelcmd");

    public final StringPath artgenins2cmd = createString("artgenins2cmd");

    public final StringPath artgeninscmd = createString("artgeninscmd");

    public final StringPath artgenupdcmd = createString("artgenupdcmd");

    public final NumberPath<Integer> artid = createNumber("artid", Integer.class);

    public final NumberPath<Integer> artobjid = createNumber("artobjid", Integer.class);

    public final StringPath artpartialupdcmd = createString("artpartialupdcmd");

    public final NumberPath<Integer> artpubid = createNumber("artpubid", Integer.class);

    public final NumberPath<Byte> artstatus = createNumber("artstatus", Byte.class);

    public final NumberPath<Byte> arttype = createNumber("arttype", Byte.class);

    public final StringPath artupdtxtcmd = createString("artupdtxtcmd");

    public final NumberPath<Integer> cmdTypeDel = createNumber("cmdTypeDel", Integer.class);

    public final NumberPath<Integer> cmdTypeIns = createNumber("cmdTypeIns", Integer.class);

    public final NumberPath<Integer> cmdTypePartialUpd = createNumber("cmdTypePartialUpd", Integer.class);

    public final NumberPath<Integer> cmdTypeUpd = createNumber("cmdTypeUpd", Integer.class);

    public final NumberPath<Byte> fInReconcile = createNumber("fInReconcile", Byte.class);

    public final NumberPath<Byte> fPubAllowUpdate = createNumber("fPubAllowUpdate", Byte.class);

    public final NumberPath<Integer> intPublicationOptions = createNumber("intPublicationOptions", Integer.class);

    public final NumberPath<Integer> numcol = createNumber("numcol", Integer.class);

    public final StringPath wszArtdelcmd = createString("wszArtdelcmd");

    public final StringPath wszArtdesttable = createString("wszArtdesttable");

    public final StringPath wszArtdesttableowner = createString("wszArtdesttableowner");

    public final StringPath wszArtinscmd = createString("wszArtinscmd");

    public final StringPath wszArtpartialupdcmd = createString("wszArtpartialupdcmd");

    public final StringPath wszArtupdcmd = createString("wszArtupdcmd");

    public QDmReplArticles(String variable) {
        super(QDmReplArticles.class, forVariable(variable), "sys", "dm_repl_articles");
        addMetadata();
    }

    public QDmReplArticles(String variable, String schema, String table) {
        super(QDmReplArticles.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmReplArticles(Path<? extends QDmReplArticles> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_repl_articles");
        addMetadata();
    }

    public QDmReplArticles(PathMetadata metadata) {
        super(QDmReplArticles.class, metadata, "sys", "dm_repl_articles");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(artcacheArticleAddress, ColumnMetadata.named("artcache_article_address").withIndex(4).ofType(Types.VARBINARY).withSize(8));
        addMetadata(artcacheDbAddress, ColumnMetadata.named("artcache_db_address").withIndex(1).ofType(Types.VARBINARY).withSize(8));
        addMetadata(artcacheSchemaAddress, ColumnMetadata.named("artcache_schema_address").withIndex(3).ofType(Types.VARBINARY).withSize(8));
        addMetadata(artcacheTableAddress, ColumnMetadata.named("artcache_table_address").withIndex(2).ofType(Types.VARBINARY).withSize(8));
        addMetadata(artcmdtype, ColumnMetadata.named("artcmdtype").withIndex(22).ofType(Types.TINYINT).withSize(3));
        addMetadata(artfilter, ColumnMetadata.named("artfilter").withIndex(6).ofType(Types.INTEGER).withSize(10));
        addMetadata(artgendel2cmd, ColumnMetadata.named("artgendel2cmd").withIndex(29).ofType(Types.NVARCHAR).withSize(4000));
        addMetadata(artgendelcmd, ColumnMetadata.named("artgendelcmd").withIndex(24).ofType(Types.NVARCHAR).withSize(4000));
        addMetadata(artgenins2cmd, ColumnMetadata.named("artgenins2cmd").withIndex(28).ofType(Types.NVARCHAR).withSize(4000));
        addMetadata(artgeninscmd, ColumnMetadata.named("artgeninscmd").withIndex(23).ofType(Types.NVARCHAR).withSize(4000));
        addMetadata(artgenupdcmd, ColumnMetadata.named("artgenupdcmd").withIndex(25).ofType(Types.NVARCHAR).withSize(4000));
        addMetadata(artid, ColumnMetadata.named("artid").withIndex(5).ofType(Types.INTEGER).withSize(10));
        addMetadata(artobjid, ColumnMetadata.named("artobjid").withIndex(7).ofType(Types.INTEGER).withSize(10));
        addMetadata(artpartialupdcmd, ColumnMetadata.named("artpartialupdcmd").withIndex(26).ofType(Types.NVARCHAR).withSize(4000));
        addMetadata(artpubid, ColumnMetadata.named("artpubid").withIndex(8).ofType(Types.INTEGER).withSize(10));
        addMetadata(artstatus, ColumnMetadata.named("artstatus").withIndex(9).ofType(Types.TINYINT).withSize(3));
        addMetadata(arttype, ColumnMetadata.named("arttype").withIndex(10).ofType(Types.TINYINT).withSize(3));
        addMetadata(artupdtxtcmd, ColumnMetadata.named("artupdtxtcmd").withIndex(27).ofType(Types.NVARCHAR).withSize(4000));
        addMetadata(cmdTypeDel, ColumnMetadata.named("cmdTypeDel").withIndex(16).ofType(Types.INTEGER).withSize(10));
        addMetadata(cmdTypeIns, ColumnMetadata.named("cmdTypeIns").withIndex(14).ofType(Types.INTEGER).withSize(10));
        addMetadata(cmdTypePartialUpd, ColumnMetadata.named("cmdTypePartialUpd").withIndex(20).ofType(Types.INTEGER).withSize(10));
        addMetadata(cmdTypeUpd, ColumnMetadata.named("cmdTypeUpd").withIndex(18).ofType(Types.INTEGER).withSize(10));
        addMetadata(fInReconcile, ColumnMetadata.named("fInReconcile").withIndex(30).ofType(Types.TINYINT).withSize(3));
        addMetadata(fPubAllowUpdate, ColumnMetadata.named("fPubAllowUpdate").withIndex(31).ofType(Types.TINYINT).withSize(3));
        addMetadata(intPublicationOptions, ColumnMetadata.named("intPublicationOptions").withIndex(32).ofType(Types.INTEGER).withSize(10));
        addMetadata(numcol, ColumnMetadata.named("numcol").withIndex(21).ofType(Types.INTEGER).withSize(10));
        addMetadata(wszArtdelcmd, ColumnMetadata.named("wszArtdelcmd").withIndex(15).ofType(Types.NVARCHAR).withSize(258));
        addMetadata(wszArtdesttable, ColumnMetadata.named("wszArtdesttable").withIndex(11).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(wszArtdesttableowner, ColumnMetadata.named("wszArtdesttableowner").withIndex(12).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(wszArtinscmd, ColumnMetadata.named("wszArtinscmd").withIndex(13).ofType(Types.NVARCHAR).withSize(258));
        addMetadata(wszArtpartialupdcmd, ColumnMetadata.named("wszArtpartialupdcmd").withIndex(19).ofType(Types.NVARCHAR).withSize(258));
        addMetadata(wszArtupdcmd, ColumnMetadata.named("wszArtupdcmd").withIndex(17).ofType(Types.NVARCHAR).withSize(258));
    }

}

