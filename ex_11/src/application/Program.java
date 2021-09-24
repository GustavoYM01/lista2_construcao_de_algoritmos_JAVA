package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	/*Autor do algoritmo: Gustavo Yamashita Matimoto*/

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número qualquer: ");
		double randomNumber = sc.nextDouble();
		
		if(randomNumber % 2 == 0) {
			System.out.println("Número par");
		}
		else {
			System.out.println("Número ímpar");
		}

		sc.close();
	}

}
