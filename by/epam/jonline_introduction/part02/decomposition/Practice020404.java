/*
 * На плоскости заданы своими координатами n точек.
 * Написать метод(методы), определяющие, между какими из пар точек
 * самое большое расстояние. Указание. Координаты точек занести в массив.
 */

package by.epam.jonline_introduction.part02.decomposition;

import java.util.Scanner;

public class Practice020404 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);

		int n;
		System.out.println("Введите количество точек");
		n = console.nextInt();

		int[] x = new int[n];
		int[] y = new int[n];

		randomFill(x, -20, 20);
		randomFill(y, -20, 20);

		pointToConsole(x, y);

		int[] index = new int[2];
		index = greatestDistance(x, y);
		System.out.println("Наибольшее расстояние между точками № " + index[0] + " и № " + index[1]);
	}

	public static void randomFill(int[] arr, int min, int max) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * (max - min) + min);
		}
	}

	public static void pointToConsole(int[] x, int[] y) {
		for (int i = 0; i < x.length; i++) {
			System.out.println("(" + x[i] + "," + y[i] + ")");
		}
	}

	public static double distance(int x1, int y1, int x2, int y2) {
		return Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
	}

	public static int[] greatestDistance(int[] x, int[] y) {
		int[] index = new int[2];
		double d = 0;

		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (distance(x[i], y[i], x[j], y[j]) > d) {
					d = distance(x[i], y[i], x[j], y[j]);
					index[0] = i;
					index[1] = j;
				}
			}
		}
		return index;
	}
}
