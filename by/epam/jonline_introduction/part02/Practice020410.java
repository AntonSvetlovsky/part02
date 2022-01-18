/*
 * Дано натуральное число N. Написать метод(методы) для
 * формирования массива, элементами которого являются цифры числа N.
 */

package by.epam.jonline_introduction.part02;

import java.util.Scanner;

public class Practice020410 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		System.out.println("Введите натуральное число N");
		int n;
		n = console.nextInt();

		// System.out.println(calculateSize(n));

		arrayToConsole(createDigitArray(n));
	}

	public static int calculateSize(int a) {
		int size;
		size = 0;
		while (a != 0) {
			a = a / 10;
			size++;
		}
		return size;
	}

	public static int[] createDigitArray(int a) {
		int[] d = new int[calculateSize(a)];

		for (int i = d.length - 1; i >= 0; i--) {
			d[i] = a % 10;
			a = a / 10;
		}

		return d;
	}

	public static void arrayToConsole(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	}
}
