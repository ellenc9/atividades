/*
  Nome: ExercLt1_38
  Objetivo: 38.	Receba 100 números inteiros reais. Verifique e mostre o maior e o menor valor. Obs.: somente valores positivos.
  Nome do programador: Ellen Christine 
  Data de desenvolvimento: 05/03/2026
 */
import java.util.Scanner;
public class Est38 {
    static int maior, menor;
    public static void main(String args[]){
        valMaiorMenor();
        System.out.println("O maior numero digitado foi "+maior+
                "\nO menor numero positivo digitado foi "+menor);
    }
    public static void valMaiorMenor(){
        Scanner etd = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int n = etd.nextInt();
        menor = n;
        maior = n;
        for (int i = 0; i < 5; i++){
            System.out.print("Digite um valor: ");
            n = etd.nextInt();
            if (n < 0){
                continue;
            }
            if(menor < 0 || menor >= n){
                menor = n;
            }else if(maior <= n){
                maior = n;
            }
        }
        etd.close();
    }
}
