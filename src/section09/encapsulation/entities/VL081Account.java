package section09.encapsulation.entities;

public class VL081Account {

	private int number;
	public String holder;
	private double balance;

	public VL081Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public VL081Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public int getNumber() {
		return number;
	}

	public String getholder() {
		return holder;
	}

	public void setholder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount + 5.00;
	}

	public String toString() {
		return "Account " 
				+ number 
				+ ", Holder: " 
				+ getholder() 
				+ ", Balance: $ "
				+ String.format("%.2f%n", getBalance());
	}

}
