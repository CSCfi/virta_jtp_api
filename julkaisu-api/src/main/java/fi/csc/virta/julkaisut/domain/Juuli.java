package fi.csc.virta.julkaisut.domain;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Juuli {

    @NotNull
    @NotEmpty
    @ApiModelProperty(required = true)
    private String julkaisunTunnus;
    @NotNull
    @NotEmpty
    @ApiModelProperty(required = true)
    private String juuliURL;

    public String getJulkaisunTunnus() {
        return julkaisunTunnus;
    }

    public void setJulkaisunTunnus(String julkaisunTunnus) {
        this.julkaisunTunnus = julkaisunTunnus;
    }

    public String getJuuliURL() {
        return juuliURL;
    }

    public void setJuuliURL(String juuliURL) {
        this.juuliURL = juuliURL;
    }
}
