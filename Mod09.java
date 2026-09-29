/*
  Nome: ExercLt02_09
  Obejtivo: 9.	Criar e carregar uma matriz [4][4] com valores aleatórios, 
  sendo que a diagonal principal terá seus dados carregados no programa segundo:
  |1 |  |  |  |
  |  |4 |  |  |
  |  |  |16|  |
  |  |  |  |64|
  Nome do programador: Ellen Christine
  Data de desenvolvimento: 03/04/2026
 */
import java.util.Scanner;
public class Mod09 {
    public static void main(String args[]){
        int[][] mat = new int[4][4];
        Scanner etd = new Scanner(System.in);
        int c = 1;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(j == i){
                    mat[i][j] = c;
                    c *= 4;
                }else{               
                    System.out.println("Digite valor: ");
                    mat[i][j] = etd.nextInt();
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
