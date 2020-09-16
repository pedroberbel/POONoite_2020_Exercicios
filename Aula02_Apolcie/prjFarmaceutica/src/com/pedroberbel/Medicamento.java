package com.pedroberbel;

import java.time.LocalDate;

public class Medicamento {
    private String concentracao;
    private LocalDate dataCadastro;
    private String forma;
    private long id;
    private String medicamento;
    private String numRegistro;
    private double preco;
    private Farmaceutica detentora;


    //métodos

    //Getter and Setter

    public String getConcentracao() {
        return concentracao;
    }

    public void setConcentracao(String concentracao) {
        this.concentracao = concentracao;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public String getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(String numRegistro) {
        this.numRegistro = numRegistro;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Farmaceutica getDetentora() {
        return detentora;
    }

    public void setDetentora(Farmaceutica detentora) {
        this.detentora = detentora;
    }

    //Métodos da classe

    public void alterarPreco(){
        //aumenta o preço em 10%
        this.preco *= 1.10;
    }

    public void imprimir(){
        System.out.println("id = " + id);
        System.out.println("medicamento = " + medicamento);
        System.out.println("concentracao = " + concentracao);
        System.out.println("forma = " + forma);
        System.out.println("numRegistro = " + numRegistro);
        System.out.println("preco = " + preco); //Sem formatação de casas decimais
        System.out.printf("preco = %.2f \n", preco);
        System.out.println("dataCadastro = " + dataCadastro);
        System.out.println("-- Farmaceutica --------------");
        this.getDetentora().imprimir();
    }

    public void registrarData(){
        // como registrar a data no momento atual: LocalDate.now()
        dataCadastro = LocalDate.now();
    }

}
