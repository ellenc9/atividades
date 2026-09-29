/*
  Nome: ExercLt1_42
  Objetivo: Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
  Nome do programador: Ellen Christine 
  Data de desenvolvimento: 11/03/2026
 */
public class Est42 {
    public static void main(String args[]){
        double result = serie();
        System.out.println("Soma da serie = "+result);   
    }
    static double serie(){
        int j = 1;
        double soma = 0;
        for(int i = 0; i < 51; i++){
            soma = (double)i/j;            
            System.out.print("Soma de "+i+"/"+j+" = "+soma+"\n");
            j += 2;
        } 
        return soma;
    }  
}