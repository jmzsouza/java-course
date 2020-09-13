package section05.conditionalstructures;

public class VL039ScopeInitialization {

	public static void main(String[] args) {
		
		double price = 450.00;
		
		double discount;
		
		if (price < 250.00) {
			discount = price * 0.1;
		}
		else {
			discount = 0;
		}
		
		System.out.println(discount);

	}

}
