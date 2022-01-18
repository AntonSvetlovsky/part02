/*
 * Вычислить площадь правильного шестиугольника со стороной а,
 * используя метод вычисления площади треугольника.
 */

package by.epam.jonline_introduction.part02;

import java.util.Scanner;

public class Practice020403 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		System.out.println("Введите длину стороны a правильного шестиугольника");
		int a;
		a = console.nextInt();

		double area;
		area = 6 * triangleEquilateralArea(a);

		System.out.println("Площадь шестиугольника равна = " + area);
	}

	public static double triangleEquilateralArea(int a) {
		return a * a * Math.sqrt(3) / 4;
	}
}
