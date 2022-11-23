package com.pucrs.trafegoaereo.aplicacao.servicos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


import org.springframework.beans.factory.annotation.Autowired;

import com.pucrs.trafegoaereo.aplicacao.dtos.RotasDTO;
import com.pucrs.trafegoaereo.negocio.entidades.PlanoDeVoo;
import com.pucrs.trafegoaereo.negocio.entidades.Rota;
import com.pucrs.trafegoaereo.negocio.repositorios.IPlanosRep;

public class ConsultarRotas {
    private IPlanosRep planosRep;
    
    @Autowired
    public ConsultarRotas(IPlanosRep planosRep){
        this.planosRep = planosRep;
    }

    public RotasDTO consulta(){
        // TODO

        return new RotasDTO(null);
    }
}
