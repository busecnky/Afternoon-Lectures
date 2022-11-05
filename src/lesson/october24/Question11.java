package lesson.october24;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		
		// Girilen 3 sayıdan en büyük olanı yazdıran program
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("3 adet sayı giriniz: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int enBuyuk = a;
		
		if(enBuyuk<b) {
			enBuyuk = b;
		}
		if(enBuyuk<c) { //else if yazarsak eğer olmuyor çünkü program ilk koşulda diyor ki tamam buna uydu bi öncekinde bitiyor program.
			enBuyuk = c;
		}
	
		System.out.println("En büyük sayı: " + enBuyuk);
	}
}
