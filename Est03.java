/*
  Nome: ExercLt1_03
  Objetivo: Receba a base e a altura de um triângulo. Calcule e mostre a sua área.
  Nome do programador: Ellen Christine 
  Data de desenvolvimento: 21/02/2026
*/
import javax.swing.*;
public class Est03 {
    static double base, altura, area;
    public static void main(String[] args){
        base = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base"));
        altura = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura"));
        AreaTri();
        JOptionPane.showMessageDialog(null,"A area eh "+ area);
    }
    
    public static void AreaTri(){
        double soma = base + altura;
        area = soma/2;
    }
}
