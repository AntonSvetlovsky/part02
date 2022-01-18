/*
 *  Сформировать квадратную матрицу порядка n
 * по заданному образцу(n - четное):
 *  1  1  1 ... 1  1  1
 *  0  1  1 ... 1  1  0
 *  0  0  1 ... 1  0  0
 *  ...................
 *  0  1  1 ... 1  1  0
 *  1  1  1 ... 1  1  1
 */

package by.epam.jonline_introduction.part02;

import java.util.Scanner;

public class Practice020206 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		System.out.println("Введите размер n квадратной матрицы (n - четное)");
		int n = console.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length / 2) {
				for (int j = i; j < (arr[0].length - i); j++) {
					arr[i][j] = 1;
				}
			} else {
				for (int j = (arr[0].length - (i + 1)); j <= i; j++) {
					arr[i][j] = 1;
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
