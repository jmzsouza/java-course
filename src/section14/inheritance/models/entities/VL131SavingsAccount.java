package section14.inheritance.models.entities;

public class VL131SavingsAccount extends VL131Account {

	private Double interestRate;

	public VL131SavingsAccount() {
		super();
	}

	public VL131SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
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
