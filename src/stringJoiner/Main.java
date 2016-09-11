package stringJoiner;

import java.util.StringJoiner;

public class Main {
	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner("], [", "[", "]");
		sj.add("Practicing").add("String");
		sj.add("Joiner");
		System.out.println(sj);

	}
}
