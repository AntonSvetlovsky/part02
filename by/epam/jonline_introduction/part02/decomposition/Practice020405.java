/*
 * Составить программу, которая в массиве A[N] находит второе
 * по величине число (вывести на печать число, которое меньше
 * максимального элемента массива, но больше всех других элементов).
 */

package by.epam.jonline_introduction.part02.decomposition;

import java.util.Scanner;

public class Practice020405 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);

		int n;
		System.out.println("Введите размерность массива n");
		n = console.nextInt();

		int[] array = new int[n];

		randomFill(array, 1, 50);
		arrayToConsole(array);

		System.out.println("Второе по величине число массива = " + array[secondMaxSearch(array)]);
	}

	public static void randomFill(int[] arr, int min, int max) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * (max - min) + min);
		}
	}

	public static void arrayToConsole(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	}

	public static int secondMaxSearch(int[] arr) {
		int max;
		int secondMax;
		if (arr[0] > arr[1]) {
			max = 0;
			secondMax = 1;
		} else {
			max = 1;
			secondMax = 0;
		}
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] > arr[max]) {
				secondMax = max;
				max = i;
			}
			if (arr[i] > arr[secondMax] && arr[i] < arr[max]) {
				secondMax = i;
			}
		}
		return secondMax;
	}
}
