/*
  Nome: ExercLt02_08
  Obejtivo: Criar e carregar uma matriz [4][3] inteiro com quantidade de produtos vendidos em 4 semanas. Calcular e exibir:
  a. A quantidade de cada produto vendido no mês;
  b. A quantidade de produtos vendidos por semana;
  c. O total de produtos vendidos no mês.
  Nome do programador: Ellen Christine
  Data de desenvolvimento: 03/04/2026
 */
import java.util.Scanner;
public class Mod08 {
    public static void main(String args[]){
        int[][] mat = new int[4][3];
        try (Scanner etd = new Scanner(System.in)) {
            for(int i = 0; i < 4 ; i++){
                for(int j = 0; j < 3; j++){
                    System.out.println("Digite quantidade de produtos vendidos: ");
                    mat[i][j] = etd.nextInt();
                }
            }
        }
        
        produto(mat);
        semana(mat);
        int mes = total(mat);
        System.out.println("\nTotal de produtos vendidos no mes = "+mes);
        }
        public static void produto(int[][] matriz){
            int soma_produto = 0;
            for(int i = 0; i < 3; i++){
                soma_produto = 0;
                for(int j = 0; j < 4; j++){
                    soma_produto += matriz[j][i];
                }
                System.out.printf("Produto %d vendido %d vezes no mes\n",i+1, soma_produto);
            }
        }
        
        public static void semana(int[][] matriz){
            int semana = 0;
            for(int i = 0; i < 4; i ++){
                semana = 0;
                for(int j = 0; j < 3; j++){
                    semana += matriz[i][j];
                }
                System.out.printf("%d produtos vendidos na %d semana\n",semana, i+1);
            }
        }
        
        static int total(int[][] matriz){
            int soma_mes = 0;
            for(int i = 0; i < 4; i++){
                for(int j = 0; j < 3; j++){
                    soma_mes += matriz[i][j];
                }
            }
            return soma_mes;
        }
    
}
