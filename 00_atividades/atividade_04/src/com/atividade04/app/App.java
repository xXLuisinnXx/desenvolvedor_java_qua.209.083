package com.atividade04.app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        String nome;
        int idade;
        int verifica =0;

        System.out.println("Informe seu nome:");
        nome = leia.nextLine();
        System.out.println("Informe sua idade:");
        idade = leia.nextInt();
        
        // entrada de dados

        do{
            System.out.println("Escolha o filme que deseja assistir:");
            System.out.println("Sala 1 - A Roda Quadrada - LIVRE");
            System.out.println("Sala 2 - A Volta dos que Não foram - 12 anos");
            System.out.println("Sala 3 - Poeira em Alto Mar - 14 anos");
            System.out.println("Sala 4 - As Tranças do Rei Careca - 16 anos");
            System.out.println("Sala 5 - A Vingança da Peixe Frita - 18 anos");
            


        }while(idade >= verifica);
    }
}
