package com.uml2.app.models;

import java.time.LocalDate;

public class PessoaFisica extends Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private String cpf;


    public PessoaFisica() {
    }
    

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    

}
