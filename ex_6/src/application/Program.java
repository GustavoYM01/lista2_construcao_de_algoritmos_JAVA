package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	/*Autor do algoritmo: Gustavo Yamashita Matimoto*/

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double sumNotes = 0;
		double result;

		for (int i = 1; i <= 4; i++) {
			System.out.printf("%d° nota: ", i);
			double nota = sc.nextDouble();

			if (nota < 0 || nota > 10) {
				System.out.println("Nota inválida!");
				break;
			}

			sumNotes += nota;
		}

		result = AvgNotes(sumNotes);

		if (sumNotes == 0) {
			System.out.println("ERRO");
		} else if (result >= 7) {
			System.out.printf("ALUNO APROVADO | nota: %.2f%n", result);
		} else if (result >= 5 && result <= 7) {
			System.out.printf("ALUNO DE EXAME FINAL | nota: %.2f%n", result);
		} else {
			System.out.printf("ALUNO REPROVADO | nota: %.2f%", result);
		}

		sc.close();
	}

	public static double AvgNotes(double totalNotes) {
		return totalNotes / 4.0;
	}
}
