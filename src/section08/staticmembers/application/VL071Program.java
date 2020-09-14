package section08.staticmembers.application;

import java.util.Locale;
import java.util.Scanner;

import section08.staticmembers.entities.VL071CorrencyConverter;

public class VL071Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("What is the dollar price? ");
		double dollar = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double money = sc.nextDouble();

		double result = VL071CorrencyConverter.realToDollar(dollar, money);

		System.out.printf("Amount to be paid in reais = %.2f%n", result);

		sc.close();

	}

}
