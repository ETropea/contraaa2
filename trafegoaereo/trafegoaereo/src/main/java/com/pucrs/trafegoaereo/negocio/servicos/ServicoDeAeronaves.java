package com.pucrs.trafegoaereo.negocio.servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pucrs.trafegoaereo.negocio.entidades.Aeronave;
import com.pucrs.trafegoaereo.negocio.repositorios.IAeronavesRep;

@Component
public class ServicoDeAeronaves {
    public IAeronavesRep aeronaveRep;

    @Autowired
    public ServicoDeAeronaves(IAeronavesRep aeronaveRep){
        this.aeronaveRep = aeronaveRep;
    }

    public List<Aeronave> todos(){
        return aeronaveRep.todos();
    }

    public void cadastraAeronave(Aeronave aeronave){
        aeronaveRep.cadastra(aeronave);
    }
}
