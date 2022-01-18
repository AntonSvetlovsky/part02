/*
 * Пусть даны две неубывающие последовательности действительных
 * чисел a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm. Требуется
 * указать те места, на которые нужно вставлять элементы
 * последовательности b1 <= b2 <= ... <= bm в первую последовательность
 * так, чтобы новая последовательность оставалась возрастающей.
 */

package by.epam.jonline_introduction.part02;

import java.util.Arrays;
import java.util.Scanner;

public class Practice020307 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		System.out.println("Введите размеры последовательностей n, m");
		int n = console.nextInt();
		int m = console.nextInt();
		int[] a = new int[n];
		int[] b = new int[m];
		increaseFill(a);
		increaseFill(b);
		arrayToConsole(a);
		arrayToConsole(b);

		int[] place = new int[b.length];

		for (int i = 0; i < b.length; i++) {
			place[i] = binSearch(a, 0, a.length - 1, b[i]);
		}
		arrayToConsole(place);

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

	public static int binSearch(int[] a, int first, int last, int num) {
		while (first <= last) {
			int mid = (first + last) / 2;
			if (num > a[mid]) {
				first = mid + 1;
			} else {
				last = mid - 1;
			}
		}
		return first;
	}
}
