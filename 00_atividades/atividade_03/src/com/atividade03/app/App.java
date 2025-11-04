package com.atividade03.app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        // variaveis
        String nome;
        String resultado;
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
        System.out.println(nome+", seu IMC é: "+String.format("%.2f",imc));

        //  verifica diaginostico
        resultado = (imc <18.5) ? " está abaixo do peso." :
        (imc < 25.0) ? " está no peso ideal." :
        (imc <30.0) ? " está acima do peso" :
        (imc <35.0) ? " está obeso" :
        (imc < 40.0) ? " está com obesidade 2" :
        " está com obesidade mórbida"; 

        // exibir resultado
        System.out.println(nome + resultado +".");

        // fecha objeto leia
        leia.close();
    
    }
}
