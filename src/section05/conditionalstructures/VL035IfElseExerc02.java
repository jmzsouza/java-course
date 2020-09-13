package section05.conditionalstructures;
import java.util.Scanner;

public class VL035IfElseExerc02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a integer number:");
		
		int number = sc.nextInt();
				
		if (number % 2 == 0) {
			System.out.println("This is a pair number.");
		}
		else {
			System.out.println("This is on odd number.");
		}
		
		sc.close();
	}

}
