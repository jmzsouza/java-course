package section14.inheritance.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import section14.inheritance.models.entities.VL132Circle;
import section14.inheritance.models.entities.VL132Rectangle;
import section14.inheritance.models.entities.VL132Shape;
import section14.inheritance.models.enums.VL132Color;

public class VL132Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<VL132Shape> list = new ArrayList<>();

		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			VL132Color color = VL132Color.valueOf(sc.next());

			if (ch == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Heigth: ");
				double height = sc.nextDouble();
				list.add(new VL132Rectangle(color, width, height));
			} else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new VL132Circle(color, radius));
			}

		}

		System.out.println();
		System.out.println("SHAPE AREAS:");

		for (VL132Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}

		sc.close();

	}

}
