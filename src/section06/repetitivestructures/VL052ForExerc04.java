package section06.repetitivestructures;
import java.util.Scanner;

public class VL052ForExerc04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number of repetitions: ");
		int repetition = sc.nextInt();
		
		double div = 0;
		for(int i=1; i<=repetition; i++) {
			System.out.print("Enter two numbers: ");
			int number1 = sc.nextInt();	
			int number2 = sc.nextInt();	
			
			if(number2 == 0) {
				System.out.println("Impossible division.");
			}
			else {
				div = (double) number1 / number2;
				System.out.printf("Result: %.1f%n%n", div);
			}

		}
		
		sc.close();

	}

}
