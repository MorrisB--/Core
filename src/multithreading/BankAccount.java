package multithreading;

public class BankAccount {

	private int balance;

	public BankAccount(int startingBalance) {
		this.balance = startingBalance;
	}

	public synchronized int getBalance() {
		return this.balance;
	}

	public synchronized void deposit(int amount) {
		this.balance += amount;
	}

	public synchronized void withdrawal(int amount) {
		this.balance -= amount;
	}
}
