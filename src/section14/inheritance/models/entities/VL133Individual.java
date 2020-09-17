package section14.inheritance.models.entities;

public class VL133Individual extends VL133TaxPayer {

	private Double healthExpenditures;

	public VL133Individual() {
	}

	public VL133Individual(String name, Double annualIncome, Double healthExpenditures) {
		super(name, annualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		double calc = 0;
		if (super.getAnnualIncome() < 20000.00) {
			calc = (super.getAnnualIncome() * 0.15) - (healthExpenditures * 0.5);
		} else {
			calc = (super.getAnnualIncome() * 0.25) - (healthExpenditures * 0.5);
		}
		return calc;
	}

}
