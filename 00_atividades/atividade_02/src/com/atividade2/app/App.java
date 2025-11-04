package com.atividade2.app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        // variaveis
        double a;
        double b;
        double resultado;

        // entrada de dados
        System.out.println("Informe o coeficiente A:");
        a = leia.nextDouble();
        System.out.println("Informe o coeficiente B:");
        b = leia.nextDouble();
        
        // saida de dados
        if(a == 0){
            if (b==0) {
                System.out.println("Essa é uma identidade. Possui infinitas soluções");
            }
            else{
                System.err.println("Não possui solução pois a é igual a 0.");
            }
        } 
        else{
            resultado = -b/a;
            System.out.println("Resultado da equação: "+resultado);
        }

        // fecha objeto leia
        leia.close();
    }
}
