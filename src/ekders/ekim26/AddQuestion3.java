package ekders.ekim26;

import java.util.Scanner;

public class AddQuestion3 {

	public static void main(String[] args) {

		//taban sayısı 2 
				//üs 5
				
				//çıktı --> 2^5 = 32
				//for loop
				
				
				Scanner scanner = new Scanner(System.in);

				System.out.println("Taban sayısı için sayı giriniz: ");
				int taban = scanner.nextInt();
				System.out.println("Üs için sayı giriniz: ");
				int us = scanner.nextInt();
				
				int carpim = 1;
				for (int i = 0; i < us; i++) {
					carpim = carpim * taban;
				}
				
				
				System.out.println(taban +" ^ " + us + " = " + carpim);

	}

}
