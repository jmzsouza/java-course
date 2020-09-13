package section07.otherbasictopics;
import java.util.Scanner;

public class VL056Bitwise {

	public static void main(String[] args) {
		
		int n1 = 75;
		int n2 = 58;
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("%nEnter a number: ");
		int mask = 0b00100000; //0b indicates that it is a binary entry. 0b00100000 represents number 32
		int num = sc.nextInt();
		
		if((num & mask) != 0) {
			System.out.println("6th bit is true!");
		}
		else {
			System.out.println("6th bit is false!");
		}
		
		sc.close();
		
	}
}
