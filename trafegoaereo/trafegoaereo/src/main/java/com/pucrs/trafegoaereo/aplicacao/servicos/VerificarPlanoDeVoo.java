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

public class VerificarPlanoDeVoo {
    private IPlanosRep planosRep;
    
    //data, horário e o número do voo, a rota escolhida, a velocidade de cruzeiro e a altitude que pretende ser utilizada
    @Autowired
    public VerificarPlanoDeVoo(IPlanosRep planosRep){
        this.planosRep = planosRep;
    }

    public RotasDTO verifica(LocalDateTime dataVoo, int horaVoo, int numeroVoo, Rota rota, double velocidade, double altitude){
        // verifica se existe algum plano no mesmo horario
        List<PlanoDeVoo> planosDeVoo = 
            planosRep.todos()
                .stream()
                .filter(e -> e.getData().getHour() == horaVoo)
                .collect(Collectors.toList());
                
        List<Rota> nomeRotas = new ArrayList<Rota>();

        if(planosDeVoo.size() > 0) {
            for (PlanoDeVoo planoDeVoo : planosDeVoo) {
                nomeRotas.add(planoDeVoo.getRota());
            }
        }

        return new RotasDTO(nomeRotas);
    }
}
