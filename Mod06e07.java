/*
  Nome: ExercLt02_03
  Obejtivo: 6 - Criar e coletar em um vetor [20] com números aleatórios. 
    Classificar este vetor em ordem crescente e mostre os dados.
   7 - A partir do exercício 6 (vetor classificado) solicitar um valor qualquer 
    e verificar a sua existência no vetor (utilizar pesquisa binária).
  Nome do programador: Ellen Christine
  Data de desenvolvimento: 02/04/2026
 */
import java.util.Scanner;
import java.util.Arrays;
public class Mod06e07 {
    public static void main(String args[]){
        Scanner etd = new Scanner(System.in);

        int vet[] = new int[5];
        for(int i = 0; i < 5; i++){
            System.out.println("Digite valor: ");
            vet[i] = etd.nextInt();
        }
        int[] classificado = classifica(vet);
        System.out.println("Vetor classificado = "+Arrays.toString(classificado));
        System.out.println("Digite o numero que quer encontrar: ");
        int num = etd.nextInt();
        int encontrado = binaria(classificado, num);
        if(encontrado >= 0){    
            System.out.println(num+" encontrado!");
        }else{
            System.out.println(num+" nao encontrado");
        }
    }
    static int[] classifica(int[] lista){
        for(int i = 0; i < lista.length - 1; i++){
            for(int j = i + 1; j < lista.length; j++ ){
                if(lista[i] >= lista[j]){
                    int aux = lista[i];
                    lista[i] = lista[j];
                    lista[j] = aux;
                }
            }
        }    
        return lista;
    }
    static int binaria(int[] ordenada, int alvo){
        int inicio = 0;
        int fim = ordenada.length - 1;
        while(inicio <= fim){
            int meio = inicio + (fim - inicio) / 2;
            
            if (ordenada[meio] == alvo){
                return meio;
            }else if(ordenada[meio] < alvo){
                inicio = meio + 1;
            }else{
                fim = meio - 1;
            }
        }
        return -1;
    }
}