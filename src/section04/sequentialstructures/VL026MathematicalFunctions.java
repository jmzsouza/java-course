package section04.sequentialstructures;

public class VL026MathematicalFunctions {

	public static void main(String[] args) {
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("The square root of " + x + " = " + A);
		System.out.println("The square root of " + y + " = " + B);
		System.out.println("The square root of 25 = " + C);
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " to " + y + " = " + A);
		System.out.println(x + " squared = " + B);
		System.out.println("5 squared = " + C);
		
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Absolute value of " + y + " = " + A);
		System.out.println("Absolute value of " + z + " = " + B);
		
		//Baskara formula
		double delta, x1, x2;
		double a = 1.0;
		double b = 3.0;
		double c = -10.0;		
		
		delta = Math.pow(b, 2.0) - 4 * a * c;
		
		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		
		System.out.println("The delta value = " + delta);
		System.out.println("The value of x1 = " + x1);
		System.out.println("The value of x2 = " + x2);
	}

}
