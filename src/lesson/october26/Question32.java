package lesson.october26;

import java.util.Scanner;

public class Question32 {

	public static void main(String[] args) {

		//Get numbers between 0 and 100 entered from the keyboard from the user. (100 included.)
		//Program that finds the largest and smallest of 5 numbers and prints it on the screen
		
		
		  Scanner scanner = new Scanner(System.in);
	       
	       int smallest = 101;
	        int biggest =-1;
	        int i = 0;
	        while(i<5) {
	            System.out.println("Enter a number between 0 and 100 : ");
	            int num = scanner.nextInt();
	            if(num>biggest) {
	            	biggest=num;
	            }
	            if(num<smallest){
	            	smallest=num;
	            }    
	            i++;
	        }
	        System.out.println("Max : "+biggest+" Min : "+smallest);
		
		
		scanner.close();
		
		
		
		
		
	}

}
