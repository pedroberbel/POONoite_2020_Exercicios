package com.pedroberbel;

public class ApoliceTeste {

    public static void main(String[] args) {
        Apolice apolice;

        apolice = new Apolice();

        apolice.setNomeSegurado("Pedro");
        apolice.setIdade(23);
        apolice.setValorPremio((float)25.000);

        apolice.imprimir();
    }
}
