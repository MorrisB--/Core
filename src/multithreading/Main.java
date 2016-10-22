package multithreading;

import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		String[] inFiles = { "./file1.txt", "./file2.txt" };
		String[] outFiles = { "./file1.out.txt", "./file2.out.txt" };

		try {
			for (int i = 0; i < inFiles.length; i++) {
				Adder adder = new Adder(inFiles[i], outFiles[i]);
				adder.doAdd();
			}
		} catch (IOException e) {

		}
	}
}
