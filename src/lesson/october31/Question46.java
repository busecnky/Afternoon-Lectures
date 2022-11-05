package lesson.october31;

public class Question46 {

	public static void main(String[] args) {

		//Bir dizideki en büyük ikinci sayıyı bulan program
		
		
		int[] sayilar = { 1258, 1258, 5, 85, -256, 120, 16, 0, 36, 81, 14 };
		
		
		int enBuyuk = sayilar[0];
        int ikinci = sayilar[1];
        
		for (int i=0; i<sayilar.length; i++ ) {
			
			if (sayilar[i] > enBuyuk) {
				ikinci = enBuyuk;
				enBuyuk = sayilar[i];
				
			}else if (sayilar[i] > ikinci && sayilar[i] != ikinci) 
				ikinci = sayilar[i];
			}
			
		System.out.println("En büyük sayı: " + enBuyuk);
		System.out.println("İkinci büyük sayı: " + ikinci);
			
/*
        
        int enBuyuk = sayilar[0];
        int ikinci = sayilar[1];
        
        for (int i = 1; i < sayilar.length; i++) {



           if (sayilar[i] > enBuyuk) {
                ikinci = enBuyuk;
                enBuyuk = sayilar[i];



           } else if (sayilar[i] > ikinci) {
                ikinci = sayilar[i];
            }
        }
        System.out.println(" ikinci sayı " + ikinci);
*/
	}

}
