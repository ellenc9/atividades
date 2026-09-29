/*
  Nome: ExercLt1_26
  Objetivo: 26.	Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.
  Nome do programador: Ellen Christine 
  Data de desenvolvimento: 21/02/2026
 */
import javax.swing.*;
public class Est26 {
    static int x, y;
    public static void main(String args[]){        
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para X"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para Y"));
        Mult();
    }
    
    public static void Mult(){
        int maior = Math.max(x, y);
        int menor = Math.min(x, y);
        if (maior % menor == 0){
            JOptionPane.showMessageDialog(null, "O maior número ("+maior+") é múltiplo do menor ("+menor+")");
        }
        else{
            JOptionPane.showMessageDialog(null, "O maior número ("+x+") não é múltiplo do menor ("+y+")");
        }
    }
}
