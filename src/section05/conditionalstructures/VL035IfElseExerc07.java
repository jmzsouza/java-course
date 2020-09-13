package section05.conditionalstructures;
import java.util.Locale;
import java.util.Scanner;

public class VL035IfElseExerc07 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the coordinates (X and Y):");
		
		double X = sc.nextDouble();
		double Y = sc.nextDouble();
		
		if (X == 0 && Y == 0) {
			System.out.println("This is the origin.");
		}
		else if (X > 0 && Y > 0) {
			System.out.println("Coordinates belong to the quadrant: QA");
		}
		else if (X > 0 && Y < 0) {
			System.out.println("Coordinates belong to the quadrant: QD");
		}
		else if (X < 0 && Y > 0) {
			System.out.println("Coordinates belong to the quadrant: QB");
		}
		else {
			System.out.println("Coordinates belong to the quadrant: QC");
		}
		
		sc.close();
	}

}