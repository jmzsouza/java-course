package section04.sequentialstructures;
import java.util.Scanner;

public class VL028MathematicalFunctionsExerc01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x, y, sum;
		System.out.print("Enter a number: ");
		x = sc.nextInt();
		System.out.print("Enter another number: ");
		y = sc.nextInt();		
		
		sum = x + y;
		
		System.out.printf("The sum of the numbers = %d%n%n", sum);
			
		sc.close();
		
	}

}
