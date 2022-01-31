/*
 * Сортировка выбором. Дана последовательность чисел. Требуется
 * переставить элементы так, чтобы они были расположены по убыванию.
 * Для этого в массиве, начиная с первого, выбирается наибольший элемент и
 * ставится на первое место, а первый - на место наибольшего.
 * Затем, начиная со второго, эта процедура повторяется.
 * Написать алгоритм сортировки выбором.
 */

package by.epam.jonline_introduction.part02.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Practice020303 {
	public static void main(String[] args) {
		int n;

		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);

		System.out.println("Введите размер массива n (n < 100)");
		n = console.nextInt();

		int[] arr = new int[n];
		int k = 1;
		int m;
		while (k < arr.length) {
			m = (int) (Math.random() * (1000 - 1) + 1);
			if (m >= arr[k - 1]) {
				arr[k] = m;
				k++;
			}
		}
		System.out.println(Arrays.toString(arr));

		int x;
		for (int i = 0; i < arr.length; i++) {
			x = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] > arr[x]) {
					x = j;
				}
			}
			int temp = arr[x];
			arr[x] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
