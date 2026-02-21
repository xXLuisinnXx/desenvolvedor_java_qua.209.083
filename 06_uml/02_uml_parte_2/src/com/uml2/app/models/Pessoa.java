package com.uml2.app.models;

public class Pessoa {
    private long idPessoa;
    private String email;
    private String telefone;


    public Pessoa() {
    }


    public long getIdPessoa() {
        return this.idPessoa;
    }

    public void setIdPessoa(long idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
