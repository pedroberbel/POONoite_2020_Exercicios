package com.pedroberbel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TelaCalculadora extends JFrame implements WindowListener, ActionListener {
    //Quais os componentes de uma calculadora?
    protected Dimension dFrame, dLabel, dTextField, dButton;
    protected Button btnNum1, btnNum2, btnNum3, btnNum4, btnNum5, btnNum6, btnNum7, btnNum8, btnNum9, btnNum0;
    protected Button btnSoma, btnSubtracao, btnDivisao, btnMultiplicacao, btnResultado, btnLimpa;
    protected TextField txtVisor;
    private int controleOp = 0, selectedOp = 0, primeiroValor = 0, segundoValor = 0;
    private int resultado = 0;
    public TelaCalculadora(){
        dFrame = new Dimension(350,400);
        dLabel = new Dimension(40,20);
        dTextField = new Dimension(325,40);
        dButton = new Dimension(50,50);

        //Define as propriedades ao iniciar a tela
        setTitle("Controle de Caixa");
        setResizable(false);
        setSize(dFrame);
        setLocation(200,200);
        setLayout(null);


        //Visor
        txtVisor = new TextField(null);
        txtVisor.setSize(dTextField);
        txtVisor.setLocation(5,40);
        txtVisor.setEditable(false);
        txtVisor.setText("0");
        add(txtVisor);

        //Botões de ação
        btnSoma = new Button("+");
        btnSoma.setSize(dButton);
        btnSoma.setLocation(275,85);
        btnSoma.addActionListener(this);
        add(btnSoma);

        btnSubtracao = new Button("-");
        btnSubtracao.setSize(dButton);
        btnSubtracao.setLocation(275,135);
        btnSubtracao.addActionListener(this);
        add(btnSubtracao);

        btnMultiplicacao = new Button("*");
        btnMultiplicacao.setSize(dButton);
        btnMultiplicacao.setLocation(275,185);
        btnMultiplicacao.addActionListener(this);
        add(btnMultiplicacao);

        btnDivisao = new Button("/");
        btnDivisao.setSize(dButton);
        btnDivisao.setLocation(275,235);
        btnDivisao.addActionListener(this);
        add(btnDivisao);

        btnResultado = new Button("=");
        btnResultado.setSize(dButton);
        btnResultado.setLocation(275,285);
        btnResultado.addActionListener(this);
        add(btnResultado);

        //Botões numéricos

        btnNum0 = new Button("0");
        btnNum0.setSize(dButton);
        btnNum0.setLocation(5,285);
        btnNum0.addActionListener(this);
        add(btnNum0);

        btnNum1 = new Button("1");
        btnNum1.setSize(dButton);
        btnNum1.setLocation(5,235);
        btnNum1.addActionListener(this);
        add(btnNum1);

        btnNum2 = new Button("2");
        btnNum2.setSize(dButton);
        btnNum2.setLocation(55,235);
        btnNum2.addActionListener(this);
        add(btnNum2);

        btnNum3 = new Button("3");
        btnNum3.setSize(dButton);
        btnNum3.setLocation(105,235);
        btnNum3.addActionListener(this);
        add(btnNum3);

        btnNum4 = new Button("4");
        btnNum4.setSize(dButton);
        btnNum4.setLocation(5,185);
        btnNum4.addActionListener(this);
        add(btnNum4);

        btnNum5 = new Button("5");
        btnNum5.setSize(dButton);
        btnNum5.setLocation(55,185);
        btnNum5.addActionListener(this);
        add(btnNum5);

        btnNum6 = new Button("6");
        btnNum6.setSize(dButton);
        btnNum6.setLocation(105,185);
        btnNum6.addActionListener(this);
        add(btnNum6);

        btnNum7 = new Button("7");
        btnNum7.setSize(dButton);
        btnNum7.setLocation(5,135);
        btnNum7.addActionListener(this);
        add(btnNum7);

        btnNum8 = new Button("8");
        btnNum8.setSize(dButton);
        btnNum8.setLocation(55,135);
        btnNum8.addActionListener(this);
        add(btnNum8);

        btnNum9 = new Button("9");
        btnNum9.setSize(dButton);
        btnNum9.setLocation(105,135);
        btnNum9.addActionListener(this);
        add(btnNum9);

        addWindowListener(this);
    }
    //Métodos window Listener
    @Override
    public void windowOpened(WindowEvent e) {}

    @Override
    public void windowClosing(WindowEvent e) {}

    @Override
    public void windowClosed(WindowEvent e) {}

    @Override
    public void windowIconified(WindowEvent e) {}

    @Override
    public void windowDeiconified(WindowEvent e) {}

    @Override
    public void windowActivated(WindowEvent e) {}

    @Override
    public void windowDeactivated(WindowEvent e) {}

    //Action Listener
    @Override
    public void actionPerformed(ActionEvent e){
    //botões numéricos
        if(e.getSource()==btnNum0){
            if(controleOp == 0){
                this.txtVisor.setText("0");
                controleOp = 1;
                primeiroValor = 0;
            } else if (controleOp == 2) {
                this.txtVisor.setText(this.txtVisor.getText()+" 0 ");
                controleOp = 3;
                segundoValor = 0;
            }

        }
        if(e.getSource()==btnNum1){
            if(controleOp == 0){
                this.txtVisor.setText("1");
                controleOp = 1;
                primeiroValor = 1;
            } else if (controleOp == 2) {
                this.txtVisor.setText(this.txtVisor.getText()+" 1 ");
                controleOp = 3;
                segundoValor = 1;
            }

        }
        if(e.getSource()==btnNum2){
            if(controleOp == 0){
                this.txtVisor.setText("2");
                controleOp = 1;
                primeiroValor = 2;
            } else if (controleOp == 2) {
                this.txtVisor.setText(this.txtVisor.getText()+" 2 ");
                controleOp = 3;
                segundoValor = 2;
            }

        }
        if(e.getSource()==btnNum3){
            if(controleOp == 0){
                this.txtVisor.setText("3");
                controleOp = 1;
                primeiroValor = 3;
            } else if (controleOp == 2) {
                this.txtVisor.setText(this.txtVisor.getText()+" 3 ");
                controleOp = 3;
                segundoValor = 3;
            }

        }
        if(e.getSource()==btnNum4){
            if(controleOp == 0){
                this.txtVisor.setText("4");
                controleOp = 1;
                primeiroValor = 4;
            } else if (controleOp == 2) {
                this.txtVisor.setText(this.txtVisor.getText()+" 4 ");
                controleOp = 3;
                segundoValor = 4;
            }

        }
        if(e.getSource()==btnNum5){
            if(controleOp == 0){
                this.txtVisor.setText("5");
                controleOp = 1;
                primeiroValor = 5;
            } else if (controleOp == 2) {
                this.txtVisor.setText(this.txtVisor.getText()+" 5 ");
                controleOp = 3;
                segundoValor = 5;
            }

        }
        if(e.getSource()==btnNum6){
            if(controleOp == 0){
                this.txtVisor.setText("6");
                controleOp = 1;
                primeiroValor = 6;
            } else if (controleOp == 2) {
                this.txtVisor.setText(this.txtVisor.getText()+" 6 ");
                controleOp = 3;
                segundoValor = 6;
            }

        }
        if(e.getSource()==btnNum7){
            if(controleOp == 0){
                System.out.println("Entrou 7");
                this.txtVisor.setText("7");
                controleOp = 1;
                primeiroValor = 7;
            } else if (controleOp == 2) {
                this.txtVisor.setText(this.txtVisor.getText()+" 7 ");
                controleOp = 3;
                segundoValor = 7;
            }

        }
        if(e.getSource()==btnNum8){
            if(controleOp == 0){
                this.txtVisor.setText("8");
                controleOp = 1;
                primeiroValor = 8;
            } else if (controleOp == 2) {
                this.txtVisor.setText(this.txtVisor.getText()+" 8 ");
                controleOp = 3;
                segundoValor = 8;
            }

        }
        if(e.getSource()==btnNum9){
            if(controleOp == 0){
                this.txtVisor.setText("9");
                controleOp = 1;
                primeiroValor = 9;
            } else if (controleOp == 2) {
                this.txtVisor.setText(this.txtVisor.getText()+" 9 ");
                controleOp = 3;
                segundoValor = 9;
            }

        }


    //botões de função
        if(e.getSource()==btnSoma){
            if(controleOp == 0 || controleOp == 2){
                //invalido
            } else if (controleOp == 1){
                this.txtVisor.setText(this.txtVisor.getText()+" + ");
                controleOp = 2;
                selectedOp = 1;
            }

        }
        if(e.getSource()==btnSubtracao){
            if(controleOp == 0 || controleOp == 2){
                //invalido
            } else if (controleOp == 1){
                this.txtVisor.setText(this.txtVisor.getText()+" - ");
                controleOp = 2;
                selectedOp = 2;
            }

        }
        if(e.getSource()==btnMultiplicacao){
            if(controleOp == 0 || controleOp == 2){
                //invalido
            } else if (controleOp == 1){
                this.txtVisor.setText(this.txtVisor.getText()+" * ");
                controleOp = 2;
                selectedOp = 3;
            }

        }
        if(e.getSource()==btnDivisao){
            if(controleOp == 0 || controleOp == 2){
                //invalido
            } else if (controleOp == 1){
                this.txtVisor.setText(this.txtVisor.getText()+" / ");
                controleOp = 2;
                selectedOp = 4;
            }

        }
        if(e.getSource()==btnResultado){
            if(controleOp == 0 || controleOp == 1 || controleOp == 2){

            } else if (controleOp == 3){
                switch (selectedOp){
                    case 1: //soma
                        resultado = primeiroValor + segundoValor;
                        this.txtVisor.setText(Integer.toString(resultado));
                        controleOp = 0;
                        break;
                    case 2: // sub
                        resultado = primeiroValor - segundoValor;
                        this.txtVisor.setText(Integer.toString(resultado));
                        controleOp = 0;
                        break;
                    case 3: //mult
                        resultado = primeiroValor * segundoValor;
                        this.txtVisor.setText(Integer.toString(resultado));
                        controleOp = 0;
                        break;
                    case 4: //div
                        resultado = primeiroValor / segundoValor;
                        this.txtVisor.setText(Integer.toString(resultado));
                        controleOp = 0;
                        break;
                }
            }

        }
    } //fim actionPerformed






}
