/*
 * В числовой матрице поменять местами два любых столбца,
 * т. е. все элементы одного столбца поставить на соответствующие им
 * позиции другого, а элементы второго переместить в первый.
 * Номера столбцов вводит пользователь с клавиатуры
 */

package by.epam.jonline_introduction.part02.n_dimensional_array;

import java.util.Scanner;

public class Practice020208 {
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

		int a;
		int b;

		System.out.println("Введите номера столбцов для замены a, b(учитывая размерность матрицы)");
		a = console.nextInt();
		b = console.nextInt();

		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i][a];
			arr[i][a] = arr[i][b];
			arr[i][b] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
