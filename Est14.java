/*
  Nome: ExercLt1_14
  Objetivo: Receba 2 ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.
  Nome do programador: Ellen Christine 
  Data de desenvolvimento: 21/02/2026
 */
import javax.swing.*;
public class Est14 {
    static int a1, a2, a3;
    public static void main(String [] args){
        a1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro angulo"));
        a2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do segundo angulo"));
        Calc();
        JOptionPane.showMessageDialog(null, "O valor do terceiro angulo é "+a3);
    }
    public static void Calc(){
         a3 = 180 - (a1 + a2);
    }
}
