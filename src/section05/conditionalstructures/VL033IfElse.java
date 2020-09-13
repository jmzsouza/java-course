package section05.conditionalstructures;
import java.util.Scanner;

public class VL033IfElse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many hours...? ");
		int hour = sc.nextInt();
		
		if (hour < 12) {
			System.out.println("Good morning!");
		}
		else if (hour < 18) {
			System.out.println("Good afternoon!");
		}
		else {
			System.out.println("Good night!");
		}
	
		sc.close();
	}

}
