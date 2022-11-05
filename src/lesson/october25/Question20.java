package lesson.october25;

import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {
		
		//Koç Burcu : 21 Mart- 20 Nisan
		//Boğa Burcu : 21 Nisan – 21 Mayıs
		//İkizler Burcu : 22 Mayıs – 22 Haziran
		//Yengeç Burcu : 23 Haziran – 22 Temmuz
		//Aslan Burcu : 23 Temmuz – 22 Ağustos
		//Başak Burcu : 23 Ağustos – 22 Eylül
		//Terazi Burcu : 23 Eylül – 22 Ekim
		//Akrep Burcu : 23 Ekim – 21 Kasım
		//Yay Burcu : 22 Kasım – 21 Aralık
		//Oğlak Burcu : 22 Aralık – 21 Ocak
		//Kova Burcu : 22 Ocak – 19 Şubat
		//Balık Burcu : 22 Şubat - 20 Mart
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bir doğduğunuz ayı giriniz: ");
		int i = scanner.nextInt();
		System.out.println("Bir doğduğunuz günü giriniz: ");
		int gun = scanner.nextInt();
		
		switch (i) {
		case 1:
			if (gun<=21) {
				System.out.println("Oğlak burcusunuz");
			}
			else if (gun>21 && gun<=31) {
				System.out.println("Kovs burcusunuz");
			}
			break;
		case 2:
			if (gun<=19) {
				System.out.println("Kova burcusunuz");
			}
			else if (gun>19 && gun<=29) {
				System.out.println("Balık burcusunuz");
			}
			break;
		case 3:
			if (gun<=20) {
				System.out.println("Balık burcusunuz");
			}
			else if (gun>20 && gun<=31) {
				System.out.println("Koç burcusunuz");
			}
			break;
		case 4:
			if (gun<=21) {
				System.out.println("Koç burcusunuz");
			}
			else if (gun>21 && gun<=30) {
				System.out.println("Boğa burcusunuz");
			}
			break;
		case 5:
			if (gun<=21) {
				System.out.println("Boğa burcusunuz");
			}
			else if (gun>21 && gun<=31) {
				System.out.println("İkizler burcusunuz");
			}
			break;
		case 6:
			if (gun<=23) {
				System.out.println("İkizler burcusunuz");
			}
			else if (gun>23 && gun<=30) {
				System.out.println("Yengeç burcusunuz");
			}
			break;
		case 7:
			if (gun<=22) {
				System.out.println("Yengeç burcusunuz");
			}
			else if (gun>22 && gun<=31) {
				System.out.println("Aslan burcusunuz");
			}
			break;
		case 8:
			if (gun<=22) {
				System.out.println("Aslan burcusunuz");
			}
			else if (gun>22 && gun<=31) {
				System.out.println("Başak burcusunuz");
			}
			break;
		case 9:
			if (gun<=22) {
				System.out.println("Başak burcusunuz");
			}
			else if (gun>22 && gun<=31) {
				System.out.println("Terazi burcusunuz");
			}
			break;
		case 10:
			if (gun<=21) {
				System.out.println("Terazi burcusunuz");
			}
			else if (gun>21 && gun<=31) {
				System.out.println("Akrep burcusunuz");
			}
			break;
		case 11:
			if (gun<=21) {
				System.out.println("Akrep burcusunuz");
			}
			else if (gun>21 && gun<=31) {
				System.out.println("Yay burcusunuz");
			}
			break;
		case 12:
			if (gun<=21) {
				System.out.println("Yay burcusunuz");
			}
			else if (gun>21 && gun<=31) {
				System.out.println("Oğlak burcusunuz");
			}
			break;
		default:
			System.out.println("Lütfen 1-12 arasında bir sayı giriniz");
			break;
		}
		
				
		
		
		
		
	}

}
