package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	/*Autor do algoritmo: Gustavo Yamashita Matimoto*/

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um n?mero: ");
		double randomNumber1 = sc.nextDouble();

		System.out.print("Digite outro n?mero: ");
		double randomNumber2 = sc.nextDouble();

		double sumNumber = randomNumber1 + randomNumber2;

		System.out.printf("Resultado da soma: %.2f%n", sumNumber);

		if (sumNumber > 20) {
			sumNumber += 8;
			System.out.printf("Resultado final: %.2f%n", sumNumber);
		} else if (sumNumber <= 20) {
			sumNumber -= 5;
			System.out.printf("Resultado final: %.2f%n", sumNumber);
		} else {
			System.out.println("Erro");
		}

		sc.close();
	}

}
