package com.heranca.models;

public class PessoaFisica extends Pessoa {
    // atributos 
    public String nome;
    public String cpf;
    public int idade;

    //construtor
    public PessoaFisica(String nome, String cpf, int idade, String email, String telefone) {
        super(email,telefone);
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    //metodos 
    public void exibirDados(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Cpf: "+this.cpf);
        System.out.println("Idade: "+this.idade);
        super.exbirDados();
    }

}
