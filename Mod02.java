/*
  Nome: ExercLt2_02
  Objetivo: 2. Criar e coletar um vetor [100] inteiro e exibir:
  a. O maior e o menor valor;
  b. A média dos valores.
  Nome do programador: Ellen Christine
  Data de desenvolvimento: 25/03/2025
 */
import java.util.Scanner;
public class Mod02 {
    public static void main(String args[]){
        Scanner etd = new Scanner(System.in);
        
        int vet[] = new int[10];
        for(int i = 0; i <10; i++){
            System.out.print("Digite um numero: ");
            vet[i] = etd.nextInt();
        }
        calmm(vet);
        double result = fmedia(vet);
        System.out.print("\nMedia dos valores = "+result);
        etd.close();
    }
    public static void calmm(int[] lista){
        int menor = lista[0];
        int maior = lista[0];
        
        for(int i = 0; i < lista.length; i++){
            if(lista[i] <= menor){
                menor = lista[i];
            }else if(lista[i] >= maior){
                maior = lista[i];
            }
        }
        System.out.print("Maior = "+ maior+"\nMenor = "+menor);
    }
    static double fmedia(int[] lista){
        int soma = 0;
        for(int i = 0; i < lista.length; i++){
            soma += lista[i];
        }
        return soma / lista.length;
    }
}
