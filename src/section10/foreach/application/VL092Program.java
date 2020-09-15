package section10.foreach.application;

public class VL092Program {

	public static void main(String[] args) {

		String[] vector = new String[] { "John", "Paul", "Grace" };

		for (int i = 0; i < vector.length; i++) {
			System.out.println(vector[i]);
		}
		
		System.out.println("----------");
		
		for (String obj : vector) {
			System.out.println(obj);
		}

	}

}
