package section04.sequentialstructures;
import java.util.Locale;

public class VL022DataOutput {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		double x = 10.35784;
		String nome = "Mary";
		int idade = 31;
		double renda = 4000.00;
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		System.out.println("RESULT = " + x + " meters");
		System.out.printf("RESULT =  %.2f meters%n", x);
		System.out.printf("%s is %d years old and receives U$ %.2f dollars", nome, idade, renda);
		
	}

}
