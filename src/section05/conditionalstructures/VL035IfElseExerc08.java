package section05.conditionalstructures;
import java.util.Locale;
import java.util.Scanner;

public class VL035IfElseExerc08 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		System.out.println("INCOME | TAX");
		System.out.println("from 0.00 to U$ 2000.00 | free");
		System.out.println("from 2000.01 to U$ 3000.00 | 8%");
		System.out.println("from 3000.01 to U$ 4500.00 | 18%");
		System.out.println("over U$ 4500.01 | 28%");	

		System.out.print("Enter your income:");
		
		Scanner sc = new Scanner(System.in);
		
		double income = sc.nextDouble();
		double tax = 0;
		
		if (income <= 2000.0) {
			System.out.println("You are free!");
		}
		else if (income <= 3000.0) {
			tax = (income - 2000.0) * 0.08;
		}
		else if (income <= 4500.0) {
			tax = (income - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			tax = (income - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		
		System.out.printf("The tax is U$ %.2f%n", tax);
		sc.close();
	}

}