package lesson.october25;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {

		//girilen 3 sayıyı büyükten küçüğe sıralayan program
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("3 adet sayı giriniz: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int enBuyuk = a;
		int ortanca = b;
		int enKucuk = c;
		
				
		if(enBuyuk<b) {
			enBuyuk = b;
			ortanca = a;
			if (ortanca < c) {
				ortanca = c;
				enKucuk = a;
			}
			else if (ortanca > c) {
				ortanca = a;
				enKucuk = c;
			}
		}
		if(enBuyuk<c) { 
			enBuyuk = c;
			ortanca = b;
			if (ortanca < a) {
				ortanca = a;
				enKucuk = c;
			}
			else if (ortanca > a) {
				ortanca = b;
				enKucuk = a;
			}
		}
	
		System.out.println("Büyükten küçüğe sıralama: " + enBuyuk + " > " + ortanca + " > " + enKucuk );
		
		
	}

}
