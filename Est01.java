/*
  Nome do programa : ExercLt1_01
  Objetivo: Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado.
  Nome do Programador: Ellen christine
  Data de desenvolvimento: 21/02/2026

*/
import javax.swing.JOptionPane;
public class Est01 {
       static int Lado, Area; 
       public static void main(String[] args) {
       Lado = Integer.parseInt(JOptionPane.showInputDialog("Digite valor do lado"));
       CalcArea();
       JOptionPane.showMessageDialog(null,"Area do quadrado é "+ Area);
    }
       
public static void CalcArea(){
    Area = (Lado * Lado);
    }

}