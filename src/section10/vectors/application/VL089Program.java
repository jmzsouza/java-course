package section10.vectors.application;

import java.util.Locale;
import java.util.Scanner;

import section10.vectors.entities.VL089ProductVectors;

public class VL089Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		VL089ProductVectors[] vector = new VL089ProductVectors[num];

		for (int i = 0; i < vector.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vector[i] = new VL089ProductVectors(name, price);
		}

		double sum = 0.0;
		for (int i = 0; i < vector.length; i++) {
			sum += vector[i].getPrice();
		}

		double average = sum / vector.length;

		System.out.printf("Average Price %.2f%n", average);

		sc.close();

	}

}
