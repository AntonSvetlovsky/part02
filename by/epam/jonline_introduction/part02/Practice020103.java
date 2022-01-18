/*
 * Дан массив действительных чисел, размерность которого N.
 * Подсчитать, сколько в нем отрицательных, положительных
 * и нулевых элементов.
 */

package by.epam.jonline_introduction.part02;

import java.util.Arrays;
import java.util.Scanner;

public class Practice020103 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		System.out.println("Введите размерность массива");
		int n = console.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * (100 + 100) - 100);
		}
		System.out.println(Arrays.toString(arr));
		int pos = 0;
		int neg = 0;
		int nll = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				pos++;
			} else if (arr[i] < 0) {
				neg++;
			} else {
				nll++;
			}
		}
		System.out.println("Количество положительных элементов = " + pos);
		System.out.println("Количество отрицательных элементов = " + neg);
		System.out.println("Количество нулевых элементов = " + nll);

	}
}
