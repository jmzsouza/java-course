package section06.repetitivestructures;
import java.util.Scanner;

public class VL046WhileExerc01 {

	public static void main(String[] args) {

		Scanner  sc = new Scanner(System.in);
		
		int pass = sc.nextInt();
		int password = 2002;
		
		while (pass != password) {
			System.out.println("Access Denied");
			pass = sc.nextInt();
		}
		System.out.println("Access Allowed");
		
		sc.close();
	}

}
