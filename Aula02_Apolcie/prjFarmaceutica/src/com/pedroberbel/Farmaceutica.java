package com.pedroberbel;

import java.util.ArrayList;
import java.util.List;

public class Farmaceutica {
    private String cidade;
    private int idFarmaceutica;
    private String nomeFarmaceutica;
    private String uf;

    //Métodos

    //Getter and Setter
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getIdFarmaceutica() {
        return idFarmaceutica;
    }

    public void setIdFarmaceutica(int idFarmaceutica) {
        this.idFarmaceutica = idFarmaceutica;
    }

    public String getNomeFarmaceutica() {
        return nomeFarmaceutica;
    }

    public void setNomeFarmaceutica(String nomeFarmaceutica) {
        this.nomeFarmaceutica = nomeFarmaceutica;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    //Métodos da classe
    public void imprimir(){
        System.out.println("idFarmaceutica = " + idFarmaceutica);
        System.out.println("nomeFarmaceutica = " + nomeFarmaceutica);
        System.out.println("cidade = " + cidade);
        System.out.println("uf = " + uf);
    }
}
