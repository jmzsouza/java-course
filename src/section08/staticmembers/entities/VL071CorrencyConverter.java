package section08.staticmembers.entities;

public class VL071CorrencyConverter {

	public static double realToDollar(double dollar, double money) {
		return (dollar * money) + (dollar * money * 0.06);
	}

}
