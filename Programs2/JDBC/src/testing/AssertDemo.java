package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertDemo {

	@Test
	public void testforAssertEquals() {
		int res=1;
		int expected=1;
		assertEquals(res,expected);
	}
	@Test
	public void testforAssertTrue() {
		assertFalse("Hello".contains("e"));
	}

}
/*AssertEquals() - actual result should be equal to expected output
 * 
 *
 */