package lesson.november9.oopproduct2;

import java.util.Random;

public class GenerateRandomId {
	
	//method
	//rastgele bir id oluşturcak
	//Elimizdeki string id var
	//int oluşturup sonra onu stringe çevirmemiz lazım
	
	public static String generateId() {
		//rastgele bir sayı oluşturcaz
		//oluşturduğumuz sayıyı stringe çevircez
	Random random = new Random();  
	int sayi1 = random.nextInt(1000);
	String sayiStr = String.valueOf(sayi1);
	return sayiStr;
	}
	
	

}
