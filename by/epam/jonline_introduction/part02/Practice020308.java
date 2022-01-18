/*
 * Даны дроби p1/q1, p2/q2, ... , pn/qn (pi, qi - натуральные).
 * Составить программу, которая приводит эти дроби к общему
 * знаменателю и упорядочивает их в порядке возрастания.
 */

package by.epam.jonline_introduction.part02;

import java.util.Scanner;

public class Practice020308 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		System.out.println("Введите количество дробей");
		int n = console.nextInt();
		int[] p = new int[n];
		int[] q = new int[n];

		randomFill(p, 1, 5);
		randomFill(q, 5, 9);

		fractionToConsole(p, q);

		for (int i = 1; i < q.length; i++) {
			int l = lcm(q[i - 1], q[i]);

			for (int j = 0; j <= i; j++) {
				int m = l / q[j];
				q[j] = l;
				p[j] = p[j] * m;
			}

		}

		insertionSort(p);

		fractionToConsole(p, q);
	}

	public static void randomFill(int[] arr, int min, int max) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * (max - min) + min);
		}
	}

	public static void fractionToConsole(int[] numerator, int[] denominator) {
		for (int i = 0; i < numerator.length; i++) {
			System.out.print(numerator[i] + "/" + denominator[i] + "   ");
		}
		System.out.println();
	}

	public static int gcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	public static int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}

	public static void insertionSort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0 && arr[j - 1] > arr[j]; j--) {
				int temp = arr[j - 1];
				arr[j - 1] = arr[j];
				arr[j] = temp;
			}
		}
	}
}
