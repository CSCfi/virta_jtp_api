package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;

@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class Qduplikaatit extends com.querydsl.sql.RelationalPathBase<Qduplikaatit>{
    
    private static final long serialVersionUID = 1234567890;

    public static final Qduplikaatit duplikaatit = new Qduplikaatit("duplikaatit");

	public final NumberPath<Long> duplikaattiID = createNumber("duplikaattiID", Long.class);
        public final StringPath organisaatiotunnus = createString("organisaatiotunnus");
	public final StringPath organisaationimi = createString("organisaationimi");
        public final StringPath julkaisuntunnus = createString("julkaisuntunnus");
	public final StringPath kuvaus = createString("kuvaus");
        public final StringPath julkaisunorgtunnus = createString("julkaisunorgtunnus");
        public final StringPath duplikaattijulkaisunorgtunnus = createString("duplikaattijulkaisunorgtunnus");
	public final StringPath julkaisunnimi = createString("julkaisunnimi");
        public final StringPath duplikaattijulkaisunnimi = createString("duplikaattijulkaisunnimi");
	public final StringPath julkaisutyyppikoodi = createString("julkaisutyyppikoodi");
        public final NumberPath<Integer> tila = createNumber("tila", Integer.class);
        public final NumberPath<Integer> tarkistusID = createNumber("tarkistusID", Integer.class);	
	public final StringPath luontipaivamaara = createString("luontipaivamaara");
	public final NumberPath<Integer> ilmoitusvuosi = createNumber("ilmoitusvuosi", Integer.class);	
	public final NumberPath<Integer> julkaisuvuosi = createNumber("julkaisuvuosi", Integer.class);	     


    public Qduplikaatit(String variable) {
        super(Qduplikaatit.class, forVariable(variable), "web", "duplikaatit");
        addMetadata();
    }

    public Qduplikaatit(String variable, String schema, String table) {
        super(Qduplikaatit.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public Qduplikaatit(Path<? extends Qduplikaatit> path) {
        super(path.getType(), path.getMetadata(), "web", "duplikaatit");
        addMetadata();
    }

    public Qduplikaatit(PathMetadata metadata) {
        super(Qduplikaatit.class, metadata, "web", "duplikaatit");
        addMetadata();
    }

    public void addMetadata() {

        addMetadata(duplikaattiID, ColumnMetadata.named("duplikaattiID").withIndex(1).ofType(Types.BIGINT).withSize(19));
        addMetadata(organisaatiotunnus, ColumnMetadata.named("organisaatiotunnus").withIndex(2).ofType(Types.NVARCHAR).withSize(20));
	addMetadata(organisaationimi, ColumnMetadata.named("organisaationimi").withIndex(3).ofType(Types.NVARCHAR).withSize(100));
        addMetadata(julkaisuntunnus, ColumnMetadata.named("julkaisuntunnus").withIndex(4).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(kuvaus, ColumnMetadata.named("Kuvaus").withIndex(5).ofType(Types.NVARCHAR).withSize(100));
	addMetadata(julkaisunorgtunnus, ColumnMetadata.named("julkaisunorgtunnus").withIndex(6).ofType(Types.NVARCHAR).withSize(100));
        addMetadata(duplikaattijulkaisunorgtunnus, ColumnMetadata.named("duplikaattijulkaisunorgtunnus").withIndex(7).ofType(Types.NVARCHAR).withSize(100));
	addMetadata(julkaisunnimi, ColumnMetadata.named("julkaisunnimi").withIndex(8).ofType(Types.NVARCHAR).withSize(500));
        addMetadata(duplikaattijulkaisunnimi, ColumnMetadata.named("duplikaattijulkaisunnimi").withIndex(9).ofType(Types.NVARCHAR).withSize(500));
	addMetadata(julkaisutyyppikoodi, ColumnMetadata.named("julkaisutyyppikoodi").withIndex(10).ofType(Types.NVARCHAR).withSize(2));
	addMetadata(tila, ColumnMetadata.named("tila").withIndex(11).ofType(Types.INTEGER).withSize(10));
	addMetadata(tarkistusID, ColumnMetadata.named("tarkistusID").withIndex(12).ofType(Types.INTEGER).withSize(10));
	addMetadata(luontipaivamaara, ColumnMetadata.named("luontipaivamaara").withIndex(13).ofType(Types.NVARCHAR).withSize(12));
	addMetadata(ilmoitusvuosi, ColumnMetadata.named("ilmoitusvuosi").withIndex(14).ofType(Types.INTEGER).withSize(10));	
	addMetadata(julkaisuvuosi, ColumnMetadata.named("julkaisuvuosi").withIndex(15).ofType(Types.INTEGER).withSize(10));

    }
    
}
