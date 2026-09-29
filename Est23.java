/*
  Nome: ExercLt1_23
  Objetivo: 23.	Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. 
  Mostre os 4 números em ordem crescente.
  Nome do programador: Ellen Christine 
  Data de desenvolvimento: 21/02/2026
*/
import javax.swing.*;
public class Est23 {
    static int v1, v2, v3, v4;
    public static void main(String args[]){        
        v1 = Integer.parseInt(JOptionPane.showInputDialog("Digite primeiro valor"));
        v2 = Integer.parseInt(JOptionPane.showInputDialog("Digite segundo valor"));
        v3 = Integer.parseInt(JOptionPane.showInputDialog("Digite terceiro valor"));
        v4 = Integer.parseInt(JOptionPane.showInputDialog("Digite quarto valor"));
        Ordem();
    }
    public static void Ordem(){
        if (v4<v1)
            JOptionPane.showMessageDialog(null, v4+" - "+v1+" - "+v2+" - "+v3);
        else if (v4<v2)
            JOptionPane.showMessageDialog(null, v1+" - "+v4+" - "+v2+" - "+v3);
        else if (v4<v3)
            JOptionPane.showMessageDialog(null, v1+" - "+v2+" - "+v4+" - "+v3);
        else
            JOptionPane.showMessageDialog(null, v1+" - "+v2+" - "+v3+" - "+v4);
    }
}
