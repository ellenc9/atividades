/*
  Nome:ExercLt1_02
  Objetivo: Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%.
  Nome do programador: Ellen Christine 
  Data de desenvolvimento: 21/02/2026
*/
import javax.swing.JOptionPane;
public class Est02 {
     static double salarioReceber, salarioReajuste;
     public static void main(String[] args){
        salarioReceber = Double.parseDouble(JOptionPane.showInputDialog("Digite Salário"));
        Ajuste();
        JOptionPane.showMessageDialog(null,"Salário com reajuste "+salarioReajuste);
    } 
     
public static void Ajuste(){
    salarioReajuste = salarioReceber * 1.15;
}

}
