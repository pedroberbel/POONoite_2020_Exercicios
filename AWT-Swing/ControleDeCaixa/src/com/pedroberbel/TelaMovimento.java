package com.pedroberbel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TelaMovimento extends JFrame implements WindowListener, ActionListener {
    protected Dimension dFrame, dLabel, dTextField, dButton, dTextArea;
    protected Button cmdEntrada, cmdRetirada, cmdConsulta, cmdSair;
    protected TextField txtValor, txtSaldo;
    protected Label lblValor, lblSaldo;
    protected TextArea txtMsg;
    public Caixa caixa;

    public TelaMovimento(){
        caixa = new Caixa();
        //Metodo construtor da view
        //Define dimensão dos componentes

        dFrame = new Dimension(350,400);
        dLabel = new Dimension(40,20);
        dTextField = new Dimension(150,20);
        dButton = new Dimension(95,20);
        dTextArea = new Dimension(300,140);

        //Define as propriedades ao iniciar a tela
        setTitle("Controle de Caixa");
        setResizable(false);
        setSize(dFrame);
        setLocation(200,200);
        setLayout(null);

        //Definindo atributos dos componentes criados
        lblValor = new Label("Valor: ");
        lblValor.setSize(dLabel);
        lblValor.setLocation(25,50);
        add(lblValor);

        lblSaldo = new Label("Saldo: ");
        lblSaldo.setSize(dLabel);
        lblSaldo.setLocation(25,80);
        add(lblSaldo);

        txtValor = new TextField(null);
        txtValor.setSize(dTextField);
        txtValor.setLocation(75,50);
        add(txtValor);

        txtSaldo = new TextField(null);
        txtSaldo.setSize(dTextField);
        txtSaldo.setLocation(75,80);
        add(txtSaldo);

        cmdEntrada = new Button("Entrada");
        cmdEntrada.setSize(dButton);
        cmdEntrada.setLocation(25,150);
        cmdEntrada.addActionListener(this);
        add(cmdEntrada);

        cmdConsulta = new Button("Consulta");
        cmdConsulta.setSize(dButton);
        cmdConsulta.setLocation(25,185);
        cmdConsulta.addActionListener(this);
        add(cmdConsulta);

        cmdRetirada = new Button("Retirada");
        cmdRetirada.setSize(dButton);
        cmdRetirada.setLocation(180,150);
        cmdRetirada.addActionListener(this);
        add(cmdRetirada);

        cmdSair = new Button("Sair");
        cmdSair.setSize(dButton);
        cmdSair.setLocation(180,185);
        cmdSair.addActionListener(this);
        this.add(cmdSair);

        txtMsg = new TextArea(null);
        txtMsg.setSize(dTextArea);
        txtMsg.setLocation(25,220);
        add(txtMsg);

    //Métodos Window Listener
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

        if(e.getSource()==cmdSair){
            JOptionPane.showMessageDialog(null,"Finalizando o Programa","fim", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        if(e.getSource()==cmdEntrada){
            try {
                txtMsg.append(caixa.depositar(Double.parseDouble(txtValor.getText())));
                txtMsg.append("\n");
                txtValor.setText(null);
            } catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Ocorreu um erro", JOptionPane.ERROR_MESSAGE);

            }
        }
        if(e.getSource()==cmdRetirada){
            try {
                txtMsg.append(caixa.sacar(Double.parseDouble(txtValor.getText())));
                txtMsg.append("\n");
                txtValor.setText(null);
            } catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Ocorreu um erro", JOptionPane.ERROR_MESSAGE);

            }
        }
        if(e.getSource()==cmdConsulta){
            txtSaldo.setText(Double.toString(caixa.getSaldo()));
        }

    } //fim actionPerformed


}
