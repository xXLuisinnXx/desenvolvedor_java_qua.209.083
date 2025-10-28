package com.maioridade.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // instancia a classe Scanner
        Scanner leia = new Scanner(System.in);

        // declaração de variavel

        String nome;
        int idade;

        // entrada de dados
        System.out.println("Informe o nome: ");
        nome = leia.nextLine();
        System.out.println("Informe sua idade: ");
        idade = leia.nextInt();

        // estrutura de decisão
        if (idade >= 18 ) {
            System.out.println(nome+ " é maior de idade");
        } 
        else {
            System.out.println(nome+ " é menor de idade");
        }

        // fecha objeto leia
        leia.close();
    }
}
