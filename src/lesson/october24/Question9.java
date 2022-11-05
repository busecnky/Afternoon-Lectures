package lesson.october24;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		// Dairenin alanını ve çevresini bulan program
		//r(yarı çapı) yi kullanıcıdan alacağız.
		//pi = 3.14
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("r değerini giriniz: ");
		float r = scanner.nextInt();


		System.out.println("Dairenin çevresi " + (3.14*2*r) + "dairenin alanı:" + (3.14*r*r));
	}

}
