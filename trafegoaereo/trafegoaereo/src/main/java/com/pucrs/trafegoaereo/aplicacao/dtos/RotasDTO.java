package com.pucrs.trafegoaereo.aplicacao.dtos;

import java.util.List;

import com.pucrs.trafegoaereo.negocio.entidades.Rota;

public class RotasDTO {
    private List<Rota> nomeRotas;

    public RotasDTO(List<Rota> nomeRotas) {
        this.nomeRotas = nomeRotas;
    }

    public List<Rota> getNomeRotas() {
        return this.nomeRotas;
    }

    public void setNomeRotas(List<Rota> nomeRotas) {
        this.nomeRotas = nomeRotas;
    }

    public RotasDTO nomeRotas(List<Rota> nomeRotas) {
        setNomeRotas(nomeRotas);
        return this;
    }

}
