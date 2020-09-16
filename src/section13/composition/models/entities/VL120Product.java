package section13.composition.models.entities;

public class VL120Product {

	private String name;
	private Double price;

	public VL120Product() {
	}

	public VL120Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
