package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	/*Autor do algoritmo: Gustavo Yamashita Matimoto*/

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double ad, sub, div, mult;

		System.out.print("Informe um n�mero: ");
		double n1 = sc.nextDouble();

		System.out.print("Informe outro n�mero: ");
		double n2 = sc.nextDouble();

		System.out.println();

		System.out.println(
				"Escolha uma op��o para realizar a opera��o aritm�tica: 1- adi��o. 2- subtra��o. 3- divis�o. 4- multiplica��o.");
		int option = sc.nextInt();

		switch (option) {
		case 1:
			ad = n1 + n2;
			System.out.printf("Valor da opera��o matem�tica: %.2f%n", ad);
			break;

		case 2:
			sub = n1 - n2;
			System.out.printf("Valor da opera��o matem�tica: %.2f%n", sub);
			break;

		case 3:
			div = n1 / n2;
			System.out.printf("Valor da opera��o matem�tica: %.2f%n", div);
			break;

		case 4:
			mult = n1 * n2;
			System.out.printf("Valor da opera��o matem�tica: %.2f%n", mult);
			break;

		default:
			System.out.println("Op��o inv�lida!");
			break;

		}
		sc.close();
	}

}
