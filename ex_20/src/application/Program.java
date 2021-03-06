package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	/* Autor do algoritmo: Gustavo Yamashita Matimoto */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int absences = 0;
		int numberOfAbsences = 0;
		double notes = 0;
		double result;

		for (int i = 1; i <= 4; i++) {

			System.out.printf("Digite a nota do %d? bimestre: ", i);
			double bimonthlyNote = sc.nextDouble();

			if (bimonthlyNote < 0 || bimonthlyNote > 10) {
				System.out.println("Nota inv?lida");
				break;
			} else {

				System.out.printf("Digite a quantidade de faltas do %d? bimestre: ", i);
				numberOfAbsences = sc.nextInt();

				notes += bimonthlyNote;
				absences += numberOfAbsences;

			}

		}

		result = AvgNotes(notes);

		if (result >= 7 && result <= 10 && absences <= 36) {
			System.out.printf("Aprovado. M?dia: %.2f | Faltas: %d", result, absences);
		} else if (result >= 4 && result <= 7 && absences <= 36) {
			System.out.printf("Exame final. M?dia: %.2f | Faltas: %d", result, absences);
		} else if (result < 4 && absences > 36) {
			System.out.printf("Reprovado. M?dia: %.2f | Faltas: %d", result, absences);
		} else {
			System.out.println("ERRO");
		}

		sc.close();

	}

	public static double AvgNotes(double totalNotes) {
		return totalNotes / 4;

	}
}
