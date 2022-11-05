package lesson.november2;

import java.util.Iterator;

public class Question56 {

	public static void main(String[] args) {

		// verilen dizide rakamların farkının en az olduğu sayıların farkı

		// Abdulkadirin çözümü

		int[] array = { 1, 5, -4, 3 };

		// int mutlakDeger = Math.abs(-7);
		// System.out.println(mutlakDeger);

		int min = Integer.MAX_VALUE;
		int m = 0;
		int n = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i != j) {
					if (Math.abs(array[i] - array[j]) < min) {
						min = Math.abs(array[i] - array[j]);
						m = i;
						n = j;
					}
				}
			}

		}
		System.out.println("Farkın en küçük olduğu indexler: " + m + " ve " + n + " farkımız: " + min);

		System.out.println("\n******************************");

		// Hocanın çözümü

		int min1 = Integer.MAX_VALUE;

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				int fark = Math.abs(array[i] - array[j]);
				if (fark < min1) {
					min1 = fark;
				}
			}

		}
		System.out.println(min1);

	}

}
