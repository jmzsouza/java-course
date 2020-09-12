package section04.sequentialstructures;
import java.util.Scanner;

public class VL024DataEntryP1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		System.out.print("Enter a word: ");
		x = sc.next();
		System.out.println("You entered: " + x);
		
		int y;
		System.out.print("Enter a number: ");
		y = sc.nextInt();
		System.out.println("You entered: " + y);
		
		double z;
		System.out.print("Enter a floating-point number: ");
		z = sc.nextDouble();
		System.out.println("You entered: " + z);
		
		char a;
		System.out.print("Enter a character: ");
		a = sc.next().charAt(0);
		System.out.println("You entered: " + a);		
		
		String b;
		int c;
		double d;
		b = sc.next();
		c = sc.nextInt();
		d = sc.nextDouble();
		System.out.println("Data entered:");
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		sc.close();

	}

}
