package section14.inheritance.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import section14.inheritance.models.entities.VL130ImportedProduct;
import section14.inheritance.models.entities.VL130Product;
import section14.inheritance.models.entities.VL130UsedProduct;

public class VL130Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<VL130Product> list = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();

			if (ch == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				list.add(new VL130ImportedProduct(name, price, customsFee));
			} 
			else if (ch == 'u') {
				System.out.print("Manufacture date (dd/mm/yyyy): ");
				Date manufactureDate = sdf.parse(sc.next());
				list.add(new VL130UsedProduct(name, price, manufactureDate));
			} 
			else {
				list.add(new VL130Product(name, price));
			}

		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");

		for (VL130Product prod : list) {
			System.out.println(prod.priceTag());
		}

		sc.close();

	}

}
