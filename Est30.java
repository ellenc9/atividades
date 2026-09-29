/*
  Nome: ExercLt1_30
  Objetivo: Receba a data de nascimento e atual em ano, mês e dia. 
  Calcule e mostre a idade em anos, meses e dias, considerando os anos bissextos.
  Nome do programador: Ellen Christine 
  Data de desenvolvimento: 05/03/2026
 */
import java.util.Scanner;
public class Est30 {
        static int anos, meses, dias, anoAtual, mesAtual, diaAtual, anoNasc, diaNasc, mesNasc;
	public static void main(String[] args) {
            try (Scanner teclado = new
                        Scanner(System.in)) {
                System.out.print("Digite o ano de nascimento: ");
                anoNasc = teclado.nextInt();
                
                System.out.print("Digite o mês de nascimento: ");
                mesNasc = teclado.nextInt();
                
                System.out.print("Digite o dia de nascimento: ");
                diaNasc = teclado.nextInt();
                
                System.out.print("Digite o ano atual: ");
                anoAtual = teclado.nextInt();
                
                System.out.print("Digite o mês atual: ");
                mesAtual = teclado.nextInt();
                
                System.out.print("Digite o dia atual: ");
                diaAtual = teclado.nextInt();
                
                CalcId();
                
                System.out.println("Sua idade exata é: " + anos + " anos," + meses + " meses e " + dias + " dias.");
                
                teclado.close();
            }
	}
        public static void CalcId(){
            anos = anoAtual - anoNasc;
                meses = mesAtual - mesNasc;
                dias = diaAtual - diaNasc;
                
                if (dias < 0) {
                    meses = meses - 1;
                    int mesAnterior = mesAtual - 1;
                    int anoDoMesAnterior = anoAtual;
                    
                    if (mesAnterior == 0) {
                        mesAnterior = 12;
                        anoDoMesAnterior = anoDoMesAnterior - 1;
                    }
                    
                    int diasNoMesAnterior = 31;
                    if (mesAnterior == 4 || mesAnterior == 6 || mesAnterior == 9 || mesAnterior == 11) {
                        diasNoMesAnterior = 30;
                    } else if (mesAnterior == 2) {
                        if ((anoDoMesAnterior % 4 == 0 && anoDoMesAnterior % 400 == 0)) {
                            diasNoMesAnterior = 29;
                        } else {
                            diasNoMesAnterior = 28;
                        }
                    }
                    dias = dias + diasNoMesAnterior;
                }
                
                if (meses < 0) {
                    anos = anos - 1;
                    meses = meses + 12;
                }
        }
}
