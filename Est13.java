/*  
  Nome: ExercLt1_13
  Objetivo: Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias durará esse alimento 
  sabendo que a pessoa consome 50g ao dia.
  Nome do programador: Ellen Christine 
  Data de desenvolvimento: 21/02/2026
 */
import javax.swing.*;
public class Est13 {
    static double alimento, dias;
    public static void main(String [] args){
        alimento = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de alimento em quilos "));
        Calc();
        JOptionPane.showMessageDialog(null, "quilos durará "+dias+" dias");
    }
    public static void Calc(){
        alimento = alimento * 1000;
        dias = alimento / 50;
    }
}
