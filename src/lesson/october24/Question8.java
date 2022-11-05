package lesson.october24;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		// Kenarları verilen üçgenin nasıl bir üçgen old
		//eşkenar ikizkenar çeşitkenar
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("İlk kenarı giriniz: ");
		float kenar1 = scanner.nextInt();
		
		System.out.println("İkinci kenarı giriniz: ");
		float kenar2 = scanner.nextInt();
		
		System.out.println("Üçüncü kenarı giriniz: ");
		float kenar3 = scanner.nextInt();

		if (kenar1 == kenar2 && kenar1 == kenar3 && kenar2 == kenar3) {
			System.out.println("Üçgen eşkenar üçgendir.");
		}
			else if (kenar1 != kenar2 && kenar2 != kenar3 && kenar1 != kenar3) {
				System.out.println("Üçgen çeşitkenar üçgendir.");
			}
			
			else {
				System.out.println("Üçgen eşkenar üçgendir");
			}
		}
		
		
		
		
		
	}
	
	

