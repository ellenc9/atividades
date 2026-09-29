/*
  Nome: ExercLt1_34
  Objetivo: Receba um número. Calcule e mostre os resultados da tabuada desse número.
  Nome do programador: Ellen Christine 
  Data de desenvolvimento: 26/02/2026
 */

import java.util.*;
public class Est34 {
    static int num;
    public static void main(String args[]){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite um numero: ");
        num = entrada.nextInt();
        Tabua(num);
        entrada.close();
        }
    
    public static void Tabua(int n){
        for (int i = 1; i <= 10; i++){
            int soma = n * i;
            System.out.println(n+" x "+i+" = "+soma);
        }
    }
}