package multithreading;

public class TransactionWorker implements Runnable {

	protected BankAccount account;
	protected char transactionType; // w for withdrawal d for deposit
	protected int amount;

	public TransactionWorker(BankAccount account, char transactionType, int amount) {
		this.account = account;
	}

	@Override
	public void run() {
		if (transactionType == 'w')
			account.withdrawal(amount);
		else if (transactionType == 'd')
			account.deposit(amount);
	}

}
