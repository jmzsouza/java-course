package section08.staticmembers.application;

import java.util.Locale;
import java.util.Scanner;

import section08.staticmembers.entities.VL070Calculator;

public class VL070Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();

		double c = VL070Calculator.circumference(radius);

		double v = VL070Calculator.volume(radius);

		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", VL070Calculator.PI);

		sc.close();

	}

}
