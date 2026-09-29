/*
  Nome: ExercLt1_04
  Objetivo: Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida em fahrenheit F = (9*C+160) /5.
  Nome do programador: Ellen Christine 
  Data de desenvolvimento: 21/02/2026
 */
import javax.swing.*;
public class Est04 {
    static int graus;
    static double f;
    public static void main(String[] args){
        graus = Integer.parseInt(JOptionPane.showInputDialog("Digite a temperatura em Graus"));
        Conv();
        JOptionPane.showMessageDialog(null, "A temperatura "+graus+" convertida para fahrenheit é "+f);
    }
    public static void Conv(){
        f = (9*graus+160)/5;
    }
}
