package com.pedroberbel;

public class Carro {
    private String modelo;
    private int ano;
    private String marca;

    //getter setter

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }



    //métodos
    public void imprimir(){
        System.out.println("marca = " + marca);
        System.out.println("modelo = " + modelo);
        System.out.println("ano = " + ano);
        System.out.println("-----------------");
    }


}
