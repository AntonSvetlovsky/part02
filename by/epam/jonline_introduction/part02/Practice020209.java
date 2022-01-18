/*
 * Задана матрица неотрицательных чисел.
 * Посчитать сумму элементов в каждом столбце.
 * Определить, какой столбец содержит максимальную сумму.
 */

package by.epam.jonline_introduction.part02;

import java.util.Arrays;
import java.util.Scanner;

public class Practice020209 {
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
		int[] sum = new int[m];
		int max = 0;
		for (int j = 0; j < arr[0].length; j++) {
			for (int i = 0; i < arr.length; i++) {
				sum[j] += arr[i][j];
			}
			if (sum[j] > sum[max]) {
				max = j;
			}
		}
		System.out.println("Суммы элементов по столбцам");
		System.out.println(Arrays.toString(sum));
		System.out.println("№ столбца с максимальной суммой = " + max);
	}
}
