package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	/*Autor do algoritmo: Gustavo Yamashita Matimoto*/
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o valor total da compra (R$): ");
		double totalValue = sc.nextDouble();

		System.out.println("Informe aqui se ?: 1- cliente comum. 2- funcion?rio. 3- vip.");
		int option = sc.nextInt();

		sc.nextLine();

		switch (option) {
		case 1:
			System.out.printf("Valor a ser pago: R$%.2f", totalValue);
			break;

		case 2:
			totalValue -= totalValue * 0.1;
			System.out.printf("Valor a ser pago: R$%.2f", totalValue);
			break;

		case 3:
			totalValue -= totalValue * 0.05;
			System.out.printf("Valor a ser pago: R$%.2f", totalValue);
			break;

		default:
			System.out.println("Op??o inv?lida");
			break;
		}

		sc.close();
	}

}
