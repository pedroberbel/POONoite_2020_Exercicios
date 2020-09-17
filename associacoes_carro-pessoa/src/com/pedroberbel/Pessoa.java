package com.pedroberbel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pessoa {
    private String nome;
    private int idade;
    private List<Carro> carros = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

    public void adicionarCarro(Carro carro){
        carros.add(carro);
    }

    public void imprimir(){
        System.out.println("nome = " + nome);
        System.out.println("idade = " + idade);
        System.out.println("--Lista de Carros--");
        if(carros.size()>0){
            for (int i =0; i < carros.size(); i ++) {
                carros.get(i).imprimir();
            }
        }

    }
}
