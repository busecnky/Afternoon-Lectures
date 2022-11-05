package lesson.november2;

import java.util.Scanner;

public class Question61 {

	public static void main(String[] args) {
		
		// parametre olarak int alan ve int döndüren
        // girilen ifadenini kaç basamaklı olduğunu bulan method
        // type casting işlemi kullanalım
        // int Stringe çevirip öyle bulalım



        // kacBasamakli("500")
        //
        // girilen değeri stringe çevirip, çevirdiğimiz ifadenin uzunluğunu bulcaz.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Sayı giriniz:");
		int sayimiz = scanner.nextInt();
		
		
		int basamakSayisi = basamakBul(sayimiz);
		System.out.println(basamakSayisi);
		
		//System.out.print(sayininBuyuklugu(basamakSayisi));
		sayininBuyuklugu(basamakSayisi);
	}

	
	public static int basamakBul(int sayi) {
		String str = String.valueOf(sayi);
		int uzunluk = str.length();
		return uzunluk;
		

	}
	
	public static void  sayininBuyuklugu(int sayi) {
		if (basamakBul(sayi) >= 1000) {
			System.out.println("Sayımız 1000'den büyüktür.");
		}
		else if (basamakBul(sayi) < 1000) {
			System.out.println("Sayımız 1000'den büyüktür.");
		}
	}
	
	
	
	
	
}
