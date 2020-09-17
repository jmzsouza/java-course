package section14.inheritance.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import section14.inheritance.models.entities.VL133Company;
import section14.inheritance.models.entities.VL133Individual;
import section14.inheritance.models.entities.VL133TaxPayer;

public class VL133Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<VL133TaxPayer> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Annual income: ");
			double annualIncome = sc.nextDouble();

			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new VL133Individual(name, annualIncome, healthExpenditures));
			} else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new VL133Company(name, annualIncome, numberOfEmployees));
			}
		}

		System.out.println();
		System.out.println("TAXES PAID");
		double sum = 0.0;
		for (VL133TaxPayer tp : list) {
			System.out.printf("%s: %.2f%n", tp.getName(), tp.tax());
			sum += tp.tax();
		}
		
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f", sum);
		
		sc.close();
	}

}
