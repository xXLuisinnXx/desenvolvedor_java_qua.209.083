package com.atividade05.app;

import javax.swing.JOptionPane;

import com.atividade05.models.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia
        Pessoa usuario = new Pessoa();
        
        String[] opcoes = {"Calcular IMC", "Sair do programa"};
        Object opcao;
        double resultado;

        do{
            opcao = JOptionPane.showInputDialog(
                null, 
                "Selecione uma opção", 
                "IMC", 
                JOptionPane.INFORMATION_MESSAGE, 
                null, 
                opcoes, 
                opcoes[0]
            );

             

            if (opcao !="Sair do programa" ) {
                // entrada de dados
                usuario.setNome(JOptionPane.showInputDialog("Informe o seu nome:"));
                usuario.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Informe a sua altura em metros:").replace(",",".")));
                usuario.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Informe o seu peso em Kg:").replace(",",".")));

                resultado =usuario.calculaImc();

                if (resultado <18.5) {
                    JOptionPane.showMessageDialog(null,"Seu imc: "+ String.format("%.2f", resultado));
                    JOptionPane.showMessageDialog(null, usuario.getNome()+", você está com magreza.");
                
                }
                else if(resultado <=24.9){
                    JOptionPane.showMessageDialog(null,"Seu imc: "+ String.format("%.2f", resultado));
                    JOptionPane.showMessageDialog(null, usuario.getNome()+", você está com peso ideal.");
                    
                }
                else if(resultado <=29.9){
                    JOptionPane.showMessageDialog(null,"Seu imc: "+ String.format("%.2f", resultado));
                    JOptionPane.showMessageDialog(null, usuario.getNome()+", você está com excesso de peso.");

                }
                else if(resultado <=34.9){
                    JOptionPane.showMessageDialog(null,"Seu imc: "+ String.format("%.2f", resultado));
                    JOptionPane.showMessageDialog(null, usuario.getNome()+", você está com obesidade 1.");

                }
                else if(resultado <=39.9){
                    JOptionPane.showMessageDialog(null,"Seu imc: "+ String.format("%.2f", resultado));
                    JOptionPane.showMessageDialog(null, usuario.getNome()+", você está com obesidade 2.");

                }
                else{
                    JOptionPane.showMessageDialog(null,"Seu imc: "+ String.format("%.2f", resultado));
                    JOptionPane.showMessageDialog(null, usuario.getNome()+", você está com obesidade 3.");
                }
            }
        }while(opcao != "Sair do programa");
    }
}
