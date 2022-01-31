/*
 * Написать метод(методы), определяющий, в каком из
 * данных двух чисел больше цифр.
 */

package by.epam.jonline_introduction.part02.decomposition;

import java.util.Scanner;

public class Practice020411 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);

		int a;
		int b;
		System.out.println("Введите 2 натуральных числа A, B");
		a = console.nextInt();
		b = console.nextInt();

		compareQuantityDigits(a, b);
	}

	public static int calculateSize(int a) {
		int size = 0;

		while (a != 0) {
			a = a / 10;
			size++;
		}
		return size;
	}

	public static void compareQuantityDigits(int a, int b) {
		if (calculateSize(a) > calculateSize(b)) {
			System.out.println("В первом числе цифр больше");
		} else if (calculateSize(a) < calculateSize(b)) {
			System.out.println("Во втором числе цифр больше");
		} else {
			System.out.println("Количество цифр в этих числах равное");
		}
	}
}
