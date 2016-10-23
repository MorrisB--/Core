package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
	public static void main(String[] args) {
		String[] inFiles = { "./file1.txt", "./file2.txt" };
		String[] outFiles = { "./file1.out.txt", "./file2.out.txt" };
		ExecutorService es = Executors.newFixedThreadPool(3);

		for (int i = 0; i < inFiles.length; i++) {
			Adder adder = new Adder(inFiles[i], outFiles[i]);
			es.submit(adder);
		}
		
		try {
			
			es.shutdown();
			es.awaitTermination(60, TimeUnit.SECONDS);
		
		} catch (Exception e) {
		}
	}
}
