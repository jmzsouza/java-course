package section14.inheritance.models.entities;

import section14.inheritance.models.enums.VL132Color;

public class VL132Circle extends VL132Shape {

	private Double radius;

	public VL132Circle() {
	}

	public VL132Circle(VL132Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

}
