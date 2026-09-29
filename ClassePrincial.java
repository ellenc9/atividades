import java.util.Scanner;
import java.io.*;
public class ClassePrincial {
    public static void main(String args[])throws IOException{
        Aluno[] aluno = new Aluno[2];
        ClasseMetodos m = new ClasseMetodos();
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        while(opc!=9){
            System.out.println("1 - Gravar Aluno| 2 - Ler Aluno| 9 - Finaliza");
            opc = sc.nextInt();
            switch(opc){
                case 1:
                    aluno = m.GravaAluno(aluno);
                    break;
                case 2:
                    m.LerAluno(aluno);
                    break;
                case 9: 
                    System.out.println("Finalizado");
                    break;
                default:
                    System.out.println("OPC invalida");
            }
        }
    }         
}
