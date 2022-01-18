/*
 * Дана матрица. Вывести на экран все нечетные столбцы,
 * у которых первый элемент больше последнего.
 */

package by.epam.jonline_introduction.part02;

import java.util.Scanner;

public class Practice020201 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		System.out.println("Введите количество строк n и количество m столбцов матрицы");
		int n = console.nextInt();
		int m = console.nextInt();
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
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if ((j % 2 != 0) && (arr[0][j] > arr[(arr.length - 1)][j])) {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}
