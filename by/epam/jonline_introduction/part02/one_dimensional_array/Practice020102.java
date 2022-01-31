/*
 * Дана последовательность действительных чисел а1 ,а2 ,..., аn.
 * Заменить все ее члены, большие данного Z, этим числом.
 * Подсчитать количество замен.
 */

package by.epam.jonline_introduction.part02.one_dimensional_array;

import java.util.Arrays;
import java.util.Scanner;

public class Practice020102 {
	public static void main(String[] args) {
		int n;
		int z;
		int q;

		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);

		System.out.println("Введите размерность массива");
		n = console.nextInt();
		System.out.println("Введите число z");
		z = console.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * (100 - 1) + 1);
		}
		System.out.println(Arrays.toString(arr));
		q = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > z) {
				arr[i] = z;
				q++;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Количество замен = " + q);
	}
}
