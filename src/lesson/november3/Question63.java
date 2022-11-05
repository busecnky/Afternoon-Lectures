package lesson.november3;

import java.util.Scanner;

public class Question63 {

	public static void main(String[] args) {

		//asalMi methodunu yazarken sadece sayının asal olup olmadığını kontrol edelim
		//Daha sonra mainin içinde for işlemi yapacağız.
		//metodun dönüş tipi olmayacak
		//Sayı kullanıcıdan alınacak
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		int sayi = scanner.nextInt();
		asalMi(sayi);
	}

	private static void asalMi(int sayi) {
		int asalDegil = 1;
		
		for(int i = 2; i<sayi; i++)
			if (sayi%i==0) {
				asalDegil = 0;
			}
		if(asalDegil == 0) {
			System.out.println(sayi + " asal değildir");
		}
		else {
			System.out.println(sayi + " asaldır");
	}
		
	}	

}
