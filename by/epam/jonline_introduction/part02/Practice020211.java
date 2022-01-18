/*
 * Матрицу 10x20 заполнить случайными числами от 0 до 15.
 * Вывести на экран саму матрицу и номера строк,
 * в которых число 5 встречается три и более раз.
 */

package by.epam.jonline_introduction.part02;

import java.util.Arrays;

public class Practice020211 {
	public static void main(String[] args) {
		int n = 10;
		int m = 20;
		int[][] arr = new int[n][m];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = (int) (Math.random() * (16 - 0) + 0);
			}
		}
		int value = 5;
		boolean[] bool = new boolean[n];
		for (int i = 0; i < arr.length; i++) {
			int q = 0;
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == value) {
					q++;
				}
				System.out.print(arr[i][j] + " ");
			}
			if (q > 2) {
				bool[i] = true;
			}
			System.out.println();
		}
		System.out.println(Arrays.toString(bool));
		System.out.println("Номера строк, в которых число 5 повторяется 3 и более раз:");
		for (int i = 0; i < bool.length; i++) {
			if (bool[i]) {
				System.out.println(i + "  ");
			}
		}
	}
}
