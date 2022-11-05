package lesson.november2;

public class Question59 {

	public static void main(String[] args) {

		//topla metodu
		
		//public static void topla() {}

		int toplam = topla(2,3);
		
		if(toplam < 10) {
			System.out.println("Toplamları 10'dan küçüktür.");
		}
		else {
			System.out.println("Toplamları 10'dan büyüktür.");
		}

	}

	
	public static int topla(int sayi1, int sayi2) {
		int toplam = sayi1 + sayi2;
		System.out.println("Toplamları: " + toplam);
		return toplam;
	}
	
	
	
}
