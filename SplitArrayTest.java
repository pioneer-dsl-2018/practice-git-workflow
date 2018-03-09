import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SplitArrayTest {
	
	@Test
	public void testEmpty() {
		int[] testArray = {};
		boolean result = SplitArray.splitArray(testArray) ;
		assertEquals(true, result);
	}
	
	@Test
	public void test1() {
		int[] testArray = {2, 2};
		boolean result = SplitArray.splitArray(testArray) ;
		assertEquals(true, result);
	}
	
	@Test
	public void test2() {
		int[] testArray = {2, 3};
		boolean result = SplitArray.splitArray(testArray) ;
		assertEquals(false, result);
	}
	
	@Test
	public void test3() {
		int[] testArray = {5, 2, 3};
		boolean result = SplitArray.splitArray(testArray) ;
		assertEquals(true, result);
	}
	
	@Test
	public void test4() {
		int[] testArray = {5, 2, 2};
		boolean result = SplitArray.splitArray(testArray) ;
		assertEquals(false, result);
	}
	
	@Test
	public void test5() {
		int[] testArray = {1, 1, 1, 1, 1, 1, };
		boolean result = SplitArray.splitArray(testArray) ;
		assertEquals(true, result);
	}
	
	@Test
	public void test6() {
		int[] testArray = {1, 1, 1, 1, 1};
		boolean result = SplitArray.splitArray(testArray) ;
		assertEquals(false, result);
	}
	
	@Test
	public void test7() {
		int[] testArray = {1};
		boolean result = SplitArray.splitArray(testArray) ;
		assertEquals(false, result);
	}
	
	@Test
	public void test8() {
		int[] testArray = {3, 5};
		boolean result = SplitArray.splitArray(testArray) ;
		assertEquals(false, result);
	}
	
	@Test
	public void test9() {
		int[] testArray = {5, 3, 2};
		boolean result = SplitArray.splitArray(testArray) ;
		assertEquals(true, result);
	}
	
	@Test
	public void test10() {
		int[] testArray = {2, 2, 10, 10, 1, 1};
		boolean result = SplitArray.splitArray(testArray) ;
		assertEquals(true, result);
	}
	
	@Test
	public void test11() {
		int[] testArray = {1, 2, 2, 10, 10, 1, 1};
		boolean result = SplitArray.splitArray(testArray) ;
		assertEquals(false, result);
	}
	
	@Test
	public void test12() {
		int[] testArray = {1, 2, 3, 10, 10, 1, 1};
		boolean result = SplitArray.splitArray(testArray) ;
		assertEquals(true, result);
	}
	
	@Test
	public void test13() {
		int[] testArray = {1, 0, -1};
		boolean result = SplitArray.splitArray(testArray) ;
		assertEquals(true, result);
	}
}
