package lesson.october31;

import java.util.Scanner;

public class Question43 {

	public static void main(String[] args) {

		//girilen değer arrayde var mı yok mu
		
		//türkiye ya da Türkiye olarakta girse kişi farketmez
		
		String[] dizi = {"Türkiye", "Japonya", "Moğolistan", "Fransa", "Danimarka"};
		
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Aramak istediğiniz ülkeyi giriniz: ");
		String ulke = scanner.nextLine();
		
		boolean check = true;
		
		for (int i=0; i<dizi.length; i++ ) {
			
			if(ulke.equalsIgnoreCase(dizi[i])) {
				System.out.println("Listede vardır.");
				check = false;
			}
		
	}
		if (check) {
			System.out.println("Listede yoktur.");
		}

		

	}

}
