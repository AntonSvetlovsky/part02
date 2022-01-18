/*
 * Сортировка Шелла. Дан массив n действительных чисел.
 * Требуется упорядочить его по возрастанию. Делается это
 * следующим образом: сравниваются два соседних элемента
 * ai и a(i+1) . Если ai <= a(i+1), то продвигаются на
 * один элемент вперед. Если ai > a(i+1), то производится
 * перестановка и сдвигаются на один элемент назад.
 * Составить алгоритм этой сортировки.
 *
 * Сравнивать и менять будем числа, стоящие через промежуток d
 * друг от друга.
 */

package by.epam.jonline_introduction.part02;

import java.util.Scanner;

public class Practice020306 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		System.out.println("Введите размер массива n");
		int n = console.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * (100 - 1) + 1);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
		for (int i = 0; i < arr.length - 1;) {
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
				if (i != 0) {
					i--;
				}
			} else {
				i++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	}
}
