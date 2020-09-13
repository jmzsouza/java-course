package section06.repetitivestructures;
import java.util.Scanner;

public class VL052ForExerc01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		
		for(int i=1; i<=number; i++) {
			if(i % 2 != 0) {
				System.out.printf("Odd number: %d%n", i);
			}
			
		}
		
		sc.close();

	}

}
