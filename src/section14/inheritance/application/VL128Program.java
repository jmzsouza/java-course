package section14.inheritance.application;

import section14.inheritance.models.entities.VL124Account;
import section14.inheritance.models.entities.VL125SavingsAccount;

public class VL128Program {

	public static void main(String[] args) {

		VL124Account x = new VL124Account(1001, "John", 1000.0);
		VL124Account y = new VL125SavingsAccount(1004, "Joana", 1000.0, 0.01);

		x.withdraw(50.0);
		y.withdraw(50.0);

		System.out.println(x.getBalance());
		System.out.println(y.getBalance());

	}

}
