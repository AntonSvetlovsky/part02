/*
 * Магическим квадратом порядка n называется квадратная матрица
 * размера nxn, составленная из чисел 1, 2, 3, ..., n так,
 * что суммы по каждому столбцу, каждой строке и каждой
 * из двух больших диагоналей равны между собой.
 * Построить такой квадрат.
 * Пример магического квадрата порядка 3:
 * 6  1  8
 * 7  5  3
 * 2  9  4
 */

package by.epam.jonline_introduction.part02.n_dimensional_array;

import java.util.Scanner;

public class Practice020216 {
	public static void main(String[] args) {
		int n;

		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);

		System.out.println("Введите размер n квадратной матрицы");
		n = console.nextInt();

		int[][] square = new int[n][n];

		if (n % 2 != 0) {
			oddSquareFill(square);
		} else if (n % 4 == 0) {
			even4SquareFill(square);
		} else {
			evenSquareFill(square);
		}

		squareArrayToConsole(square);
	}

	public static void oddSquareFill(int[][] sq) {
		int row;
		int col;
		int i = 0;
		int j = sq.length / 2;
		sq[i][j] = 1;
		int n = sq.length * sq.length;
		int k = 2;
		while (k <= n) {
			if (i == 0 && j != sq.length - 1) {
				row = sq.length - 1;
				col = j + 1;
			} else if (j == sq.length - 1 && i != 0) {
				row = i - 1;
				col = 0;
			} else if (i == 0 && j == sq.length - 1) {
				row = sq.length - 1;
				col = 0;
			} else {
				row = i - 1;
				col = j + 1;
			}
			if (sq[row][col] == 0) {
				sq[row][col] = k;
			} else {
				row = i + 1;
				col = j;
				sq[row][col] = k;
			}
			i = row;
			j = col;
			k++;
		}
	}

	public static void even4SquareFill(int[][] sq) {
		for (int i = 0; i < sq.length / 2; i++) {
			for (int j = 0; j < sq.length / 2; j += 2) {
				if (i % 2 == 0) {
					sq[i][j] = -1;
					sq[i][sq.length - 1 - j] = -1;
				} else {
					sq[i][j + 1] = -1;
					sq[i][sq.length - 2 - j] = -1;
				}
			}
		}
		int n = sq.length * sq.length;
		int m = 1;

		for (int i = 0; i < sq.length / 2; i++) {
			for (int j = 0; j < sq.length; j++) {
				if (sq[i][j] == -1) {
					sq[i][j] = n;
					sq[sq.length - 1 - i][sq.length - 1 - j] = m;
				} else {
					sq[i][j] = m;
					sq[sq.length - 1 - i][sq.length - 1 - j] = n;
				}
				m++;
				n--;
			}
		}
	}

	public static void evenSquareFill(int[][] sq) {
		int half = sq.length / 2;
		int[][] sq1 = new int[half][half];

		oddSquareFill(sq1);

		for (int i = 0; i < half; i++) {
			for (int j = 0; j < half; j++) {
				sq[i][j] = sq1[i][j];
			}
		}
		for (int i = half; i < sq.length; i++) {
			for (int j = half; j < sq.length; j++) {
				sq[i][j] = sq1[i - half][j - half] + half * half;
			}
		}
		for (int i = 0; i < half; i++) {
			for (int j = half; j < sq.length; j++) {
				sq[i][j] = sq1[i][j - half] + 2 * half * half;
			}
		}
		for (int i = half; i < sq.length; i++) {
			for (int j = 0; j < half; j++) {
				sq[i][j] = sq1[i - half][j] + 3 * half * half;
			}
		}

		int temp = sq[0][0];
		sq[0][0] = sq[half][0];
		sq[half][0] = temp;

		temp = sq[half - 1][0];
		sq[half - 1][0] = sq[sq.length - 1][0];
		sq[sq.length - 1][0] = temp;

		for (int i = 1; i < half - 1; i++) {
			temp = sq[i][1];
			sq[i][1] = sq[half + i][1];
			sq[half + i][1] = temp;
		}

		int q = sq.length / 4 - 1;
		for (int j = half - q; j < half + q; j++) {
			for (int i = 0; i < half; i++) {
				temp = sq[i][j];
				sq[i][j] = sq[half + i][j];
				sq[half + i][j] = temp;
			}
		}
	}

	public static void squareArrayToConsole(int[][] sq) {
		for (int i = 0; i < sq.length; i++) {
			for (int j = 0; j < sq[0].length; j++) {
				System.out.print(sq[i][j]);
				if (sq[i][j] / 10 == 0) {
					System.out.print("   ");
				} else if (sq[i][j] / 100 != 0) {
					System.out.print(" ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
