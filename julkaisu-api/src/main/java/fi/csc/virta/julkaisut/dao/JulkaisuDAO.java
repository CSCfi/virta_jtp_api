package fi.csc.virta.julkaisut.dao;

import com.lyncode.xoai.dataprovider.core.Set;
import com.querydsl.core.Tuple;
import com.querydsl.core.types.Expression;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.core.types.dsl.BooleanTemplate;
import com.querydsl.core.types.dsl.DateTimeExpression;
import com.querydsl.core.types.dsl.Expressions;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.SimpleExpression;
import com.querydsl.core.types.dsl.StringPath;
import com.querydsl.sql.RelationalPath;
import com.querydsl.sql.SQLBindings;
import com.querydsl.sql.SQLExpressions;
import com.querydsl.sql.SQLQuery;
import com.querydsl.sql.SQLTemplates;
import com.querydsl.sql.dml.SQLInsertClause;
import fi.csc.virta.julkaisut.Util.ObjectConverter;
import fi.csc.virta.julkaisut.Util.RawConverter;
import fi.csc.virta.julkaisut.config.AppConfig;
import fi.csc.virta.julkaisut.domain.Julkaisu;
import fi.csc.virta.julkaisut.domain.Juuli;
import static fi.csc.virta.julkaisut.domain.QAvainsanatF.avainsanatF;
import static fi.csc.virta.julkaisut.domain.QJulkaisunTieteenala.JulkaisunTieteenala;
import static fi.csc.virta.julkaisut.domain.QJulkaisunTaiteenala.JulkaisunTaiteenala;
import static fi.csc.virta.julkaisut.domain.QOpenaireCRISPublications.OpenaireCRISPublications; // Tyyppi = 1
import static fi.csc.virta.julkaisut.domain.QOpenaireCRISProducts.OpenaireCRISProducts;         // Tyyppi = 2
import static fi.csc.virta.julkaisut.domain.QOpenaireCRISPatents.OpenaireCRISPatents;           // Tyyppi = 3
import static fi.csc.virta.julkaisut.domain.QOpenaireCRISPersons.OpenaireCRISPersons;           // Tyyppi = 4
import static fi.csc.virta.julkaisut.domain.QOpenaireCRISOrgUnits.OpenaireCRISOrgUnits;         // Tyyppi = 5
import static fi.csc.virta.julkaisut.domain.QOpenaireCRISProjects.OpenaireCRISProjects;         // Tyyppi = 6
import static fi.csc.virta.julkaisut.domain.QOpenaireCRISFunding.OpenaireCRISFunding;           // Tyyppi = 7
import static fi.csc.virta.julkaisut.domain.QOpenaireCRISEvents.OpenaireCRISEvents;             // Tyyppi = 8
import static fi.csc.virta.julkaisut.domain.QOpenaireCRISEquipments.OpenaireCRISEquipments;     // Tyyppi = 9
import static fi.csc.virta.julkaisut.domain.QJulkaisut.Julkaisut;
import static fi.csc.virta.julkaisut.domain.QJulkaisutDC.JulkaisutDC;
import static fi.csc.virta.julkaisut.domain.QCERIF.CERIF;
import static fi.csc.virta.julkaisut.domain.QTekijatCERIF.TekijatCERIF;
import static fi.csc.virta.julkaisut.domain.QTapahtumatCERIF.TapahtumatCERIF;
import static fi.csc.virta.julkaisut.domain.QOrganisaatiotCERIF.OrganisaatiotCERIF;
import static fi.csc.virta.julkaisut.domain.QJulkaisutF.julkaisutF;
import static fi.csc.virta.julkaisut.domain.QJulkaisutXML.JulkaisutXML;
import static fi.csc.virta.julkaisut.domain.QJuuliTemp.JuuliTemp;
import static fi.csc.virta.julkaisut.domain.QOrganisaatio.Organisaatio;
import static fi.csc.virta.julkaisut.domain.QTieteenalaLuokitus.TieteenalaLuokitus;
import static fi.csc.virta.julkaisut.domain.QTaiteenalaLuokitus.TaiteenalaLuokitus;
import fi.csc.virta.julkaisut.domain.SearchQuery;
import org.apache.commons.lang3.StringUtils;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Data access class for {@link fi.csc.virta.julkaisut.domain.Julkaisu} objects.
 */
public class JulkaisuDAO extends AbstractDAO<Julkaisu> {

    private static final String LAST_DATE_ALIAS = "lastDate";
    private static final String TIETEENALA = "tieteenala";
    private static final String TAITEENALA = "taiteenala";
    private static final String ORGANISAATIO = "organisaatio";
    private static final String JULKAISU_TYYPPI = "julkaisuTyyppi";
    private static final String AVOIN_SAATAVUUS = "avoinSaatavuus";
    private static final String OPENAIRE_CRIS_PUBLICATIONS = "openaire_cris_publications";
    private static final String OPENAIRE_CRIS_PRODUCTS = "openaire_cris_products";
    private static final String OPENAIRE_CRIS_PATENTS = "openaire_cris_patents";
    private static final String OPENAIRE_CRIS_PERSONS = "openaire_cris_persons";
    private static final String OPENAIRE_CRIS_ORGUNITS = "openaire_cris_orgunits";
    private static final String OPENAIRE_CRIS_PROJECTS = "openaire_cris_projects";
    private static final String OPENAIRE_CRIS_FUNDING = "openaire_cris_funding";
    private static final String OPENAIRE_CRIS_EVENTS = "openaire_cris_events";
    private static final String OPENAIRE_CRIS_EQUIPMENTS = "openaire_cris_equipments";
    private static final String JULKAISUT = "julkaisut";
    private static final String JULKAISUT_DC = "oai_dc";
    private static final String JULKAISUT_CERIF_XML = "oai_cerif_openaire";

