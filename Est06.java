/* 
  Nome: ExercLt1_06
  Objetivo: Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos.
  Nome do programador: Ellen Christine 
  Data de desenvolvimento: 21/02/2026
 */
import javax.swing.*;;
public class Est06 {
    static int x, y;
    public static void main(String[]args){
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de x"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de y"));
        Troca();
        JOptionPane.showMessageDialog(null,
                x+" :valor de x atual \n"+
                y+" :valor de y atual");
    }
    public static void Troca(){
        int aux = x;
        x  = y;
        y = aux;
    }
}
