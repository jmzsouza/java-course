package section08.objectandtostring.application;

import java.util.Locale;
import java.util.Scanner;

import section08.objectandtostring.entities.VL068RectangleExerc1;

public class VL068ProgramExerc1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		VL068RectangleExerc1 rectangle;
		rectangle = new VL068RectangleExerc1();

		System.out.println("Enter rectangle width and height: ");
		rectangle.a = sc.nextDouble();
		rectangle.b = sc.nextDouble();

		double area = rectangle.area();
		double perimeter = rectangle.perimeter();
		double diagonal = rectangle.diagonal();

		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);
		System.out.println("Diagonal: " + diagonal);

		sc.close();

	}

}
