/*
  Nome: ExercLt1_20
  Objetivo: 20.	Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula AX²+BX+C=0. 
  Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre.
  Nome do programador: Ellen Christine 
  Data de desenvolvimento: 21/02/2026
 */
import javax.swing.*;
public class Est20 {
    static int a, b, c;
    static double raiz1, raiz2;
    public static void main(String args[]){
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C"));
        Raizes();
        JOptionPane.showMessageDialog(null, "Raiz 1 é "+raiz1+"\nRaiz 2 é "+raiz2);
    }
    public static void Raizes(){
        double delta = b*b - 4 * a * c;
        raiz1 = (-b + Math.sqrt(delta))/(2 * a);
        raiz2 = (-b - Math.sqrt(delta))/(2 * a);
    }
}
