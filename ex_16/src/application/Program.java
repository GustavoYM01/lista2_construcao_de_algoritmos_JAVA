package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	/* Autor do algoritmo: Gustavo Yamashita Matimoto */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 1; i++) {

			System.out.print("Informe o valor do sapato: ");
			double priceShoes = sc.nextDouble();

			if (priceShoes == 0 || priceShoes < 0) {
				System.out.println("Valor inválido");
				break;
			}

			System.out.println("Informe a forma de pagamento: 1- à vista. 2- à prazo.");
			int option = sc.nextInt();

			switch (option) {
			case 1:
				priceShoes -= priceShoes * 0.1;
				System.out.printf("Valor a pagar: %.2f", priceShoes);
				break;

			case 2:
				System.out.printf("Valor a pagar: %.2f", priceShoes);
				break;

			default:
				System.out.println("Opção inválida");
				break;
			}
		}

		sc.close();
	}

}
