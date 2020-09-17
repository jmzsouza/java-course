package section14.inheritance.application;

import section14.inheritance.models.entities.VL124Account;
import section14.inheritance.models.entities.VL124BusinessAccount;
import section14.inheritance.models.entities.VL125SavingsAccount;

public class VL124Program {

	public static void main(String[] args) {

		VL124Account acc = new VL124Account(1001, "Alex", 1000.0);
		VL124BusinessAccount bacc = new VL124BusinessAccount(1002, "Maria", 0.0, 500.0);

		System.out.println(acc);

		// UPCASTING
		VL124Account acc1 = bacc;
		VL124Account acc2 = new VL124BusinessAccount(1003, "Bob", 0.0, 200.0);
		VL124Account acc3 = new VL125SavingsAccount(1004, "Anna", 1000.0, 0.01);
		System.out.println(acc1);

		// DOWNCASTING
		VL124BusinessAccount acc4 = (VL124BusinessAccount) acc2;
		acc4.loan(150.0);

		// VL123BusinessAccount acc5 = (VL123BusinessAccount)acc3;
		if (acc3 instanceof VL124BusinessAccount) {
			VL124BusinessAccount acc5 = (VL124BusinessAccount) acc3;
			acc5.loan(200.);
			System.out.println("Loan! ");
		}

		if (acc3 instanceof VL125SavingsAccount) {
			VL125SavingsAccount acc5 = (VL125SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}

		VL124Account acc6 = new VL124Account(1001, "John", 1000.0);
		acc6.withdraw(200.0);
		System.out.println(acc6.getBalance());

		VL124Account acc7 = new VL125SavingsAccount(1004, "Joana", 1000.0, 0.01);
		acc7.withdraw(200.0);
		System.out.println(acc7.getBalance());

		VL124Account acc8 = new VL124BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc8.withdraw(200.0);
		System.out.println(acc8.getBalance());

	}

}
