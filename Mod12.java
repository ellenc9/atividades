/*
  Nome: ExercLt02_10
  Objeitvo: Carregar códigos das peças em um tabuleiro de xadrez, onde:
  codigo|   1   |   2   |   3   |   4   |   5   |   6   |   7   | 
  peça  | peao  | torre |cavalo | bispo |rainha |  rei  | vazio |
  Calcular e mostrar a soma das peças do tabuleiro.
  Não pode utilizar estrutura de decisão e Escolha Caso na contagem das peças
  Nome do desenvolvedor: Ellen Christine
  Data de desenvolvimento: 04/03/2026
 */
import java.util.Random;
public class Mod12 {
    public static void main(String args[]){
        Random random = new Random();
        int[] valores = {0, 1, 5, 3, 3, 9, 10, 0};
        int[][] tabuleiro = new int[8][8];
        int soma = 0;
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                int codigo = random.nextInt(7)+1; 
                tabuleiro[i][j] = codigo;
                soma += valores[codigo];
            }
        }

        System.out.println("A soma total das pecas do tabuleiro e = " + soma);

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
       
    }
}
