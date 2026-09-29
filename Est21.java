/*
  Nome: ExercLt1_21
  Objetivo: 21.	Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. Mostre a mensagem de acordo com a média:
  a. Se a média for >= 6,0 exibir “APROVADO”;
  b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
  c. Se a média for < 3,0 exibir “RETIDO”.
  Nome do programador: Ellen Christine 
  Data de desenvolvimento: 21/02/2026
 */
import javax.swing.*;
public class Est21 {
    static double n1, n2, n3, n4;
    public static void main(String args[]){
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota"));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota"));
        Situacao();
        }
    
    public static void Situacao(){
        double soma = n1 + n2 + n3 + n4;
        double media = soma / 4;
        if (media >= 6)
            JOptionPane.showMessageDialog(null, "Aprovado");
        else if (media >= 3 & media < 6)
            JOptionPane.showMessageDialog(null, "Exame");
        else
            JOptionPane.showMessageDialog(null, "Reetido");
    }
}
