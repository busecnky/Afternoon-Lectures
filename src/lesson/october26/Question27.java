package lesson.october26;

import java.util.Scanner;

public class Question27 {

	public static void main(String[] args) {

		//kullanıcıdan taban sayısı alcaz -->
		//üs sayısı alcaz
		
		//2 üzeri 5 i hesaplayan program
		
		//while
		//2^5 : 32
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Taban sayısı için sayı giriniz: ");
		int taban = scanner.nextInt();
		System.out.println("Üs için sayı giriniz: ");
		int us = scanner.nextInt();
		
		int sonuc = 1;
		int i = 1;
		while (i<=us) {
			sonuc *= taban;
			i++;
		}
		
		System.out.println(taban +" ^ " + us + " = " + sonuc);
		
	}

}
