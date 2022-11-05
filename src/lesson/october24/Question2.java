package lesson.october24;

import java.util.Scanner;

public class Question2 {
	
	public static void main(String[] args) {
		
		//Verilen ürünün satış fiyatının içinde %18 kdv ve %15 kar olduğunu biliyoruz.
		
		//Verilen ürünün ham fiyatını bulan program
		
		//değişken isimleri --> camelCase
		//sınıf isimleri --> PascalCase
		
		
		
		/*int fiyat = 100;
		int vergisizFiyat = fiyat *82/100;
		int hamFiyat = vergisizFiyat * 85/100;
		System.out.println(hamFiyat);*/
		
		
		
		
		int fiyat = 100;
		float vergisizFiyat = fiyat / 0.82f;
		float hamFiyat = vergisizFiyat / 0.75f;
		System.out.println(hamFiyat);
		
		System.out.println("*******************");
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ürün fiyatını girin");
		int urunFiyat = scanner.nextInt();
		
		float kdvSizFiyat = urunFiyat / 1.18f;
		float ilkFiyat = kdvSizFiyat / 1.15f;
		
		System.out.println("İlk fiyat = " + ilkFiyat);
		
		
		
		
		
	}

}
