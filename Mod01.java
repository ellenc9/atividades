/*
  Nome: ExercLt02_01
  Objetivo: 1. Criar e coletar um vetor [50] inteiro. Calcular e exibir:
  a. A média dos valores entre 10 e 200;
  b. A soma dos números ímpares.
  Nome do programador: Ellen Christine
  Data de desenvolvimento: 25/03/2026
 */
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Mod01 {
    public static void main(String args[]){
        Scanner etd = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        for(int i = 0; i < 6; i++){
            System.out.print("Digite um valor: ");
            int valor = etd.nextInt();
            numeros.add(valor);
        }
        double a = calcMedia(numeros);
        int b = calcSoma(numeros);    
        System.out.print("Valores digitados = "+numeros+
                "\nMedia dos valores entre 10 e 200 = "+a+
                "\nSoma dos numeros impares = "+b);
    }
    static double calcMedia(List<Integer> lista){
        int soma = 0;
        int qtd = 0;
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i) > 10 && lista.get(i) < 200){
                soma += lista.get(i);
                qtd += 1;  
            }            
        }
        if (qtd == 0){
            return 0;
        }
        double media = (double) soma / qtd; 
        return media;
    }  
    static int calcSoma(List<Integer> lista){
        int soma = 0;
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i)%2 != 0){
                soma += lista.get(i);
                ;
            }
        }
        return soma;
    }
}


