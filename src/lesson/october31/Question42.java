package lesson.october31;

public class Question42 {

	public static void main(String[] args) {
		
		//verilen arrayde 0dan küçük sayılar var ise 100 ile değiştirin.
		//ve 2. index değişti 100 diye çıktı alalım
		
		//2.indexi değişti --> 100 gibi çıktılar alalım
		
		int[] sayilar = {0, 120, -5, -85, -256, 16, 1258, 81, 14};
		

		for (int i=0; i<sayilar.length; i++ ) {
			if (sayilar[i] < 0) {
				sayilar[i] = 100;
				int yeniSayi = sayilar[i];
				System.out.println(i + ". indexi değişti --> " + yeniSayi);
			}
		}
		
		
		
		
		
	}

}
