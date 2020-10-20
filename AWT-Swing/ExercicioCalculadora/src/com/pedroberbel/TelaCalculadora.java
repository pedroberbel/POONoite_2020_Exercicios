package com.pedroberbel;

import javax.swing.*;
import java.awt.*;

public class TelaCalculadora extends JFrame {
    //Quais os componentes de uma calculadora?
    protected Dimension dFrame, dLabel, dTextField, dButton;
    protected Button btnNum1, btnNum2, btnNum3, btnNum4, btnNum5, btnNum6, btnNum7, btnNum8, btnNum9, btnNum0;
    protected Button btnSoma, btnSubtracao, btnDivisao, btnMultiplicacao, btnResultado, btnLimpa;
    protected TextField txtVisor;

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
        add(txtVisor);

        //Botões de ação
        btnSoma = new Button("+");
        btnSoma.setSize(dButton);
        btnSoma.setLocation(275,85);
        //btnSoma.addActionListener(this);
        add(btnSoma);

        btnSubtracao = new Button("-");
        btnSubtracao.setSize(dButton);
        btnSubtracao.setLocation(275,135);
        //btnSubtracao.addActionListener(this);
        add(btnSubtracao);

        btnMultiplicacao = new Button("*");
        btnMultiplicacao.setSize(dButton);
        btnMultiplicacao.setLocation(275,185);
        //btnMultiplicacao.addActionListener(this);
        add(btnMultiplicacao);

        btnDivisao = new Button("/");
        btnDivisao.setSize(dButton);
        btnDivisao.setLocation(275,235);
        //btnDivisao.addActionListener(this);
        add(btnDivisao);

        btnResultado = new Button("=");
        btnResultado.setSize(dButton);
        btnResultado.setLocation(275,285);
        //btnResultado.addActionListener(this);
        add(btnResultado);

        //Botões numéricos

        btnNum0 = new Button("0");
        btnNum0.setSize(dButton);
        btnNum0.setLocation(5,285);
        //btnNum0.addActionListener(this);
        add(btnNum0);

        btnNum1 = new Button("1");
        btnNum1.setSize(dButton);
        btnNum1.setLocation(5,235);
        //btnNum1.addActionListener(this);
        add(btnNum1);

        btnNum2 = new Button("2");
        btnNum2.setSize(dButton);
        btnNum2.setLocation(55,235);
        //btnNum2.addActionListener(this);
        add(btnNum2);

        btnNum3 = new Button("3");
        btnNum3.setSize(dButton);
        btnNum3.setLocation(105,235);
        //btnNum3.addActionListener(this);
        add(btnNum3);

        btnNum4 = new Button("4");
        btnNum4.setSize(dButton);
        btnNum4.setLocation(5,185);
        //btnNum4.addActionListener(this);
        add(btnNum4);

        btnNum5 = new Button("5");
        btnNum5.setSize(dButton);
        btnNum5.setLocation(55,185);
        //btnNum5.addActionListener(this);
        add(btnNum5);

        btnNum6 = new Button("6");
        btnNum6.setSize(dButton);
        btnNum6.setLocation(105,185);
        //btnNum6.addActionListener(this);
        add(btnNum6);

        btnNum7 = new Button("7");
        btnNum7.setSize(dButton);
        btnNum7.setLocation(5,135);
        //btnNum7.addActionListener(this);
        add(btnNum7);

        btnNum8 = new Button("8");
        btnNum8.setSize(dButton);
        btnNum8.setLocation(55,135);
        //btnNum8.addActionListener(this);
        add(btnNum8);

        btnNum9 = new Button("9");
        btnNum9.setSize(dButton);
        btnNum9.setLocation(105,135);
        //btnNum9.addActionListener(this);
        add(btnNum9);
    }
}
