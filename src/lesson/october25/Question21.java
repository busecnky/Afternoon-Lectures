package lesson.october25;

public class Question21 {

	public static void main(String[] args) {

		//1den 100e kadar çift sayıların toplamını tek sayıların toplamına oranı bulan program
		
		int tekler = 0;
		int ciftler = 0;
		for (int k=1 ; k<=100 ; k++) {
			if (k%2 != 0) {
			tekler = tekler + k;
			System.out.println("k = " + k + " olduğunda, teklerin toplamı = " + tekler);
			}
			else if (k%2 == 0) {
			ciftler = ciftler + k;
			System.out.println("k = " + k + " olduğunda, çiftlerin toplamı = " + ciftler);
			}
		}
		
		double oran = (double) ciftler/tekler;
		System.out.println(oran);
		
		
		
		
		
		
		
		
		
		

	}

}
