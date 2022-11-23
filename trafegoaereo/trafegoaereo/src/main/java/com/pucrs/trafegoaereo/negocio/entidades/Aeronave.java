package com.pucrs.trafegoaereo.negocio.entidades;

import javax.persistence.Entity;

@Entity
public class Aeronave {
    private String prefixo;
    private int velocidadeCruzeiro;
    private int autonomia;

    public Aeronave(String prefixo, int velocidadeCruzeiro, int autonomia) {
        this.prefixo = prefixo;
        this.velocidadeCruzeiro = velocidadeCruzeiro;
        this.autonomia = autonomia;
    }
    
    public String getPrefixo() {
        return this.prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public int getVelocidadeCruzeiro() {
        return this.velocidadeCruzeiro;
    }

    public void setVelocidadeCruzeiro(int velocidadeCruzeiro) {
        this.velocidadeCruzeiro = velocidadeCruzeiro;
    }

    public int getAutonomia() {
        return this.autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

}
