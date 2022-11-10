package br.senai.model;

import java.util.ArrayList;

public class Concessionaria {

    private int id;
    private Endereco endereco;
    private String nome;
    private int qtdFuncionarios;
    private String rua;
    private int qtdCarros;

    private ArrayList<Carro> carros;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdFuncionarios() {
        return qtdFuncionarios;
    }
    public void setQtdFuncionarios(int qtdFuncionarios) {
        this.qtdFuncionarios = qtdFuncionarios;
    }

    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getQtdCarros() {
        return qtdCarros;
    }
    public void setQtdCarros(int qtdCarros) {
        this.qtdCarros = qtdCarros;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Carro> getCarros() {
        return carros;
    }

    public void setCarros(ArrayList<Carro> carros) {
        this.carros = carros;
    }

    @Override
    public String toString() {
        return "Concessionaria{" +
                "id=" + id +
                ", endereco=" + endereco +
                ", nome='" + nome + '\'' +
                ", qtdFuncionarios=" + qtdFuncionarios +
                ", rua='" + rua + '\'' +
                ", qtdCarros=" + qtdCarros +
                ", carros=" + carros +
                '}';
    }

    public Concessionaria() {
    }
}
