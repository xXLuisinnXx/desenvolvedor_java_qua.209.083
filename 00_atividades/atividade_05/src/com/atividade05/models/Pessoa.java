package com.atividade05.models;

public class Pessoa {
    // atributos
    private String nome;
    private double altura;
    private double peso;
    private double imc;

    // construtor
    public Pessoa() {
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setImc(double imc){
        this.imc = imc;
    }

    public double getImc(){
        return this.imc;
    }

    public double calculaImc(){
       this.imc = this.peso/(this.altura*this.altura);
        return this.imc;
    }
}
