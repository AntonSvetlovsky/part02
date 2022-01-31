/*
 * Написать метод(методы) для нахождения наибольшего общего
 * делителя четырех натуральных чисел.
 */

package by.epam.jonline_introduction.part02.decomposition;

import java.util.Scanner;

public class Practice020402 {
	public static void main(String[] args) {
		int[] arr = new int[4];

		arrayFill(arr);

		System.out.print("Наибольший общий делитель = ");
		System.out.println(arrayGcd(arr));
	}

	public static void arrayFill(int[] array) {
		System.out.println("Введите " + array.length + " целых числа:");

		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {
			array[i] = console.nextInt();
		}
	}

	public static int gcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	public static int arrayGcd(int[] array) {
		int d;
		d = gcd(array[0], array[1]);
		for (int i = 2; i < array.length; i++) {
			if (d > gcd(array[i], array[i - 1])) {
				d = gcd(array[i], array[i - 1]);
			}
		}
		return d;
	}
}
