package section06.repetitivestructures;
import java.util.Locale;
import java.util.Scanner;

public class VL052ForExerc03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number of test cases: ");
		int N = sc.nextInt();
		
		double average = 0;
		
		for(int i=1; i<=N; i++) {
			System.out.print("Enter three numbers:" );
			double num1 = sc.nextDouble();
			double num2 = sc.nextDouble();
			double num3 = sc.nextDouble();	
			
			average = (num1 * 2 + num2 * 3 + num3 * 5) / 10;
		
			System.out.printf("Average = %.1f%n%n", average);
		}
		
		sc.close();
				
	}

}
