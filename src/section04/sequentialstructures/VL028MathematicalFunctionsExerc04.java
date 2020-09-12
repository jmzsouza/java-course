package section04.sequentialstructures;
import java.util.Scanner;

public class VL028MathematicalFunctionsExerc04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	
		
		int number, hour;
		double valueHour, salary;
				
		System.out.print("Enter employee number: ");
		number = sc.nextInt();
		System.out.print("Enter the hours worked: ");
		hour = sc.nextInt();
		System.out.print("Enter the value of each hour: ");
		valueHour = sc.nextDouble();
		
		salary = hour * valueHour;
		
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f%n%n", salary);
		
		sc.close();
		
	}

}
