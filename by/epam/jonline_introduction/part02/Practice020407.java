/*
 * Написать метод(методы) для вычисления суммы факториалов
 * всех нечетных чисел от 1 до 9.
 */

package by.epam.jonline_introduction.part02;

public class Practice020407 {
	public static void main(String[] args) {
		int n;
		n = 9;
		int[] arr = new int[n];

		arrayFill(arr);
		arrayToConsole(arr);

		System.out.println("Сумма факториалов нечетных чисел = " + sum(arr));
	}

	public static void arrayFill(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}
	}

	public static void arrayToConsole(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
		System.out.println();
	}

	public static boolean oddNumber(int num) {
		return num % 2 != 0 ? true : false;
	}

	public static int factorial(int num) {
		int f = 1;
		for (int i = 1; i <= num; i++) {
			f *= i;
		}
		return f;
	}

	public static int sum(int[] array) {
		int s;
		s = 0;
		for (int i = 0; i < array.length; i++) {
			if (oddNumber(array[i])) {
				s += factorial(array[i]);
			}
		}
		return s;
	}
}
