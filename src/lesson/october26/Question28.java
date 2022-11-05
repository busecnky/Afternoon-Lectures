package lesson.october26;

import java.util.Scanner;

public class Question28 {

	public static void main(String[] args) {

		// Kullanıcıdan sürekli sayı alcaz.
		// 0a bastığımızda bu aldığımız sayıların çarpımını veren program

		// While
		// İlk sayının 0 girme durumu

		/*
		Scanner scanner = new Scanner(System.in);

		int cevap;
		int carpim = 1;

		while ((cevap = scanner.nextInt()) != 0) {
			carpim *= cevap;
			System.out.println("Lütfen sayı giriniz: ");
		}

		System.out.println("Girilen sayıların çarpımı: " + carpim);
		
		*/


		//	Hocanın çözümü
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayı girin, 0'a basarak çıkın: ");
		
		int sayi = scanner.nextInt();
		int carpim = 1;
		String kelime = scanner.nextLine();

		int ilkDeger = 0;
		while (sayi != 0) {
			carpim = carpim * sayi;
			System.out.println("Bir sayı girin, 0'a basarak çıkın: ");
			sayi = scanner.nextInt(); 
			ilkDeger = 1;
		}

		if (ilkDeger ==0 ) {
		System.out.println("Programdan çıktınız");
		}
		else {
			System.out.println("Girilen sayıların çarpımı: " + carpim);
		}


		
		
	}

}


