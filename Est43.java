/*
  Nome: ExercLt1_
  Objetivo: 1.	Calcule e mostre quantos anos serão necessários para que Ana seja maior que Maria
  sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano.
  Nome do programador: Ellen Christine 
  Data de desenvolvimento: 1/03/2026
 */
public class Est43 {
    public static void main(String args[]){
        double ana = 1.10, maria = 1.50;
        int anos = calcAnos(ana, maria);
        System.out.print("Em "+anos+" anos");
    }
    static int calcAnos(double pe1, double pe2){
        int ano = 0;
        while (pe1 <= pe2){
            pe1 += 0.03;
            pe2 += 0.02;
            ano += 1;
            System.out.printf("Ana = %.2fcm Maria = %.2fcm \n",pe1, pe2);
        }
        return ano;
    }    
}

