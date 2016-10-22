package multithreading;

public class Main {
	public static void main(String[] args) {
		String[] inFiles = { "./file1.txt", "./file2.txt" };
		String[] outFiles = { "./file1.out.txt", "./file2.out.txt" };
		Thread[] threads = new Thread[inFiles.length];

		for (int i = 0; i < inFiles.length; i++) {
			Adder adder = new Adder(inFiles[i], outFiles[i]);
			threads[i] = new Thread(adder);
			threads[i].start();
		}

		for (Thread thread : threads) {
			try {
				thread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
