/*
  Nome: ExercLt1_09
  Objetivo: Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.
  Nome do programador: Ellen Christine 
  Data de desenvolvimento: 21/02/2026
 */
import javax.swing.*;
public class Est09 {
    static int x, y, soma;
    public static void main(String [] args){
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para x"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite ojum valor para y"));
        Calc();
        JOptionPane.showMessageDialog(null, "A soma dos quadrados de "+x+" e "+y+"\né "+soma);
    }
    public static void Calc(){
        int qx = x*x;
        int qy = y*y;
        soma = qx+qy;
    }
}
