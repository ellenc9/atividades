/*
  Nome: ExercLt1_44
  Objetivo: Receba o número da base e do expoente. Calcule e mostre o valor da potência.
  Nome do programador: Ellen Christine 
  Data de desenvolvimento: 18/03/2026
 */
import java.util.Scanner;
public class Est44 {
    public static void main(String args[]){
        Scanner etd = new Scanner (System.in);
        
        System.out.print("Digite o numero de base: ");
        int base = etd.nextInt();
        
        System.out.print("Digite o numero do expoente: ");
        int expoe = etd.nextInt();
        etd.close();
        double potencia = calcPot(base, expoe);
        System.out.print("Potencia de "+base+"^"+expoe+" = "+potencia);
    }
    static double calcPot(int a, int b){
        double pot = Math.pow(a, b);
        return pot;
    }
}