    public JulkaisuDAO(AppConfig config) {
        super(config);
    }

    public JulkaisuDAO(SQLTemplates templates, AppConfig config) {
        super(templates, config);
    }

    public void getAll(ObjectConverter<Julkaisu> converter, String orgId) {
        final SQLQuery<Tuple> query = queryFactory.select(JulkaisutXML.julkaisuID, JulkaisutXML.xmldata, julkaisutF.muutospvm, julkaisutF.luontipvm)
                .from(JulkaisutXML).leftJoin(julkaisutF).on(JulkaisutXML.julkaisuID.eq(julkaisutF.julkaisuID));
        addOrganizationCondition(query, julkaisutF.orgTunnus, orgId);
        select(query.getSQL(), converter);
    }

    public void getAllXml(RawConverter converter, String orgId) {
        final SQLQuery<Tuple> query = queryFactory.select(JulkaisutXML.julkaisuID, JulkaisutXML.xmldata)
                .from(JulkaisutXML).leftJoin(julkaisutF).on(JulkaisutXML.julkaisuID.eq(julkaisutF.julkaisuID));
        addOrganizationCondition(query, julkaisutF.orgTunnus, orgId);
        select(query.getSQL(), converter);
    }

    public void getByJulkaisunTunnus(RawConverter converter, String julkaisunTunnus, String orgId) {
        SQLBindings sql = getByJulkaisunTunnusSql(julkaisunTunnus, orgId);
        select(sql, converter);
    }

    public void search(SearchQuery searchQuery, ObjectConverter<Julkaisu> converter, String orgId) {
        SQLBindings sql = getSearchSql(searchQuery, orgId);
        select(sql, converter);
    }

    public void search(SearchQuery searchQuery, RawConverter converter, String orgId) {
        SQLBindings sql = getSearchSql(searchQuery, orgId);
        select(sql, converter);
    }

    public Long createJuuliUrl(Juuli juuli, String orgId) throws SQLException {
        checkJulkaisu(juuli.getJulkaisunTunnus(), orgId);
        if (exists(juuli)) {
            log.info("Juuli URL for julkaisunTunnus {} already exists. Updating Juuli URL to {}",
                    juuli.getJulkaisunTunnus(), juuli.getJuuliURL());
            updateJuuliUrl(juuli);
            return null;
        }
        KeyListener listener = new KeyListener();
        SQLInsertClause insert = queryFactory.insert(JuuliTemp);
        insert.addListener(listener);
        insert.columns(JuuliTemp.julkaisunTunnus,
                JuuliTemp.juuliID, JuuliTemp.luontipaivamaara)
                .values(juuli.getJulkaisunTunnus(), juuli.getJuuliURL(), new Timestamp(System.currentTimeMillis()))
                .executeWithKeys();

        Long key = listener.getKey();
        log.info("Created Juuli-URL with id {}", key);
        return key;
    }

    public void updateJuuliUrl(Juuli juuli) {
        queryFactory.update(JuuliTemp)
                .set(JuuliTemp.juuliID, juuli.getJuuliURL())
                .set(JuuliTemp.paivityspaivamaara, new Timestamp(System.currentTimeMillis()))
                .where(JuuliTemp.julkaisunTunnus.eq(juuli.getJulkaisunTunnus()))
                .execute();
    }


    /* OE: this is used for getting persons, events, and orgunits, too.
    This is done by parsing the id
    */
    // TO DO
    public Tuple getJulkaisuByIdentifier(String id, String metaDataPrefix) {
        RelationalPath table = null;
        
        if (id.contains("Persons")) {
            table = TekijatCERIF;
            return queryFactory.select(
            //return queryFactory.selectDistinct(
                TekijatCERIF.luontipaivamaara,
                getXmldataPath(table),
                TekijatCERIF.identifier)
                .from(table)
                .where(TekijatCERIF.identifier.eq(id))
                .fetchFirst(); 
        } else if (id.contains("Events")) {
            table = TapahtumatCERIF;
            return queryFactory.select(
            //return queryFactory.selectDistinct(
                TapahtumatCERIF.luontipaivamaara,
                getXmldataPath(table),
                TapahtumatCERIF.identifier)
                .from(table)
                .where(TapahtumatCERIF.identifier.eq(id))
                .fetchFirst(); 
        } else if (id.contains("OrgUnits")) {
            table = OrganisaatiotCERIF;
            return queryFactory.select(
            //return queryFactory.selectDistinct(
                OrganisaatiotCERIF.luontipaivamaara,
                getXmldataPath(table),
                OrganisaatiotCERIF.identifier)
                .from(table)
                .where(OrganisaatiotCERIF.identifier.eq(id))
                .fetchFirst(); 
        } 
        else {         
            table = getTable(metaDataPrefix);       

            if (table.equals(CERIF)) {
                return queryFactory.select(
                    lastDateSubQueryCERIF(),
                    getXmldataPath(table),
                    CERIF.identifier)
                    .from(table)
                    //.leftJoin(Julkaisut).on(getJulkaisuIdPath(table).eq(Julkaisut.julkaisuID))
                    .where(CERIF.identifier.eq(id))
                    .fetchFirst(); 
            } else {
                return queryFactory.select(
                    lastDateSubQuery(),
                    getXmldataPath(table),Julkaisut.julkaisunTunnus)
                    .from(table)
                    .leftJoin(Julkaisut).on(getJulkaisuIdPath(table).eq(Julkaisut.julkaisuID))
                    .where(Julkaisut.julkaisunTunnus.eq(id))
                    .fetchFirst();
            }
        }
    }
    
