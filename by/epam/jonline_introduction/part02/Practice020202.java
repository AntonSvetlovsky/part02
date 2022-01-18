/*
 * Дана квадратная матрица.
 * Вывести на экран элементы, стоящие на диагонали.
 */

package by.epam.jonline_introduction.part02;

import java.util.Scanner;

public class Practice020202 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		System.out.println("Введите размер n квадратной матрицы");
		int n = console.nextInt();
		int[][] arr = new int[n][n];
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
			System.out.println(arr[i][i]);
		}
	}
}
