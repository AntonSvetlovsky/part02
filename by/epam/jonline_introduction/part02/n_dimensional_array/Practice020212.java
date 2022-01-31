/*
 * Отсортировать строки матрицы по возрастанию и убыванию значений элементов
 */

package by.epam.jonline_introduction.part02.n_dimensional_array;

import java.util.Scanner;

public class Practice020212 {
	public static void main(String[] args) {
		int n;
		int m;
		int max;
		int min;

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
		printToConsole(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				max = j;
				for (int k = j; k < arr[0].length; k++) {
					if (arr[i][k] > arr[i][max]) {
						max = k;
					}
				}
				int temp = arr[i][max];
				arr[i][max] = arr[i][j];
				arr[i][j] = temp;
			}
		}
		System.out.println();
		printToConsole(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				min = j;
				for (int k = j; k < arr[0].length; k++) {
					if (arr[i][k] < arr[i][min]) {
						min = k;
					}
				}
				int temp = arr[i][min];
				arr[i][min] = arr[i][j];
				arr[i][j] = temp;
			}
		}
		System.out.println();
		printToConsole(arr);
	}

	public static void printToConsole(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
