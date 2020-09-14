package section08.objectandtostring.application;

import java.util.Locale;
import java.util.Scanner;

import section08.objectandtostring.entities.VL068StudentExerc3;

public class VL068ProgramExerc3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		VL068StudentExerc3 student = new VL068StudentExerc3();
		System.out.print("Name: ");
		student.name = sc.nextLine();
		System.out.print("1st quarter - Grade: ");
		student.grade1 = sc.nextDouble();
		System.out.print("2nd quarter - Grade: ");
		student.grade2 = sc.nextDouble();
		System.out.print("2rd quarter - Grade: ");
		student.grade3 = sc.nextDouble();

		System.out.println();
		System.out.println("Student: " + student.name);

		double finalGrade = student.finalGrade();
		String message = student.message();

		System.out.println("Final Grade: " + finalGrade);
		System.out.println("Message: " + message);

		sc.close();
	}

}
