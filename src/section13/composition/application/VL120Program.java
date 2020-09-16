package section13.composition.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import section13.composition.models.entities.VL120Client;
import section13.composition.models.entities.VL120Order;
import section13.composition.models.entities.VL120OrderItem;
import section13.composition.models.entities.VL120Product;
import section13.composition.models.enums.VL120OrderStatus;

public class VL120Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());

		VL120Client client = new VL120Client(name, email, birthDate);

		System.out.println("Enter order data:");
		System.out.print("Status: ");
		VL120OrderStatus status = VL120OrderStatus.valueOf(sc.next());

		VL120Order order = new VL120Order(new Date(), status, client);

		System.out.print("How many items to this order? ");
		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();

			VL120Product product = new VL120Product(productName, productPrice);
			VL120OrderItem item = new VL120OrderItem(quantity, productPrice, product);
			order.addItem(item);
		}

		System.out.println();
		System.out.println(order);

		sc.close();

	}

}
