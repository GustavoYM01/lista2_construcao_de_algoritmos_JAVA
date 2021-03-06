package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	/*Autor do algoritmo: Gustavo Yamashita Matimoto*/

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a 1° nota: ");
		double n1 = sc.nextDouble();

		System.out.print("Digite a 2° nota: ");
		double n2 = sc.nextDouble();

		System.out.print("Digite a 3° nota: ");
		double n3 = sc.nextDouble();

		double result;

		result = AvgNotes(n1, n2, n3);

		if (result >= 7) {
			System.out.printf("ALUNO APROVADO | nota: %.2f%n", result);
		} else {
			System.out.printf("ALUNO REPROVADO | nota: %.2f%n", result);
		}

		sc.close();
	}

	public static double AvgNotes(double firstNote, double secondNote, double thirdNote) {
		return (firstNote + secondNote + thirdNote) / 3.0;
	}

}
