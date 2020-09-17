package section14.inheritance.models.entities;

public class VL129OutsourcedEmployee extends VL129Employee {

	private Double additionalCharge;

	public VL129OutsourcedEmployee() {
		super();
	}

	public VL129OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	@Override
	public Double payment() {
		return super.payment() + additionalCharge * 1.1;
	}

}
