package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	/*Autor do algoritmo: Gustavo Yamashita Matimoto*/

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double result;
		double valueInstallments;
		double limitValueInstallments;

		for (int i = 1; i <= 1; i++) {

			System.out.print("Insira aqui o valor total de seu salário: ");
			double inputSalary = sc.nextDouble();

			if (inputSalary == 0 || inputSalary < 0) {
				System.out.println("Valor inválido");
				break;

			} else {

				System.out.print("Insira aqui o valor do empréstimo: ");
				double inputLoan = sc.nextDouble();

				if (inputLoan == 0 || inputLoan < 0) {

					System.out.println("Valor inválido");
					break;

				} else {

					System.out.print("Insira aqui o número de prestações: ");
					int installments = sc.nextInt();

					if (installments == 0 || installments < 0) {
						System.out.println("Valor inválido");
						break;
					} else {

						result = FinancingCoefficient(installments);
						valueInstallments = result * inputLoan;
						limitValueInstallments = inputSalary * 0.3; // limite de 30% do salário

						if (valueInstallments <= limitValueInstallments) {

							System.out.printf("Empréstimo concedido. Valor do empréstimo: %.2f%n", valueInstallments);
						} else {

							System.out.println("Valor de empréstimo não concedido. Valor da prestação acima de 30% do salário.");
						}

					}
				}

			}
		}

		sc.close();
	}

	public static double FinancingCoefficient(int installment) {
		return 0.010 / (1 - (Math.pow((1 + 0.010), -installment)));
		// considerei:
		// taxa de 10% a.m. durante 12 meses
	}

}
