/*
  Nome: ExercLt1_31
  Objetivo: Calcule e mostre o quadrado dos números entre 10 e 150.
  Nome do programador: Ellen Christine 
  Data de desenvolvimento: 26/02/2026
 */
public class Est31 {
    static int i = 4, qua = 0;
    public static void main(String args[]){       
        int recebe = CalcQ(i, qua);
        System.out.println(recebe);
    }
    public static int CalcQ(int a, int b){
        while(b<=150){
            b = a * a;
            System.out.println("Quadrados = "+b);
            a += 1;
        }
        return b;
    }
}
