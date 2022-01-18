/*
 *  Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
 */

package by.epam.jonline_introduction.part02;

import java.util.Scanner;

public class Practice020213 {
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
		for (int j = 0; j < arr[0].length; j++) {
			for (int i = 0; i < arr.length; i++) {
				int max = i;
				for (int k = i; k < arr.length; k++) {
					if (arr[k][j] > arr[max][j]) {
						max = k;
					}
				}
				int temp = arr[max][j];
				arr[max][j] = arr[i][j];
				arr[i][j] = temp;
			}
		}
		System.out.println();
		printToConsole(arr);
		for (int j = 0; j < arr[0].length; j++) {
			for (int i = 0; i < arr.length; i++) {
				int min = i;
				for (int k = i; k < arr.length; k++) {
					if (arr[k][j] < arr[min][j]) {
						min = k;
					}
				}
				int temp = arr[min][j];
				arr[min][j] = arr[i][j];
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
