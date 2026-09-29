/*
  Nome: ExercLt02_11
  Objeitvo: Criar uma matriz [8][8] inteiro e o programa irá carregar segundo:
  | 1 | 1 | 1 | 1 | 1 | 1 | 1 | 1 |
  | 1 | 2 | 2 | 2 | 2 | 2 | 2 | 1 |
  | 1 | 2 | 3 | 3 | 3 | 3 | 2 | 1 |
  | 1 | 2 | 3 | 4 | 4 | 3 | 2 | 1 |
  | 1 | 2 | 3 | 4 | 4 | 3 | 2 | 1 |
  | 1 | 2 | 3 | 3 | 3 | 3 | 2 | 1 |
  | 1 | 2 | 2 | 2 | 2 | 2 | 2 | 1 |
  | 1 | 1 | 1 | 1 | 1 | 1 | 1 | 1 |
  Nome do desenvolvedor: Ellen Christine
  Data de desenvolvimento: 04/03/2026
 */
public class Mod11 {
    public static void main(String args[]){
        int[][] mat = new int[8][8];
        for(int z = 1; z <= 4; z++){
            for(int i = (z-1); i <= (8-z); i++){
                for(int j = (z-1); j <= (8-z); j++){
                    mat[i][j] = z;
                }
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}