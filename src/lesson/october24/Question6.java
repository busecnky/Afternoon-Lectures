package lesson.october24;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		
		// Kullanıcıdan alınan vize ve final notlarıyla öğrencinin geçip geçmediğini bulan program.
		//50'den büyük eşit geçti
		//50'den küçükse kaldı
		
		//vizenin yüzde 40ı finalin yüzde 60ı
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Vize Notu: ");
		int vizeNotu = scanner.nextInt();
		
		
		System.out.println("Final Notu: ");
		int finalNotu = scanner.nextInt();
		
		float sonuc = (float) ((vizeNotu*0.4) + (finalNotu*0.6));
		System.out.println(sonuc);		
		
				if (sonuc >= 50) {
					System.out.println("Geçti.");
				}
				else {
					System.out.println("Kaldı.");
				}
		
		scanner.close();
	}
}
