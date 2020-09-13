package section05.conditionalstructures;
import java.util.Scanner;

public class VL035IfElseExerc03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter two integer numbers:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (x % y == 0 || y % x == 0) {
			System.out.println("The numbers are multiples.");
		}
		else {
			System.out.println("The numbers aren't multiples.");
		}
		
		sc.close();

	}

}
