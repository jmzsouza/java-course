package section13.enumerations.application;

import java.util.Date;

import section13.enumerations.models.entities.VL114Order;
import section13.enumerations.models.enums.VL114OrderStatus;

public class VL114Program {

	public static void main(String[] args) {

		VL114Order order = new VL114Order(1080, new Date(), VL114OrderStatus.PENDING_PAYMENT);

		System.out.println(order);

		VL114OrderStatus os1 = VL114OrderStatus.DELIVERED;
		VL114OrderStatus os2 = VL114OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);

	}

}
