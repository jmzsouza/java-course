package section14.inheritance.models.entities;

public abstract class VL133TaxPayer {

	private String name;
	private Double annualIncome;

	public VL133TaxPayer() {
	}

	public VL133TaxPayer(String name, Double annualIncome) {
		this.name = name;
		this.annualIncome = annualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(Double annualIncome) {
		this.annualIncome = annualIncome;
	}

	public abstract double tax();

}
