package section06.repetitivestructures;
import java.util.Scanner;

public class VL052ForExerc07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number of repetitions: ");
		int repetition = sc.nextInt();
		
		for(int i=1; i<=repetition; i++) {
			if(repetition > 0) {
				int square = (int) Math.pow(i, 2);
				int cube = (int) Math.pow(i, 3);
				System.out.printf("Number: %d - Square: %d - Cube: %d%n", i, square, cube);
			}
			else {
				System.out.println("This number is negative.");
			}
		}
		
		sc.close();

	}

}
