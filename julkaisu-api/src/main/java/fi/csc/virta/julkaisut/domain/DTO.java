package fi.csc.virta.julkaisut.domain;

import java.util.Date;

public interface DTO {

    Long keySelector();

    void setId(Long id);

    void setMuutospvm(Date muutospvm);

    void setLuontipvm(Date luontipvm);
}
