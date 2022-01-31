/*
 * Задана последовательность N вещественных чисел.
 * Вычислить сумму чисел, порядковые номера которых
 * являются простыми числами.
 */

package by.epam.jonline_introduction.part02.one_dimensional_array;

import java.util.Arrays;
import java.util.Scanner;

public class Practice020106 {

	public static boolean isPrime(int x) {
		int i = 2;
		int n;
		boolean flag = true;
		if (x <= 1) {
			flag = false;
		} else if (x == 2) {
			flag = true;
		} else {
			while (i <= x / 2) {
				n = x % i;
				if (n == 0) {
					flag = false;
					break;
				}
				if (i == x / 2 && n != 0) {
					flag = true;
				}
				i++;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		int n;
		double sum = 0;

		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);

		System.out.println("Введите размерность массива");
		n = console.nextInt();

		double[] arr = new double[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Math.random() * (100 - 1) + 1;
		}
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			if (isPrime(i)) {
				sum += arr[i];
			}
		}
		System.out.println("Сумма элементов, порядковые номера которых являются простыми числами = " + sum);
	}
}
