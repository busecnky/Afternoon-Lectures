package lesson.october24;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// Girilen TL değerini USD ye çeviren program
		// 1 USD = 18.25 TL
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("TL miktarını giriniz");
		int para = scanner.nextInt();
		
		float ceviri = (float) (para / 18.25);
				
				System.out.println(ceviri + " dolarınız vardır.");

	}
}
