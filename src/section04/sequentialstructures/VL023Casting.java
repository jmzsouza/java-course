package section04.sequentialstructures;

public class VL023Casting {

	public static void main(String[] args) {
		
		double b, B, h, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b * B) / 2.0 * h;
		
		System.out.println(area);
		
		int x, y;
		double result;
		
		x = 5;
		y = 2;
		
		// 'casting' is the explicit conversion of the values
		// within the parentheses () should put which type you want to convert
		result = (double) x / y;
		
		System.out.println(result);
	}

}
