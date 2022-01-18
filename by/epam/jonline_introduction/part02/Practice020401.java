/*
 * Написать метод(методы) для нахождения наибольшего общего делителя и
 * наименьшего общего кратного двух натуральных чисел:
 * НОК(А, В) = (А * В) / НОД(А, В)
 */

package by.epam.jonline_introduction.part02;

import java.util.Scanner;

public class Practice020401 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		int a;
		int b;
		a = console.nextInt();
		b = console.nextInt();
		System.out.println("Наибольший общий делитель = " + gcd(a, b));
		System.out.println("Наименьшее общее кратное = " + lcm(a, b));
	}

	public static int gcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	public static int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}
}
