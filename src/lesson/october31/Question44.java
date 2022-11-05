package lesson.october31;

public class Question44 {

	public static void main(String[] args) {
	
		//bu sayılar çifttir ve bu sayılar tektir şeklinde çıktı alan ve
		//dizideli tüm sayıların toplamını veren program
		
		//0 sayısı çifttir
		//5 sayısı tektir. gibi
		
		int[] sayilar = {0, 120, 5, -85, -256, 16, 1258, 81, 14};
		
		int toplam = 0;

		for (int i=0; i<sayilar.length; i++ ) {
			toplam += sayilar[i] ;
			if (sayilar[i] %2 == 0) {
				System.out.println(sayilar[i] + " sayısı çifttir");
			}else
				System.out.println(sayilar[i] + " sayısı tektir");
		
		}
		
		System.out.println("Toplam: " + toplam );
		

	}

}
