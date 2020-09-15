package section10.vectors.application;

import java.util.Locale;
import java.util.Scanner;

public class VL088Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		double[] vector = new double[num];

		for (int i = 0; i < num; i++) {
			vector[i] = sc.nextDouble();
		}

		double sum = 0.0;
		for (int i = 0; i < num; i++) {
			sum += vector[i];
		}

		double average = sum / num;

		System.out.printf("Average Height: %.2f%n", average);

		sc.close();

	}

}
