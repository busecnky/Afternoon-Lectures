package lesson.october25;

import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {

		//
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bir sayı giriniz: ");
		int sayi = scanner.nextInt();
		
	
		for (int k=1 ; k<=sayi ; k++) {
			if (k%2 == 0) {
			System.out.println(k);
			}
		}
	
		
	}

}
