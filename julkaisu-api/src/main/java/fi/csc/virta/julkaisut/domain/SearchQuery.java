package fi.csc.virta.julkaisut.domain;

import fi.csc.virta.julkaisut.constraint.AtLeastOneValue;
import io.swagger.annotations.ApiParam;

import javax.ws.rs.QueryParam;
import java.util.Date;
import java.util.List;

@AtLeastOneValue(message = "At least one search parameter should have value.")
public class SearchQuery {
    @ApiParam(value = "Firstname (freetext search supported), search for organisation own authors")
    @QueryParam("etunimi")
    public String etunimi;
    @ApiParam(value = "Lastname (freetext search supported), search for organisation own authors")
    @QueryParam("sukunimi")
    public String sukunimi;
    @ApiParam(value = "Author search (freetext search supported), search for all authors")
    @QueryParam("henkiloHaku")
    public String henkiloHaku;
    @ApiParam(value = "Name of publication (freetext search supported)")
    @QueryParam("julkaisunNimi")
    public String julkaisunNimi;
    @ApiParam(value = "Name of magazine (freetext search supported)")
    @QueryParam("lehdenNimi")
    public String lehdenNimi;
    @ApiParam(value = "Key word (freetext search supported), multiple values allowed with 'OR' condition.",
            allowMultiple = true, example = "?avainsana=Medic&avainsana=Dia")
    @QueryParam("avainsana")
    public List<String> avainsana;
    @ApiParam(value = "Release year")
    @QueryParam("julkaisuVuosi")
    public Integer julkaisuVuosi;
    @ApiParam(value = "Organization ID")
    @QueryParam("organisaatioTunnus")
    public String organisaatioTunnus;
    @ApiParam(value = "Organization ID of publication")
    @QueryParam("julkaisunOrgTunnus")
    public String julkaisunOrgTunnus;
    @ApiParam(value = "ORCID (Open Researcher and Contributor ID)")
    @QueryParam("orcid")
    public String orcid;
    @ApiParam(value = "Type of publication")
    @QueryParam("julkaisuTyyppi")
    public String julkaisuTyyppi;
    @ApiParam(value = "State of publication")
    @QueryParam("julkaisunTila")
    public Integer julkaisunTila;
    @ApiParam(value = "ISSN")
    @QueryParam("issn")
    public String issn;
    @ApiParam(value = "ISBN")
    @QueryParam("isbn")
    public String isbn;
    @ApiParam(value = "Name of publisher (freetext search supported)")
    @QueryParam("kustantajanNimi")
    public String kustantajanNimi;
    @ApiParam(value = "DOI")
    @QueryParam("doi")
    public String doi;
    @ApiParam(value = "From the date changed, Date ISO-8601 format (example: 2016-03-22T07:52:44Z)")
    @QueryParam("muutospvmAlku")
    public Date muutospvmAlku;
    @ApiParam(value = "To the date changed, Date ISO-8601 format (example: 2016-03-22T07:52:44Z)")
    @QueryParam("muutospvmLoppu")
    public Date muutospvmLoppu;
    @ApiParam(value = "From the date created, Date ISO-8601 format (example: 2016-03-22T07:52:44Z)")
    @QueryParam("luontipvmAlku")
    public Date luontipvmAlku;
    @ApiParam(value = "To the date created, Date ISO-8601 format (example: 2016-03-22T07:52:44Z)")
    @QueryParam("luontipvmLoppu")
    public Date luontipvmLoppu;
    @ApiParam(value = "Common publication identifier")
    @QueryParam("yhteisJulkaisunTunnus")
    public String yhteisJulkaisunTunnus;
    @ApiParam(value = "Publication forum identifier. Leave empty to find publications which not have forum identifier. (example: jufoTunnus=")
    @QueryParam("jufoTunnus")
    public String jufoTunnus;
    @ApiParam(value = "Announcement year")
    @QueryParam("ilmoitusVuosi")
    public Integer ilmoitusVuosi;
}
