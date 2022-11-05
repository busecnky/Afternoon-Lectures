package lesson.october24;


import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		//verilen iki sayıdan hangisinin büyük olduğunu bulan program
		
		
		int sayi1 = 5;
		int sayi2 = 10;
		
		if (sayi1 > sayi2) {
			System.out.println("Birinci sayı büyüktür ikinci sayıdan" );
		}
		else if (sayi1==sayi2) {
			System.out.println("Sayılar eşittir.");
			}
		
		else {
			System.out.println("İkinci sayı büyüktür birinci sayıdan " );
		}
		
		System.out.println("********************" );
		
		
		
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Birinci sayıyı girin: ");
		int a = scanner.nextInt();
		
		System.out.println("İkinci sayıyı girin: ");
		int b = scanner.nextInt();
		
		if (a > b) {
			System.out.println("Birinci sayı büyüktür ikinci sayıdan." );
		}
		
		else if (a==b) {
			System.out.println("Sayılar eşittir." );
		}
		else {
			System.out.println("İkinci sayı büyüktür birinci sayıdan. " );
	
	
		}
	}
	

}
