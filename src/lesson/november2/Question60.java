package lesson.november2;

public class Question60 {

	public static void main(String[] args) {

		//Parametre olarak girilen bi string ve int değerini toplayan methodu yazalım
		//methodu int
		//daha sonra bu değeri console a yazdıralım
		
		//toplama ("5" , 4)
		//9
		
		int result = toplama ("5",4);
		System.out.println(result);
	}

	public static int toplama(String sayi1, int sayi2) {
		int sayiInt = Integer.parseInt(sayi1);
		int toplam = sayiInt + sayi2;
		//System.out.println("Toplamları: " + toplam); //bunu dersek eğer yukarıda sadece toplama("5",4); yazmamız yeterli.
		return toplam;
	}
	
	
	
}
