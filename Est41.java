/*
 Nome: ExercLt1_41
  Objetivo: Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.
  Nome do programador: Ellen Christine 
  Data de desenvolvimento: 11/03/2026
 */
public class Est41 {
    public static void main(String args[]){
        int result = possi();
        System.out.print(result+" possibilidades");
    }
    static int possi(){
        int qtd = 0;
        for(int d1 = 1; d1<=6; d1++){
            for(int d2 = 1; d2 <= 6; d2++){
                if(d2+d1 == 7){
                    qtd +=1;
                    System.out.print(d1+" + "+d2+" = 7\n");
                }
            }
        }
        return qtd;
    }
}