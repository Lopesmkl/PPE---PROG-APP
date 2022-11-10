package br.senai;

import br.senai.model.*;

import java.util.ArrayList;


public class Main {
    public static void main(String args[]){
        System.out.println("Iniciando Listagem: \n");

        Endereco endereco1 = new Endereco();
        endereco1.setId(1);
        endereco1.setBairro("Jardim bob");
        endereco1.setRua("Rua Angelo Bob");
        endereco1.setNumero(77);
        endereco1.setUf("SC");

        Concessionaria concessionaria1 = new Concessionaria();
        concessionaria1.setId(1);
        concessionaria1.setNome("BobCars");
        concessionaria1.setQtdFuncionarios(12);
        concessionaria1.setQtdCarros(90);
        concessionaria1.setRua("Rua Marques");
        concessionaria1.setEndereco(endereco1);

        Concessionaria concessionaria2 = new Concessionaria();
        concessionaria2.setId(2);
        concessionaria2.setNome("MarquesCars");
        concessionaria2.setQtdFuncionarios(7);
        concessionaria2.setQtdCarros(70);
        concessionaria2.setRua("Rua Bobs");
        concessionaria2.setEndereco(endereco1);

        Marca marca1 = new Marca();
        marca1.setId(1);
        marca1.setNome("Jaguar");
        marca1.setEndereco(endereco1);

        Carro carro1 = new Carro();
        carro1.setId(1);
        carro1.setMarca(marca1);
        carro1.setModelo("F-Pace");

        Carro carro2 = new Carro();
        carro2.setId(2);
        carro2.setMarca(marca1);
        carro2.setModelo("Jaguar XE");

        Carro carro3 = new Carro();
        carro3.setId(3);
        carro3.setMarca(marca1);
        carro3.setModelo("I-Pace");

        Carro carro4 = new Carro();
        carro4.setId(4);
        carro4.setMarca(marca1);
        carro4.setModelo("F-Type");

        Carro carro5 = new Carro();
        carro5.setId(5);
        carro5.setMarca(marca1);
        carro5.setModelo("E-Pace");

        ArrayList<Carro> carros1 = new ArrayList<Carro>();
        carros1.add(carro1);
        carros1.add(carro2);
        carros1.add(carro3);
        carros1.add(carro4);
        carros1.add(carro5);

        Pessoa pessoa = new Pessoa();
        pessoa.setId(1);
        pessoa.setNome("bob");

        System.out.println("Pessoa: " + "\n" + pessoa + "\n");
        System.out.println("Concessionarias: " + "\n" + concessionaria1 + "\n" + concessionaria2 + "\n");
        System.out.println("Carros: " + "\n" + carros1 + "\n");

    }


}
