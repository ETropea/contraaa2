package com.pucrs.trafegoaereo.negocio.entidades;

import javax.persistence.Entity;

@Entity
public class Rota {
    private String nome;

    public Rota(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    } 
}
