package lesson.october24;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
	
		// 1- Toplama
		// 2- Çıkarma
		// 3- Çarpma
		// 4- Bölme
		
		//2 tane sayı al kullanıcıdan
		//1se sayıyı topla, 2 seçerse çıkar...
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("2 adet sayı giriniz: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.println("Bu sayılarla hangi işlem yapmak istiyorsanız numarasını tuşlayınız.");
		System.out.println("1- Toplama");
		System.out.println("2- Çıkarma");
		System.out.println("3- Çarpma");
		System.out.println("4- Bölme");
		int cevap = scanner.nextInt();
		
		if (cevap == 1) {
			System.out.println(a+b);
		}

		
		
		
		
		
		
	}

}
