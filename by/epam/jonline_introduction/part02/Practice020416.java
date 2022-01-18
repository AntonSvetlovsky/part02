/*
 * Написать программу, определяющую сумму n - значных чисел, содержащих
 * только нечетные цифры. Определить также, сколько четных цифр в
 * найденной сумме. Для решения задачи использовать декомпозицию.
 */

package by.epam.jonline_introduction.part02;

import java.util.Scanner;

public class Practice020416 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		System.out.println("Введите число n");

		int n;
		int sum;
		int numOfEven;
		int numOfOdd;

		n = console.nextInt();

		sum = countSumWithOddDigits(n);
		numOfOdd = countOddDigits(createArrayOfDigits(sum));
		numOfEven = calculateSize(sum) - numOfOdd;

		System.out.println("Сумма n-значных чисел, содержащих только нечетные цифры = " + sum);
		System.out.println("Количество четных цифр в сумме = " + numOfEven);
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

	public static int[] createArrayOfDigits(int a, int size) {
		int[] d = new int[size];

		for (int i = d.length - 1; i >= 0; i--) {
			d[i] = a % 10;
			a = a / 10;
		}

		return d;
	}

	public static int countOddDigits(int[] array) {
		int k;
		k = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				k++;
			}
		}

		return k;
	}

	public static int countSumWithOddDigits(int n) {
		int min;
		int max;
		int sum;
		int[] array = new int[n];

		min = (int) Math.pow(10, (n - 1));
		max = (int) Math.pow(10, n) - 1;
		sum = 0;

		for (int i = min; i <= max; i++) {
			array = createArrayOfDigits(i, n);
			if (countOddDigits(array) == n) {
				sum += i;
			}
		}

		return sum;
	}
}
