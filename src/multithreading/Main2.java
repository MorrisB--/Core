package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main2 {
	@SuppressWarnings("null")
	public static void main(String[] args) {

		/*
		 * Using Worker.java
		 */
		
		ExecutorService es = Executors.newFixedThreadPool(5);
		BankAccount account = new BankAccount(100);
		
		for (int i = 0; i < 10; i++) {
			Worker worker = new Worker(account);
			es.submit(worker);
		}
		
		/*
		 * Using TransactionWorker.java
		 */
		
		ExecutorService es1 = Executors.newFixedThreadPool(5);
		TransactionWorker[] workers = null; // set this later, example
		
		for(TransactionWorker worker: workers)
			es1.submit(worker);
	}

}
