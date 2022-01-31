/*
 * В массив A [N] занесены натуральные числа.
 * Найти сумму тех элементов, которые кратны данному К.
 */

package by.epam.jonline_introduction.part02.one_dimensional_array;

import java.util.Scanner;

public class Practice020101 {
	public static void main(String[] args) {
		int n;
		int k;
		int sum;

		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);

		System.out.println("Введите размерность массива");
		n = console.nextInt();
		System.out.println("Введите k");
		k = console.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * (100 - 1) + 1);
			System.out.print(arr[i] + " ");
		}
		sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % k == 0) {
				sum += arr[i];
			}
		}
		System.out.println("Сумма элементов, кратных k = " + sum);
	}
}
