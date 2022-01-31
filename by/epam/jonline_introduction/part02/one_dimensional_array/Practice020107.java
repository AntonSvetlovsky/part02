/*
 * Даны действительные числа a(1),a(2),...,a(2n).
 * Найти max(a(1) + a(2n), a2 + a(2n-1), ..., a(n) + a(n+1))
 */

package by.epam.jonline_introduction.part02.one_dimensional_array;

import java.util.Arrays;
import java.util.Scanner;

public class Practice020107 {
	public static void main(String[] args) {
		int n;
		double sum;

		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);

		System.out.println("Введите n");
		n = console.nextInt();

		double[] arr = new double[n * 2];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (Math.random() * (100 - 1) + 1);
		}
		System.out.println(Arrays.toString(arr));

		double max = arr[0] + arr[arr.length - 1];
		for (int i = 1; i < arr.length / 2; i++) {
			sum = arr[i] + arr[arr.length - (i + 1)];
			if (sum > max) {
				max = sum;
			}
		}
		System.out.println("Максимум сумм = " + max);
	}
}
