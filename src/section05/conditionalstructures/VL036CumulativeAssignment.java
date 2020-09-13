package section05.conditionalstructures;
import java.util.Locale;
import java.util.Scanner;

public class VL036CumulativeAssignment {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutes = sc.nextInt();
		double bill = 50.0;
		
		if (minutes > 100) {
			bill += (minutes- 100) * 2.0;
		}
		
		System.out.printf("Bill amount = U$ %.2f%n ", bill);
		
		sc.close();
	}

}