    // new
    public List<Tuple> getJulkaisutCERIF(int offset, int length, Date from, Date until, String setSpec, String metaDataPrefix) {       
        
        SQLQuery<Tuple> query = getTupleSQLQueryJulkaisutCERIF(offset, length, from, until,
                setSpec, metaDataPrefix, Expressions.dateTimePath(Date.class, LAST_DATE_ALIAS), Expressions.stringPath("xmldata"),
                Expressions.stringPath("identifier"));       
        
        return query.fetch();
    
    }

    
    public List<Tuple> getJulkaisut(int offset, int length, Date from, Date until, String setSpec, String metaDataPrefix) {
        
        SQLQuery<Tuple> query = getTupleSQLQuery(offset, length, from, until,
                setSpec, metaDataPrefix, Expressions.dateTimePath(Date.class, LAST_DATE_ALIAS), Expressions.stringPath("xmldata"),
                Expressions.stringPath("julkaisunTunnus"));
        
        return query.fetch();
        
//        // current solution
//        SQLQuery<Tuple> query = null;
//        if (metaDataPrefix.equals(JULKAISUT_CERIF_XML)) {
//            query = getTupleSQLQuery(offset, length, from, until,
//                setSpec, metaDataPrefix, Expressions.dateTimePath(Date.class, LAST_DATE_ALIAS), Expressions.stringPath("xmldata"),
//                Expressions.stringPath("identifier"));
//           
//        } else {
//            query = getTupleSQLQuery(offset, length, from, until,
//                setSpec, metaDataPrefix, Expressions.dateTimePath(Date.class, LAST_DATE_ALIAS), Expressions.stringPath("xmldata"),
//                Expressions.stringPath("julkaisunTunnus"));
//        }
//        return query.fetch();
   
  
    }

    
    // new
    public List<Tuple> getJulkaisuCERIFIdentifiers(int offset, int length, Date from, Date until, String setSpec, String metaDataPrefix) {
       
        SQLQuery<Tuple> query = getTupleSQLQueryJulkaisutCERIF(offset, length, from, until,
                setSpec, metaDataPrefix, Expressions.dateTimePath(Date.class, LAST_DATE_ALIAS), Expressions.stringPath("identifier"));
        
        return query.fetch();
        
    }
    
    
    public List<Tuple> getJulkaisuIdentifiers(int offset, int length, Date from, Date until, String setSpec, String metaDataPrefix) {

        SQLQuery<Tuple> query = getTupleSQLQuery(offset, length, from, until,
                setSpec, metaDataPrefix, Expressions.dateTimePath(Date.class, LAST_DATE_ALIAS), Expressions.stringPath("julkaisunTunnus"));
        
        return query.fetch();
        
    
        //// current solution
//        SQLQuery<Tuple> query = null;
//        if (metaDataPrefix.equals(JULKAISUT_CERIF_XML)) {
//            query = getTupleSQLQuery(offset, length, from, until,
//                setSpec, metaDataPrefix, Expressions.dateTimePath(Date.class, LAST_DATE_ALIAS), Expressions.stringPath("identifier"));
//        } else {
//            query = getTupleSQLQuery(offset, length, from, until,
//                setSpec, metaDataPrefix, Expressions.dateTimePath(Date.class, LAST_DATE_ALIAS), Expressions.stringPath("julkaisunTunnus"));
//        }
//        return query.fetch();
        
    }

    
    // new
    public Long getJulkaisutCERIFXmlCount(Date from, Date until, String setSpec, String metaDataPrefix) {
        return queryFactory.select().from(getTupleSubJulkaisutCERIF(setSpec, metaDataPrefix))
                .where(createBetween(Expressions.dateTimePath(Date.class, LAST_DATE_ALIAS), from, until))
                .fetchCount();
    }
    
    
    
    public Long getJulkaisutXmlCount(Date from, Date until, String setSpec, String metaDataPrefix) {
        return queryFactory.select().from(getTupleSub(setSpec, metaDataPrefix))
                .where(createBetween(Expressions.dateTimePath(Date.class, LAST_DATE_ALIAS), from, until))
                .fetchCount();
    }

