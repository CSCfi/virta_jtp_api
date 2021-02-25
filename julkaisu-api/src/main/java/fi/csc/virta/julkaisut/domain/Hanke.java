package fi.csc.virta.julkaisut.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.util.Date;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Hanke implements DTO {

    private Long id;
    @NotNull
    @NotEmpty
    @ApiModelProperty(required = true)
    private String julkaisunTunnus;
    @NotNull
    @NotEmpty
    @ApiModelProperty(required = true)
    private String hankenumero;
    @NotNull
    @NotEmpty
    @ApiModelProperty(required = true)
    private String organisaatioTunnus;
    @JsonIgnore
    private Date muutospvm;
    @JsonIgnore
    private Date luontipvm;

    public String getJulkaisunTunnus() {
        return julkaisunTunnus;
    }

    public void setJulkaisunTunnus(String julkaisunTunnus) {
        this.julkaisunTunnus = julkaisunTunnus;
    }

    public String getHankenumero() {
        return hankenumero;
    }

    public void setHankenumero(String hankenumero) {
        this.hankenumero = hankenumero;
    }

    public String getOrganisaatioTunnus() {
        return organisaatioTunnus;
    }

    public void setOrganisaatioTunnus(String organisaatioTunnus) {
        this.organisaatioTunnus = organisaatioTunnus;
    }

    public Long getId() {
        return id;
    }

    @Override
    public Long keySelector() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    @JsonIgnore
    public void setMuutospvm(Date muutospvm) {
        this.muutospvm = muutospvm;
    }

    @JsonProperty
    @ApiModelProperty(value = "Date ISO-8601 format")
    public Date getMuutospvm() {
        return muutospvm;
    }

    @Override
    @JsonIgnore
    public void setLuontipvm(Date luontipvm) {
        this.luontipvm = luontipvm;
    }

    @JsonProperty
    @ApiModelProperty(value = "Date ISO-8601 format")
    public Date getLuontipvm() {
        return luontipvm;
    }

    public void setPaivityspaivamaara(Date pvm) {
        this.muutospvm = pvm;
    }

    public void setLuontipaivamaara(Date pvm) {
        this.luontipvm = pvm;
    }
}
