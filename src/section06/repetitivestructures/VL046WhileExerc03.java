package section06.repetitivestructures;
import java.util.Scanner;

public class VL046WhileExerc03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int code = sc.nextInt();

		int alcohol = 0;
		int gasoline = 0;
		int diesel = 0;
		
		while (code != 4) {
			if (code == 1) {
				alcohol += 1;
			}
			else if (code == 2) {
				gasoline += 1;
			}
			else if (code == 3) {
				diesel += 1;
			}
			code = sc.nextInt();
		}
		
		System.out.println("THANKS!");
		System.out.printf("Alcohol: %d%n", alcohol);
		System.out.printf("Gasoline: %d%n", gasoline);
		System.out.printf("Diesel: %d%n", diesel);

		sc.close();
	}

}
