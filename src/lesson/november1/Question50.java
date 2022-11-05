package lesson.november1;

import java.util.Scanner;

public class Question50 {
	public static void main(String[] args) {
		
		//İkiye ikilik bir matris tanımlayalım
		
		
		//bunların içine isimler yazalım
		
		//isimleri dışarıdan alcaz
		//Çıktımız:
		
		//1. grup
		//Ahmet
		//Mehmet
		
		//2. grup
		//Aslı
		//Zeynep
		
		String [][] array = new String[2][2];
 		
		Scanner scanner = new Scanner(System.in);
		
		/*
		System.out.println("1. grup için 2 kişi girin");
		isimler[0][0] = scanner.nextLine();
		isimler[0][1] = scanner.nextLine();
		
		System.out.println("2. grup için 2 kişi girin");
		isimler[1][0] = scanner.nextLine();
		isimler[1][1] = scanner.nextLine();
		*/
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println(i+1 + ". grup üyelerini giriniz: ");
				array[i][j] = scanner.nextLine();
			}
			System.out.println();
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(i+1 + ". grup");
			for (int j = 0; j < array[i].length; j++) {
				System.out.println(array[i][j]);
			}
		}
		
		scanner.close();
		
	}

}
