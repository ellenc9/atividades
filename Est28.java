/*
  Nome: ExercLt1_28
  Objetivo: Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço sabendo que:
  Venda Mensal	   Preço Atual	      Preço Novo
  < 500	           < 30	              + 10%
  >= 500 e < 1000  >= 30 e < 80       +15%
  >= 1000	   >= 80	      - 5%
  Obs.: para outras condições, preço novo será igual ao preço atual.
  Nome do programador: Ellen Christine 
  Data de desenvolvimento: 21/02/2026
 */
import javax.swing.*;
public class Est28 {
    static int pa, mm;
    static double pn;
    public static void main(String args[]){       
        mm = Integer.parseInt(JOptionPane.showInputDialog("Digite a venda mensal"));
        pa = Integer.parseInt(JOptionPane.showInputDialog("Digite o preço atual"));
        CalcPreco();
        JOptionPane.showMessageDialog(null,"Novo preço "+pn);
    }
    
    public static void CalcPreco(){
        if (mm<500 && pa<30){
            pn = (pa*0.1)+pa;
        }else if (mm>= 500 && mm<1000 && pa>= 30 && pa<80){
            pn = (pa*0.15)+pa;
        }else if (mm>=1000 && pa>=80){
            pn = pa - (pa*0.05);
        }else{
            pn = pa;
        }
        
    }
}
