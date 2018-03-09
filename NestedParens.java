public class NestedParens {

	public static boolean nestParen(String str) {
		// base case: the empty string
		if (str.isEmpty()) {
			return true;
		}

		// recursive case: if the first character is '(' and the last
		// character is ')', then make a recursive call to a smaller version
		// of the problem.
		if (str.startsWith("(") && str.endsWith(")")) {
			return nestParen(str.substring(1, str.length() - 1));
		}

		// otherwise, the string is not properly formatted
		else {
			return false;
		}
	}
		
	public static void main(String[] args) {
		System.out.println(nestParen("(())"));
	}
}