/*
 * В массиве целых чисел с количеством элементов n найти наиболее
 * часто встречающееся число. Если таких чисел несколько,
 * то определить наименьшее из них.
 */

package by.epam.jonline_introduction.part02.one_dimensional_array;

import java.util.Arrays;
import java.util.Scanner;

public class Practice020109 {
	public static void main(String[] args) {
		int n;

		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);

		System.out.println("Введите размерность массива");
		n = console.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * (6 - 1) + 1);
		}
		System.out.println(Arrays.toString(arr));

		int[][] fr = new int[2][n];
		int k = 0;
		int m;
		boolean flag;

		for (int i = 0; i < arr.length; i++) {
			flag = true;
			m = 0;
			while (m < k) {
				flag = arr[i] != fr[0][m];
				if (!flag) {
					break;
				}
				m++;
			}
			if (flag) {
				fr[0][k] = arr[i];
				for (int j = 0; j < arr.length; j++) {
					if (arr[j] == fr[0][k]) {
						fr[1][k]++;
					}
				}
				k++;
			}
		}
		System.out.println(Arrays.deepToString(fr));

		for (int i = 0; i < fr[0].length; i++) {
			m = i;
			for (int j = i; j < fr[0].length; j++) {
				if (fr[1][j] > fr[1][m]) {
					m = j;
				}
			}
			int temp = fr[1][m];
			int tempN = fr[0][m];
			fr[1][m] = fr[1][i];
			fr[0][m] = fr[0][i];
			fr[1][i] = temp;
			fr[0][i] = tempN;
		}
		System.out.println(Arrays.deepToString(fr));
		int h = 0;
		int min = fr[0][0];
		while (fr[1][0] == fr[1][h]) {
			if (fr[0][h] < min) {
				min = fr[0][h];
			}
			h++;
		}
		System.out.println("Наименьшее из наиболее часто повторяющихся чисел = " + min);
	}
}
