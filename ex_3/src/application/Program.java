package application;

import java.util.Scanner;

public class Program {
	
	/*Autor do algoritmo: Gustavo Yamashita Matimoto*/

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um n�mero inteiro qualquer: ");
		int randomNumber = sc.nextInt();

		if (randomNumber < 3 || randomNumber > 25) {
			System.out.println("O n�mero digitado n�o se encontra entre 3 e 25.");
		} else {
			System.out.printf("N�mero digitado: %d%n", randomNumber);
		}

		sc.close();
	}

}
