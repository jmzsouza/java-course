package section09.encapsulation.application;

import java.util.Locale;
import java.util.Scanner;

import section09.encapsulation.entities.VL081Account;

public class VL081Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		VL081Account Account;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an initial  deposit (y/n)? ");
		char response = sc.next().toUpperCase().charAt(0);

		if (response == 'Y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			Account = new VL081Account(number, holder, initialDeposit);
		} else {
			Account = new VL081Account(number, holder);
		}

		System.out.println();
		System.out.println("Account data:");
		System.out.print(Account);

		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		Account.deposit(depositValue);
		System.out.println("Updated account data:");
		System.out.print(Account);

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		Account.withdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.print(Account);

		sc.close();

	}

}