    // TO DO
    public List<Set> getSets() {
        List<Set> sets = new ArrayList<>();
        List<Tuple> tieteenAlat = queryFactory.select(TieteenalaLuokitus.koodi, TieteenalaLuokitus.nimi)
                .from(TieteenalaLuokitus)
                .orderBy(TieteenalaLuokitus.koodi.asc())
                .fetch();
        addSets(sets, tieteenAlat, TIETEENALA, TieteenalaLuokitus.koodi, TieteenalaLuokitus.nimi);        
        
        List<Tuple> taiteenAlat = queryFactory.select(TaiteenalaLuokitus.koodi, TaiteenalaLuokitus.nimi)
                .from(TaiteenalaLuokitus)
                .orderBy(TaiteenalaLuokitus.koodi.asc())
                .fetch();
        addSets(sets, taiteenAlat, TAITEENALA, TaiteenalaLuokitus.koodi, TaiteenalaLuokitus.nimi);        
        
        List<Tuple> orgs = queryFactory.select(Organisaatio.orgTunnus, Organisaatio.nimi)
                .from(Organisaatio).orderBy(Organisaatio.orgTunnus.asc())
                .fetch();
        addSets(sets, orgs, ORGANISAATIO, Organisaatio.orgTunnus, Organisaatio.nimi);

        List<Tuple> julkaisuTyypit = queryFactory.selectDistinct(Julkaisut.julkaisuTyyppi, Julkaisut.julkaisuTyyppi)
                .from(Julkaisut)
                .where(Julkaisut.julkaisuTyyppi.isNotNull())
                .groupBy(Julkaisut.julkaisuTyyppi).orderBy(Julkaisut.julkaisuTyyppi.asc())
                .fetch();
        addSets(sets, julkaisuTyypit, JULKAISU_TYYPPI, Julkaisut.julkaisuTyyppi, Julkaisut.julkaisuTyyppi);

        List<Tuple> avoinSaatavuus = queryFactory.selectDistinct(Julkaisut.avoinSaatavuusKoodi, Julkaisut.avoinSaatavuusKoodi)
                .from(Julkaisut)
                .where(Julkaisut.avoinSaatavuusKoodi.isNotNull())
                .groupBy(Julkaisut.avoinSaatavuusKoodi).orderBy(Julkaisut.avoinSaatavuusKoodi.asc())
                .fetch();
        addSets(sets, avoinSaatavuus, AVOIN_SAATAVUUS, Julkaisut.avoinSaatavuusKoodi, Julkaisut.avoinSaatavuusKoodi);       
             
        /* here begins OPENAIRE part */
        // Publications
        List<Tuple> openaireCrisPublications = queryFactory.select(OpenaireCRISPublications.koodi, OpenaireCRISPublications.setName)
                .from(OpenaireCRISPublications)
                .fetch();    
        addSets(sets, openaireCrisPublications, OPENAIRE_CRIS_PUBLICATIONS, OpenaireCRISPublications.koodi, OpenaireCRISPublications.setName);  
        
        // Products
        List<Tuple> openaireCrisProducts = queryFactory.select(OpenaireCRISProducts.koodi, OpenaireCRISProducts.setName)
                .from(OpenaireCRISProducts)
                .fetch();    
        addSets(sets, openaireCrisProducts, OPENAIRE_CRIS_PRODUCTS, OpenaireCRISProducts.koodi, OpenaireCRISProducts.setName); 
        
        // Patents
        List<Tuple> openaireCrisPatents = queryFactory.select(OpenaireCRISPatents.koodi, OpenaireCRISPatents.setName)
                .from(OpenaireCRISPatents)
                .fetch();    
        addSets(sets, openaireCrisPatents, OPENAIRE_CRIS_PATENTS, OpenaireCRISPatents.koodi, OpenaireCRISPatents.setName);
        
        // Persons
        List<Tuple> openaireCrisPersons = queryFactory.select(OpenaireCRISPersons.koodi, OpenaireCRISPersons.setName)
                .from(OpenaireCRISPersons)
                .fetch();    
        addSets(sets, openaireCrisPersons, OPENAIRE_CRIS_PERSONS, OpenaireCRISPersons.koodi, OpenaireCRISPersons.setName);   
        
        // OrgUnits
        List<Tuple> openaireCrisOrgUnits = queryFactory.select(OpenaireCRISOrgUnits.koodi, OpenaireCRISOrgUnits.setName)
                .from(OpenaireCRISOrgUnits)
                .fetch();    
        addSets(sets, openaireCrisOrgUnits, OPENAIRE_CRIS_ORGUNITS, OpenaireCRISOrgUnits.koodi, OpenaireCRISOrgUnits.setName);
        
        // Projects
        List<Tuple> openaireCrisProjects = queryFactory.select(OpenaireCRISProjects.koodi, OpenaireCRISProjects.setName)
                .from(OpenaireCRISProjects)
                .fetch();    
        addSets(sets, openaireCrisProjects, OPENAIRE_CRIS_PROJECTS, OpenaireCRISProjects.koodi, OpenaireCRISProjects.setName);  
            
        // Funding
        List<Tuple> openaireCrisFunding = queryFactory.select(OpenaireCRISFunding.koodi, OpenaireCRISFunding.setName)
                .from(OpenaireCRISFunding)
                .fetch();    
        addSets(sets, openaireCrisFunding, OPENAIRE_CRIS_FUNDING, OpenaireCRISFunding.koodi, OpenaireCRISFunding.setName);
        
        // Events
        List<Tuple> openaireCrisEvents = queryFactory.select(OpenaireCRISEvents.koodi, OpenaireCRISEvents.setName)
                .from(OpenaireCRISEvents)
                .fetch();    
        addSets(sets, openaireCrisEvents, OPENAIRE_CRIS_EVENTS, OpenaireCRISEvents.koodi, OpenaireCRISEvents.setName);  
        
        // Equipments
        List<Tuple> openaireCrisEquipments = queryFactory.select(OpenaireCRISEquipments.koodi, OpenaireCRISEquipments.setName)
                .from(OpenaireCRISEquipments)
                .fetch();    
        addSets(sets, openaireCrisEquipments, OPENAIRE_CRIS_EQUIPMENTS, OpenaireCRISEquipments.koodi, OpenaireCRISEquipments.setName);  

        return sets;
    }

    private StringPath getXmldataPath(RelationalPath table) {
        return Expressions.stringPath(table, "xmldata");
    }   

    private NumberPath<Long> getJulkaisuIdPath(RelationalPath table) {
        return Expressions.numberPath(Long.class, table, "julkaisuID");
    }

    private RelationalPath getTable(String metaDataPrefix) {
        if (JULKAISUT_DC.equals(metaDataPrefix)) {
            return JulkaisutDC;
        }        
        if (JULKAISUT_CERIF_XML.equals(metaDataPrefix)) {
            return CERIF;
        }
        return JulkaisutXML;
    }
    
