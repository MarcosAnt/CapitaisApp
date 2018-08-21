package com.example.marcos.capitaisapp;

/**
 * Created by Marcos on 03/03/2018.
 */

public class Estado {

    private String nome;
    private String capital;

    public Estado(String nome,String capital) {
        this.nome = nome;
        this.capital = capital;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
}
