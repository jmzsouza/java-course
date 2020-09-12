package section04.sequentialstructures;
import java.util.Scanner;

public class VL028MathematicalFunctionsExerc06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double A1, B1, C1, triangleArea, circleArea, trapezeArea, squareArea, rectangleArea;
		double pii = 3.14159;
		
		A1 = sc.nextDouble();
		B1 = sc.nextDouble();
		C1 = sc.nextDouble();
		
		triangleArea = A1 * C1 / 2.0;
		circleArea = pii * Math.pow(C1, 2.0);
		trapezeArea = (A1 + B1) * C1 / 2.0;
		squareArea = Math.pow(B1, 2.0);
		rectangleArea = A1 * B1;
			
		System.out.printf("Triangle = %.3f%n", triangleArea);
		System.out.printf("Circle = %.3f%n", circleArea);
		System.out.printf("Trapeze = %.3f%n", trapezeArea);
		System.out.printf("Square = %.3f%n", squareArea);
		System.out.printf("Rectangle = %.3f%n", rectangleArea);
		
		sc.close();

	}

}
