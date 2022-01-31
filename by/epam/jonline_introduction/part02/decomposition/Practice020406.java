/*
 * Написать метод(методы), проверяющий,
 * являются ли данные три числа взаимно простыми.
 *
 * Целые числа взаимно просты, если их наибольший
 * общий делитель (НОД) равен 1
 */

package by.epam.jonline_introduction.part02.decomposition;

import java.util.Scanner;

public class Practice020406 {
	public static void main(String[] args) {
		int[] arr = new int[3];

		arrayFill(arr);

		if (coprimeIntegers(arr)) {
			System.out.println("Числа являются взаимно простыми");
		} else {
			System.out.println("Числа не являются взаимно простыми");
		}
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

	public static boolean coprimeIntegers(int[] array) {
		int d;
		d = gcd(array[0], array[1]);
		for (int i = 2; i < array.length; i++) {
			if (d > gcd(array[i], array[i - 1])) {
				d = gcd(array[i], array[i - 1]);
			}
		}
		return d == 1 ? true : false;
	}

}
