/*
 * Сортировка вставками. Дана последовательность чисел
 * a1, a2, ..., an. Требуется переставить числа в порядке возрастания.
 * Делается это следующим образом. Пусть a1, a2, ..., ai -
 * упорядоченная последовательность, т. е. a1 <= a2 <= ... <= an.
 * Берется следующее число ai + 1 и вставляется в последовательность так,
 * чтобы новая последовательность была тоже возрастающей.
 * Процесс производится до тех пор, пока все элементы от i + 1 до n
 * не будут перебраны. Примечание. Место помещения очередного элемента
 * в отсортированную часть производить с помощью двоичного поиска.
 * Двоичный поиск оформить в виде отдельной функции.
 */

package by.epam.jonline_introduction.part02;

import java.util.Scanner;

public class Practice020305 {
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

		for (int i = 1; i < arr.length; i++) {

			int first = 0;
			int last = i - 1;
			int num = arr[i];

			first = binSearch(arr, first, last, num);

			for (int j = i; j > first; j--) {
				arr[j] = arr[j - 1];
			}
			arr[first] = num;
		}

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
