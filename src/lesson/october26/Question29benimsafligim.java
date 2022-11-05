package lesson.october26;

import java.util.Scanner;

public class Question29benimsafligim {

	public static void main(String[] args) {

		// Kullanıcıdan sürekli sayı alcaz.
		// 0a bastığımızda bu aldığımız sayılardan tek olanların toplamını veren program
		
		//while
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayı girin: ");
		
		int sayi = scanner.nextInt();
		int toplam = 0;
		
		
		
		while (sayi != 0) {
			if (sayi %2 != 0) {
			toplam = toplam + sayi;
			}
			System.out.println("Bir sayı daha girin veya 0'a basarak çıkın: ");
			sayi = scanner.nextInt(); 
		}
		
		System.out.println("Girilen sayıların toplamı: " + toplam);
		
		

		
		
	}

}
