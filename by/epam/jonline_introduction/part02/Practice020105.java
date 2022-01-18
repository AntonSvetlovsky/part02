/*
 * Даны целые числа а1 ,а2 ,..., аn .
 * Вывести на печать только те числа, для которых аi > i.
 */

package by.epam.jonline_introduction.part02;

import java.util.Arrays;
import java.util.Scanner;

public class Practice020105 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		System.out.println("Введите размерность массива");
		int n = console.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * (100 - 1) + 1);
		}
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > i) {
				System.out.print(arr[i] + "  ");
			}
		}
	}
}
