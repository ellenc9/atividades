/*
  Nome: ExercLt1_35
  Objetivo: Receba 2 números inteiros, verifique qual o maior entre eles. 
  Calcule e mostre o resultado da somatória dos números ímpares entre esses valores.
  Nome do programador: Ellen Christine 
  Data de desenvolvimento: 02/03/2026
 */
import java.util.Scanner;
public class Est35 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int x = entrada.nextInt();

        System.out.print("Digite outro numero: ");
        int y = entrada.nextInt();
        entrada.close();
        int maior = Math.max(x, y);
        int menor = Math.min(x, y);       
        int result = Somatoria(maior, menor);
        System.out.println("Soma dos impares entre "+maior+" e "+menor+" = "+result);                
    }
    static int Somatoria(int x, int y){
        int i, c = 0;
        for (i = y + 1; i < x; i++){
            if(i % 2 != 0){
                c += 1;
            }
        }
        return c;
    }
}
