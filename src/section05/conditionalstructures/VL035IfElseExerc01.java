package section05.conditionalstructures;
import java.util.Scanner;

public class VL035IfElseExerc01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Enter a integer number:");
		
		int number = sc.nextInt();
		
		if (number < 0) {
			System.out.println("This number is negative.");
		}
		else {
			System.out.println("This number isn't negative.");
		}		
		
		sc.close();
	}

}
