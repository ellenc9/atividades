/*
  Nome: ExercLt1_16
  Objetivo: Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes. 
  Calcule o salário que serão as horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário Bruto – desconto). 
  A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber.
  Nome do programador: Ellen Christine 
  Data de desenvolvimento: 21/02/2026
 */
import javax.swing.*;
public class Est16 {
    static double qtd_hr, val_por_hr, desco, s_bruto, s_liqui, salario;
    static int desce; 
    public static void main(String [] args){
        qtd_hr = Double.parseDouble(JOptionPane.showInputDialog("Digite as horas trabalhadas"));
        val_por_hr = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por hora"));
        desco = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de desconto"));
        desce = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de descendentes"));
        CalcSalario();
        JOptionPane.showMessageDialog(null, "O salario bruto é "+s_bruto+"\nO salario liquido é "+s_liqui+
                "\nO salario total e acrescido dos dependentes "+salario);
        
    }
    public static void CalcSalario(){
        s_bruto = qtd_hr * val_por_hr;
        s_liqui = s_bruto - (s_bruto * (desco/100));
        salario= s_liqui + (desce*100);
    }
}
