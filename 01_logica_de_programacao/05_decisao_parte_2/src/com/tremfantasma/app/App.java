package com.tremfantasma.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instacia a classe scanner
        Scanner leia = new Scanner(System.in);

        // declaração de variaveis
        String nome;
        int idade;
        double altura;

        // entrada de dados
        System.out.println("Informe seu nome:");
        nome = leia.nextLine();
        System.out.println("Informe sua idade:");
        idade = leia.nextInt();
        System.out.println("Informe sua altura em metros:");
        altura = leia.nextDouble();


        // condições 
        if (idade >=14 && altura>=1.5) {
            System.out.println(nome+ " pode brincar no trem fantasma");
        }
        else{
            System.out.println(nome+ " não pode brincar no trem fantasma");
        }
        // fecha objeto leia 
        leia.close();
    }
}
