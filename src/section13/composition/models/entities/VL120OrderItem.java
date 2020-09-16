package section13.composition.models.entities;

public class VL120OrderItem {

	private Integer quantity;
	private Double price;

	private VL120Product product;

	public VL120OrderItem() {
	}

	public VL120OrderItem(Integer quantity, Double price, VL120Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public VL120Product getProduct() {
		return product;
	}

	public void setProduct(VL120Product product) {
		this.product = product;
	}

	public Double subTotal() {
		return price * quantity;
	}

	@Override
	public String toString() {
		return getProduct().getName() + ", $" + String.format("%.2f", price) + ", Quantity: " + quantity
				+ ", Subtotal: $" + String.format("%.2f", subTotal());
	}

}
