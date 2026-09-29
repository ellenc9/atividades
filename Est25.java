/*
  Nome: ExercLt1_25
  Objetivo: Receba a hora de início e de final de um jogo 
  (HH,MM) sabendo que o tempo máximo é de 24 horas e pode começar num dia e terminar noutro
  Nome do programador: Ellen Christine 
  Data de desenvolvimento: 21/02/2026
 */
import javax.swing.*;
public class Est25 {
    static int hr_ini, hr_fim, min_ini, min_fim, hora, minuto;
    public static void main(String args[]){
        hr_ini = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora inicial"));
        min_ini = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto incial"));
        hr_fim = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora final"));
        min_fim = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto final"));
        Jogo();
        JOptionPane.showMessageDialog(null, "Total de horas jogadas "+hora+"h "+minuto+"min" );
    }
    
    public static void Jogo(){
        int total_ini = hr_ini * 60 + min_ini;
        int total_fim = hr_fim * 60 + min_fim;
        if (total_fim <= total_ini)
            total_fim = total_fim + 24 * 60;
        int duracao = total_fim - total_ini;
        hora = (int) duracao / 60;
        minuto = duracao % 60;
    }
}
