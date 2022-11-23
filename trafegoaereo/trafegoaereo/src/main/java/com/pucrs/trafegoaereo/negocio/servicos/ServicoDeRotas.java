package com.pucrs.trafegoaereo.negocio.servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pucrs.trafegoaereo.negocio.entidades.Rota;
import com.pucrs.trafegoaereo.negocio.repositorios.IRotasRep;

@Component
public class ServicoDeRotas {
    public IRotasRep rotasRep;

    @Autowired
    public ServicoDeRotas(IRotasRep rotasRep){
        this.rotasRep = rotasRep;
    }

    public List<Rota> todos(){
        return rotasRep.todos();
    }

    public void cadastraRota(Rota rota){
        rotasRep.cadastra(rota);
    }
}
