package com.entrada.app;

import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        // declaração de variaveis
        String nome;
        String resultado;
        int idade;

        // entrada de dados
        nome = JOptionPane.showInputDialog("Informe o seu nome:");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:"));

        // verificação maioridade
        resultado = (idade>=18) ? "é maior de idade." : "é menor de idade.";
        // saida de dados
        JOptionPane.showMessageDialog(null, nome+" "+resultado);
    }
}
