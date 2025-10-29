package com.alfandega.app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        String nome;
        String resultado;
        double valor;

        //entrada de dados
        System.out.println("Informe o nome do passageiro:");
        nome = leia.nextLine();
        System.out.println("Informe o valor da bagagem em dólares:");
        valor = leia.nextDouble();

        // verificação
        resultado=(valor<=1000) ? " está liberado." : " está retido.";
        System.out.println(nome+ resultado);

        leia.close();
    }
}
