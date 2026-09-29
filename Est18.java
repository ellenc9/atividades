/*
  Nome: ExercLt1_18
  Objetivo: Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menos valor.
  Nome do programador: Ellen Christine 
  Data de desenvolvimento: 21/02/2026
 */
import javax.swing.*;
public class Est18 {
    static int a, b, diferenca;
    public static void main(String args[]){       
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B"));
        Dif();
        JOptionPane.showMessageDialog(null,"A diferença do maior para o menor é "+diferenca);

    }
    public static void Dif(){
        if (a>b)
            diferenca = a - b;
        
        else
            diferenca = b - a;
    }
}
