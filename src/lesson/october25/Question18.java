package lesson.october25;

import java.util.Scanner;

public class Question18 {
	public static void main(String[] args) {
		
		//Girilen sayının faktöriyelini bulan program.
		

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bir sayı giriniz: ");
		int sayi = scanner.nextInt();
		int faktoriyel = 1;
		for (int i = 1; i <= sayi; i++) {
			faktoriyel = faktoriyel * i;
			System.out.println("Sayı " + i + " olduğunda faktöriyel: " + faktoriyel);
		
			}

	}

}
