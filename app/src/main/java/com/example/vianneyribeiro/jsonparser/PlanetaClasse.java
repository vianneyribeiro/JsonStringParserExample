package com.example.vianneyribeiro.jsonparser;

/**
 * Created by vianneyribeiro on 17/01/18.
 */

public class PlanetaClasse {

    String nome;
    int posicao;
    boolean habitavel;


    public PlanetaClasse(String nome, int posicao, boolean habitavel) {
        this.nome = nome;
        this.posicao = posicao;
        this.habitavel = habitavel;
    }

    public String getNome() {
        return nome;
    }

    public int getPosicao() {
        return posicao;
    }

    public boolean isHabitavel() {
        return habitavel;
    }
}
