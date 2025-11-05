package com.atividade04.app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        // declaração de variaveis
        String nome;
        int idade;
        int verifica =0;
        int opcao;

        // entrada de dados
        System.out.println("Informe seu nome:");
        nome = leia.nextLine();
        System.out.println("Informe sua idade:");
        idade = leia.nextInt();
        
        // MENU
        do{
            System.out.println("\nEscolha o filme que deseja assistir:");
            System.out.println("Sala 1 - A Roda Quadrada - LIVRE");
            System.out.println("Sala 2 - A Volta dos que Não foram - 12 anos");
            System.out.println("Sala 3 - Poeira em Alto Mar - 14 anos");
            System.out.println("Sala 4 - As Tranças do Rei Careca - 16 anos");
            System.out.println("Sala 5 - A Vingança da Peixe Frita - 18 anos");
            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    verifica = 0;
                    System.err.println("-----Recibo-----");
                    System.out.println("Nome: "+nome);
                    System.out.println("Sala: 1");
                    System.out.println("filme: A Roda Quadrada");
                    System.out.println("Classificação: LIVRE");
                    break;

                case 2:
                    verifica = 12;
                    if (idade >= verifica) {
                        System.err.println("-----Recibo-----");
                        System.out.println("Nome: "+nome);
                        System.out.println("Sala: 2");
                        System.out.println("filme: A Volta dos que Não foram");
                        System.out.println("Classificação: 12 anos");
                   }
                   else {
                    System.out.println("Você não possui a idade mínima! Escolha outro filme.");
                   }
                    break;

                case 3:
                    verifica = 14;
                    if (idade >= verifica) {
                        System.err.println("-----Recibo-----");
                        System.out.println("Nome: "+nome);
                        System.out.println("Sala: 3");
                        System.out.println("filme: Poeira em Alto Mar");
                        System.out.println("Classificação: 14 anos");
                   }
                   else {
                    System.out.println("Você não possui a idade mínima! Escolha outro filme.");
                   }
                    break;
                case 4:
                    verifica = 16;
                    if (idade >= verifica) {
                        System.err.println("-----Recibo-----");
                        System.out.println("Nome: "+nome);
                        System.out.println("Sala: 4");
                        System.out.println("filme: As Tranças do Rei Careca");
                        System.out.println("Classificação: 16 anos");
                   }
                   else {
                    System.out.println("Você não possui a idade mínima! Escolha outro filme.");
                   }
                    break;
                case 5:
                    verifica = 18;
                    if (idade >= verifica) {
                        System.err.println("-----Recibo-----");
                        System.out.println("Nome: "+nome);
                        System.out.println("Sala: 5");
                        System.out.println("filme: A Vingança da Peixe Frita");
                        System.out.println("Classificação: 18 anos");
                   }
                   else {
                    System.out.println("Você não possui a idade mínima! Escolha outro filme.");
                   }
                    break;
                default:
                   System.out.println("Opção inválida");
            }


        }while(idade < verifica);

        // fecha objeto leia
        leia.close();
    
    }
}

