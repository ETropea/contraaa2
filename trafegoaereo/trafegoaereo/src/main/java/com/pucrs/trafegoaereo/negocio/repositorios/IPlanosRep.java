package com.pucrs.trafegoaereo.negocio.repositorios;

import java.util.List;

import com.pucrs.trafegoaereo.negocio.entidades.PlanoDeVoo;

public interface IPlanosRep {
    List<PlanoDeVoo> todos();
    void removeTodos();
    boolean cadastra(PlanoDeVoo planoDeVoo);
}
