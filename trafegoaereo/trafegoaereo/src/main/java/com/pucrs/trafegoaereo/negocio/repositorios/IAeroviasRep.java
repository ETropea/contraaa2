package com.pucrs.trafegoaereo.negocio.repositorios;

import java.util.List;

import com.pucrs.trafegoaereo.negocio.entidades.Aerovia;

public interface IAeroviasRep {
    List<Aerovia> todos();
    void removeTodos();
    boolean cadastra(Aerovia aerovia);
}
