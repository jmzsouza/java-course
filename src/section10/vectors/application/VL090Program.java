package section10.vectors.application;

import java.util.Locale;
import java.util.Scanner;

import section10.vectors.entities.VL090Rent;

public class VL090Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		VL090Rent[] vector = new VL090Rent[10];

		System.out.print("How many rooms will be rented? ");
		int roomsForRent = sc.nextInt();

		for (int i = 0; i < roomsForRent; i++) {
			System.out.println();
			System.out.printf("Rent #%d%n", i + 1);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vector[room] = new VL090Rent(name, email);
		}

		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] != null) {
				System.out.println(i + ": " + vector[i]);
			}
		}

		sc.close();

	}

}
