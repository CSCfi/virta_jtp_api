package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QColumnStoreDictionaries is a Querydsl query type for QColumnStoreDictionaries
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QColumnStoreDictionaries extends com.querydsl.sql.RelationalPathBase<QColumnStoreDictionaries> {

    private static final long serialVersionUID = 1904158210;

    public static final QColumnStoreDictionaries columnStoreDictionaries = new QColumnStoreDictionaries("column_store_dictionaries");

    public final NumberPath<Integer> columnId = createNumber("columnId", Integer.class);

    public final NumberPath<Integer> dictionaryId = createNumber("dictionaryId", Integer.class);

    public final NumberPath<Long> entryCount = createNumber("entryCount", Long.class);

    public final NumberPath<Long> flags = createNumber("flags", Long.class);

    public final NumberPath<Long> hobtId = createNumber("hobtId", Long.class);

    public final NumberPath<Integer> lastId = createNumber("lastId", Integer.class);

    public final NumberPath<Long> onDiskSize = createNumber("onDiskSize", Long.class);

    public final NumberPath<Long> partitionId = createNumber("partitionId", Long.class);

    public final NumberPath<Integer> type = createNumber("type", Integer.class);

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QColumnStoreDictionaries(String variable) {
        super(QColumnStoreDictionaries.class, forVariable(variable), "sys", "column_store_dictionaries");
        addMetadata();
    }

    public QColumnStoreDictionaries(String variable, String schema, String table) {
        super(QColumnStoreDictionaries.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QColumnStoreDictionaries(Path<? extends QColumnStoreDictionaries> path) {
        super(path.getType(), path.getMetadata(), "sys", "column_store_dictionaries");
        addMetadata();
    }

    public QColumnStoreDictionaries(PathMetadata metadata) {
        super(QColumnStoreDictionaries.class, metadata, "sys", "column_store_dictionaries");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(columnId, ColumnMetadata.named("column_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(dictionaryId, ColumnMetadata.named("dictionary_id").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(entryCount, ColumnMetadata.named("entry_count").withIndex(9).ofType(Types.BIGINT).withSize(19));
        addMetadata(flags, ColumnMetadata.named("flags").withIndex(7).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(hobtId, ColumnMetadata.named("hobt_id").withIndex(2).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(lastId, ColumnMetadata.named("last_id").withIndex(8).ofType(Types.INTEGER).withSize(10));
        addMetadata(onDiskSize, ColumnMetadata.named("on_disk_size").withIndex(10).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(partitionId, ColumnMetadata.named("partition_id").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(type, ColumnMetadata.named("type").withIndex(6).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(version, ColumnMetadata.named("version").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

