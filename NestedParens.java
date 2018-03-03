
public class Recursion {
	
	public static boolean nestParen(String str) {
		if (str.length() == 0) {
			return true;
		} else if (str.length() < 2) {
			return false;
		} 
		return nestParen(str.substring(1, str.length() - 1));
		
	}

	public static void main(String[] args) {
		System.out.println(nestParen("()"));
	}
}
