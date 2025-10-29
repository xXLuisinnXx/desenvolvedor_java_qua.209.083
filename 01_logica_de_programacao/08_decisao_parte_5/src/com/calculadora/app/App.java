package com.calculadora.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        
        //declaração de variaveis
        String  operador;
        double x,y,resultado;

        // entrada de dados
        System.out.println("Informe o valor de X:");
        x=leia.nextDouble();
        System.out.println("Informe o valor de Y:");
        y= leia.nextDouble();

        // limpeza de buffer
        leia.nextLine();

        // menu

        
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Divisão");
        System.out.println("4 - Multiplicação");
        operador = leia.nextLine();

        switch (operador) {
            case "1":
                resultado= x + y;
                System.out.println("Valor da soma: "+resultado);
                break;
            case "2":
                resultado= x-y;
                System.out.println("Valor da subtração: "+resultado);
                break;
            case "3":
                resultado= x/y;
                System.out.println("Valor da divisão: "+resultado);
                break;
            case "4":
                resultado=x*y;
                System.out.println("Valor da multiplicação: "+resultado);
                break;
            default:
                System.out.println("Opção inválida");
        }

        // fecha o objeto leia
        leia.close();

    }
}
