package com.pucrs.trafegoaereo.negocio.entidades;

import java.util.Date;
import java.util.HashMap;

import javax.persistence.Entity;

@Entity
public class OcupacaoAerovia {
    private Date data;
    private HashMap<Integer, Boolean> altitudes;

    public OcupacaoAerovia(Date data, HashMap<Integer, Boolean> altitudes) {
        this.data = data;
        this.altitudes = altitudes;
    }

    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public HashMap<Integer,Boolean> getAltitudes() {
        return this.altitudes;
    }

    public void setAltitudes(HashMap<Integer,Boolean> altitudes) {
        this.altitudes = altitudes;
    }

}
