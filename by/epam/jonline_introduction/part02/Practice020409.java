/*
 * Даны числа X, Y, Z, Т — длины сторон четырехугольника.
 * Написать метод(методы) вычисления его площади,
 * если угол между сторонами длиной X и Y— прямой.
 */

package by.epam.jonline_introduction.part02;

import java.util.Scanner;

public class Practice020409 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		System.out.println("Введите длины сторон четырехугольника X, Y, Z, T");
		double x;
		double y;
		double z;
		double t;
		x = console.nextDouble();
		y = console.nextDouble();
		z = console.nextDouble();
		t = console.nextDouble();

		double s;
		s = calculateAreaQuadrilateral(x, y, z, t);

		System.out.println("Площадь четырехугольника = " + s);
	}

	public static double calculateAreaRightTriangle(double a, double b) {
		double s;
		s = a * b / 2;
		return s;
	}

	public static double calculateArea3SidesTriangle(double a, double b, double c) {
		double s;
		s = Math.sqrt((a + b + c) * (b + c - a) * (a + c - b) * (a + b - c)) / 4;
		return s;
	}

	public static double calculateHypotenuse(double a, double b) {
		double c;
		c = Math.sqrt((a * a) + (b * b));
		return c;
	}

	public static double calculateAreaQuadrilateral(double x, double y, double z, double t) {
		double s;
		double s1;
		double s2;
		s1 = calculateAreaRightTriangle(x, y);
		s2 = calculateArea3SidesTriangle(z, t, calculateHypotenuse(x, y));
		s = s1 + s2;
		return s;
	}
}
