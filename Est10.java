/*
  Nome: ExercLt1_10
  Objetivo: Receba 2 números reais. Calcule e mostre a diferença desses valores.
  Nome do programador: Ellen Christine 
  Data de desenvolvimento: 21/02/2026
 */
import javax.swing.*;
public class Est10 {
    static int a, b, diferenca;
    public static void main(String []args){
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para A"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para B"));
        Dif();
        JOptionPane.showMessageDialog(null,"A diferença de A para B é de "+diferenca);
    }
    public static void Dif(){
        diferenca = a - b;
    }
}
