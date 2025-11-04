package com.atividade01.app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        // instancia objeto leia
        Scanner leia = new Scanner(System.in);

        // variaveis
        String nome;
        String dn;
        String email;
        String cpf;
        String telefone;

        // entrada de dados
        System.out.println("Informe seu nome:");
        nome = leia.nextLine();
        System.out.println("Informe sua data de nascimento:");
        dn = leia.nextLine();
        System.out.println("Informe seu e-mail:");
        email = leia.nextLine();
        System.out.println("Informe seu cpf:");
        cpf = leia.nextLine();
        System.out.println("Informe seu telefone:");
        telefone = leia.nextLine();

        // saida de dados
        System.out.println("\nNome: "+nome);
        System.out.println("Data de nascimento: "+dn);
        System.out.println("E-mail: "+email);
        System.out.println("CPF: "+cpf);
        System.out.println("Telefone: "+telefone);

        // fecha o objeto leia
        leia.close();
    }
}
