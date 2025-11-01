package com.atividade03.app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        // variaveis
        String nome;
        double peso;
        double altura;
        double imc;

        // entrada de dados
        System.out.println("Informe seu nome:");
        nome = leia.nextLine();
        System.out.println("Informe sua altura em metros:");
        altura = leia.nextDouble();
        System.out.println("Informe seu peso em KG:");
        peso = leia.nextDouble();

        // calculo
        imc = peso/ Math.pow(altura,2);

        // saida de dados
        System.out.println("Seu IMC é: "+imc);

        // verifica diaginostico
        if (imc < 18.5) {
            System.out.println(nome+ " você está com magreza");    
        }
        else if (imc >=18.5 && imc <25.0) {
            System.out.println(nome+ " você está normal");
            
        }
        else if (imc >=25.0 && imc <30.0) {
            System.out.println(nome+ " você está com sobrepeso");
        }
        else if (imc >= 30.0 && imc <40.0) {
            System.out.println(nome+ " você está com obesidade");
        }
        else {
            System.out.println(nome+ " você está com obesidade grave");
        }

        // fecha objeto leia
        leia.close();

    }
}