    // TO DO
    private void addSets(List<Set> sets, List<Tuple> results, String setSpec,
                         Path id, Path name) {
        for (Tuple t : results) {
            
            if (setSpec.equals(OPENAIRE_CRIS_PUBLICATIONS) ||
                    setSpec.equals(OPENAIRE_CRIS_PRODUCTS) ||
                    setSpec.equals(OPENAIRE_CRIS_PATENTS) ||
                    setSpec.equals(OPENAIRE_CRIS_PERSONS) ||                    
                    setSpec.equals(OPENAIRE_CRIS_ORGUNITS) ||
                    setSpec.equals(OPENAIRE_CRIS_PROJECTS) ||
                    setSpec.equals(OPENAIRE_CRIS_FUNDING) ||             
                    setSpec.equals(OPENAIRE_CRIS_EVENTS) ||
                    setSpec.equals(OPENAIRE_CRIS_EQUIPMENTS)) {
                Set set = new Set(setSpec,
                    "" + t.get(name));
                sets.add(set);
            } 
            else
            {
                Set set = new Set(setSpec + ":" + t.get(id),
                    "" + t.get(name));
                sets.add(set);
  
            }
        }
    }

    
    // new
    private SQLQuery<Tuple> getTupleSQLQueryJulkaisutCERIF(int offset, int length, Date from, Date until, String setSpec, String metaDataPrefix, Expression... columns) {
        
        SimpleExpression<Tuple> subQuery = getTupleSubJulkaisutCERIF(setSpec, metaDataPrefix);
        SQLQuery<Tuple> query = queryFactory.select(columns).from(subQuery)
                .where(createBetween(Expressions.dateTimePath(Date.class, LAST_DATE_ALIAS), from, until))
                .limit(length).offset(offset).orderBy(Expressions.numberPath(Long.class, "ID").asc());
        
        log.debug("Query: {}", query.getSQL().getSQL());
        return query;
        
    }
    
    
    // TO DO
    private SQLQuery<Tuple> getTupleSQLQuery(int offset, int length, Date from, Date until, String setSpec, String metaDataPrefix, Expression... columns) {
        
        SimpleExpression<Tuple> subQuery = getTupleSub(setSpec, metaDataPrefix);
        SQLQuery<Tuple> query = queryFactory.select(columns).from(subQuery)
                .where(createBetween(Expressions.dateTimePath(Date.class, LAST_DATE_ALIAS), from, until))
                .limit(length).offset(offset).orderBy(Expressions.numberPath(Long.class, "JulkaisuID").asc());
        
        log.debug("Query: {}", query.getSQL().getSQL());
        return query;
        
        
//        // current solution
//        
//        SimpleExpression<Tuple> subQuery = getTupleSub(setSpec, metaDataPrefix);
//        
//        SQLQuery<Tuple> query = null;
//        
//        if (setSpec.equals(OPENAIRE_CRIS_PERSONS)) {
//            query = queryFactory.select(columns).from(subQuery)
//                .where(createBetween(Expressions.dateTimePath(Date.class, LAST_DATE_ALIAS), from, until))
//                .limit(length).offset(offset).orderBy(Expressions.numberPath(Long.class, "TekijaID").asc());   
//            
//        } else if (setSpec.equals(OPENAIRE_CRIS_EVENTS)) {
//            query = queryFactory.select(columns).from(subQuery)
//                .where(createBetween(Expressions.dateTimePath(Date.class, LAST_DATE_ALIAS), from, until))
//                .limit(length).offset(offset).orderBy(Expressions.numberPath(Long.class, "TapahtumaID").asc());
//                   
//        } else if (setSpec.equals(OPENAIRE_CRIS_ORGUNITS)) {
//            query = queryFactory.select(columns).from(subQuery)
//                    .where(createBetween(Expressions.dateTimePath(Date.class, LAST_DATE_ALIAS), from, until))
//                    .limit(length).offset(offset).orderBy(Expressions.numberPath(Long.class, "OrganisaatioID").asc());
//                
//            }
//        else {
//        
//        //SQLQuery<Tuple> query = queryFactory.select(columns).from(subQuery)
//            query = queryFactory.select(columns).from(subQuery)
//                .where(createBetween(Expressions.dateTimePath(Date.class, LAST_DATE_ALIAS), from, until))
//                .limit(length).offset(offset).orderBy(Expressions.numberPath(Long.class, "JulkaisuID").asc());
//        }
//        log.debug("Query: {}", query.getSQL().getSQL());
//        return query;
    }
    
    
    // new
    private SimpleExpression<Tuple> getTupleSubJulkaisutCERIF(String setSpec, String metaDataPrefix) {
         
        //RelationalPath table = getTable(metaDataPrefix);
        RelationalPath table = CERIF;
        SQLQuery<Tuple> query = null;
        
        //if (table.equals(JulkaisutCERIF)) {       
            query = queryFactory.select(CERIF.ID, 
                getXmldataPath(table),
                CERIF.identifier, 
                lastDateSubQueryCERIF())
                .from(table);
                //.leftJoin(JulkaisutCERIF).on(getJulkaisuIdPath(table).eq(JulkaisutCERIF.julkaisuID));
                        
            if (StringUtils.isNotEmpty(setSpec)) {
                String[] split = setSpec.split(":");
                String set = split[0];

                // value is changed inside the if and else if -clauses because OPENAIRE_CRIS_PUBLICATIONS does not have value
                // ie. old setSpecs are in format tieteenala:112 but OPENAIRE_CRIS_PUBLICATIONS is without :
                // Therefore, only set = split[0] is available to OPENAIRE_CRIS_PUBLICATIONS
                // String value = split[1];

                if (TIETEENALA.equals(set)) {               
                    String value = split[1];
                    SQLQuery<Long> sub = SQLExpressions.selectDistinct(JulkaisunTieteenala.julkaisuID)
                            .from(JulkaisunTieteenala).leftJoin(TieteenalaLuokitus)
                            .on(TieteenalaLuokitus.tieteenalaID.eq(JulkaisunTieteenala.tieteenalaID))
                            .where(TieteenalaLuokitus.koodi.eq(value)
                                    .and(JulkaisunTieteenala.julkaisuID.eq(Julkaisut.julkaisuID)));
                    query.where(sub.exists());
                } else if (TAITEENALA.equals(set)) {
                    String value = split[1];
                    SQLQuery<Long> sub = SQLExpressions.selectDistinct(JulkaisunTaiteenala.julkaisuID)
                            .from(JulkaisunTaiteenala).leftJoin(TaiteenalaLuokitus)
                            .on(TaiteenalaLuokitus.taiteenalaID.eq(JulkaisunTaiteenala.taiteenalaID))
                            .where(TaiteenalaLuokitus.koodi.eq(value)
                                    .and(JulkaisunTaiteenala.julkaisuID.eq(Julkaisut.julkaisuID)));
                    query.where(sub.exists());
                } else if (ORGANISAATIO.equals(set)) {
                    String value = split[1];
                    query.leftJoin(Organisaatio).on(Julkaisut.orgID.eq(Organisaatio.orgID))
                            .where(Organisaatio.orgTunnus.eq(value));
                } else if (JULKAISU_TYYPPI.equals(set)) {
                    String value = split[1];
                    query.where(Julkaisut.julkaisuTyyppi.eq(value));
                } else if (AVOIN_SAATAVUUS.equals(set)) {
                    String value = split[1];
                    Integer i = Integer.valueOf(value);
                    query.where(Julkaisut.avoinSaatavuusKoodi.eq(i));
                } else if (OPENAIRE_CRIS_PUBLICATIONS.equals(set)) {
                    Integer i = 1;
                    query.where(CERIF.tyyppi.eq(i));
                } else if (OPENAIRE_CRIS_PRODUCTS.equals(set)) {
                    Integer i = 2;
                    query.where(CERIF.tyyppi.eq(i));
                } else if (OPENAIRE_CRIS_PATENTS.equals(set)) {
                    Integer i = 3;
                    query.where(CERIF.tyyppi.eq(i));
                } else if (OPENAIRE_CRIS_PERSONS.equals(set)) {
                    Integer i = 4;
                    query.where(CERIF.tyyppi.eq(i));
                } else if (OPENAIRE_CRIS_ORGUNITS.equals(set)) {
                    Integer i = 5;
                    query.where(CERIF.tyyppi.eq(i));
                } else if (OPENAIRE_CRIS_PROJECTS.equals(set)) {
                    Integer i = 6;
                    query.where(CERIF.tyyppi.eq(i));
                } else if (OPENAIRE_CRIS_FUNDING.equals(set)) {
                    Integer i = 7;
                    query.where(CERIF.tyyppi.eq(i));
                } else if (OPENAIRE_CRIS_EVENTS.equals(set)) {
                    Integer i = 8;
                    query.where(CERIF.tyyppi.eq(i));
                } else if (OPENAIRE_CRIS_EQUIPMENTS.equals(set)) {
                    Integer i = 9;
                    query.where(CERIF.tyyppi.eq(i));
                }
                
            } 
            
        //}
                      
        return query.as("sub");  
        
    }
    

