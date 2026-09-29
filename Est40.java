/*
  Nome: ExercLt1_40
  Objetivo: Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles.
  Nome do programador: Ellen Christine 
  Data de desenvolvimento: 06/03/2026
 */
import java.util.*;
public class Est40 {
    public static void main(String args[]){
        Scanner etd = new Scanner(System.in);
        
        System.out.println("Digite um numero inteiro: ");        
        int x = etd.nextInt();
        
        System.out.println("Digite outro numero: ");        
        int y = etd.nextInt();
        
        int menor = Math.min(x, y);
        int maior = Math.max(x, y);
        
        ArrayList<Integer> result = calPrimo(menor, maior);
        int contador = result.size();
        
        etd.close();    
        
        System.out.println("Ha " + contador + " primos entre " + x + " e " + y + " = " + result);
    }    
    static ArrayList<Integer> calPrimo(int a, int b){
        ArrayList<Integer> primos = new ArrayList<>();
        for(int n = a + 1; n < b; n++){
            boolean primo = true;

            for(int i = 2; i < n; i++){
                if(n % i == 0){
                    primo = false;
                    break;
                }
            }
            
            if(primo && n > 1){
                primos.add(n);
            }
        }
        return primos;
    }
}

    


