/*
  Nome: ExercLt02_10
  Objeitvo: Criar uma matriz [5][5] onde o programa irá carregar segundo: 
   casa|1|2|3|4|...|*exibir soma 
  valor|1|2|4|8|...| dos valores
  Nome do desenvolvedor: Ellen Christine
  Data de desenvolvimento: 04/03/2026
*/
public class Mod10 {
    public static void main(String args[]){
        long[][] mat = new long[5][5];
        int valor = 1, soma = 0;
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                mat[i][j] = valor;
                soma += valor;
                valor *= 2;
            }
        }
        System.out.println("Matriz:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Total = "+soma);
    }
}
