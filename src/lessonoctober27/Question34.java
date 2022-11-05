package lessonoctober27;

import java.util.Scanner;

public class Question34 {

	public static void main(String[] args) {
		
		//Kullanıcıdan bir veri alalım (JAVA)
		
		//0. indexi J
		//1. indexi A gibi

		

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String kelime = scanner.nextLine();
        
        
        for (int i = 0 ; i < (kelime.length())  ; i++) {
        	System.out.println(i + ". indexi: " + kelime.charAt(i));
			
		}
        
        
        
        
        
        
        
	}

}
