package stringJoiner;

import java.util.StringJoiner;

public class Main {
	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner("], [", "[", "]");
		sj.add("Practicing").add("String");
		sj.add("Joiner");
		System.out.println(sj);

		StringJoiner sj2 = new StringJoiner(", ");
		// Will only print if add() was never called
		sj2.setEmptyValue("STRING_IS_EMPTY");
		System.out.println(sj2);

	}
}
