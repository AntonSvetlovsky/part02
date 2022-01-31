/*
 * Даны натуральные числа К и N. Написать метод (методы)
 * формирования массива А, элементами которого являются числа,
 * сумма цифр которых равна К и которые не большее N.
 */

package by.epam.jonline_introduction.part02.decomposition;

import java.util.Scanner;

public class Practice020412 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);

		int k;
		int n;
		System.out.println("Введите натуральные числа K, N");
		k = console.nextInt();
		n = console.nextInt();

		printArray(createArray(k, n));

	}

	public static int calculateSum(int a) {
		int sum = 0;

		while (a != 0) {
			sum += a % 10;
			a = a / 10;
		}
		return sum;
	}

	public static int calculateArraySize(int k, int n) {
		int size = 0;

		for (int i = k; i <= n; i++) {
			if (calculateSum(i) == k) {
				size++;
			}
		}
		return size;
	}

	public static int[] createArray(int k, int n) {
		int[] arr = new int[calculateArraySize(k, n)];
		int index = 0;

		for (int i = k; i <= n; i++) {
			if (calculateSum(i) == k) {
				arr[index] = i;
				index++;
			}
		}
		return arr;
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	}
}
