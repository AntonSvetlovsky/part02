/*
 * Из заданного числа вычли сумму его цифр.
 * Из результата вновь вычли сумму его цифр и т.д.
 * Сколько таких действий надо произвести, чтобы получился нуль?
 * Для решения задачи использовать декомпозицию.
 */

package by.epam.jonline_introduction.part02;

import java.util.Scanner;

public class Practice020417 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		int n;
		int q;
		int temp;

		System.out.println("Введите число n");
		n = console.nextInt();
		q = 0;
		temp = n;

		while (temp > 0) {
			temp = temp - countSumOfDigits(createArrayOfDigits(temp));
			q++;
		}

		System.out.println("Количество операций = " + q);
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

	public static int[] createArrayOfDigits(int a) {
		int[] d = new int[calculateSize(a)];

		for (int i = d.length - 1; i >= 0; i--) {
			d[i] = a % 10;
			a = a / 10;
		}

		return d;
	}

	public static int countSumOfDigits(int[] array) {
		int sum;
		sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		return sum;
	}
}
