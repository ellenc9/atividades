/*
  Nome: ExercLt1_07
  Objetivo: Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume.
  Nome do programador: Ellen Christine 
  Data de desenvolvimento: 21/02/2026
 */

import javax.swing.*;
public class Est07 {
    static int comprimento, largura, altura;
    static double volume;
    public static void main(String args[]){
        comprimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento do paralelepipedo")); 
        largura = Integer.parseInt(JOptionPane.showInputDialog("Digite a largura do paralelepipedo"));
        altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do paralelepipedo"));
        Calc();
        JOptionPane.showMessageDialog(null, "O volume do paralelepipedo é "+volume);
    }
    public static void Calc(){
        volume = comprimento * largura * altura;
    }
}
