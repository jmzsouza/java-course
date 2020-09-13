package section05.conditionalstructures;
import java.util.Scanner;

public class VL035IfElseExerc05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("List of items:");
		System.out.println("COD PRICE");
		System.out.println("101 U$ 7.50");
		System.out.println("102 U$ 5.00");
		System.out.println("103 U$ 9.00");
		System.out.println("104 U$ 6.00");
		System.out.println("105 U$ 8.50");
		System.out.print("Enter an item code and quantity of items:");
		
		int itemCode = sc.nextInt();
		int itemQuantity = sc.nextInt();
		
		double total = 0;	

		if (itemCode == 101) {
			total = itemQuantity * 7.5;
		}
		else if (itemCode == 102) {
			total = itemQuantity * 5.0;
		}
		else if (itemCode == 103) {
			total = itemQuantity * 9.0;
		}
		else if (itemCode == 104) {
			total = itemQuantity * 6.0;
		}
		else if (itemCode == 105) {
			total = itemQuantity * 8.5;
		}
		else {
			System.out.println("Item not found.");
		}
		
		System.out.printf("Total: U$ %.2f%n", total);
		
		sc.close();
	}

}