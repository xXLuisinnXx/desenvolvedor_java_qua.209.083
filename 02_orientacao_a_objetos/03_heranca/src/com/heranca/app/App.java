package com.heranca.app;
import com.heranca.models.PessoaFisica;
import com.heranca.models.PessoaJuridica;
public class App {
    public static void main(String[] args) throws Exception {
        PessoaFisica usuario = new PessoaFisica();
        PessoaJuridica empresa = new PessoaJuridica();

        usuario.email = "luisguilherme@gmail.com";
        usuario.telefone = "(61) 983714175";
        usuario.nome = "Luis";
        usuario.cpf = "085.004.040-48";
        usuario.idade = 18;

        empresa.email= "sac@sacmcdonalds.com.br";
        empresa.telefone= "(11) 3230-3223.";
        empresa.razaoSocial= "Arcos Dourados Comércio de Alimentos S.A";
        empresa.nomeFantasia= "McDonald's";
        empresa.cnpj= "42.591.651/0001-43";

        System.out.println("Email do usuario: "+usuario.email);
        System.out.println("Telefone do usuario: "+usuario.telefone);
        System.out.println("Nome do usuario: "+usuario.nome);
        System.out.println("CPF do usuario: "+usuario.cpf);
        System.out.println("Idade do usuario: "+usuario.idade);
        System.out.println("\n---------------------------------------------\n");
        System.out.println("Razão social da empresa: "+empresa.razaoSocial);
        System.out.println("Nome fantasia da empresa: "+empresa.nomeFantasia);
        System.out.println("CNPJ da empresa: "+empresa.cnpj);
        System.out.println("Email da empresa: "+empresa.email);
        System.out.println("Telefone da empresa: "+empresa.telefone);
    }
}
