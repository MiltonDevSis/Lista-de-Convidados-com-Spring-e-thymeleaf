package com.senai.convidados.convidados.repository;

import java.util.ArrayList;
import java.util.List;

import com.senai.convidados.convidados.model.Convidado;

import org.springframework.stereotype.Repository;

@Repository
public class ConvidadosRepository {
    
    private static final List<Convidado> LISTA_CONVIDADOS = new ArrayList<>();

    static{
        LISTA_CONVIDADOS.add(new Convidado("João", 3));
        LISTA_CONVIDADOS.add(new Convidado("maria", 5));
        LISTA_CONVIDADOS.add(new Convidado("pedro", 10));
    }
    
    public List<Convidado> todos(){
        return ConvidadosRepository.LISTA_CONVIDADOS;
    }

    public void adicionar(Convidado convidado){
        ConvidadosRepository.LISTA_CONVIDADOS.add(convidado);
    }
}
