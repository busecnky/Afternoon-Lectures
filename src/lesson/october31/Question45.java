package lesson.october31;

public class Question45 {

	public static void main(String[] args) {


		//dizi içerisinde 2 ve 4 kaç kerek geçtiğini
		//hangisinin daha fazla olduğunu bulan program
		
		//--> 4lerin sayısı daha fazla (adet)
		
		int[] array = {1, 3, 4, 4, 4, 4, 4, 2, 2, 9, 8, 8};
		
		int k=0;
		int j=0;
		
		for (int i=0; i<array.length; i++ ) {
			if (array[i] == 2) {
				k++;
			}
			else if (array[i] == 4) {
				j++;
			}
		}
		System.out.println("Bu listenin içinde 2: " + k + " kere geçiyor.");
		System.out.println("Bu listenin içinde 4: " + j + " kere geçiyor.");
		
			if (k>j) {
				System.out.println("2lerin sayısı 4lerin sayısından fazladır. 2lerin sayısı: " + k);
			}else if (k<j) {
				System.out.println("4lerin sayısı 2lerin sayısından fazladır. 4lerin sayısı: " + j);
			}else {
				System.out.println("4lerin sayısı 2lerin sayısına eşittir. " + j + " kere geçiyor.");
			}
	}

}
