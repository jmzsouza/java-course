package section14.inheritance.models.entities;

import section14.inheritance.models.enums.VL132Color;

public class VL132Rectangle extends VL132Shape {

	private Double width;
	private Double height;

	public VL132Rectangle() {
	}

	public VL132Rectangle(VL132Color color, Double width, Double height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public double area() {
		return width * height;
	}

}
