/*
 * Найдите наибольший элемент матрицы и заменить
 * все нечетные элементы на него.
 */

package by.epam.jonline_introduction.part02;

import java.util.Scanner;

public class Practice020215 {
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
		printToConsole(arr);
		System.out.println();
		int x = 0;
		int y = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] > arr[x][y]) {
					x = i;
					y = j;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] % 2 != 0) {
					arr[i][j] = arr[x][y];
				}
			}
		}
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
