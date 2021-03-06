package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	/*Autor do algoritmo: Gustavo Yamashita Matimoto*/

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String textGender = "";

		for (int i = 1; i <= 1; i++) {

			System.out.print("Digite uma das letras (m/f) que represente o seu g?nero: ");
			char gender = sc.next().charAt(0);
			
			if (gender == 'm' || gender == 'M') {
				textGender = "Masculino";
			}
			else if (gender == 'f' || gender == 'F') {
				textGender = "Feminino";
			}
			else {
				System.out.println("Op??o inv?lida!");
				break;
			}

			System.out.print("Digite a sua idade: ");
			int age = sc.nextInt();

			sc.nextLine();

			switch (age) {
			case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11:
				System.out.printf("Crian?a de %d anos do gen?ro %s%n", age, textGender);
				break;

			case 12, 13, 14, 15, 16, 17, 18:
				System.out.printf("Adolescente de %d anos do gen?ro %s%n", age, textGender);
				break;

			case 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35:
				System.out.printf("Adulto de %d anos do gen?ro %s%n", age, textGender);
				break;

			case 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52:
				System.out.printf("Adulto de %d anos do gen?ro %s%n", age, textGender);
				break;

			case 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64:
				System.out.printf("Adulto de %d anos do gen?ro %s%n", age, textGender);
				break;

			case 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80:
				System.out.printf("Idoso de %d anos do gen?ro %s%n", age, textGender);
				break;

			case 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96:
				System.out.printf("Idoso de %d anos do gen?ro %s%n", age, textGender);
				break;

			case 97, 98, 99, 100:
				System.out.printf("Idoso de %d anos do gen?ro %s%n", age, textGender);
				break;

			default:
				System.out.println("Idade inv?lida");
				break;
			}

			sc.close();
		}

	}

}
