package section08.objectandtostring.application;

import java.util.Locale;
import java.util.Scanner;

import section08.objectandtostring.entities.VL068EmployeeExerc2;

public class VL068ProgramExerc2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		VL068EmployeeExerc2 employee = new VL068EmployeeExerc2();
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();

		System.out.println();
		System.out.println("Employee: " + employee);

		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);

		System.out.println();
		System.out.println("Updated data: " + employee);

		sc.close();
	}

}
