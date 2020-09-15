package section10.matrix.application;

import java.util.Scanner;

public class VL099Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of lines for a matrix: ");
		int n = sc.nextInt();
		System.out.print("Enter the number of columns for for a matrix: ");
		int m = sc.nextInt();

		int[][] mat = new int[n][m];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.print("Enter the number to query in a matrix: ");
		int x = sc.nextInt();

		int count = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					count++;
					System.out.printf("%nEvent #%d%n", count);
					System.out.printf("Number %d is in position..: [%d][%d]%n", x, i, j);

					if (j > 0) {
						System.out.println("[" + i + "][" + (j - 1) + "] Left..............: " + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("[" + (i - 1) + "][" + j + "] Up................: " + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("[" + i + "][" + (j + 1) + "] Right.............: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("[" + (i + 1) + "][" + j + "] Down..............: " + mat[i + 1][j]);
					}

				}
			}
		}

		if (count == 0) {
			System.out.println("Number not found in matrix!");
		}

		sc.close();

	}

}
