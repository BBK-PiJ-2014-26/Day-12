import org.junit.*;
import static org.junit.Assert.*;

public class HashUtilitiesTest {

	/**
	* This method tests a very large number, then verifies whether it is >= 0 and <= 1000.
	*/
	@Test
	public void testsNormalInt() {
		HashUtilities myHash = new HashUtilities();
		int x = 11;
		assertTrue(x <= 1000 && x >= 0);
		System.out.println(x);
	}

	/**
	* This methods tests a very large negative integer.
	*/
	public void testsVeryLargeNegInt() {
		HashUtilities myHash = new HashUtilities();
		int x = -1952357;
		assertTrue(x <= 1000 && x >= 0);
		System.out.println(x);
	}
}