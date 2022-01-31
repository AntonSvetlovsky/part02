/*
 * Сформировать квадратную матрицу порядка n
 * по заданному образцу(n - четное):
 *   1   1   1  ...  1   1   1
 *   2   2   2  ...  2   2   0
 *   3   3   3  ...  3   0   0
 *  ..........................
 *   n  0   0   0   0   0   0
 */

package by.epam.jonline_introduction.part02.n_dimensional_array;

import java.util.Scanner;

public class Practice020205 {
	public static void main(String[] args) {
		int n;

		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);

		System.out.println("Введите размер n квадратной матрицы (n - четное)");
		n = console.nextInt();

		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < (arr[0].length - i); j++) {
				arr[i][j] = i + 1;
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
