package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	/* Autor do algoritmo: Gustavo Yamashita Matimoto */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double total;

		// 100kW = 1/7 do sal?rio m?nimo (R$1.100,00)
		// 1/7 do sal?rio m?nimo ~ R$157,14

		System.out.print("Informe o gasto de energia (em kWh): ");
		double electricEnergyExpenditure = sc.nextDouble();

		total = electricEnergyExpenditure / 100;
		total *= 157.14;
		total -= total * 0.1;

		System.out.printf("Total a pagar: R$%.2f", total);

		sc.close();

	}

}
