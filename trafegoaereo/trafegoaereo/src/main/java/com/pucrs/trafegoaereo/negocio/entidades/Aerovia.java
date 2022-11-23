package com.pucrs.trafegoaereo.negocio.entidades;

import javax.persistence.Entity;

@Entity
public class Aerovia {
    private String nome;
    private RefGeo origem;
    private RefGeo detisno;
    private float distancia;

    public Aerovia(String nome, RefGeo origem, RefGeo detisno, float distancia) {
        this.nome = nome;
        this.origem = origem;
        this.detisno = detisno;
        this.distancia = distancia;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public RefGeo getOrigem() {
        return this.origem;
    }

    public void setOrigem(RefGeo origem) {
        this.origem = origem;
    }

    public RefGeo getDetisno() {
        return this.detisno;
    }

    public void setDetisno(RefGeo detisno) {
        this.detisno = detisno;
    }

    public float getDistancia() {
        return this.distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

}
