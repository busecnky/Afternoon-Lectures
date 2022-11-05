package lesson.november3;

import java.util.Scanner;

public class Question62 {


	public static int yasHesapla(int yil) {
		int yas = (2022-yil);
		return yas;
	}
	
	public static int yuzyılHesapla(int yil) {
		int yuzyil = yil/100 +1;
		return yuzyil;
	}
	
	public static void bilgileriYazdir(int yil) {
		int yasiniz = yasHesapla(yil);
		int yuzyiliniz = yuzyılHesapla(yil);
		System.out.println("Yaşınız: " + yasiniz + " Doğduğunuz yüzyıl: " + yuzyiliniz);
	}
	
	
	public static void main(String[] args) {

		//Doğum yılınızı girerek yaşınızı ve hangi yüzyılda doğduğunu hesaplayan metot
		//3 farklı metot
		
		//yasHesapla yuzyıl hesapla ve bilgileri yazdır
		
		//bilgileri yazdır metotunu çağırdığımızda --> 24 yaşındasınız 20. yüzyılda doğmuşsunuz diye çıkı alcaz
		
		
		//Bilgileri yazdır (1885);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Doğum yılınızı giriniz: "); 
		int sayi = scanner.nextInt();
		bilgileriYazdir(sayi);
	
		
		
		scanner.close();
	}

	
	
}
