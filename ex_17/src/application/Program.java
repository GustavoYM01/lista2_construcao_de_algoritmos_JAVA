package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	/*Autor do algoritmo: Gustavo Yamashita Matimoto*/

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o valor do produto: ");
		double valueProduct = sc.nextDouble();

		if (valueProduct < 20) {
			valueProduct += valueProduct * 0.45;
			System.out.printf("Valor de revenda: %.2f", valueProduct);
		} else {
			valueProduct += valueProduct * 0.30;
			System.out.printf("Valor de revenda: %.2f", valueProduct);
		}

		sc.close();
	}

}
