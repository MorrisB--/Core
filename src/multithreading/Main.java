package multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Main {
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		String[] inFiles = { "./file1.txt", "./file2.txt" };
		String[] outFiles = { "./file1.out.txt", "./file2.out.txt" };
		ExecutorService es = Executors.newFixedThreadPool(3);
		@SuppressWarnings("unchecked")
		Future<Integer>[] results = new Future[inFiles.length];

		for (int i = 0; i < inFiles.length; i++) {
			Adder adder = new Adder(inFiles[i], outFiles[i]);
			results[i] = es.submit(adder);
		}

		for (Future<Integer> result : results) {
			try {

				int value = result.get();
				System.out.println("Total: " + value);

			} catch (ExecutionException e) {
				
				Throwable adderEx = e.getCause();
			
			} catch (Exception e) {
			}
		}
		try {

			es.shutdown();
			es.awaitTermination(60, TimeUnit.SECONDS);

		} catch (Exception e) {
		}

	}
}
