package lesson.october27;

import java.util.Scanner;

public class Question38 {

	public static void main(String[] args) {

		// BUNU TEKRAR ÇÖZ SEN HİÇ YAPAMADIN BU SORUYU KENDIN YORUMLA

		// girilen mail ve password doğruysa sisteme giriş yapıldı yazdıran program
		// mailin içinde "@" var mı kontrolü
		// password ikinci password bunlarda doğruysa sisteme kayıt olcaz
		// gişir yaptınız --> (girilen mail)
		// hatalı mail adı veya şifre veya yaptınız

		// email
		// password
		// ikinci paswword

		// email "@" //contains
		// password ikiside eşitmi
		// password 8 karakterden fazla mı
		// kayıt oldunuz
		// email formatı uygun değil
		// passwordlar uyuşmuyosa ve ya 8 karakterden az ise passwordu tekrar kontrol
		// edin

		// booelan
		// while

		Scanner scanner = new Scanner(System.in);

		boolean check = true;
		while (check == true) {
			System.out.print("mail girin : ");
			String mail = scanner.nextLine();

			System.out.print("şifrenizi girin : ");
			String password = scanner.nextLine();

			System.out.print("tekrar şifre girin : ");
			String rePassword = scanner.nextLine();

			if ((mail.contains("@")) == false) {
				System.out.println("email formatı uygun değil");
			} else {
				if ((password.equals(rePassword)) && (password.length() >= 8)) {
					System.out.println("giriş yaptınız -->" + mail);
					check = false;
				} else {
					System.out.println(" iki şifreniz ya eşit değil ve ya 8 karakterden az girdiniz");
				}
			}
		}

	}

}
