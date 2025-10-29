package com.media.app;
// importando o scanner
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        // declaração de variaveis
        String nome;
        double nota;

        // entrada de dados
        System.out.println("Informe o nome do aluno:");
        nome = leia.nextLine();
        System.out.println("Informe a nota do aluno "+nome);
        nota = leia.nextDouble();

        // condições

        if (nota < 0 || nota> 10) {
            System.out.println("Nota inválida.");
        } 
        else {
            if (nota <5) {
                System.out.println("O aluno está reprovado");
            }
            else if(nota>=5 && nota<7){
                System.out.println("O aluno está de recuperação");
            }
            else 
            System.out.println("O aluno está aprovado");
        }

        // fecha objeto leia
        leia.close();

    }
}
