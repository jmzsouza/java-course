package section04.sequentialstructures;
import java.util.Scanner;

public class VL025DataEntryP2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s1, s2, s3;
		int x;
		
		//Reads a text until the line break (Enter).
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Data entered:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		//Pending line break 
		x = sc.nextInt();
		//Clears the read buffer, i.e. consumes the line break (ENTER) that was given after the value is espered for variable x
		sc.nextLine(); 
		s1 = sc.nextLine();
		s2 = sc.nextLine(); 
		s3 = sc.nextLine();
		
		System.out.println("Data entered:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);		
		
		sc.close();

	}

}
