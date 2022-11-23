package com.pucrs.trafegoaereo.negocio.repositorios;

import java.util.List;

import com.pucrs.trafegoaereo.negocio.entidades.Rota;

public interface IRotasRep {
    List<Rota> todos();
    void removeTodos();
    boolean cadastra(Rota rotas);
}
