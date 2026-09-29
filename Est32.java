/*
  Nome: ExercLt1_32
  Objetivo: Receba um número inteiro. Calcule e mostre o seu fatorial.
  Nome do programador: Ellen Christine 
  Data de desenvolvimento: 26/02/2026
 */
import java.util.Scanner;
public class Est32 {
        public static void main(String args[]){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite um numero: ");
        int num = entrada.nextInt();
        int result = Fator(num);
        System.out.println("Resultado fatorial = "+ result);
        entrada.close();
        }
    
    static int Fator(int n){
        int f = n;
        for (int i = n - 1; i>=1; i--){
            f *= i;
            System.out.println("Fatorial "+n+" x "+i+" = "+f);
        }
        return f;
    }
}

