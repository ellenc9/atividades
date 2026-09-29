/*
  Nome: ExercLt1_45
  Objetivo: Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
  Nome do programador: Ellen Christine 
  Data de desenvolvimento: 18/03/2026
 */
public class Est45 {
    public static void main(String args[]){
        int x = 1;
        double y = Math.pow(x, 2);
        double result = calcSerie(x, y);
        System.out.print("Resultado da serie = "+result);
    }
    static double calcSerie(int a, double b){
        double soma = 0;
        while (a <= 15){
            if (a % 2 == 0){
                soma = soma - a/b;
                System.out.printf(a+"/"+b+" = %.2f\n",soma);
            }else{
                soma = soma + a/b;
                System.out.printf(a+"/"+b+" = %.2f\n",soma);
            }
            a += 1;
            b = Math.pow(a, 2);
        }
        return soma;
    }
    
}
