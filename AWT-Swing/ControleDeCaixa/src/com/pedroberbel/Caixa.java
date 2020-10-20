package com.pedroberbel;

public class Caixa {
    private double saldo;

    public double getSaldo(){
        return saldo;
    }

    //Depósito e saque
    public String sacar(double valor){
        String msg = "Erro ao executar operação";
        try {
            if(valor<= 0){
                throw new IllegalArgumentException("Valor Inválido");
            }
            if (valor > getSaldo()){
                msg = "Saldo insuficiente para o saque";
            } else {
                this.saldo -= valor;
                msg = "Saque efetuado com sucesso";
            }
        }
        catch (IllegalArgumentException e){
            throw e;
        } finally {
            return msg;
        }
    }

    public String depositar(double valor){
        String msg = "Erro ao executar a operação";
        System.out.println("Entrou depositar");
        try {
            if(valor <= 0){
                throw new IllegalArgumentException("Valor Inválido");
            }
            this.saldo += valor;
            msg = "Depósito efetuado com sucesso";
        }
        catch (IllegalArgumentException e){
            throw e;
        } finally {
            return msg;
        }
    }
}
