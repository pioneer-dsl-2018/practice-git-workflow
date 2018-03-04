import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RecursionTest {
	
	@Test
	public void testEmpty() {
		String testString = "";
		boolean result = Recursion.nestParen(testString) ;
		assertEquals(true, result);
	}

	@Test
	public void test1() {
		String testString = "(())";
		boolean result = Recursion.nestParen(testString) ;
		assertEquals(true, result);
	}
	
	@Test
	public void test2() {
		String testString = "((()))";
		boolean result = Recursion.nestParen(testString) ;
		assertEquals(true, result);
	}
	
	@Test
	public void test3() {
		String testString = "(((x))";
		boolean result = Recursion.nestParen(testString) ;
		assertEquals(false, result);
	}
	
	@Test
	public void test4() {
		String testString = "((())";
		boolean result = Recursion.nestParen(testString) ;
		assertEquals(false, result);
	}
	
	@Test
	public void test5() {
		String testString = "((()()";
		boolean result = Recursion.nestParen(testString) ;
		assertEquals(false, result);
	}
	
	@Test
	public void test6() {
		String testString = "()";
		boolean result = Recursion.nestParen(testString) ;
		assertEquals(true, result);
	}
	
	@Test
	public void test7() {
		String testString = "(yy)";
		boolean result = Recursion.nestParen(testString) ;
		assertEquals(false, result);
	}
	
	@Test
	public void test8() {
		String testString = "(((y))";
		boolean result = Recursion.nestParen(testString) ;
		assertEquals(false, result);
	}
	
	@Test
	public void test9() {
		String testString = "((y)))";
		boolean result = Recursion.nestParen(testString) ;
		assertEquals(false, result);
	}
	
	@Test
	public void test10() {
		String testString = "((()))";
		boolean result = Recursion.nestParen(testString) ;
		assertEquals(true, result);
	}
	
	@Test
	public void test11() {
		String testString = "(())))";
		boolean result = Recursion.nestParen(testString) ;
		assertEquals(false, result);
	}
	
	@Test
	public void test12() {
		String testString = "((yy())))";
		boolean result = Recursion.nestParen(testString) ;
		assertEquals(false, result);
	}
	
	@Test
	public void test13() {
		String testString = "(((())))";
		boolean result = Recursion.nestParen(testString) ;
		assertEquals(true, result);
	}
	
	@Test
	public void test14() {
		String testString = "()()";
		boolean result = Recursion.nestParen(testString) ;
		assertEquals(false, result);
	}
}
