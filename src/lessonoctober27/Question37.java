package lessonoctober27;

import java.util.Scanner;

public class Question37 {

	public static void main(String[] args) {
		
		//Girilen kelimenin ilk önce hepsini büyük harfe çevien sonra hepsini küçük harfe çeviren program
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir kelime giriniz: ");
		String kelime = scanner.nextLine();
		
		String k2 = kelime.toUpperCase();
		System.out.println("Hepsi büyük: " + k2);
		
		
		String k1 = kelime.toLowerCase();
		System.out.println("Hepsi küçük: " +  k1);
		
	
		
		
		
		

	}

}
