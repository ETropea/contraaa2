package com.pucrs.trafegoaereo.aplicacao.servicos;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.pucrs.trafegoaereo.aplicacao.dtos.RotasDTO;
import com.pucrs.trafegoaereo.negocio.entidades.PlanoDeVoo;
import com.pucrs.trafegoaereo.negocio.repositorios.IPlanosRep;

public class ConsultarSlotsLivres {
    private IPlanosRep planosRep;
    
    //horário de partida, a velocidade de cruzeiro e o sentido que ela será percorrida
    @Autowired
    public ConsultarSlotsLivres(IPlanosRep planosRep){
        this.planosRep = planosRep;
    }

    public RotasDTO consulta(LocalDateTime dataPartida, float velocidade, String sentido){
        // TODO
        List<PlanoDeVoo> planosDeVoo = 
            planosRep.todos()
                .stream()
                .filter(e -> e.getData().getHour() != dataPartida.getHour())
                .collect(Collectors.toList());

        return new RotasDTO(null);
    }
}
