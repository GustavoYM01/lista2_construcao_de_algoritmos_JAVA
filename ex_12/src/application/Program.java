package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	/*Autor do algoritmo: Gustavo Yamashita Matimoto*/

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("1? n?mero: ");
		double firstNumber = sc.nextDouble();
		
		System.out.print("2? n?mero: ");
		double secondNumber = sc.nextDouble();
		
		System.out.print("3? n?mero: ");
		double thirdNumber = sc.nextDouble();
		
		if (firstNumber > secondNumber && firstNumber > thirdNumber) {
			System.out.printf("Maior n?mero: %.2f", firstNumber);
		}
		else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
			System.out.printf("Maior n?mero: %.2f", secondNumber);
		}
		else {
			System.out.printf("Maior n?mero: %.2f", thirdNumber);
		}

		sc.close();
	}
}
