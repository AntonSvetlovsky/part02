/*
 * Сформировать квадратную матрицу порядка n
 * по заданному образцу(n - четное):
 *  1   2    3  ... n
 *  n  n-1  n-2 ... 1
 *  1   2    3  ... n
 *  n  n-1  n-2 ... 1
 *  .................
 *  n  n-1  n-2 ... 1
 */

package by.epam.jonline_introduction.part02.n_dimensional_array;

import java.util.Scanner;

public class Practice020204 {
	public static void main(String[] args) {
		int n;

		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);

		System.out.println("Введите размер n квадратной матрицы (n - четное)");
		n = console.nextInt();

		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (i % 2 == 0) {
					arr[i][j] = j + 1;
				} else {
					arr[i][j] = arr.length - j;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
