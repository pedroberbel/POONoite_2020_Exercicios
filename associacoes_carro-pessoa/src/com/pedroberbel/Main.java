package com.pedroberbel;

public class Main {

    public static void main(String[] args) {
        //cadastra carro
        Carro carro1 = new Carro();

        carro1.setMarca("Fiat");
        carro1.setModelo("Uno");
        carro1.setAno(1990);

        Carro carro2 = new Carro();

        carro2.setMarca("Ford");
        carro2.setModelo("Mustang");
        carro2.setAno(1967);

        //cadastra pessoa
        Pessoa cliente1 = new Pessoa();

        cliente1.setNome("Pedro");
        cliente1.setIdade(25);

        //relaciona carro à pessoa
        cliente1.adicionarCarro(carro1);
        cliente1.adicionarCarro(carro2);

        //imprimir os dados do cliente(Pessoa)
        cliente1.imprimir();
    }
}
