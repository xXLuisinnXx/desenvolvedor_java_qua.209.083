package com.construtor.app;

import com.construtor.models.Pessoa;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       // instancias
       Scanner leia = new Scanner(System.in);
       Pessoa usuario = new Pessoa("","","","",0);

       // entrada de dados 
       System.out.println("Informe o nome:");
       usuario.nome = leia.nextLine();
       System.out.println("Informe o Cpf:");
       usuario.cpf = leia.nextLine();
       System.out.println("Informe o email:");
       usuario.email = leia.nextLine();
       System.out.println("Informe o telefone:");
       usuario.telefone = leia.nextLine();
       System.out.println("Informe a idade:");
       usuario.idade = leia.nextInt();

        // saida de dados
        System.out.println(usuario.apresentar());

       // fecha objeto leia
       leia.close();
    }
}
