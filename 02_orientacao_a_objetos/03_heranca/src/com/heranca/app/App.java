package com.heranca.app;

// classe Java importada
import java.util.Scanner;

// classes criadas por mim
import com.heranca.models.PessoaFisica;
import com.heranca.models.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        // instancias
        Scanner leia  = new Scanner(System.in);
        PessoaFisica usuario = new PessoaFisica(null, null, 0, null, null);
        PessoaJuridica corp = new PessoaJuridica(null, null, null, null, null);

        // entrada de dados
        System.out.println("Informe os dados do usuario:");
        System.out.println("Informe o nome:");
        usuario.nome = leia.nextLine();
        System.out.println("Informe o CPF:");
        usuario.cpf = leia.nextLine();
        System.out.println("Informe o email:");
        usuario.email = leia.nextLine();
        System.out.println("Informe o telefone:");
        usuario.telefone = leia.nextLine();
        System.out.println("Informe a idade:");
        usuario.idade = leia.nextInt();

        // limpeza de buffer
        leia.nextLine();

        System.out.println("\nInforme os dados da empresa:");
        System.out.println("Informe a razão social:");
        corp.razaoSocial = leia.nextLine();
        System.out.println("Informe o nome fantasia:");
        corp.nomeFantasia = leia.nextLine();
        System.out.println("Informe o CNPJ:");
        corp.cnpj = leia.nextLine();
        System.out.println("Informe o email:");
        corp.email = leia.nextLine();
        System.out.println("Informe o telefone:");
        corp.telefone = leia.nextLine();

        // saida de dados
        System.out.println("\nDADOS DO USUÁRIO:");
        usuario.exbirDados();
        System.out.println("\nDADOS DA EMPRESA:");
        corp.exbirDados();
        // fecha o objeto leia
        leia.close();
    }
}
