/*
 * Сортировка обменами. Дана последовательность чисел
 * a1 <= a2 <= ... <= an. Требуется переставить числа в порядке
 * возрастания. Для этого сравниваются два соседних числа a1 +a(i+1).
 * Если ai > a(i+1), то делается перестановка. Так продолжается
 * до тех пор, пока все элементы не станут расположены в порядке
 * возрастания. Составить алгоритм сортировки, подсчитывая при
 * этом количества перестановок.
 */

package by.epam.jonline_introduction.part02;

import java.util.Scanner;

public class Practice020304 {
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
		boolean flag;
		int q = 0;
		do {
			flag = false;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					flag = true;
					q++;
				}
			}
		} while (flag);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
		System.out.println("Количество перестановок = " + q);
	}
}
