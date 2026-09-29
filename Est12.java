/*
  Nome: ExercLt1_12
  Objetivo: Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.
  Nome do programador: Ellen Christine 
  Data de desenvolvimento: 21/02/2026
= */
import javax.swing.*;
public class Est12 {
    static int ann, ana, idade, at;
    public static void main(String []args){
        ann = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento"));
        ana = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual"));
        CalcAnos();
        JOptionPane.showMessageDialog(null, "A idade é de "+idade+"\nDaqui 17 anos terá "+at);
    }
    public static void CalcAnos(){
        idade = ana - ann;
        at = idade + 17;
    }
}
