package lesson.october24;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {

		//Verilen iki sayının çarpımı veren program.
				/*int sayi1 = 3;
				int sayi2 = 6;
				
				int carpim = sayi1*sayi2;
				
				System.out.println("Sayıların çarpımı: " + carpim);*/
			
				
				Scanner scanner = new Scanner(System.in);
				
				System.out.println("İlk sayıyı girin");
				int sayi1 = scanner.nextInt();
				
				System.out.println("İkinci sayıyı girin");
				int sayi2 = scanner.nextInt();
			
				int carpim = sayi1 * sayi2;
				System.out.println("Çarpım: " + carpim);
				
				
				

	}

}