    // TO DO
    private SimpleExpression<Tuple> getTupleSub(String setSpec, String metaDataPrefix) {
         
        RelationalPath table = getTable(metaDataPrefix);
        SQLQuery<Tuple> query = queryFactory.select(Julkaisut.julkaisuID, 
                getXmldataPath(table),
                Julkaisut.julkaisunTunnus,   
                lastDateSubQuery())
                .from(table)
                .leftJoin(Julkaisut).on(getJulkaisuIdPath(table).eq(Julkaisut.julkaisuID)); 
                
        if (StringUtils.isNotEmpty(setSpec)) {
            String[] split = setSpec.split(":");
            String set = split[0];
        
            // value is changed inside the if and else if -clauses because OPENAIRE_CRIS_PUBLICATIONS does not have value
            // ie. old setSpecs are in format tieteenala:112 but OPENAIRE_CRIS_PUBLICATIONS is without :
            // Therefore, only set = split[0] is available to OPENAIRE_CRIS_PUBLICATIONS
            // String value = split[1];
            
            if (TIETEENALA.equals(set)) {               
                String value = split[1];
                SQLQuery<Long> sub = SQLExpressions.selectDistinct(JulkaisunTieteenala.julkaisuID)
                        .from(JulkaisunTieteenala).leftJoin(TieteenalaLuokitus)
                        .on(TieteenalaLuokitus.tieteenalaID.eq(JulkaisunTieteenala.tieteenalaID))
                        .where(TieteenalaLuokitus.koodi.eq(value)
                                .and(JulkaisunTieteenala.julkaisuID.eq(Julkaisut.julkaisuID)));
                query.where(sub.exists());
            } else if (TAITEENALA.equals(set)) {
                String value = split[1];
                SQLQuery<Long> sub = SQLExpressions.selectDistinct(JulkaisunTaiteenala.julkaisuID)
                        .from(JulkaisunTaiteenala).leftJoin(TaiteenalaLuokitus)
                        .on(TaiteenalaLuokitus.taiteenalaID.eq(JulkaisunTaiteenala.taiteenalaID))
                        .where(TaiteenalaLuokitus.koodi.eq(value)
                                .and(JulkaisunTaiteenala.julkaisuID.eq(Julkaisut.julkaisuID)));
                query.where(sub.exists());
            } else if (ORGANISAATIO.equals(set)) {
                String value = split[1];
                query.leftJoin(Organisaatio).on(Julkaisut.orgID.eq(Organisaatio.orgID))
                        .where(Organisaatio.orgTunnus.eq(value));
            } else if (JULKAISU_TYYPPI.equals(set)) {
                String value = split[1];
                query.where(Julkaisut.julkaisuTyyppi.eq(value));
            } else if (AVOIN_SAATAVUUS.equals(set)) {
                String value = split[1];
                Integer i = Integer.valueOf(value);
                query.where(Julkaisut.avoinSaatavuusKoodi.eq(i));
            } else if (OPENAIRE_CRIS_PUBLICATIONS.equals(set)) {
                Integer i = 1;
                query.where(CERIF.tyyppi.eq(i));
            } else if (OPENAIRE_CRIS_PRODUCTS.equals(set)) {
                Integer i = 2;
                query.where(CERIF.tyyppi.eq(i));
            } else if (OPENAIRE_CRIS_PATENTS.equals(set)) {
                Integer i = 3;
                query.where(CERIF.tyyppi.eq(i));
            } else if (OPENAIRE_CRIS_PERSONS.equals(set)) {
                Integer i = 4;
                query.where(CERIF.tyyppi.eq(i));
            } else if (OPENAIRE_CRIS_ORGUNITS.equals(set)) {
                Integer i = 5;
                query.where(CERIF.tyyppi.eq(i));
            } else if (OPENAIRE_CRIS_PROJECTS.equals(set)) {
                Integer i = 6;
                query.where(CERIF.tyyppi.eq(i));
            } else if (OPENAIRE_CRIS_FUNDING.equals(set)) {
                Integer i = 7;
                query.where(CERIF.tyyppi.eq(i));
            } else if (OPENAIRE_CRIS_EVENTS.equals(set)) {
                Integer i = 8;
                query.where(CERIF.tyyppi.eq(i));
            } else if (OPENAIRE_CRIS_EQUIPMENTS.equals(set)) {
                Integer i = 9;
                query.where(CERIF.tyyppi.eq(i));
            }
            
        }
                      
        return query.as("sub");          
                
                
                
                
                
        // current solution
        //////////////////
 //       RelationalPath table = null;
//        SQLQuery<Tuple> query = null;
//        
//        if (setSpec.equals(OPENAIRE_CRIS_PERSONS)) {
//            table = TekijatCERIF;         
//            query = queryFactory.select(TekijatCERIF.tekijaID, 
//                getXmldataPath(table),
//                TekijatCERIF.identifier, 
//                TekijatCERIF.luontipaivamaara.as(LAST_DATE_ALIAS))
//                .from(table);
//            
//        } else if (setSpec.equals(OPENAIRE_CRIS_EVENTS)) {
//            table = TapahtumatCERIF;         
//            query = queryFactory.select(TapahtumatCERIF.tapahtumaID, 
//                getXmldataPath(table),
//                TapahtumatCERIF.identifier, 
//                TapahtumatCERIF.luontipaivamaara.as(LAST_DATE_ALIAS))
//                .from(table);
//            
//        } else if (setSpec.equals(OPENAIRE_CRIS_ORGUNITS)) {
//            table = OrganisaatiotCERIF;         
//            query = queryFactory.select(OrganisaatiotCERIF.organisaatioID, 
//                getXmldataPath(table),
//                OrganisaatiotCERIF.identifier, 
//                OrganisaatiotCERIF.luontipaivamaara.as(LAST_DATE_ALIAS))
//                .from(table);
//            
//        }
//        else {
//            
//            table = getTable(metaDataPrefix); 
//            
//            if (table.equals(JulkaisutCERIF)) {       
//            query = queryFactory.select(Julkaisut.julkaisuID, 
//                getXmldataPath(table),
//                JulkaisutCERIF.identifier, lastDateSubQuery())
//                .from(table)
//                .leftJoin(Julkaisut).on(getJulkaisuIdPath(table).eq(Julkaisut.julkaisuID));
//            } else {
//                query = queryFactory.select(Julkaisut.julkaisuID, 
//                getXmldataPath(table),
//                Julkaisut.julkaisunTunnus,   
//                lastDateSubQuery())
//                .from(table)
//                .leftJoin(Julkaisut).on(getJulkaisuIdPath(table).eq(Julkaisut.julkaisuID));           
//            } 
//        }
//  
//        if (StringUtils.isNotEmpty(setSpec)) {
//            String[] split = setSpec.split(":");
//            String set = split[0];
//        
//            // value is changed inside the if and else if -clauses because OPENAIRE_CRIS_PUBLICATIONS does not have value
//            // ie. old setSpecs are in format tieteenala:112 but OPENAIRE_CRIS_PUBLICATIONS is without :
//            // Therefore, only set = split[0] is available to OPENAIRE_CRIS_PUBLICATIONS
//            // String value = split[1];
//            
//            if (TIETEENALA.equals(set)) {               
//                String value = split[1];
//                SQLQuery<Long> sub = SQLExpressions.selectDistinct(JulkaisunTieteenala.julkaisuID)
//                        .from(JulkaisunTieteenala).leftJoin(TieteenalaLuokitus)
//                        .on(TieteenalaLuokitus.tieteenalaID.eq(JulkaisunTieteenala.tieteenalaID))
//                        .where(TieteenalaLuokitus.koodi.eq(value)
//                                .and(JulkaisunTieteenala.julkaisuID.eq(Julkaisut.julkaisuID)));
//                query.where(sub.exists());
//            } else if (TAITEENALA.equals(set)) {
//                String value = split[1];
//                SQLQuery<Long> sub = SQLExpressions.selectDistinct(JulkaisunTaiteenala.julkaisuID)
//                        .from(JulkaisunTaiteenala).leftJoin(TaiteenalaLuokitus)
//                        .on(TaiteenalaLuokitus.taiteenalaID.eq(JulkaisunTaiteenala.taiteenalaID))
//                        .where(TaiteenalaLuokitus.koodi.eq(value)
//                                .and(JulkaisunTaiteenala.julkaisuID.eq(Julkaisut.julkaisuID)));
//                query.where(sub.exists());
//            } else if (ORGANISAATIO.equals(set)) {
//                String value = split[1];
//                query.leftJoin(Organisaatio).on(Julkaisut.orgID.eq(Organisaatio.orgID))
//                        .where(Organisaatio.orgTunnus.eq(value));
//            } else if (JULKAISU_TYYPPI.equals(set)) {
//                String value = split[1];
//                query.where(Julkaisut.julkaisuTyyppi.eq(value));
//            } else if (AVOIN_SAATAVUUS.equals(set)) {
//                String value = split[1];
//                Integer i = Integer.valueOf(value);
//                query.where(Julkaisut.avoinSaatavuusKoodi.eq(i));
//            } else if (OPENAIRE_CRIS_PUBLICATIONS.equals(set)) {
//                Integer i = 2;
//                query.where(Julkaisut.julkaisunTila.eq(i));
//            } else if (OPENAIRE_CRIS_PERSONS.equals(set)) {
//                Integer i = 1;
//                query.where(TekijatCERIF.tekijaCERIFid.gt(i));
//            } else if (OPENAIRE_CRIS_EVENTS.equals(set)) {
//                Integer i = 1;
//                query.where(TapahtumatCERIF.tapahtumaCERIFid.gt(i));
//            }  else if (OPENAIRE_CRIS_ORGUNITS.equals(set)) {
//                Integer i = 1;
//                query.where(OrganisaatiotCERIF.organisaatioCERIFid.gt(i));
//            }                              
//        }
//                      
//        return query.as("sub");
        
    }

    
    
