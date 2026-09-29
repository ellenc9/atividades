/*
  Nome: ExercLt1_19
  Objetivo: Receba 2 valores reais. Calcule e mostre o maior deles.
  Nome do programador: Ellen Christine 
  Data de desenvolvimento: 21/02/2026
 */
import javax.swing.*;
public class Est19 {
    static int a, b;
    public static void main(String args[]){
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite valor para A"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite valor para B"));
        Maior();
    }
    public static void Maior(){
        if (a>b)
            JOptionPane.showMessageDialog(null, a+" é maior que "+b);
        else
            JOptionPane.showMessageDialog(null, b+" é maior que "+a);
    }
}
