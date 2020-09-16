package com.pedroberbel;


import java.sql.SQLOutput;

public class Apolice {

    private String nomeSegurado;
    private int idade;
    private float valorPremio;

    //Construtor
    /*
    public Apolice(String nomeSegurado, int idade, float valorPremio){
        this.nomeSegurado = nomeSegurado;
        this.idade = idade;
        this.valorPremio = valorPremio;
    }
    */
    //Getters e Setters
    public String getNomeSegurado(){
        return nomeSegurado;
    }
    public int getIdade(){
        return idade;
    }
    public float getValorPremio(){
        return valorPremio;
    }

    public void setNomeSegurado(String nomeSegurado){
        this.nomeSegurado = nomeSegurado;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setValorPremio(float valorPremio){
        this.valorPremio = valorPremio;
    }


    //Métodos
    public void imprimir(){
        System.out.println("Nome Segurado: " + nomeSegurado + "\nIdade: " + idade + "\nValor Prêmio: R$ " + valorPremio);
        System.out.println("--------------------------------");
    }
}
