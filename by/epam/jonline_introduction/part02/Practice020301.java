/*
 * Заданы два одномерных массива с различным количеством элементов
 * и натуральное число k. Объединить их в один массив, включив
 * второй массив между k-м и (k+1) - м элементами первого,
 * при этом не используя дополнительный массив.
 */

package by.epam.jonline_introduction.part02;

import java.util.Scanner;

public class Practice020301 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		System.out.println("Введите размерности 2-х массивов n и m");
		int n = console.nextInt();
		int m = console.nextInt();
		int[] a = new int[n];
		int[] b = new int[m];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * (100 - 1) + 1);
		}
		for (int i = 0; i < b.length; i++) {
			b[i] = (int) (Math.random() * (100 - 1) + 1);
		}
		System.out.println("Введите число k (k < n)");
		int k = console.nextInt();
		int[] c = new int[a.length + b.length];
		for (int i = 0; i < c.length; i++) {
			if (i <= k) {
				c[i] = a[i];
			} else if (i > k && i < k + 1 + b.length) {
				c[i] = b[i - k - 1];
			} else {
				c[i] = a[i - b.length];
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}
		System.out.println();
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + "  ");
		}
		System.out.println();
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + "  ");
		}
		System.out.println();
	}
}
