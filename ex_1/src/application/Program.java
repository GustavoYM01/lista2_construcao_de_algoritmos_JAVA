package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	/*Autor do algoritmo: Gustavo Yamashita Matimoto*/

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		float randomNumber = sc.nextFloat();

		if (randomNumber >= 100 && randomNumber <= 200) {
			System.out.println("Voc? digitou um numero entre 100 e 200");
		}

		else {
			System.out.println("Voce digitou um numero fora da faixa entre 100 e 200");
		}
		sc.close();
	}

}
