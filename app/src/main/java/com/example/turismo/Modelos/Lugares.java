package com.example.turismo.Modelos;

public class Lugares {

    private String nome;
    private Double distancia;
    private String descricao;

    public Lugares(String nome, Double distancia, String descricao) {
        this.nome = nome;
        this.distancia = distancia;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
