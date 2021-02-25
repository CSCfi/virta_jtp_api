package fi.csc.virta.julkaisut.Util;

import fi.csc.virta.julkaisut.domain.DTO;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement(name = "Dummy")
public class Dummy implements DTO {

    private Long dummyId;
    private String name;
    private Long number;
    private Date muutospvm;
    private Date luontipvm;

    public Dummy() {
    }

    public Dummy(Long dummyId, String name, Long number, Date muutospvm, Date luontipvm) {
        this.dummyId = dummyId;
        this.name = name;
        this.number = number;
        this.muutospvm = muutospvm;
        this.luontipvm = luontipvm;
    }

    public Long getDummyId() {
        return dummyId;
    }

    public void setDummyId(Long dummyId) {
        this.dummyId = dummyId;
    }

    @XmlElement(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name = "Number")
    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    @Override
    public Long keySelector() {
        return dummyId;
    }

    @Override
    public void setId(Long id) {
        setDummyId(id);
    }

    @Override
    public void setMuutospvm(Date muutospvm) {
        this.muutospvm = muutospvm;
    }

    public Date getMuutospvm() {
        return muutospvm;
    }

    public Date getLuontipvm() {
        return luontipvm;
    }

    @Override
    public void setLuontipvm(Date luontipvm) {
        this.luontipvm = luontipvm;
    }
}