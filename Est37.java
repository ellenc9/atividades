/*
  Nome: ExercLt1_37
  Objetivo: Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.
  Nome do programador: Ellen Christine 
  Data de desenvolvimento: 04/03/2026
 */
import java.util.Scanner;
public class Est37 {
    public static void main(String args[]){
        Scanner etd = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = etd.nextInt();
        int result = fibo(num);        
        System.out.println("Resultado de "+num+" termos da serie Fibonacci = "+result);
        etd.close();
        }
    static int fibo(int n){
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            int temp = a + b;
            a = b;
            b = temp;
        }
        return a;
    }
}