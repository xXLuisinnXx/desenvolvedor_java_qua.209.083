package com.abstracao.app;

import java.util.Scanner;

import com.abstracao.models.Carro;
import com.abstracao.models.Moto;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia as classes
        Scanner leia = new Scanner(System.in);

        Carro carro = new Carro();
        Moto moto = new Moto();


        //declararação de variável
        String combustivel;  

        // entrada de dados do carro
        System.out.println("INFORME OS DADOS DO CARRO:");
        System.out.println("Informe o fabricante do carro:");
        carro.fabricante = leia.nextLine();
        System.out.println("Informe o modelo do carro:");
        carro.modelo = leia.nextLine();
        System.out.println("Informe a cor do carro:");
        carro.cor = leia.nextLine();
        System.out.println("Informe o ano do carro:");
        carro.ano = leia.nextLine();
        System.out.println("Informe a placa do carro:");
        carro.placa = leia.nextLine();
        
        // padrão de combustivel 
        carro.motorFlex = false;
        carro.motorDiesel = false;
        carro.motorEletrico = false;
        carro.motorGasolina = false;
        carro.motorEtanol = false;

        // usuario informa o tipo de combustivel
        System.out.println("\nInforme o tipo de combustível:\n");
        System.out.println("1 - Gasolina");
        System.out.println("2 - Etanol");
        System.out.println("3 - Tanto gasolina como etanol");
        System.out.println("4 - Diesel");
        System.out.println("5 - Elétrico");
        combustivel = leia.nextLine();

        switch (combustivel) {
            case "1":
                carro.motorGasolina = true;
                break;
            case "2":
                carro.motorEtanol = true;
                break;
            case "3":
                carro.motorFlex = true;
                break;
            case "4":
                carro.motorDiesel = true;
                break;
            case "5":
                carro.motorEletrico = true;
                break;
            default:
            System.out.println("Motor inexistente.");
        }

        //entrada de dados da moto
        System.out.println("\nINFORME OS DADOS DA MOTO:");
        System.out.println("Informe o fabricante da moto:");
        moto.fabricante = leia.nextLine();
        System.out.println("Informe o modelo da moto:");
        moto.modelo = leia.nextLine();
        System.out.println("Informe a cor da moto:");
        moto.cor = leia.nextLine();
        System.out.println("Informe o ano da moto:");
        moto.ano = leia.nextLine();
        System.out.println("Informe a placa da moto:");
        moto.placa = leia.nextLine();

        // saida de dados
        System.out.println("\nDADOS DO CARRO:");
        carro.exibirDados();
        System.out.println("\nDADOS DA MOTO:");
        moto.exibirDados();
        // fecha o objeto leia
        leia.close();
    }
}
