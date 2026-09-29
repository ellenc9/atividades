/*
  Nome: ExercLt1_38
  Objetivo: Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
  Casa: 1 2 3 4	... 64
  Qdte:	1 2 4 8	... N
  Nome do programador: Ellen Christine 
  Data de desenvolvimento: 05/03/2026
 */
public class Est39 {
    public static void main(String args[]){
        long result = Tab();
        System.out.print("Quantidade de grãos = "+result);
        }
    static long Tab(){
        long n = 1;
        for (int i = 1; i < 65; i++){
            System.out.print("Casa "+i+" = "+n+"\n");
            n *= 2;
            }
        return n;
    }
}
