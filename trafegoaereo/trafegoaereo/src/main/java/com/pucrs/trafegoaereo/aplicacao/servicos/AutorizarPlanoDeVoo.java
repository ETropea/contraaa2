package com.pucrs.trafegoaereo.aplicacao.servicos;

import org.springframework.beans.factory.annotation.Autowired;

import com.pucrs.trafegoaereo.aplicacao.dtos.RotasDTO;
import com.pucrs.trafegoaereo.negocio.repositorios.IPlanosRep;

public class AutorizarPlanoDeVoo {
    private IPlanosRep planosRep;
    
    @Autowired
    public AutorizarPlanoDeVoo(IPlanosRep planosRep){
        this.planosRep = planosRep;
    }

    public RotasDTO autorizar(){
        // TODO

        return new RotasDTO(null);
    }
}
