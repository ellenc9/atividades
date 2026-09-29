/*
  Nome: ExercLt1_05
  Objetivo: Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0). 
            Calcule e mostre as raízes reais (considerar que a equação possue2 raízes).
  Nome do programador: Ellen Christine 
  Data de desenvolvimento: 21/02/2026

 */
import javax.swing.*;
public class Est05 {
    static int a, b, c;
    static double raiz1, raiz2;
    public static void main(String[]args){
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para A"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para B"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para C"));
        CalcR();
        JOptionPane.showMessageDialog(null,"A primeira raiz é "+raiz1+"\ne a segunda raiz é "+raiz2);
 
    }
    public static void CalcR(){
        double delta = b*b - 4 * a * c;
        raiz1 = (-b + Math.sqrt(delta))/(2 * a);
        raiz2 = (-b - Math.sqrt(delta))/(2 * a);
    }
}
