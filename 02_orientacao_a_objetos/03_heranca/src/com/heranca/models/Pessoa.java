package com.heranca.models;

public class Pessoa {
    public String email;
    public String telefone;

    // construtor
    public Pessoa(String email, String telefone) {
        this.email = email;
        this.telefone = telefone;
    }

    // metodo
    public void exbirDados(){
        System.out.println("Email: "+this.email);
        System.out.println("Telefone: "+this.telefone);
    }

}
