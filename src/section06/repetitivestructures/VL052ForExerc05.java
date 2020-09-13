package section06.repetitivestructures;
import java.util.Scanner;

public class VL052ForExerc05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		
		int factorial = 1;
		for(int i=1; i<=number; i++) {
			factorial = factorial * i;
		}
		
		System.out.printf("Factorial of %d: %d", number, factorial);
		
		sc.close();

	}

}
