/*
  Nome: ExercLt1_11
  Objetivo: Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência.
  Nome do programador: Ellen Christine 
  Data de desenvolvimento: 21/02/2026
 */
import javax.swing.*;
public class Est11 {
    static double raio, comprimento;
    public static void main(String [] args){
        raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio"));
        JOptionPane.showMessageDialog(null,"O comprimento da circunferencia é "+comprimento);
    }
    public static void Comp(){
        comprimento = 2*3.14*raio;
    }
}
