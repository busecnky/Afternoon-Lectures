package lesson.october31;

import java.security.KeyStore.PrivateKeyEntry;
import java.util.Scanner;

public class Question40 {

	public static void main(String[] args) {

		//Bizden bir kelime istenilcek (java)
		//hangi hargi değiştirmek istediğimizi soracak (b)
		//eğer değiştirmek istediğimiz kelimede yoksa,
		//döngü başa saraqcak ve tekrar kelime isteyecek
		//eğer varsa harfimiz değişecek
		//ve yeni kelimemiz ekrana basılcak
		
		//java
		 // değiştirmek istediğiniz harf --> a
        //neyle değiştirmek istediğimiz harf --> b
        
        //jbvb
		
		//while
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Bir kelime giriniz: ");
		String kelime = scanner.nextLine();
		
		boolean kontrol = true;
		System.out.println("Değiştirmek istediğiniz harfi giriniz: ");

		while (kontrol == true) {
			String harf = scanner.nextLine();
			if (kelime.contains(harf)) {
				System.out.println("Hangi harf ile değiştirmek isterseniz harfi giriniz: ");
				String harf2 = scanner.nextLine();
				String yeniKelime = kelime.replace(harf, harf2);
				System.out.println("Yeni kelimeniz: " + yeniKelime);
				kontrol = false;
			}
			else
				System.out.println("Lütfen kelimenin içinde olan bir harf giriniz: ");
		}
		
		
		
		
		

		
		
	}

}
