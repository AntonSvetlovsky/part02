/*
 * Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */

package by.epam.jonline_introduction.part02.n_dimensional_array;

import java.util.Scanner;

public class Practice020203 {
	public static void main(String[] args) {
		int n;
		int m;

		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);

		System.out.println("Введите количество строк n и количество m столбцов матрицы");
		n = console.nextInt();
		m = console.nextInt();

		int[][] arr = new int[n][m];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = (int) (Math.random() * (10 - 1) + 1);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		int k;
		int p;
		System.out.println("Введите строку k и столбец p для вывода");
		k = console.nextInt();
		p = console.nextInt();

		for (int i = 0; i < arr[0].length; i++) {
			System.out.print(arr[k][i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i][p]);
		}
	}
}
