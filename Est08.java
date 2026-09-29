/*
  Nome: ExercLt1_08
  Objetivo: Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação 
  sabendo que rende 1,3% a. m.
  Nome do programador: Ellen Christine 
  Data de desenvolvimento: 21/02/2026
 */
import javax.swing.*;
public class Est08 {
    static double deposito, valor;
    public static void main(String [] args){
        deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de deposito"));
        Aumento();
        JOptionPane.showMessageDialog(null, "Valor do deposito após 1 mês de aplicação\n"+ valor);
    }       
    public static void Aumento(){
        valor = 1.3 * deposito;
    }
}
