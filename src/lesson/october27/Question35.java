package lesson.october27;

public class Question35 {

	public static void main(String[] args) {

		//Java
		//Spring
		//Postgre
		//React
		
		//her virgülden öncesini aşağı satıra yazan program
		//substring
		
		String string = "Java,Spring,Postgre,React";
	
		//Hocanın substringli çözümü
		
		int index = 0;
		for(int i = 0 ; i < (string.length()) ; i++) {
			
			if(string.charAt(i) == ',') {
				 System.out.println(string.substring(index, i));
				 index = i +1;
			 } 
		}
		
		System.out.println(string.substring(index));
		
		
		
		
		
		
		/* Hocanın charAt li çözümü
		 
		for(int i = 0 ; i < (string.length()) ; i++) {
			 if(string.charAt(i) == ',') {
				 System.out.println();
			 } else {
					 System.out.print(string.charAt(i));
				 }
		 }
			 
			*/
		
		
		
		
			
		

		
		/*
		//charAt li çözüm
		
		for(int i = 0 ; i < string.length() ; i++) {
			
			System.out.print(string.charAt(i));
			
			if(string.charAt(i) == ',') {
				System.out.println();
			}
		*/
	
		
	}
}

