package section14.inheritance.models.entities;

public class VL133Company extends VL133TaxPayer {

	private Integer numberOfEmployees;

	public VL133Company() {
	}

	public VL133Company(String name, Double annualIncome, Integer numberOfEmployees) {
		super(name, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		double calc = 0;
		if (numberOfEmployees > 10) {
			calc = super.getAnnualIncome() * 0.14;
		} else {
			calc = super.getAnnualIncome() * 0.16;
		}
		return calc;
	}

}
