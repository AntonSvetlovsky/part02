/*
 * Дана последовательность целых чисел a1,a2,...,an.
 * Образовать новую последовательность, выбросив из исходной те члены,
 * которые равны min(a1,a2,...,an).
 */

package by.epam.jonline_introduction.part02.one_dimensional_array;

import java.util.Arrays;
import java.util.Scanner;

public class Practice020108 {
	public static void main(String[] args) {
		int n;
		int min;
		int q = 0;
		
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		
		System.out.println("Введите размерность массива");
		n = console.nextInt();
		
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * (6 - 1) + 1);
		}
		System.out.println(Arrays.toString(arr));
		
		min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == min) {
				q++;
			}
		}
		
		int j = 0;
		int[] arrWithoutMin = new int[arr.length - q];
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > min) {
				arrWithoutMin[j] = arr[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(arrWithoutMin));
	}
}
