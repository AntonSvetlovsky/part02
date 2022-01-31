/*
 * Найти все натуральные n-значные числа, цифры в которых образуют
 * строго возрастающую последовательность (например, 1234, 5789).
 * Для решения задачи использовать декомпозицию.
 */

package by.epam.jonline_introduction.part02.decomposition;

import java.util.Scanner;

public class Practice020415 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);

		int n;
		System.out.println("Введите n");
		n = console.nextInt();

		System.out.println(
				"Натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность :");
		printIncreaseNumbers(n);
	}

	public static void printIncreaseNumbers(int n) {
		int min;
		int max;
		int[] array = new int[n];

		min = (int) Math.pow(10, (n - 1));
		max = (int) Math.pow(10, n) - 1;

		for (int i = min; i <= max; i++) {
			array = createArrayOfDigits(i, n);
			if (isArrayIncrease(array)) {
				System.out.println(i);
			}
		}
	}

	public static int[] createArrayOfDigits(int a, int size) {
		int[] d = new int[size];

		for (int i = d.length - 1; i >= 0; i--) {
			d[i] = a % 10;
			a = a / 10;
		}

		return d;
	}

	public static boolean isArrayIncrease(int[] array) {
		boolean flag;
		int i = 1;
		flag = true;

		while (i < array.length) {
			if (array[i] <= array[i - 1]) {
				flag = false;
				break;
			} else {
				i++;
			}
		}

		return flag;
	}
}
