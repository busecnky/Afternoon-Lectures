package lesson.october27;

import java.util.Scanner;

public class Question36 {

	public static void main(String[] args) {

		// Verilen kelimenin içinde kaç tane e olduğunu bulan program

	/*	Scanner scanner = new Scanner(System.in);
		System.out.println("Bir kelime giriniz: ");
		String kelime = scanner.nextLine();
		
		int k = 0;

		for (int i = 0; i < (kelime.length()); i++) {
			if (kelime.charAt(i) == 'e') {
				k++;
			} 

		}
		System.out.println("Kelimenin içinde " + k + " adet e harfi vardır.");
		
	
		*/
		
		//kelimeyi ve harfi dışarıdan alan program
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir kelime giriniz: ");
		String kelime = scanner.nextLine();
		System.out.println("Sayısını bulmak istediğiniz harfi giriniz: ");
		String harf = scanner.nextLine();
		int k = 0;

		
		for (int i = 0; i < (kelime.length()); i++) {
			if (kelime.charAt(i) == harf.charAt(0)) {
				k++;
			} 

		}
		System.out.println("Kelimenin içinde " + k + " adet " + harf +  " harfi vardır.");
		
		
		
		
		

		
		
		
	}

}
