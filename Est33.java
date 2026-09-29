/*
  Nome: ExercLt1_33
  Objetivo: Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
  Nome do programador: Ellen Christine 
  Data de desenvolvimento: 26/02/2026 
*/
import java.util.Scanner;
public class Est33 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = entrada.nextInt();
        double result = CalSerie(num);
        System.out.println("Resultado: "+result);
        entrada.close();
    }
    static double CalSerie(int n){
        int i;
        float soma = 0;
        for (i = 1; i <=n; i++){
            soma += 1.0/i;
            System.out.println("Soma parcial: 1/"+i+" = "+soma);
        }
        return soma;
    }
}
