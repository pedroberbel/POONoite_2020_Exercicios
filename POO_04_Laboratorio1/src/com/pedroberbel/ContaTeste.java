package com.pedroberbel;

import java.util.Scanner;

public class ContaTeste {

    private static int TAM = 3;
    private int indice;
    private Conta[] cc = new Conta[TAM];

    public void execCadastrar(){
        if(indice >= TAM){
            System.out.println("Todos os espaços para contas foram ocupados");
            return;
        }
        Scanner sc = new Scanner(System.in);
        this.cc[indice] = new Conta();
        System.out.println("Digite o nome: ");
        this.cc[indice].setNomeCliente(sc.nextLine());
        System.out.println("Digite a conta: ");
        this.cc[indice].setConta(sc.nextLine());
        System.out.println("Digite a agência: ");
        this.cc[indice].setAgencia(sc.nextLine());
        System.out.println("Digite o saldo: ");
        this.cc[indice].setSaldo(Double.parseDouble(sc.nextLine()));
        indice++;
    }

    public void execConsultar(){
        if(indice > 0){
            System.out.println("Digite a posição da conta");
            Scanner sc = new Scanner(System.in);
            int op = Integer.parseInt(sc.nextLine());
            if (op < 0 || op > 2){
                System.out.println("Posição inválida");
            } else {
                this.cc[op].imprimir();
            }
        } else {
            System.out.println("Nenhuma conta cadastrada");
        }
    }

    public void execSacar(){
        if(indice > 0){
            System.out.println("Digite a posição da conta");
            Scanner sc = new Scanner(System.in);
            int op = Integer.parseInt(sc.nextLine());
            if (op < 0 || op > 2){
                System.out.println("Posição inválida");
            } else {
                System.out.println("Digite o valor: ");
                double valor = Double.parseDouble(sc.nextLine());
                int retorno = this.cc[op].sacar(valor);
                if (retorno == 1){
                    System.out.println("Saque realizado!");
                } else {
                    System.out.println("Saque não realizado!");
                }
            }
        } else {
            System.out.println("Nenhuma conta cadastrada");
        }
    }

    public void execDepositar(){
        if(indice > 0){
            System.out.println("Digite a posição da conta");
            Scanner sc = new Scanner(System.in);
            int op = Integer.parseInt(sc.nextLine());
            if (op < 0 || op > 2){
                System.out.println("Posição inválida");
            } else {
                System.out.println("Digite o valor: ");
                double valor = Double.parseDouble(sc.nextLine());
                this.cc[op].depositar(valor);
                System.out.println("Deposito realizado com sucesso!");
            }
        } else {
            System.out.println("Nenhuma conta cadastrada");
        }
    }

    public static void main(String[] args) {
        ContaTeste controlaConta = new ContaTeste();
        Scanner sc = new Scanner(System.in);
        int opMenu = 0;
        while (opMenu != 9) {
            System.out.println("Controle de Contas");
            System.out.println("1) Cadastrar");
            System.out.println("2) Sacar");
            System.out.println("3) Depositar");
            System.out.println("4) Consultar");
            System.out.println("9) Sair");
            System.out.println();

            System.out.println("Digite a opção:");
            opMenu = Integer.parseInt(sc.nextLine());

            switch(opMenu){
                case 1:
                    controlaConta.execCadastrar();
                    break;
                case 2:
                    controlaConta.execSacar();
                    break;
                case 3:
                    controlaConta.execDepositar();
                    break;
                case 4:
                    controlaConta.execConsultar();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }

        }
    }
}
