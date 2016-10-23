package multithreading;

public class TransactionPromoWorker extends TransactionWorker {

	public TransactionPromoWorker(BankAccount account, char transactionType, int amount) {
		super(account, transactionType, amount);
		// TODO Auto-generated constructor stub
	}

	public void run() {
		if (transactionType == 'w')
			account.withdrawal(amount);
		else if (transactionType == 'd') {
			synchronized (account) {
				account.deposit(amount);
				/*
				 * Giving a 10% bonus if the account has more than $500 after
				 * the deposit
				 */
				if (account.getBalance() > 500) {
					int bonus = (int) ((account.getBalance() - 500) * 0.1);
					account.deposit(bonus);
				}
			}
		}
	}

}
