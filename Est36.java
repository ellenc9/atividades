/*
  Nome: ExercLt1_36
  Objetivo: Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!  
  Calcule e mostre o resultado da somatória dos números ímpares entre esses valores.
  Nome do programador: Ellen Christine 
  Data de desenvolvimento: 04/03/2026
 */
import java.util.Scanner;
public class Est36 {
    public static void main(String args[]){
        Scanner es = new Scanner(System.in);
        System.out.println("Digite valor de N: ");
        int n = es.nextInt();
        es.close();
        double result = CalSerie(n);
        System.out.println("Resultado da soma da serie 1 + 1/2! + 1/3! + ... + 1/N! = "+result);        
    }  
    static double CalSerie(int a){
        double s_fatorial = 1, soma = 1;
        int i = 2; 
        while (i <= a){
            for (int j = i; j > 1; j--){
                s_fatorial = s_fatorial * j; 
                }
            soma += 1/s_fatorial;
            System.out.println("soma = "+soma);
            i +=1;
            s_fatorial = 1;
            }
        return soma;
    }
}
