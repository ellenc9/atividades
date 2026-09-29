/*
  Nome: ExercLt1_15
  Objetivo: Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa.
  Nome do programador: Ellen Christine 
  Data de desenvolvimento: 21/02/2026
 */
import javax.swing.*;
public class Est15 {
    static int c1, c2, hipotenusa;
    public static void main(String [] args){
        c1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o cateto 1"));
        c2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o cateto 2"));
        CalcH();
        JOptionPane.showMessageDialog(null,"A hipotenusa é "+hipotenusa);
    }
    public static void CalcH(){
        int soma = c1 * c1 + c2 * c2;
        hipotenusa = (int) Math.sqrt(soma);
    }
}
