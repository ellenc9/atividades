/*
  Nome: ExercLt1_24
  Objetivo: Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
  Nome do programador: Ellen Christine 
  Data de desenvolvimento: 21/02/2026
 */
import javax.swing.*;
public class Est24 {
    static int x;
    public static void main(String args[]){
        x = Integer.parseInt(JOptionPane.showInputDialog("Digiite um valor x"));
        Div();
    }
    
    public static void Div(){
        double d2 = x % 2;
        double d3 = x % 3;
        if (d2 == 0 && d3 == 0)
            JOptionPane.showMessageDialog(null, x+" é divisível por 2 e por 3");
        else
            JOptionPane.showMessageDialog(null, x+" não é divisível por 2 e por 3");
    }
}
