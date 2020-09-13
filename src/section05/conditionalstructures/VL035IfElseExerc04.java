package section05.conditionalstructures;
import java.util.Scanner;

public class VL035IfElseExerc04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a start time and an end time:");
		int startTime = sc.nextInt();
		int endTime = sc.nextInt();
		
		int duration;
		
		if (startTime > endTime) {
			duration = startTime - endTime;
		}
		else {
			duration = endTime + (24 - startTime);
		}

		System.out.printf("The play lasted %d hour(s).%n", duration);
		
		sc.close();
	}

}
