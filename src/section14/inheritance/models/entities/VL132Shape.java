package section14.inheritance.models.entities;

import section14.inheritance.models.enums.VL132Color;

public abstract class VL132Shape {

	private VL132Color color;

	public VL132Shape() {
	}

	public VL132Shape(VL132Color color) {
		this.color = color;
	}

	public VL132Color getColor() {
		return color;
	}

	public void setColor(VL132Color color) {
		this.color = color;
	}

	public abstract double area();

}
