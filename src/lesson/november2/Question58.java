package lesson.november2;

import java.util.Scanner;

public class Question58 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("İsim giriniz:");
		String isim = scanner.nextLine();
		
		System.out.println("Soyisim giriniz:");
		String soyad = scanner.nextLine();
		
		
		
		isimOlustur("mehmet" , "sli");
		isimOlustur(isim, soyad);
		

	}
	
	//Access Modifier
	//public --> bütün projede erişebilir demek
	//private --> Sadece bulunduğu class
	//protected --> aynı package içinde

	
	public static void isimOlustur (String name, String surname) {
		System.out.println("isim --> " + name + " " + "Soyad--> " + surname);
	}
	
	
	
	
	
}
