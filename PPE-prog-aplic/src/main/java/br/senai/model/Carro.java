package br.senai.model;


public class Carro {
    private int id;
    private String modelo;

    private Marca marca;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Carro() {
    }

    @Override
    public String toString() {
        return "Carro{" +
                "id=" + id + '\'' +
                 marca +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
