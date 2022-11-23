package com.pucrs.trafegoaereo.negocio.servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pucrs.trafegoaereo.negocio.entidades.Aerovia;
import com.pucrs.trafegoaereo.negocio.repositorios.IAeroviasRep;

@Component
public class ServicoAerovias {
    public IAeroviasRep aeroviasRep;

    @Autowired
    public ServicoAerovias(IAeroviasRep aeroviasRep){
        this.aeroviasRep = aeroviasRep;
    }

    public List<Aerovia> todos(){
        return aeroviasRep.todos();
    }

    public void cadastraAerovia(Aerovia aerovia){
        aeroviasRep.cadastra(aerovia);
    }
}
