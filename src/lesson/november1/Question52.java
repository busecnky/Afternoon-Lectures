package lesson.november1;

public class Question52 {
	public static void main(String[] args) {
		
		//Tek sayıları ayrı bir diziye yazdıran kod
		// 23 231 5 21 33 67 189 35 89
		String bosluk = " ";
		int[][] matris = { { 56, 23, 678, 231, 5 }, { 234, 21, 78, 26, 6 }, { 654, 33, 32, 67, 2 },{ 189, 35, 56, 89, 8 }};
		
		int[] tekSayilar = new int[matris.length * matris[0].length];
		
		int index = 0;
		for (int i = 0; i <  matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				if(matris[i][j] %2 != 0) {
				tekSayilar[index] = matris[i][j];       //tekSayilar[i] olunca i for loopuna girince 0 olunca sıkıntı 
				index++;								//oluyordu o yüzden index tanımladık.
				System.out.print(tekSayilar[i] + bosluk);
				}
			}
		}
		
		
		
		
		
		
		
		
	}

}
