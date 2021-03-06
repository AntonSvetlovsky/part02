/*
 * Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
 * причем в каждом столбце число единиц равно номеру столбца.
 */

package by.epam.jonline_introduction.part02.n_dimensional_array;

import java.util.Scanner;

public class Practice020214 {
	public static void main(String[] args) {
		int n;
		int m;
		int q;
		int ran;

		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);

		System.out.println("Введите количество строк n и количество m столбцов матрицы");
		n = console.nextInt();
		m = console.nextInt();

		if (n < m) {
			int tmp = n;
			n = m;
			m = tmp;
		}
		int[][] arr = new int[n][m];
		for (int j = 0; j < arr[0].length; j++) {
			q = 0;
			while (q < j) {
				q = 0;
				ran = (int) (Math.random() * (arr.length - 0) + 0);
				arr[ran][j] = 1;
				for (int i = 0; i < arr.length; i++) {
					if (arr[i][j] == 1) {
						q++;
					}
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
