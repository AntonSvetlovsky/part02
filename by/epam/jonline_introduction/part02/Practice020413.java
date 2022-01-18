/*
 * Два простых числа называются «близнецами», если они отличаются
 * друг от друга на 2 (например, 41 и 43). Найти и напечатать все пары
 * «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
 * Для решения задачи использовать декомпозицию.
 */

package by.epam.jonline_introduction.part02;

import java.util.Scanner;

public class Practice020413 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		System.out.println("Введите нтуральное число, больше 2");
		int n;
		n = console.nextInt();

		searchPrimeTwins(n);
	}

	public static void searchPrimeTwins(int n) {
		for (int i = n + 2; i <= n * 2; i++) {
			if (isPrime(i) && isPrime(i - 2)) {
				System.out.println((i - 2) + ", " + i);
			}
		}
	}

	public static boolean isPrime(int x) {
		int i;
		i = 2;
		int n;
		boolean flag = true;
		if (x <= 1) {
			flag = false;
		} else if (x == 2) {
			flag = true;
		} else {
			while (i < x / 2) {
				n = x % i;
				if (n == 0) {
					flag = false;
					break;
				}
				i++;
			}
		}
		return flag;
	}
}
