package br.senai.model;

public class Marca {
    private int id;
    private String nome;

    private Endereco endereco;


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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Marca() {
    }

    @Override
    public String toString() {
        return "Marca: " + nome + '\'';
    }


}
