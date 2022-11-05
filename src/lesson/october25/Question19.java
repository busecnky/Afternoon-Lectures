package lesson.october25;

import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {

		//Girilen sayının hangi beden olduğunu söyleyen program
		//Switch case
		
			//Small --> 29
			//Medium --> 42
			//Large --> 44
			//XL --> 48
			//Default --> Belirsiz
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bir sayı giriniz: ");
		int i = scanner.nextInt();
		
		switch (i) {
		case 29:
			System.out.println("Small beden");
			break;
		case 42:
			System.out.println("Medium beden");
			break;
		case 44:
			System.out.println("Large beden");
			break;
		case 48:
			System.out.println("XLarge beden");
			break;
		default:
			System.out.println("Belirsiz");
			break;
		}
		
		
	}

}
