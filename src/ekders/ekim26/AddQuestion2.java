package ekders.ekim26;

import java.util.Scanner;

public class AddQuestion2 {

	public static void main(String[] args) {


			//girilen sayının 2ye ve 5e tam bölünen sayıların ortalaması
			
			  Scanner scanner = new Scanner(System.in);
			  System.out.println("Lütfen bir sayı girin");
			  int num = scanner.nextInt();
			
			int toplam = 0;
			int k = 0;
			  for (int i = 1; i < num ; i++) {
				if (i%2==0 && i%5==0) {
					toplam = toplam + i;
					k++;
				}
			}
			  System.out.println(k);
			  System.out.println(toplam);
			System.out.println(toplam/k);
			
		
			
			
			
			
			scanner.close();
			

	}

}
