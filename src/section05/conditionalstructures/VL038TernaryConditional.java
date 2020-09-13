package section05.conditionalstructures;
import java.util.Scanner;

public class VL038TernaryConditional {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//ternary conditional
		
		double price = 42.7;
		double discount = (price < 20.0) ? price * 0.5 : price * 0.07;
		
		System.out.println(discount);
		sc.close();
	}

}
