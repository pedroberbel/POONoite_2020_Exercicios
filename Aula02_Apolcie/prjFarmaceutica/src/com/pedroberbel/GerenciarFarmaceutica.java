package com.pedroberbel;

public class GerenciarFarmaceutica {

    public static void main(String[] args) {
        //Definir uma farmaceutica
        Farmaceutica lab = new Farmaceutica();

        //Definindo os valores: Pode ser direto ou por meio de entrada do usuário
        //Direto:
        lab.setNomeFarmaceutica("Laboratório Cristália");
        lab.setIdFarmaceutica(1);
        lab.setCidade("Itapira");
        lab.setUf("SP");

        //Atrelar à farmaceutica os medicamentos a seguir:
        Medicamento medicamento1 = new Medicamento();
        medicamento1.setId(1);
        medicamento1.setMedicamento("Aspirina");
        medicamento1.setNumRegistro("112233");
        medicamento1.setConcentracao("5g");
        medicamento1.setPreco(12.55);
        medicamento1.setForma("Comprimido");
        medicamento1.setDetentora(lab); //atrela o medicamento à farmaceutica criada
        medicamento1.alterarPreco();
        medicamento1.registrarData(); //gera horário do registro do medicamento

        Medicamento medicamento2 = new Medicamento();
        medicamento2.setId(2);
        medicamento2.setMedicamento("Dipirona");
        medicamento2.setNumRegistro("112444");
        medicamento2.setConcentracao("25g");
        medicamento2.setPreco(15.99);
        medicamento2.setForma("Gotas");
        medicamento2.setDetentora(lab); //atrela medicamento à farmaceutica criada
        medicamento2.alterarPreco();
        medicamento2.registrarData(); // gera horario de registro do medicamento


        //Imprimir primeiro medicamento
        medicamento1.imprimir();
    }
}
