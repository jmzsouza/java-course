package section14.inheritance.models.entities;

public class VL125SavingsAccount extends VL124Account {

	private Double interestRate;

	public VL125SavingsAccount() {
		super();
	}

	public VL125SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public void updateBalance() {
		balance += balance * interestRate;
	}

	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}

}
