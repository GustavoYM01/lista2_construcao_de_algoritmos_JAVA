package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	/*Autor do algoritmo: Gustavo Yamashita Matimoto*/

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor do produto: ");
		double productValue = sc.nextDouble();

		System.out.print("N? de moedas de 1 real: ");
		int oneReal = sc.nextInt();

		System.out.print("N? de moedas de 50 centavos: ");
		int fiftyCents = sc.nextInt(); // * 0,50

		System.out.print("N? de moedas de 25 centavos: ");
		int twentyFiveCents = sc.nextInt(); // * 0,25

		System.out.print("N? de moedas de 5 centavos: ");
		int fiveCents = sc.nextInt(); // * 0,05

		System.out.print("N? de moedas de 1 centavo: ");
		int oneCent = sc.nextInt(); // * 0,01

		double totalCents = (fiftyCents * 0.5) + (twentyFiveCents * 0.25) + (fiveCents * 0.05) + (oneCent * 0.01);

		double totalMoney = totalCents + oneReal;

		double result1 = totalMoney - productValue;
		double result2 = productValue - totalMoney;

		if (totalMoney == productValue) {
			System.out.println("? poss?vel comprar o produto");
		} else if (totalMoney > productValue) {
			System.out.printf("? poss?vel comprar, e h? troco de R$ %.2f%n", result1);
		} else {
			System.out.printf("N?o ? poss?vel comprar o produto, falta(m) R$ %.2f", result2);
		}

		sc.close();
	}

}
