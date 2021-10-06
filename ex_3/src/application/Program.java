package application;

import java.util.Scanner;

public class Program {
	
	/*Autor do algoritmo: Gustavo Yamashita Matimoto*/

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número inteiro qualquer: ");
		int randomNumber = sc.nextInt();

		if (randomNumber < 3 || randomNumber > 25) {
			System.out.println("O número digitado não se encontra entre 3 ou 25.");
		} else {
			System.out.printf("Número digitado: %d%n", randomNumber);
		}

		sc.close();
	}

}
