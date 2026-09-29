/*
  Nome: ExercLt02_04
  Obejtivo: Criar e coletar em um vetor [30] real e calcular e exibir:
  a. A média do grupo;
  b. A quantidade de notas acima do grupo;
  c. As posições dos valores abaixo da média do grupo.
  Nome do programador: Ellen Christine
  Data de desenvolvimento: 29/03/2026
 */
import java.util.Scanner;
public class Mod04 {
    public static void main(String args[]){
        Scanner etd = new Scanner(System.in);
        
        double vet[] = new double[5];
        for(int i = 0; i < 5; i++){
            System.out.println("Digite valor: ");
            vet[i] = etd.nextDouble();
        }
        etd.close();
        double media = calcMedia(vet);
        int acima = nAcima(media, vet);
        System.out.println("Media = "+media+
                "\nNotas acima da media = "+acima);
        pAbaixo(media, vet);
    }
    static double calcMedia(double[] lista){
        double soma = 0;
        for(int i = 0; i < lista.length; i++){
            soma += lista[i];
        }
        return soma/lista.length;
    }
    static int nAcima(double nota, double[] lista){
        int qtd = 0;
        for(int i = 0; i < lista.length; i++){
            if(lista[i] >= nota){
                qtd += 1;
            }
        }
        return qtd;
    }
    public static void pAbaixo(double nota, double[] lista){
        for(int i = 0; i < lista.length;i++){
            if(lista[i] < nota){
                int posicao = i;
                System.out.println("Nota abaixo da media = "+lista[i]+" | Posicao = "+i);
            }
        }
    }
}
