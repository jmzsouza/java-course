package section06.repetitivestructures;
import java.util.Scanner;

public class VL052ForExerc02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number of repetitions: ");
		int repetition = sc.nextInt();
		int in = 0;
		int out = 0;
		
		for (int i=1; i<=repetition; i++) {
			System.out.print("Enter a number: ");
			int number = sc.nextInt();
			if(number >= 10 && number <= 20) {
				in++;
			}
			else {
				out++;
			}
		}
		
		System.out.printf("%d in%n", in);
		System.out.printf("%d out%n", out);
		
		sc.close();
		
	}

}
