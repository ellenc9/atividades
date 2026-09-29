/*
  Nome: ExercLt1_22
  Objetivo: Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
  Nome do programador: Ellen Christine 
  Data de desenvolvimento: 21/02/2026
 */
import javax.swing.*;
public class Est22 {
    static int a, b;
    public static void main(String args []){        
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite valor para A"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite valor para B"));
        Ordem();
    }
    public static void Ordem(){
        if (a<b)
            JOptionPane.showMessageDialog(null, a+" "+b);
        else
            JOptionPane.showMessageDialog(null, b+" "+a);
    }
}
