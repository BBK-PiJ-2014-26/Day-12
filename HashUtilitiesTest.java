import java.util.Random;
import org.junit.*;
import static org.junit.Assert.*;

public class HashUtilitiesTest {

	/**
	* This method generates a random number, then verifies whether it >= 0 and <= 1000.
	*/
	@Test
	public void testsShortHash() {
		Random numGenerator = new Random();
		HashUtilities myHash = new HashUtilities();
		int x = myHash.shortHash(numGenerator.nextInt());
		assertTrue(x <= 1000 && x >= 0);
	}
}