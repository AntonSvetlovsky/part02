/*
 * Сформировать квадратную матрицу порядка N по правилу:
 * A[I,J] = sin((I^2-J^2)/N)
 * и подсчитать количество положительных элементов в ней.
 */

package by.epam.jonline_introduction.part02.n_dimensional_array;

import java.util.Scanner;

public class Practice020207 {
	public static void main(String[] args) {
		int n;

		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);

		System.out.println("Введите размер n квадратной матрицы");
		n = console.nextInt();

		double[][] arr = new double[n][n];
		int q = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < (arr[0].length); j++) {
				arr[i][j] = Math.sin((i * i - j * j) / (double) n);
				if (arr[i][j] > 0) {
					q++;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Количество положительных элементов = " + q);
	}
}
