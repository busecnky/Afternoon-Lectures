package lesson.november2;

public class Question57 {

	public static void main(String[] args) {

		//max ve min değerlerini bulcaz
		//string den int
		//arrayin uzunluğu kadar int array oluşturalım
		
		String[] array = {"5", "2", "3", "4", "99", "85" };
		
		int[] sayilar = new int [6];
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < sayilar.length; i++) {
			sayilar[i] = Integer.parseInt(array[i]);
			if (sayilar[i] > max) {
				max = sayilar[i];
			}
			if (sayilar[i] < min) {
				min = sayilar[i];
			} 
			
		}
		System.out.println("max: " + max + " min: " + min);
		
		
		

	}

}
