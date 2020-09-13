package section06.repetitivestructures;
import java.util.Scanner;

public class VL048For {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		
		int sum = 0;
		for (int i=0; i<number; i++ ) {
			int x = sc.nextInt();
			sum += x;
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}
