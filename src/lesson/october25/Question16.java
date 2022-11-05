package lesson.october25;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {

		//Girilen sayıya kadar olan sayıların toplamı

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Sayı giriniz: ");
		int sayi = scanner.nextInt();
		
		int toplam = 0;
		for (int i = 0; i <= sayi; i++) {
			toplam = toplam + i;
			System.out.println("Sayı " + i + " olduğunda toplam: " + toplam);
		}
		System.out.println(toplam);
		
	}

}
