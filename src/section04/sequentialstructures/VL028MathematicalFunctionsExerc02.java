package section04.sequentialstructures;
import java.util.Scanner;

public class VL028MathematicalFunctionsExerc02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double area, radius;
		double pi = 3.14159;
		
		System.out.print("Enter the radius value of the circle: ");
		radius = sc.nextInt();
		
		area = pi * Math.pow(radius, 2.0);
		
		System.out.printf("The value of the circle area %.4f%n%n",area);

		sc.close();
		
	}

}
