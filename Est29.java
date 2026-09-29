/*
  Nome: ExercLt1_29
  Objetivo: 29.	Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento
  Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados.
  Nome do programador: Ellen Christine 
  Data de desenvolvimento: 21/02/2026
 */
import javax.swing.*;
public class Est29 {
    static int inves;
    static double valor, valorc;
    public static void main(String args[]){               
        inves = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 = poupança e 2 = renda fixa"));
        valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor a ser investido"));
        Tipo();
        JOptionPane.showMessageDialog(null, "Valor corrigido em 30 dias "+valorc);
    }
    
    public static void Tipo(){
        if (inves == 1){
            valorc = valor * 1.03;
        }else{
            valorc = valor * 1.05;
        }  
    }
}
