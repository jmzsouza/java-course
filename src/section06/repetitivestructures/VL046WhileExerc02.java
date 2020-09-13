package section06.repetitivestructures;
import java.util.Scanner;

public class VL046WhileExerc02 {

	public static void main(String[] args) {

		Scanner  sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		String quadrant = "";
		while (X != 0 && Y != 0) {
			quadrant = (X > 0 && Y > 0)? "Q1" : (X > 0 && Y < 0)? "Q4" : (X < 0 && Y > 0)? "Q2" : "Q3";
			System.out.println(quadrant);
			X = sc.nextInt();
			Y = sc.nextInt();			
		}
		
		sc.close();
	}

}