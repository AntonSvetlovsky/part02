/*
 * Даны две неубывающие последовательности. Образовать из них новую
 * последовательность чисел так, чтобы она тоже была неубывающей.
 * Примечание. Дополнительный массив не использовать.
 */

package by.epam.jonline_introduction.part02.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Practice020302 {
	public static void main(String[] args) {
		int n;
		int m;

		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);

		System.out.println("Введите размеры последовательностей n, m");
		n = console.nextInt();
		m = console.nextInt();

		int[] a = new int[n];
		int[] b = new int[m];
		increaseFill(a);
		increaseFill(b);
		arrayToConsole(a);
		arrayToConsole(b);
		int[] c = new int[n + m];
		int x = 0;
		int y = 0;
		for (int i = 0; i < c.length; i++) {
			if (x != a.length && y != b.length) {
				if (a[x] < b[y]) {
					c[i] = a[x];
					x++;
				} else {
					c[i] = b[y];
					y++;
				}
			} else if (x == a.length) {
				c[i] = b[y];
				y++;
			} else {
				c[i] = a[x];
				x++;
			}
		}
		arrayToConsole(c);
	}

	public static void increaseFill(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * (100 - 1) + 1);
		}
		Arrays.sort(arr);
	}

	public static void arrayToConsole(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	}
}
