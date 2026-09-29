import java.io.*;
import java.util.Scanner;
public class ClasseMetodos {
    public Aluno[] GravaAluno(Aluno[] aluno)throws IOException{
        int i;
        String fileName = "ArquivoAluno.text";
        Scanner sc = new Scanner(System.in);
        BufferedWriter grava = new BufferedWriter(new FileWriter(fileName));
        for(i = 0; i < 2; i++){
            aluno[i] = new Aluno();
        }
        for(i = 0; i < 2; i++){
            System.out.println("Nome:");
            aluno[i].pnome = sc.next();
            grava.write(aluno[i].pnome);
            grava.newLine();
            System.out.println("Sobrenome:");
            aluno[i].unome = sc.next();
            grava.write(aluno[i].unome);
            grava.newLine();
            System.out.println("Pontos: ");
            aluno[i].ponto = sc.nextInt();
            grava.write(Integer.toString(aluno[i].ponto));
            grava.newLine();
        }    
        System.out.println("Gravado com sucesso");
        grava.close();
        return aluno;
    }
    
    public void LerAluno(Aluno[] aluno)throws IOException{
        int i;
        String fileName = "ArquivoAluno.text";
        
        BufferedReader ler = new BufferedReader(new FileReader(fileName));
            for(i = 0; i < 2; i++){
                aluno[i] = new Aluno();
            }
            for(i = 0; i < 2; i++){
                aluno[i].pnome = ler.readLine();
                aluno[i].unome = ler.readLine();
                aluno[i].ponto = Integer.parseInt(ler.readLine());
            }
            for(i = 0; i < 2; i++){
                System.out.println(aluno[i].pnome+" "+aluno[i].unome+" = "+aluno[i].ponto);
            } 
        ler.close();    
    }
}
