package com.contador.app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        // instancia Scanner
        Scanner leia = new Scanner(System.in);

        // declarando variaveis
        int x;

        // entada de dados
        System.out.println("Informe um número inteiro positivo:");
        x = leia.nextInt();

        // loop (Laço de repetição)
        while(x >= 0){
            System.out.println(x);
            x--;
        }

        // fecha objeto leia
        leia.close();
    }
}
