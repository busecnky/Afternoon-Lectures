package lesson.october26;

import java.util.Scanner;

public class Question29 {

	public static void main(String[] args) {

		// Girilen sayıya kadar tek olan sayıların toplamını bulan program

		// while

		Scanner scanner = new Scanner(System.in);

		System.out.print("Bir sayı giriniz= ");
		int x = scanner.nextInt();
		int toplam = 0;

		while (x >= 0) {

			if (x % 2 != 0) {
				toplam = toplam + x;
			}
			x--;
		}
		System.out.print("Tek sayılar toplamı= " + toplam);

	}
	

}
