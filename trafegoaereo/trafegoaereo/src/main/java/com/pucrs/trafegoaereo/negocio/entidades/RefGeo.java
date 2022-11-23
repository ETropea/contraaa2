package com.pucrs.trafegoaereo.negocio.entidades;

import javax.persistence.Entity;

@Entity
public class RefGeo {
    private String nome;
    private float latitude;
    private float longitude;

    public RefGeo(String nome, float latitude, float longitude) {
        this.nome = nome;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getLatitude() {
        return this.latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return this.longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

}
