package section14.inheritance.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import section14.inheritance.models.entities.VL131Account;
import section14.inheritance.models.entities.VL131BusinessAccount;
import section14.inheritance.models.entities.VL131SavingsAccount;

public class VL131Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<VL131Account> list = new ArrayList<>();

		list.add(new VL131SavingsAccount(1001, "Alex", 500.00, 0.01));
		list.add(new VL131BusinessAccount(1002, "Maria", 1000.00, 400.00));
		list.add(new VL131SavingsAccount(1003, "Bob", 300.00, 0.01));
		list.add(new VL131BusinessAccount(1004, "Anna", 500.00, 500.00));

		double sum = 0.0;
		for (VL131Account acc : list) {
			sum += acc.getBalance();
		}

		System.out.printf("Total balance: %.2f%n", sum);

		for (VL131Account acc : list) {
			acc.deposit(10.0);
		}

		for (VL131Account acc : list) {
			System.out.printf("Updated balance for account %d: $ %.2f%n", acc.getNumber(), acc.getBalance());
		}

	}

}
