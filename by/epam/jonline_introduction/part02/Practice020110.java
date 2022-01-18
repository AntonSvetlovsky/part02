/*
 * Дан целочисленный массив с количеством элементов п.
 * Сжать массив, выбросив из него каждый второй элемент
 * (освободившиеся элементы заполнить нулями).
 * Примечание. Дополнительный массив не использовать.
 */

package by.epam.jonline_introduction.part02;

import java.util.Arrays;
import java.util.Scanner;

public class Practice020110 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		System.out.println("Введите размерность массива");
		int n = console.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * (10 - 1) + 1);
		}
		System.out.println(Arrays.toString(arr));
		for (int i = 1; i <= arr.length / 2; i++) {
			for (int j = i; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[arr.length - 1] = 0;
		}
		System.out.println(Arrays.toString(arr));
	}
}
