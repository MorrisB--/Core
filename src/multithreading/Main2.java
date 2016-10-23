package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main2 {
	public static void main(String[] args) {

		ExecutorService es = Executors.newFixedThreadPool(5);
		BankAccount account = new BankAccount(100);
		
		for (int i = 0; i < 10; i++) {
			Worker worker = new Worker(account);
			es.submit(worker);
		}
		
	}

}
