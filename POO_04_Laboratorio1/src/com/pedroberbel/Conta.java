package com.pedroberbel;

public class Conta {
    private String conta;
    private String agencia;
    private double saldo;
    private String nomeCliente;

    //Get and set

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }


    //Métodos

    public int sacar(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return 1;
        }
        return 0;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void imprimir(){
        System.out.println("conta = " + conta);
        System.out.println("agencia = " + agencia);
        System.out.println("nomeCliente = " + nomeCliente);
        System.out.println("saldo = " + saldo);
        System.out.println("----------------------");
    }
}
