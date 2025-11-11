package com.encapsulamento.app;

import java.util.Scanner;

import com.encapsulamento.models.Pessoa;
public class App {
    public static void main(String[] args) throws Exception {
        Pessoa usuario = new Pessoa();
        Scanner leia = new Scanner(System.in);

        // entrada de dados
        System.out.println("Informe o seu nome:");
        usuario.setNome(leia.nextLine());
        System.out.println("Informe o seu CPF:");
        usuario.setCpf(leia.nextLine());
        System.out.println("Informe o seu email:");
        usuario.setEmail(leia.nextLine());
        System.out.println("Informe o seu idade:");
        usuario.setIdade(leia.nextInt());

        // saida de dados
        System.out.println("\nDADOS DO USUÁRIO:");
        System.out.println("Nome: "+usuario.getNome());
        System.out.println("CPF: "+usuario.getCpf());
        System.out.println("Email: "+usuario.getEmail());
        System.out.println("Idade: "+usuario.getIdade());
     // fecha objeto leia
        leia.close();
    }
}
