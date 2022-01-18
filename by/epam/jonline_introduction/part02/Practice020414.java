/*
 * Натуральное число, в записи которого n цифр,
 * называется числом Армстронга, если сумма его цифр,
 * возведенная в степень n, равна самому числу.
 * Найти все числа Армстронга от 1 до k.
 * Для решения задачи использовать декомпозицию.
 */

package by.epam.jonline_introduction.part02;

import java.util.Scanner;

public class Practice020414 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		System.out.println("Введите натуральное число k");
		int k;
		k = console.nextInt();

		printNumbersOfArmstrong(k);
	}

	public static boolean isNumberOfArmstrong(int a) {
		int sum;
		sum = 0;
		int size;
		size = calculateSize(a);
		int num;
		num = a;
		while (num != 0) {
			sum += (int) Math.pow(num % 10, size);
			num = num / 10;
		}
		return sum == a ? true : false;
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

	public static void printNumbersOfArmstrong(int n) {
		for (int i = 1; i <= n; i++) {
			if (isNumberOfArmstrong(i)) {
				System.out.println(i);
			}
		}
	}
}
