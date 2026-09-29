/*
  Nome: ExercLt02_05
  Obejtivo: Criar e coletar em um vetor [20] inteiro. Calcule e exiba, segundo:
  10
  ∑ (A[1] – A[21–1])
  i = 1
  Nome do programador: Ellen Christine
  Data de desenvolvimento: 29/03/2026
*/
import java.util.Scanner;
public class Mod05 {
    public static void main(String args[]){

        int vet[] = new int[20];
        int[] lista = coletaint(vet);
        for(int i = 0; i < 10; i++){
            double result = lista[i] - lista[19 - i];
            System.out.println(lista[i]+" - "+lista[19 - i]+" = "+result);
        }
    }
    public static int[] coletaint(int[] lista){       
        try (Scanner etd = new Scanner(System.in)) {
            for(int i = 0; i < lista.length; i++){
                System.out.println("Digite valor: ");
                lista[i] = etd.nextInt();
            }
        }
        return lista;
    }
}
