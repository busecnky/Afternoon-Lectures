package lesson.october25;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {

		//Girilen sayı için öarpım tablosu yazan program
		//6 olursa 
		//6x1
		//6x2
		//...
		//6x10
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1'den 10!a kadar bir sayı giriniz: ");
		int sayi = scanner.nextInt();
		
		for (int i = 1; i <= sayi; i++) {
			for (int j = 1 ; j <= 10 ; j++) {
			System.out.println(i+"x"+j);
			}
			System.out.println(" "); //Güzel bir detay
		}
		
		
		/*Hocanın çözümü
		 * 
		githubda
		
		
	
		 */
		
		
		
		
		
	}

}
