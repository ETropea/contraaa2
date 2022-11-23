package com.pucrs.trafegoaereo.negocio.servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pucrs.trafegoaereo.negocio.entidades.PlanoDeVoo;
import com.pucrs.trafegoaereo.negocio.repositorios.IPlanosRep;

@Component
public class ServicoDePlanos {
    public IPlanosRep planosRep;

    @Autowired
    public ServicoDePlanos(IPlanosRep planosRep){
        this.planosRep = planosRep;
    }

    public List<PlanoDeVoo> todos(){
        return planosRep.todos();
    }

    public void cadastraPlano(PlanoDeVoo planoDeVoo){
        planosRep.cadastra(planoDeVoo);
    }
    
}
