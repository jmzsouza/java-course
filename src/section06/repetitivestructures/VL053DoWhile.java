package section06.repetitivestructures;
import java.util.Locale;
import java.util.Scanner;

public class VL053DoWhile {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char answer;
		do {
			System.out.print("Enter the temperature in Celsius: ");
			double celsius = sc.nextDouble();
			double fahrenheit = 9.0 * celsius / 5.0 + 32.0;
			
			System.out.printf("Equivalent in Fahrenheit: %.1f%n", fahrenheit);
			System.out.print("Do you want to repeat (y/n)?");
			answer = sc.next().charAt(0);
		} while (answer != 'n');		
		
		sc.close();

	}

}
