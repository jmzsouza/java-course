package section04.sequentialstructures;
import java.util.Scanner;

public class VL028MathematicalFunctionsExerc03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		
		int A, B, C, D, difference;
		
		System.out.print("Enter a number: ");
		A = sc.nextInt();
		System.out.print("Enter another number: ");
		B = sc.nextInt();
		System.out.print("Enter one more number: ");
		C = sc.nextInt();
		System.out.print("Enter another number: ");
		D = sc.nextInt();		
		
		difference = (A * B - C * D);
		
		System.out.printf("The difference = %d%n%n", difference);

		sc.close();
		
	}

}
