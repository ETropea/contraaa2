package com.pucrs.trafegoaereo.negocio.entidades;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PlanoDeVoo {
    @Id
    private int idVoo;
    private LocalDateTime data;
    private float altitude;
    private Rota rota;
    private float velocidadeCruzeiro;
    

    public PlanoDeVoo() {
    }

    public PlanoDeVoo(int idVoo, LocalDateTime data, float altitude, Rota rota, float velocidadeCruzeiro) {
        this.idVoo = idVoo;
        this.data = data;
        this.altitude = altitude;
        this.rota = rota;
        this.velocidadeCruzeiro = velocidadeCruzeiro;
    }

    public int getIdVoo() {
        return this.idVoo;
    }

    public void setIdVoo(int idVoo) {
        this.idVoo = idVoo;
    }

    public LocalDateTime getData() {
        return this.data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public float getAltitude() {
        return this.altitude;
    }

    public void setAltitude(float altitude) {
        this.altitude = altitude;
    }

    public Rota getRota() {
        return this.rota;
    }

    public void setRota(Rota rota) {
        this.rota = rota;
    }

    public float getVelocidadeCruzeiro() {
        return this.velocidadeCruzeiro;
    }

    public void setVelocidadeCruzeiro(float velocidadeCruzeiro) {
        this.velocidadeCruzeiro = velocidadeCruzeiro;
    }
}