    // new
    private DateTimeExpression<Date> lastDateSubQueryCERIF() {
        List<Object> objects = new ArrayList<>();
        objects.add(CERIF.luontipaivamaara);
        objects.add(CERIF.paivityspaivamaara);
        return Expressions.dateTimeTemplate(Date.class,
                "(SELECT Max(v) FROM (VALUES ({0}), ({1})) AS value(v))",
                objects.toArray())
                .as(LAST_DATE_ALIAS);
    } 
    

    private DateTimeExpression<Date> lastDateSubQuery() {
        List<Object> objects = new ArrayList<>();
        objects.add(Julkaisut.luontipaivamaara);
        objects.add(Julkaisut.paivityspaivamaara);
        return Expressions.dateTimeTemplate(Date.class,
                "(SELECT Max(v) FROM (VALUES ({0}), ({1})) AS value(v))",
                objects.toArray())
                .as(LAST_DATE_ALIAS);
    } 
    
    

    private boolean exists(Juuli juuli) {
        long count = queryFactory.select(JuuliTemp.julkaisunTunnus)
                .from(JuuliTemp)
                .where(JuuliTemp.julkaisunTunnus.eq(juuli.getJulkaisunTunnus()))
                .fetchCount();
        return count > 0;
    }

    private SQLBindings getSearchSql(SearchQuery sq, String orgId) {
        final SQLQuery<Tuple> query = queryFactory.select(JulkaisutXML.julkaisuID, JulkaisutXML.xmldata, julkaisutF.muutospvm, julkaisutF.luontipvm)
                .from(JulkaisutXML).leftJoin(julkaisutF).on(JulkaisutXML.julkaisuID.eq(julkaisutF.julkaisuID))
                .where(Expressions.allOf(createContains(julkaisutF.etunimet, sq.etunimi),
                        createContains(julkaisutF.sukuNimi, sq.sukunimi),
                        createContains(julkaisutF.tekijatiedot, sq.henkiloHaku),
                        createContains(julkaisutF.julkaisunNimi, sq.julkaisunNimi),
                        createContains(julkaisutF.lehdenNimi, sq.lehdenNimi),
                        createContains(julkaisutF.kustantajanNimi, sq.kustantajanNimi),
                        createEquals(julkaisutF.julkaisuVuosi, sq.julkaisuVuosi),
                        createEquals(julkaisutF.orgTunnus, sq.organisaatioTunnus),
                        createEquals(julkaisutF.orcid, sq.orcid),
                        createEquals(julkaisutF.julkaisuTyyppi, sq.julkaisuTyyppi),
                        createEquals(julkaisutF.julkaisunTila, sq.julkaisunTila),
                        createEquals(julkaisutF.issn, sq.issn),
                        createEquals(julkaisutF.isbn, sq.isbn),
                        createEquals(julkaisutF.doi, sq.doi),
                        createEquals(julkaisutF.julkaisunOrgTunnus, sq.julkaisunOrgTunnus),
                        createEquals(julkaisutF.yhteisJulkaisunTunnus, sq.yhteisJulkaisunTunnus),
                        createEquals(julkaisutF.jufoTunnus, sq.jufoTunnus),
                        createEquals(julkaisutF.ilmoitusVuosi, sq.ilmoitusVuosi),
                        createKeywordSub(sq.avainsana, julkaisutF.julkaisuID),
                        createBetween(Expressions.dateTimePath(
                                Date.class, julkaisutF.muutospvm.getMetadata()), sq.muutospvmAlku, sq.muutospvmLoppu),
                        createBetween(Expressions.dateTimePath(
                                Date.class, julkaisutF.luontipvm.getMetadata()), sq.luontipvmAlku, sq.luontipvmLoppu)));
        addOrganizationCondition(query, julkaisutF.orgTunnus, orgId);
        return query.getSQL();
    }

