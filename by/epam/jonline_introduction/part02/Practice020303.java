/*
 * Сортировка выбором. Дана последовательность чисел. Требуется
 * переставить элементы так, чтобы они были расположены по убыванию.
 * Для этого в массиве, начиная с первого, выбирается наибольший элемент и
 * ставится на первое место, а первый - на место наибольшего.
 * Затем, начиная со второго, эта процедура повторяется.
 * Написать алгоритм сортировки выбором.
 */

package by.epam.jonline_introduction.part02;

import java.util.Arrays;
import java.util.Scanner;

public class Practice020303 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		System.out.println("Введите размер массива n (n < 100)");
		int n = console.nextInt();
		int[] arr = new int[n];
		int k = 1;
		while (k < arr.length) {
			int m = (int) (Math.random() * (1000 - 1) + 1);
			if (m >= arr[k - 1]) {
				arr[k] = m;
				k++;
			}
		}
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			int x = i;
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
