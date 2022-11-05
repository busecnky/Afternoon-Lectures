package lesson.october25;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {

		//Girilen sayının asal olup olmadığını bulan program

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bir sayı giriniz: ");
		int sayi = scanner.nextInt();
		
		/*if (sayi%2==0) {
			System.out.println("Asal değildir");
		}
		else if (sayi%3==0) {
			System.out.println("Asal değildir");
		}
		else if (sayi%5==0) {
			System.out.println("Asal değildir");
		}
		else if (sayi%7==0) {
			System.out.println("Asal değildir");
		}
		else {
			System.out.println("Asal sayıdır");
		}*/
		
		//for ile çözümü
		
		int asalDegil = 1;
		
		for(int i = 2; i<sayi; i++)
			if (sayi%i==0) {
				asalDegil = 0;
			}
		if(asalDegil == 0) {
			System.out.println(sayi + " asal değildir");
		}
		else {
			System.out.println(sayi + " asaldır");
		}

	}

}
