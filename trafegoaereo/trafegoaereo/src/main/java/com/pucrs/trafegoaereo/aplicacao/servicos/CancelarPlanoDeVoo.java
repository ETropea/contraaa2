package com.pucrs.trafegoaereo.aplicacao.servicos;

import org.springframework.beans.factory.annotation.Autowired;

import com.pucrs.trafegoaereo.aplicacao.dtos.RotasDTO;
import com.pucrs.trafegoaereo.negocio.repositorios.IPlanosRep;

public class CancelarPlanoDeVoo {
    private IPlanosRep planosRep;
    
    @Autowired
    public CancelarPlanoDeVoo(IPlanosRep planosRep){
        this.planosRep = planosRep;
    }

    public RotasDTO cancelar(){
        // TODO

        return new RotasDTO(null);
    }
}
