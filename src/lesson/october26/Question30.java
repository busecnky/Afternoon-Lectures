package lesson.october26;

import java.util.Scanner;

public class Question30 {

	public static void main(String[] args) {

		//Girilen sayının, kaçıncı basamakta olduğu (1ler, 10lar, 100ler gibi)
		//o basamaktaki basamak değerini (1ler basamağı: 5 gibi)
		
		//375
		//birler basamağı 5
		//onlar basamağı 7
		//yüzler basamağı 3 gibi
		
		//while
		
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Bir sayı giriniz= ");
		int sayi = scanner.nextInt();

		int basamak = 1;
		int i = 1;
		
		while (sayi != 0) {
			 basamak = sayi %10;
			 sayi = sayi/10;
			 System.out.println(i + "ler basamağı" + basamak);
			 i *= 10;
			 
		
		}
		
		 
	}

}
