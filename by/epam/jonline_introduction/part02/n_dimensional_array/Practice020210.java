/*
 * Найти положительные элементы главной диагонали квадратной матрицы.
 */

package by.epam.jonline_introduction.part02.n_dimensional_array;

import java.util.Scanner;

public class Practice020210 {
	public static void main(String[] args) {
		int n;

		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);

		System.out.println("Введите размер n квадратной матрицы");
		n = console.nextInt();

		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = (int) (Math.random() * (10 + 10) - 10);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println("Положительные элементы главной диагонали квадратной матрицы:");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i][i] > 0) {
				System.out.print(arr[i][i] + "  ");
			}
		}
	}
}
