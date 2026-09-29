/*
  Nome: ExercLt02_03
  Obejtivo: 3.	Criar e coletar valores inteiros nos vetores VT1[3] e VT2[3]. 
  Concatenar esses valores em um 3º vetor (VT3[6]) e mostrar os seus dados. P. ex:
  VT1|1|2|3|	|VT2|4|5|6|        VT3|1|2|3|4|5|6
  Nome do programador: Ellen Christine
  Data de desenvolvimento: 26/03/2026
*/
import java.util.Scanner;
import java.util.Arrays;
public class Mod03 {
    
    public static void main(String args[]){
        Scanner etd = new Scanner(System.in);
       
        int vet1[] = new int[3];
        int vet2[] = new int[3];
        for(int i = 0; i < 3; i++){
            System.out.print("Digite valor: ");
            vet1[i] = etd.nextInt();
        }    
        for(int i = 0; i < 3; i++){
            System.out.print("Digite valor: ");
            vet2[i] = etd.nextInt();
        }
        etd.close();
        int[] result = soma(vet1, vet2);
        System.out.println("vetor 1 | "+ Arrays.toString(vet1)+
                "\nvetor 2 | "+ Arrays.toString(vet2)+
                "\nvetor 3 | "+ Arrays.toString(result));
    }
    static int[] soma(int[] lista1, int[] lista2){        
        int vet3[] = new int[6];
        for(int i = 0; i < 3; i++){
            vet3[i] = lista1[i];
        }
        for(int i = 0; i < 3; i++){
            vet3[i + 3] = lista2[i];
        }
        return vet3;
    }
}
