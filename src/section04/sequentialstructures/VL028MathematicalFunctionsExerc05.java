package section04.sequentialstructures;
import java.util.Scanner;

public class VL028MathematicalFunctionsExerc05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int quantity1, quantity2;
		double value1, value2, total;
				
		quantity1 = sc.nextInt();
		value1 = sc.nextDouble();
		sc.nextLine();
		quantity2 = sc.nextInt();
		value2 = sc.nextDouble();		
		
		total = (value1 * quantity1) + (value2 * quantity2);
		
		System.out.printf("VALUE PAYABLE = R$ %.2f%n%n", total);
		
		sc.close();
		
	}

}
