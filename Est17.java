/*
  Nome: ExercLt1_17
  Objetivo: Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. 
  Receber o tempo de percurso e a velocidade média
  Nome do programador: Ellen Christine 
  Data de desenvolvimento: 21/02/2026
 */
import javax.swing.*;
public class Est17 {
    static double litros, tempo, vm;
    public static void main(String [] args){
        tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite o temo de percurso"));
        vm = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade media"));
        VelMed();
        JOptionPane.showMessageDialog(null, "A quantidade de litros gastos foi de "+litros);
    }
    public static void VelMed(){
        litros = (vm * tempo)/12;
    }
}
