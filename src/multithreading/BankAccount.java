package multithreading;

public class BankAccount {

	private int balance;

	public BankAccount(int startingBalance) {
		this.balance = startingBalance;
	}

	public int getBalance() {
		return this.balance;
	}

	public void deposit(int amount) {
		balance += amount;
	}
}