    private BooleanExpression createKeywordSub(List<String> keywords, NumberPath<Long> julkaisuID) {
        if (keywords == null || keywords.isEmpty()) {
            return null;
        }

        BooleanTemplate[] booleanTemplates = keywords.stream()
                .map(keyword -> createContains(avainsanatF.sana, keyword))
                .toArray(BooleanTemplate[]::new);

        SQLQuery<Long> sub = SQLExpressions.selectDistinct(avainsanatF.julkaisuID)
                .from(avainsanatF)
                .where(Expressions.anyOf(booleanTemplates),
                        avainsanatF.julkaisuID.eq(julkaisuID));
        return sub.exists();
    }

    private SQLBindings getByJulkaisunTunnusSql(String julkaisunTunnus, String orgId) {
        final SQLQuery<Tuple> query = queryFactory.select(JulkaisutXML.julkaisuID, JulkaisutXML.xmldata)
                .from(JulkaisutXML)
                .leftJoin(julkaisutF)
                .on(JulkaisutXML.julkaisuID.eq(julkaisutF.julkaisuID))
                .where(julkaisutF.julkaisunTunnus.eq(julkaisunTunnus));
        addOrganizationCondition(query, julkaisutF.orgTunnus, orgId);
        return query.getSQL();
    }

}
