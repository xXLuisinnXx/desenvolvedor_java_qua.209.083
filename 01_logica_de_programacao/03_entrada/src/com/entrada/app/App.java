package com.entrada.app;
// importando a biblioteca de scanner
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Instância do objeto leia
        Scanner leia = new Scanner(System.in);

        // declaração de variaveis
        String nome, email;
        int idade;
        double altura;

        // entrada de dados
        System.out.println("Insira seu nome: ");
        nome = leia.nextLine();
        System.out.println("Informe sua idade: ");
        idade = leia.nextInt();
        System.out.println("Informe sua altura em metros: ");
        altura = leia.nextDouble();

        // limpeza de buffer
        leia.nextLine();
        
        System.out.println("Informe seu email:");
        email = leia.nextLine();
       

        // saida de dados

        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Altura: "+altura+ " metros");
        System.out.println("Email: "+email);

        // fecha objeto close 
        leia.close();
    }
}
