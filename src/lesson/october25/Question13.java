package lesson.october25;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		
		// telefona ve maile bir kod gelecek
		/*kullanıcıdan emaile gelen kodu ve telefona gelen kodu alcaz
		 * bunları karşılaştırcaz
		 * 
		 * ikisi de uyuyorsa sisteme kaydoldunuz
		 * telefonu doğru emaili yanlış --> emaili yanlış girdiniz
		 * emaili doğru telefonu yanlış girmiş --> telefonu yanlış girdiniz
		 * 
		 * ikisini de yanlış girdi--> ikisini de yanlış girdiniz yazacak
		 * 
		 * int mail kod = 555;
		 * int tel kod = 123;
		 */

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Maile gelen kodunuzu giriniz: ");
		int mailKod1 = scanner.nextInt();
		
		System.out.println("Telefona gelen kodunuzu giriniz: ");
		int telKod1 = scanner.nextInt();
		
		int mailKod = 555;
		int telKod = 321;
		
		if (mailKod == mailKod1 && telKod == telKod1) {
			System.out.println("Sisteme kaydoldunuz.");
		}
		
		else if (mailKod != mailKod1 && telKod == telKod1) {
			System.out.println("Email kodunu yanlış girdiniz.");
		}
		
		else if (mailKod == mailKod1 && telKod != telKod1) {
			System.out.println("Telefon kodunu yanlış girdiniz.");
		}
		
		else if (mailKod != mailKod1 && telKod != telKod1) {
			System.out.println("Telefon ve email kodunu yanlış girdiniz.");
		}
		
	}

}
