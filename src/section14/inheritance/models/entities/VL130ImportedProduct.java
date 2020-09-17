package section14.inheritance.models.entities;

public class VL130ImportedProduct extends VL130Product {

	private Double customsFee;

	public VL130ImportedProduct() {
		super();
	}

	public VL130ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

	@Override
	public String priceTag() {
		return super.getName() + " $ " + totalPrice() + " (Customs fee: $ " + customsFee + ")";
	}

	public Double totalPrice() {
		return super.getPrice() + customsFee;
	}
}
