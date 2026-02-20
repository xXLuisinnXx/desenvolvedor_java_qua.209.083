package com.uml1.app.models;

import javax.xml.crypto.Data;

public class Usuario {

    private long idUsuario;
    private String nome;
    private Data dataNascimento;
    private String email;
    private String senha;


    public Usuario() {
    }

    public String getSenha(){
        return this.senha;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    public long getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

    public String fazerLogin(String login, String senha){
        return "login efetuado com sucesso";
    }

    public void fazerLogoff(){
        

    }
}
