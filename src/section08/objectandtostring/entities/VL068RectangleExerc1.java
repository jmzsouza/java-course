package section08.objectandtostring.entities;

public class VL068RectangleExerc1 {

	public double a;
	public double b;

	public double area() {
		return a * b;
	}

	public double perimeter() {
		return 2 * (a + b);
	}

	public double diagonal() {
		return Math.sqrt((Math.pow(a, 2)) + (Math.pow(b, 2)));
	}

}
