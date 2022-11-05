package lesson.october24;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		// Girilen ortalamanın harf notuna göre geçip geçmediğini bulan program
		
		/* 90 üstü AA
		 * 80 ve 90 arası BB
		 * 70le 80 arası cc
		 * 60la 70 arası DD
		 * 60tan küçükse Ff kaldı olsun.
		 */

		

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ortalamayı giriniz: ");
		float ort = scanner.nextInt();
		
		if (ort>90) {
			System.out.println("AA ile geçtiniz.");
		}
		
		else if (90>=ort && ort>80) {
			System.out.println("BB ile geçtiniz.");
		}
		
		else if (80>=ort && ort>70) {
			System.out.println("CC ile geçtiniz.");
		}
		
		else if (70>=ort && ort>60) {
			System.out.println("DD ile geçtiniz.");
		}
		else if (60>ort){
			System.out.println("FF, kaldınız.");
		}
		
		
	}

}
