/*
 * Задан массив D. Определить следующие суммы:
 * D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
 * Пояснение. Составить метод(методы) для вычисления суммы трех
 * последовательно расположенных элементов массива с номерами от k до m.
 */

package by.epam.jonline_introduction.part02;

import java.util.Scanner;

public class Practice020408 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		System.out.println("Введите размер массива n");
		int n;
		n = console.nextInt();

		int[] d = new int[n];
		randomFill(d, 1, 100);
		arrayToConsole(d);

		System.out.println("D[1] + D[2] + d[3] = " + sumNum(d, 0, 2));
		System.out.println("D[3] + D[4] + d[5] = " + sumNum(d, 2, 4));
		System.out.println("D[4] + D[5] + d[6] = " + sumNum(d, 3, 5));
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

	public static int sumNum(int[] arr, int first, int last) {
		int sum;
		sum = 0;
		for (int i = first; i <= last; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
