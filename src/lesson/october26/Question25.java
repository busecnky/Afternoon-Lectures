package lesson.october26;

import java.util.Scanner;

public class Question25 {

	public static void main(String[] args) {

		// Girilen sayının faktöriyelini hesaplayan program
		
		//while
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bir sayı giriniz: ");
		int sayi = scanner.nextInt();
		
		int i = 1;
		int faktoriyel = 1;
		while (i<=sayi) {
			faktoriyel = faktoriyel * i;
					i++;
			System.out.println(faktoriyel); // bunu teyit etmek için buraya koydum sonuç için alttaki
		}
		System.out.println("Girdiğiniz sayının faktöriyeli :" + faktoriyel);
		
		
		/*
		// Arkadaşın sonucu
		 
		 Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bir sayı giriniz: ");
		int sayi = scanner.nextInt();
		
		int faktoriyel = 1;
		while (sayi>0) {
			faktoriyel = faktoriyel * sayi;
					sayi--;
			System.out.println(faktoriyel); // bunu teyit etmek için buraya koydum sonuç için alttaki
		}
		System.out.println("Girdiğiniz sayının faktöriyeli :" + faktoriyel);
		 
		 */
		
		
		
		
		
		
		
		
		
		
	}

}
