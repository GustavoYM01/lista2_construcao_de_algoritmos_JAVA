package application;

import java.util.Scanner;

public class Program {
	
	/*Autor do algoritmo: Gustavo Yamashita Matimoto*/

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Insira um n�mero de 1 a 12: ");
		int randomNumber = sc.nextInt();

		switch (randomNumber) {
		case 1:
			System.out.println("Janeiro");
			break;

		case 2:
			System.out.println("Favereiro");
			break;

		case 3:
			System.out.println("Mar�o");
			break;

		case 4:
			System.out.println("Abril");
			break;

		case 5:
			System.out.println("Maio");
			break;

		case 6:
			System.out.println("Juhno");
			break;

		case 7:
			System.out.println("Julho");
			break;

		case 8:
			System.out.println("Agosto");
			break;

		case 9:
			System.out.println("Setembro");
			break;

		case 10:
			System.out.println("Outubro");
			break;

		case 11:
			System.out.println("Novembro");
			break;

		case 12:
			System.out.println("Dezembro");
			break;

		default:
			System.out.println("n�mero inv�lido");
		}
		sc.close();
	}

}
