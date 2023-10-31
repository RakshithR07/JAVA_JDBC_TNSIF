package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.Assert.assertNotNull;
class ParametrizedTestDemo {
	@ParametrizedTest
	@ValueSource(strings= {"racecar","radar","madam","string"})
	
	void testPalindrome(String word)
	{
		assertTrue(word.equals(new StringBuffer(word).reverse().toString()));
		
		

	
	}

}
