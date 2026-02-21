package com.uml2.app;

import com.uml2.app.models.PessoaFisica;
import com.uml2.app.models.PessoaJuridica;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner leia = new Scanner(System.in);
        PessoaFisica pf = new PessoaFisica();
        PessoaJuridica pJ = new PessoaJuridica();

        System.out.println("Dados da pessoa física:\n");
        System.out.println("Informe o nome:");
        pf.setNome(leia.nextLine());
        System.out.println("Informe a data de nascimento (dd/MM/yyyy):");
        // cria uma variavel string pra receber a data
        String dataStr = leia.nextLine();
        //
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse(dataStr, formatter);

        pf.setDataNascimento(dataNascimento);
        System.out.println("Informe o cpf:");
        pf.setCpf(leia.nextLine());
        System.out.println("Informe o email:");
        pf.setEmail(leia.nextLine());
        System.out.println("Informe o telefone:");
        pf.setTelefone(leia.nextLine());

        System.out.println("\nDados pessoa jurídica");
        System.out.println("Informe o nome Fantasia:");
        pJ.setNomeFantasia(leia.nextLine());
        System.out.println("Informe a razão social:");
        pJ.setRazaoSocial(leia.nextLine());
        System.out.println("Informe o cnpj:");
        pJ.setCnpj(leia.nextLine());
        System.out.println("Informe o email:");
        pJ.setEmail(leia.nextLine());
        System.out.println("Informe o telefone:");
        pJ.setTelefone(leia.nextLine());

        leia.close();

        System.out.println("\n\nSaída de dados PESSOA FISICA");
        System.out.println("Nome:" + pf.getNome());
        System.out.println("Data de nascimento:" + pf.getDataNascimento());
        System.out.println("Cpf:" + pf.getCpf());
        System.out.println("Telefone:" + pf.getTelefone());
        System.out.println("Email:" + pf.getEmail());

        System.out.println("\n\nluiSaída de dados PESSOA JURIDICA");
        System.out.println("Nome fantasia:" + pJ.getNomeFantasia());
        System.out.println("Razão Social:" + pJ.getRazaoSocial());
        System.out.println("Cnpj:" + pJ.getCnpj());
        System.out.println("Telefone:" + pJ.getTelefone());
        System.out.println("Email:" + pJ.getEmail());

    }
}
