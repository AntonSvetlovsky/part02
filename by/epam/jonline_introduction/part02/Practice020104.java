/*
 * Даны действительные числа а1 ,а2 ,..., аn .
 * Поменять местами наибольший и наименьший элементы.
 */

package by.epam.jonline_introduction.part02;

import java.util.Arrays;
import java.util.Scanner;

public class Practice020104 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		System.out.println("Введите размерность массива");
		int n = console.nextInt();
		double[] arr = new double[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Math.random() * (100 - 1) + 1;
		}
		System.out.println(Arrays.toString(arr));
		int max = 0;
		int min = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[max]) {
				max = i;
			}
			if (arr[i] < arr[min]) {
				min = i;
			}
		}
		double temp = arr[max];
		arr[max] = arr[min];
		arr[min] = temp;
		System.out.println("Замена максимального и минимального элемента");
		System.out.println(Arrays.toString(arr));
	}
}
