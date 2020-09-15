package section10.lists.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import section10.lists.entities.VL095Employee;

public class VL095Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<VL095Employee> list = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		Integer quantity = sc.nextInt();

		for (int i = 1; i <= quantity; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ": ");
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new VL095Employee(id, name, salary));
		}

		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int desiredID = sc.nextInt();
		VL095Employee emp = list.stream().filter(x -> x.getId() == desiredID).findFirst().orElse(null);

		if (emp == null) {
			System.out.println("This Id does not exists!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}

		System.out.println();
		System.out.println("List of employees: ");
		for (VL095Employee obj : list) {
			System.out.println(obj);
		}

		sc.close();

	}

}
