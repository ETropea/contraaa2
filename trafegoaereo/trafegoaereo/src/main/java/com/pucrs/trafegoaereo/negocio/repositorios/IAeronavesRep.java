package com.pucrs.trafegoaereo.negocio.repositorios;

import java.util.List;

import com.pucrs.trafegoaereo.negocio.entidades.Aeronave;

public interface IAeronavesRep {
    List<Aeronave> todos();
    void removeTodos();
    boolean cadastra(Aeronave aeronave);
}
