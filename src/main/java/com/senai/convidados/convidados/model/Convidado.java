package com.senai.convidados.convidados.model;

public class Convidado {

    private String nome;
    private Integer qtdAcompanhantes;

    public Convidado(){
    }

    public Convidado(String name, Integer qtdAcompanhantes) {
        this.nome = name;
        this.qtdAcompanhantes = qtdAcompanhantes;
    }

    public String getName() {
        return nome;
    }

    public void setName(String name) {
        this.nome = name;
    }

    public Integer getqtdAcompanhantes() {
        return qtdAcompanhantes;
    }

    public void setqtdAcompanhantes(Integer qtdAcompanhantes) {
        this.qtdAcompanhantes = qtdAcompanhantes;
    } 
}
