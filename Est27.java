/*
  Nome: ExercLt1_27
  Objetivo: Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). 
  Calcule e mostre a velocidade média em km/h.
  Nome do programador: Ellen Christine 
  Data de desenvolvimento: 21/02/2026
 */
import javax.swing.*;
public class Est27 {
    static int voltas, ext, dur;
    static double vm;
    public static void main(String args[]){
        voltas = Integer.parseInt(JOptionPane.showInputDialog("Digite número de voltas"));
        ext = Integer.parseInt(JOptionPane.showInputDialog("Digite a extensão do circuito"));
        dur = Integer.parseInt(JOptionPane.showInputDialog("Digite a duração"));
        VelMed();
        JOptionPane.showMessageDialog(null, "Velocidade média "+vm+" km/h");
    }
    
    public static void VelMed(){
        double distancia = (voltas * ext) / 1000.0;
        double tempo = dur / 60.0;
        vm = distancia / tempo;       
    }
}
