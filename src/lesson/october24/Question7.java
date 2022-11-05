package lesson.october24;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// Girilen sayının tek mi çift mi olduğu
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bir sayı giriniz: ");
		int sayi = scanner.nextInt();
		
		if(sayi%2==0) {
			System.out.println("Girdiğiniz sayı çifttir");
		}
		else {
			System.out.println("Girdiğiniz sayı tektir.");
		}

	}

}
