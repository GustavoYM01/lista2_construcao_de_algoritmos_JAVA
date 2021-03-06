package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	/*Autor do algoritmo: Gustavo Yamashita Matimoto*/
	
	public static void main(String[] args) {
		
		// m?dia ponderada = (n1 * 1) + (n2 * 2) + (n3 * 3) + (n4 * 4)

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double totalAvg = 0;
		double result;

		for (int i = 1; i <= 4; i++) {
			System.out.printf("%d? nota: ", i);
			double nota = sc.nextDouble();
			
			if (nota < 0 || nota > 10) {
				System.out.println("Nota inv?lida!");
				break;
			}
			
			totalAvg += nota * i;
			// totalAvg = totalAvg + nota * i;
			// Ex.: totalAvg = 0 + 8.65 * 1 => totalAvg = 8.65
			// Ex.: totalAvg = 8.65 + 7.55 * 2 => totalAvg = (8.65 + 15.1) = 23.75
			// E assim sucessivamente.
		}
		
		result = Avg(totalAvg);
		
		if (totalAvg == 0) {
			System.out.println("Erro!");
		}
		else if (result >= 7) {
			System.out.printf("ALUNO APROVADO | nota: %.2f", result);
		}
		else if (result >= 5 && result < 7) {
			System.out.printf("ALUNO DE EXAME FINAL | nota: %.2f", result);
		}
		else {
			System.out.printf("ALUNO REPROVADO | nota: %.2f", result);
		}
		

		sc.close();
	}
	
	public static double Avg(double total) {
		return total / 10;
		// c?lculo da MP (m?dia ponderada)
	}

}
